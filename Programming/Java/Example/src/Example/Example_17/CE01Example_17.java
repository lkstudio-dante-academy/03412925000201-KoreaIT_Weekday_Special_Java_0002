package Example.Example_17;

/*
 * 추상 클래스 (Abstract Class) 란?
 * - 일반적인 클래스와 달리 객체화가 불가능 할 클래스를 의미한다. (+ 즉, 추상 클래스는 new 키워드를 통해
 * 직접 객체화 시키는 것이 불가능하다.)
 *
 * 단, 추상 클래스는 new 키워드를 통해 직접적으로 객체화가 불가능 하지만 자식 클래스를 통해
 * 간접적으로 객체화 시키는 것은 가능하다.
 *
 * Java 의 클래스는 객체화가 필요한 클래스가 존재하는 반면 클래스 간에 멤버의 중복을 줄이기 위한 용도로
 * 사용 되는 클래스도 존재한다. (+ Ex. 부모 클래스)
 *
 * 따라서 클래스 간에 중복을 줄이기 위한 용도로 정의 된 클래스는 객체화가 필요 없기 때문에
 * 해당 클래스를 추상 클래스로 정의하면 클래스의 용도를 좀 더 알리는 것이 가능하다. (+ 즉,
 * 가독성이 향상 된다는 것을 의미한다.)
 *
 * Java 추상 클래스 정의 방법
 * - abstract + 클래스 정의
 *
 * Ex)
 * abstract class CBase {
 * 		// Do Something
 * }
 *
 * class CDerived extends CBase {
 * 		// Do Something
 * }
 *
 * CDerived oDerived = new CDerived();
 *
 * 위와 같이 CBase 클래스는 추상 클래스이기 때문에 new 키워드를 통해 직접 객체화 시키는 것이 불가능하다.
 */

/**
 * Example 17 (추상 클래스)
 */
public class CE01Example_17 {
	/** 초기화 */
	public static void start(String[] args) {
		/*
		 * 아래와 같이 CBase 클래스는 추상 클래스이기 때문에 new 키워드를 통해 직접적으로 객체화를 시도하면
		 * 컴파일 에러가 발생한다는 것을 알 수 있다.
		 */
//		CBase oBaseA = new CBase();
		
		CBase oBaseB = new CDerived(10, 3.14f, "Hello, World!");
		CDerived oDerived = new CDerived(20, 3.14f, "Hello, World!");
		
		System.out.println("=====> 부모 클래스 <=====");
		oBaseB.showInfo();
		
		System.out.println("\n=====> 자식 클래스 <=====");
		oDerived.showInfo();
	}
}
