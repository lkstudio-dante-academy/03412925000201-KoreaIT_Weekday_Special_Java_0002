package Example.Example_22;

/*
 * 중첩 클래스 (Nested Class) 란?
 * - 클래스 내부에 정의 된 클래스를 의미한다. (+ 즉, 클래스는 필요에 따라 클래스 내부에 정의하는 것이 가능하다.)
 * 중첩 클래스는 크게 정적 중첩 클래스와 비정적 중첩 클래스로 구분된다.
 *
 * 정적 중첩 클래스 (Static Nested Class) 란?
 * - 정적 중첩 클래스는 해당 클래스를 감싸는 외부 클래스의 객체와 상관 없이 객체 생성이 가능한 클래스를 의미한다.
 * (+ 즉, 정적 중첩 클래스를 통해 생성 된 객체는 외부 클래스를 통해 생성 된 객체와 상관이 없다는 것을
 * 알 수 있다.)
 *
 * 정적 중첩 클래스는 외부 클래스에 존재하는 private 정적 (클래스) 멤버에 접근 가능하며 이를 제외하고는
 * 일반적이 클래스와 동일하다.
 *
 * Ex)
 * class COuter {
 * 		private static int m_nVal = 0;
 *
 * 		static class CInner {
 * 			public static void someMethod() {
 * 				System.out.println(COuter.m_nVal);
 * 			}
 * 		}
 * }
 *
 * COuter.CInner.someMethod();
 *
 * 위와 같이 정적 중첩 클래스는 외부 클래스에 존재하는 private 정적 (클래스) 멤버에 접근하는 것이 가능하다.
 */

/**
 * Example 23 (중첩 클래스 - 1)
 */
public class CE01Example_22 {
	/** 초기화 */
	public static void start(String[] args) {
		COuter oOuterA = new COuter();
		COuter oOuterB = new COuter();
		
		oOuterA.incrVal(10);
		oOuterB.incrVal(20);
		
		System.out.println("=====> 외부 클래스 - A <=====");
		oOuterA.showInfo();
		
		System.out.println("\n=====> 외부 클래스 - B <=====");
		oOuterB.showInfo();
		
		/*
		 * 아래와 같이 정적 중첩 클래스는 외부 클래스 내부에 정의 되었기 때문에
		 * 해당 클래스에 접근하기 위해서는 외부 클래스 이름을 명시해야한다는 것을 알 수 있다.
		 */
		COuter.CNested oNestedA = new COuter.CNested();
		COuter.CNested oNestedB = new COuter.CNested();
		
		oNestedA.incrVal(30);
		oNestedB.incrVal(40);
		
		System.out.println("\n=====> 내부 클래스 - A <=====");
		oNestedA.showInfo();
		
		System.out.println("\n=====> 내부 클래스 - B <=====");
		oNestedB.showInfo();
	}
}
