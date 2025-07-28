package Example.Example_16;

/*
 * 객체 지향 프로그래밍 3 대 요소
 * - 캡슐화 (+ or 정보 은닉)
 * - 상속
 * - 다형성
 *
 * 캡슐화 (+ or 정보 은닉) 란?
 * - 객체가 지니고 있는 데이터 중 민감한 데이터는 외부로부터 안전하게 보호하는 개념을 의미한다. (+ 즉,
 * 보안이 중요한 데이터는 외부로부터 보호한다는 것을 알 수 있다.)
 *
 * 객체가 지니고 있는 데이터를 외부에서 자유롭게 접근 할 수 있다는 것은 언제든지 문제를 발생 시킬 수 있다는 것을
 * 의미하기 때문에 보안이 중요한 데이터는 접근 방법을 제한하는 것이 중요하다. (+ 즉,
 * Java 는 접근 제어 지시자를 통해 캡슐화 구현이 가능하다는 것을 알 수 있다.)
 *
 * 상속이란?
 * - 클래스 간에 부모/자식 관계를 형성하는 개념을 의미한다. (+ 즉, 상속을 활용하면 클래스 간에 상/하 관계를
 * 형성 시킴으로서 계층 구조를 만들어 내는 것이 가능하다.)
 *
 * 클래스가 상속을 통해 부모/자식 관계를 형성하고 있으면 자식 클래스는 부모 클래스에 존재하는 멤버를
 * 사용하는 것이 가능하다.
 *
 * Java 클래스 상속 방법
 * - 자식 클래스 + extends + 부모 클래스
 *
 * Ex)
 * class CBase {
 * 		// Do Something
 * }
 *
 * class CDerived extends CBase {
 * 		// Do Something
 * }
 *
 * 위와 같이 CDerived 클래스는 CBase 클래스를 상속 함으로서 CBase 클래스에 존재하는 멤버를 사용하는 것이
 * 가능하다.
 *
 * 단, 상속은 단방향이기 때문에 클래스가 서로를 상속하는 것은 불가능하다.
 *
 * 또한 상속은 무분별하게 사용하면 클래스 간에 관계가 복잡해지기 때문에 상속은 반드시 is a 의 규칙에 따라
 * 상속을 사용하는 것이 일반적인 관례이다. (+ 즉, is a 의 규칙에 위반 될 경우 잘못된 상속이라는 것을
 * 알 수 있다.)
 *
 * 상속을 사용하는 이유
 * - 멤버 중복 최소화
 * - 클래스가 지니고 있는 기능 확장
 *
 * 멤버 중보 최소화란?
 * - 클래스 간에 중복으로 존재하는 멤버는 상속을 통해 중복을 최소화 시키는 것이 가능하다. (+ 즉,
 * 클래스 간에 중복되는 멤버를 부모 클래스에 정의 후 부모 클래스를 상속함으로서 중복을 최소화 시킨다는 것을
 * 알 수 있다.)
 *
 * Ex)
 * class CCharacter {
 * 		private int m_nLv = 0;
 *		private int m_nHp = 0;
 * 		private int m_nAtk = 0;
 * }
 *
 * class CKnight extends CCharacter {
 * 		// Do Something
 * }
 *
 * class CWarrior extends CCharacter {
 * 		// Do Something
 * }
 *
 * 위와 같이 CKnight 클래스와 CWarrior 클래스 간에 중복되는 멤버를 CCharacter 에 정의하고 해당 클래스를
 * 상속함으로서 중복을 최소화 시키는 것이 가능하다.
 *
 * 클래스가 지니고 있는 기능 확장이란?
 * - 상속은 부모 클래스가 지니고 있는 기능을 자식 클래스를 통해 확장 시키는 것이 가능하다. (+ 즉,
 * 부모 클래스가 지니고 있는 기능을 자식 클래스가 재사용 함으로서 기존 클래스가 지니고 있는 기능을 확장 시킨
 * 새로운 클래스를 정의한다는 것을 알 수 있다.)
 *
 * 다형성이란?
 * - 사물이 다양한 형태를 지니고 있는 개념을 의미한다. (+ 즉, 사물이 놓여 있는 상황에 따라 보여지는 형태가
 * 다르다는 것을 알 수 있다.)
 *
 * Java 는 상속을 이용해서 다형성을 흉내 내는 것이 가능하다. (+ 즉, 다형성을 표현하기 위해서는
 * 상속이 전제가 된다는 것을 알 수 있다.)
 *
 * Java 는 자식 클래스를 통해 생성 된 객체를 부모 클래스로 참조하는 것이 가능하다. (+ 즉, 자식 클래스 객체를
 * 부모 클래스로 참조함으로서 자식 클래스 객체를 부모 클래스 객체로 인식 한다는 것을 알 수 있다.)
 *
 * Ex)
 * class CBase {
 * 		// Do Something
 * }
 *
 * class CDerived extends CBase {
 * 		// Do Something
 * }
 *
 * CBase oBase = new CDerived();
 *
 * 위와 같이 자식 클래스 객체는 부모 클래스로 참조하는 것이 가능하기 때문에 부모 클래스 형 변수에
 * 자식 클래스 객체에 대한 참조 값을 할당하면 해당 객체를 부모 클래스 객체로 인식한다는 것을 알 수 있다.
 */

/**
 * Example 16 (클래스 - 4)
 */
public class CE01Example_16 {
	/** 초기화 */
	public static void start(String[] args) {
		CBase oBaseA = new CBase(10, 3.14f);
		
		/*
		 * 아래와 같이 protected 수준으로 명시 된 멤버는 동일한 패키지에서는 자유롭게 접근이 가능하다는 것을
		 * 알 수 있다.
		 */
		oBaseA.m_fVal = 3.14f;
		
		/*
		 * 아래와 같이 자식 클래스 객체를 부모 클래스로 참조하는 것이 가능하다. (+ 즉, 자식 클래스 객체를
		 * 부모 클래스로 참조함으로서 자식 클래스 객체를 부모 클래스 객체로 인지한다는 것을 알 수 있다.)
		 *
		 * 단, 반대로 부모 클래스 객체를 자식 클래스로 참조하는 것은 불가능하다. (+ 즉, is a 의 관계를
		 * 위반 된다는 것을 알 수 있다.)
		 */
		CBase oDerivedA = new CDerived(20, 3.14f, "Hello, World!");
		CDerived oDerivedB = new CDerived(30, 3.14f, "Hello, World!");
		
		System.out.println("=====> 부모 클래스 <=====");
		oBaseA.showInfo_Parent();
		
		System.out.println("\n=====> 자식 클래스 - A <=====");
		oDerivedA.showInfo();
		
		System.out.println("\n=====> 자식 클래스 - B <=====");
		oDerivedB.showInfo_Child();
		
		System.out.println("\n=====> 부모 클래스 -> 자식 클래스 <=====");
		
		/*
		 * instanceof 키워드란?
		 * - 안전한 다운 캐스팅을 지원하는 키워드를 의미한다. (+ 즉, instanceof 키워드를 활용하면
		 * 변수가 실제 참조하는 대상을 확인하는 것이 가능하다.)
		 *
		 * Java 는 자식 클래스 객체를 부모 클래스로 참조하는 것이 가능하며 상황에 따라 실제 참조하는 객체를
		 * 확인 할 필요가 있다.
		 *
		 * 이때 instanceof 키워드를 활용하면 안전하게 참조하는 객체를 검사하는 것이 가능하다.
		 */
		System.out.printf("Base A -> Derived : %s\n", oBaseA instanceof CDerived);
		System.out.printf("Base B -> Derived : %s\n", oDerivedA instanceof CDerived);
	}
}
