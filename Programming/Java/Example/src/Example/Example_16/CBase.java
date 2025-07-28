package Example.Example_16;

/**
 * 부모 클래스
 */
public class CBase {
	private int m_nVal = 0;
	protected float m_fVal = 0.0f;
	
	/** 생성자 */
	public CBase(int a_nVal, float a_fVal) {
		this.m_nVal = a_nVal;
		this.m_fVal = a_fVal;
	}
	
	/** 정보를 출력한다 */
	public void showInfo() {
		this.showInfo_Parent();
	}
	
	/** 정보를 출력한다 */
	public void showInfo_Parent() {
		System.out.printf("정수 : %d\n", m_nVal);
		System.out.printf("실수 : %f\n", m_fVal);
	}
}
