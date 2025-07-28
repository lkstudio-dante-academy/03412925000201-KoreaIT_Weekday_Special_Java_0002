package Example.Example_15;

/*
 * 클래스 멤버 (Class Member) 란?
 * - 일반적인 멤버와 달리 클래스 자체에 종속 되기 때문에 객체를 통하지 않고 사용 가능한 특징이 존재한다. (+ 즉,
 * 객체가 아닌 클래스를 통해 접근 가능한 멤버를 의미한다.)
 *
 * 일반적인 멤버는 객체에 종속 되기 때문에 new 키워드를 통해 생성 된 객체가 개별적으로 멤버를 지니고 있지만
 * 클래스 멤버는 클래스 자체에 종속 되기 때문에 클래스에만 존재하는 차이점이 존재한다. (+ 즉,
 * 특정 클래스를 통해 생성 된 모든 객체는 해당 클래스에 존재하는 클래스 멤버를 공유 한다는 것을 알 수 있다.)
 *
 * Java 클래스 멤버 선언 or 구현 방법
 * - static + 변수 선언 or 메서드 구현
 *
 * Ex)
 * class CSomeClass {
 * 		static int m_nVal = 0;
 *
 * 		static void someMethod() {
 * 			// Do Something
 * 		}
 * }
 *
 * CSomeClass.someMethod();
 *
 * 위와 같이 static 키워드를 명시하면 클래스 변수 or 메서드를 구현하는 것이 가능하며
 * 클래스 멤버는 클래스만으로 접근하는 것이 가능하다. (+ 즉, 클래스 멤버는 객체가 필수가 아니라는 것을
 * 알 수 있다.)
 */

/**
 * Example 15 (클래스 - 3)
 */
public class CE01Example_15 {
	/** 초기화 */
	public static void start(String[] args) {
		CWidget oWidgetA = new CWidget();
		CWidget oWidgetB = new CWidget();
		
		oWidgetA.setVal(10);
		oWidgetB.setVal(20);
		
		System.out.println("=====> 위젯 - A <=====");
		System.out.printf("멤버 변수 : %d\n", oWidgetA.getVal());
		System.out.printf("클래스 변수 : %d\n", oWidgetA.getVal_Static());
		
		System.out.println("\n=====> 위젯 - B <=====");
		System.out.printf("멤버 변수 : %d\n", oWidgetB.getVal());
		System.out.printf("클래스 변수 : %d\n", oWidgetB.getVal_Static());
		
		/*
		 * CSingleton 클래스의 생성자는 private 수준이기 때문에 아래와 같이 클래스 외부에서
		 * new 키워드를 통해 객체 생성을 시도하면 컴파일 에러가 발생한다는 것을 알 수 있다. (+ 즉,
		 * 객체가 생성 되기 위해서는 생성자가 호출 되어야하는데 생성자 호출이 불가능하기 때문에
		 * 객체 생성이 불가능하다는 것을 알 수 있다.)
		 */
//		CSingleton oSingleton = new CSingleton();
		
		CSingleton oSingletonA = CSingleton.getInst();
		CSingleton oSingletonB = CSingleton.getInst();
		
		oSingletonA.setVal(10);
		oSingletonB.setVal(20);
		
		System.out.println("\n=====> 싱글턴 - A <=====");
		System.out.printf("정수 : %d\n", oSingletonA.getVal());
		
		System.out.println("\n=====> 싱글턴 - B <=====");
		System.out.printf("정수 : %d\n", oSingletonB.getVal());
	}
}
