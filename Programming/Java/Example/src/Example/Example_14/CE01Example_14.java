package Example.Example_14;

/*
 * 접근 제어 지시자 (or 한정자) 란?
 * - 클래스 내부에 존재하는 멤버에 대한 접근 범위를 한정하는 기능을 의미한다. (+ 즉,
 * 접근 제어 지시자를 활용하면 멤버에 대한 보안 수준을 제어하는 것이 가능하다.)
 *
 * Java 접근 제어 지시자 종류
 * - public				<- 클래스 내부와 외부에서 접근 가능
 * - protected			<- 클래스 내부와 외부에서 접근 가능 (+ 동일한 패키지), 클래스 내부와 자식 클래스에서 접근 가능 (+ 다른 패키지)
 * - private			<- 클래스 내부에서 접근 가능
 * - default			<- 동일한 패키지에서 접근 가능
 *
 * 위와 같이 Java 는 클래스의 멤버를 보호하기 위한 다양한 보호 수준이 존재하며
 * 멤버 변수는 private 수준으로 지정하고 멤버 메서드는 public 수준으로 지정하는 것이 일반적인 관례이다.
 *
 * 따라서 클래스 외부에서 멤버 변수에 접근하기 위한 방법이 필요하며 이는 접근자 메서드를 구현하는 것으로
 * 해결 가능하다.
 *
 * 접근자 메서드란?
 * - protected 이상의 수준으로 보호 되고 있는 멤버 변수를 외부헤서 접근 가능하도록 해주는 메서드를 의미한다.
 * (+ 즉, 접근자 메서드를 활용하면 간접적으로 멤버에 접근하는 것이 가능하다.)
 *
 * 접근자 메서드는 클래스 외부에서 변수가 지니고 있는 데이터에 접근하기 위한 Getter 와 변수가 지니고 있는
 * 데이터를 변경하기 위한 Setter 가 존재한다.
 *
 * Ex)
 * class CSomeClass {
 *		private int m_nVal = 0;
 *
 * 		int getVal() {
 * 			return m_nVal;
 * 		}
 *
 * 		void setVal(int a_nVal) {
 * 			m_nVal = a_nVal;
 * 		}
 * }
 *
 * CSomeClass oSomeObj = new CSomeClass();
 * oSomeObj.setVal(10);
 *
 * 위와 같이 멤버 변수 m_nVal 은 private 수준으로 보호 되고 있기 때문에 클래스 외부에서
 * 직접적으로 접근하는 것이 불가능하지만 getVal 메서드와 setVal 메서드를 통해 간접적으로 멤버 변수를
 * 제어하는 것이 가능하다.
 */

/**
 * Example 14 (클래스 - 2)
 */
public class CE01Example_14 {
	/** 초기화 */
	public static void start(String[] args) {
		CCharacter oCharacterA = new CCharacter();
		oCharacterA.setLv(1);
		oCharacterA.setHp(15);
		oCharacterA.setAtk(5);
		
		/*
		 * 아래와 같이 private 수준으로 보호 되고 있는 멤버를 클래스 외부에서 접근 할 경우 컴파일 에러가
		 * 발생한다는 것을 알 수 있다.
		 */
//		oCharacterA.m_nLv = 1;
		
		/*
		 * 아래와 같이 생성자를 활용하면 객체를 생성과 동시에 원하는 데이터롤 객체를 초기화하는 것이 가능하다.
		 * (+ 즉, 기본 생성자가 없는 클래스를 대상으로 객체를 생성 할 경우 반드시 입력 데이터를
		 * 명시해줘야한다는 것을 알 수 있다.)
		 */
		CCharacter oCharacterB = new CCharacter(10, 150, 50);
		
		System.out.println("=====> 캐릭터 - A <=====");
		oCharacterA.showInfo();
		
		System.out.println("\n=====> 캐릭터 - B <=====");
		oCharacterB.showInfo();
	}
}
