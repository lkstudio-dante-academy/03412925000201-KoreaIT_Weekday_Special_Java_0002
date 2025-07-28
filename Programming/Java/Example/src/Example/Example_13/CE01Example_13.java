package Example.Example_13;

/*
 * 클래스 (Class) 란?
 * - 변수 or 메서드 등을 그룹화 시켜서 관리 할 수 있는 기능을 의미한다. (+ 즉, 클래스를 활용하면 연관 된
 * 데이터와 메서드를 그룹으로 묶어서 관리하는 것이 가능하다.)
 *
 * Java 는 객체 지향 프로그래밍 패러다임을 지원하며 객체 지향 프로그래밍에 핵심이 되는 사물 (객체) 을
 * 클래스를 통해 표현하는 것이 가능하다. (+ 즉, 클래스는 사물을 정의하기 위한 수단이라는 것을 알 수 있다.)
 *
 * 클래스를 지원하는 프로그래밍 언어는 사물의 특징을 속성 (데이터) 과 행위 (기능) 로 구분해서 속성은 변수를
 * 통해 표현하고 행위는 메서드를 통해 표현한다. (+ 즉, 클래스는 변수와 메서드 등을
 * 그룹화 시키는 기능이기 때문에 클래스를 활용하면 사물을 정의하는 것이 가능하다.)
 *
 * 객체 지향 프로그래밍 (Object Oriented Programming) 이란?
 * - 특정 역할을 수행 할 수 있는 사물을 정의하고 사물과 사물 간에 상호 작용을 통해 프로그램을 동작 시키는
 * 설계 방식을 의미한다. (+ 즉, 객체 지향 프로그래밍의 핵심은 사물이라는 것을 알 수 있다.)
 *
 * 따라서 객체 지향 프로그래밍 패러다임을 지원하는 프로그래밍 언어는 사물을 정의 할 수 있는 수단이 필요하며
 * Java 는 클래스를 통해 사물을 정의하는 것이 가능하다.
 *
 * Java 클래스 정의 방법
 * - class + 클래스 이름 + 클래스 멤버 (+ Ex. 변수, 메서드 등등...)
 *
 * Ex)
 * class CSomeClass {
 * 		int m_nVal = 0;
 *
 * 		void someMethod() {
 * 			// Do Something
 * 		}
 * }
 *
 * CSomeClass oSomeObj = new CSomeClass();
 * oSomeObj.someMethod();
 *
 * 위와 같이 정의 된 클래스는 자료형처럼 활용하는 것이 가능하며 new 키워드를 통해 객체화 (인스턴스) 시키는 것이
 * 가능하다. (+ 즉, oSomeObj 변수에는 생성 된 객체를 참조 할 수 있는 참조 값이 할당 된다는 것을 알 수 있다.)
 */

/**
 * Example 13 (클래스 - 1)
 */
public class CE01Example_13 {
	/** 초기화 */
	public static void start(String[] args) {
		CCharacter oCharacterA = new CCharacter();
		
		/*
		 * . (멤버 지정 연산자) 란?
		 * - 변수가 참조하고 있는 객체 내부에 존재하는 멤버에 접근하는 연산자를 의미한다. (+ 즉,
		 * 멤버 지정 연산자를 활용하면 참조하고 있는 객체 내부에 존재하는 멤버 변수에 데이터를 할당하는 등의
		 * 작업이 가능하다는 것을 알 수 있다.)
		 */
		oCharacterA.m_nLv = 1;
		oCharacterA.m_nHp = 15;
		oCharacterA.m_nAtk = 5;
		
		CCharacter oCharacterB = new CCharacter();
		oCharacterB.m_nLv = 10;
		oCharacterB.m_nHp = 150;
		oCharacterB.m_nAtk = 50;
		
		System.out.println("=====> 캐릭터 - A <=====");
		oCharacterA.showInfo();
		
		System.out.println("\n=====> 캐릭터 - B <=====");
		oCharacterB.showInfo();
		
		oCharacterA.levelUp();
		
		System.out.println("\n=====> 캐릭터 - A (레벨 업 후) <=====");
		oCharacterA.showInfo();
	}
}
