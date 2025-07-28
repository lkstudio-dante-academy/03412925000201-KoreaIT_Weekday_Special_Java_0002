package Example.Example_17;

/**
 * 부모 클래스
 */
public abstract class CBase {
	private int m_nVal = 0;
	private float m_fVal = 0.0f;
	
	/** 생성자 */
	public CBase(int a_nVal, float a_fVal) {
		this.m_nVal = a_nVal;
		this.m_fVal = a_fVal;
	}
	
	/** 정보를 출력한다 */
	public void showInfo() {
		System.out.printf("정수 : %d\n", m_nVal);
		System.out.printf("실수 : %f\n", m_fVal);
		
		this.showInfo_Internal();
	}
	
	/*
	 * 추상 메서드 (Abstract Method) 란?
	 * - 일반적인 메서드와 달리 메서드 몸체가 존재하지 않는 메서드를 의미한다. (+ 즉,
	 * 메서드 구현부가 없다는 것을 의미한다.)
	 *
	 * Java 는 특정 클래스가 추상 메서드를 1 개라도 지니고 있을 경우 해당 클래스는 객체화 시킬 수 없는
	 * 추상 클래스가 된다. (+ 즉, 클래스가 미완성이라는 것을 알 수 있다.)
	 *
	 * 따라서 추상 메서드를 지니고 있는 클래스는 자식 클래스를 통해서만 간접적으로 객체화가 가능하며
	 * 추상 메서드를 지니고 있는 클래스를 상속하고 있는 자식 클래스에서는 반드시 부모 클래스에 존재하는
	 * 추상 메서드를 재정의해줘야한다.
	 *
	 * 만약 자식 클래스에서 부모 클래스에 존재하는 추상 메서드를 재정의 하지 않았을 경우 자식 클래스도
	 * 객체화가 불가능한 추상 클래스가 된다. (+ 즉, 자식 클래스도 미완성 클래스가 된다는 것을 의미한다.)
	 */
	
	/** 정보를 출력한다 */
	protected abstract void showInfo_Internal();
}
