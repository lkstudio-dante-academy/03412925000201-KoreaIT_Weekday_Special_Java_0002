package Example.Example_20;

/**
 * 위젯
 */
public class CWidget {
	private int m_nVal = 0;
	private float m_fVal = 0.0f;
	
	/** 생성자 */
	public CWidget(int a_nVal, float a_fVal) {
		this.m_nVal = a_nVal;
		this.m_fVal = a_fVal;
	}
	
	/** 정수를 변경한다 */
	public void setVal_Int(int a_nVal) {
		m_nVal = a_nVal;
	}
	
	/** 실수를 변경한다 */
	public void setVal_Real(float a_fVal) {
		m_fVal = a_fVal;
	}
	
	/** 정보를 출력한다 */
	public void showInfo() {
		System.out.printf("정수 : %d\n", m_nVal);
		System.out.printf("실수 : %f\n", m_fVal);
	}
	
	/** 사본을 반환한다 */
	@Override
	public Object clone() {
		return new CWidget(m_nVal, m_fVal);
	}
	
	/** 정보를 반환한다 */
	@Override
	public String toString() {
		return String.format("정수 : %d\n실수 : %f", m_nVal, m_fVal);
	}
}
