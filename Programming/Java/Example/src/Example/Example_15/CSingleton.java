package Example.Example_15;

/*
 * 싱글턴 패턴 (Singleton Pattern) 이란?
 * - 디자인 패턴 중 하나로서 객체의 생성 개수를 하나로 제한하는 패턴을 의미한다. (+ 즉,
 * 싱글턴 패턴은 객체의 생성 방식을 제어 한다는 것을 알 수 있다.)
 */

/**
 * 싱글턴
 */
public class CSingleton {
	private int m_nVal = 0;
	private static CSingleton m_oInst = null;
	
	/** 생성자 */
	private CSingleton() {
		// Do Something
	}
	
	/** 값을 반환한다 */
	public int getVal() {
		return m_nVal;
	}
	
	/** 값을 변경한다 */
	public void setVal(int a_nVal) {
		m_nVal = a_nVal;
	}
	
	/** 인스턴스를 반환한다 */
	public static CSingleton getInst() {
		// 인스턴스가 없을 경우
		if(CSingleton.m_oInst == null) {
			CSingleton.m_oInst = new CSingleton();
		}
		
		/*
		 * 아래와 같이 클래스 메서드 내부에서는 멤버 변수에 접근하는 것이 불가능하다.
		 *
		 * 이는 멤버 변수에 접근하기 위해서는 this 키워드가 필요하지만 클래스 메서드에는 this 키워드가
		 * 존재하지 않기 때문이다.
		 *
		 * 따라서 클래스 메서드 내부에서는 클래스 멤버에만 접근하는 것이 가능하다.
		 */
//		m_nVal = 10;
		
		return CSingleton.m_oInst;
	}
}
