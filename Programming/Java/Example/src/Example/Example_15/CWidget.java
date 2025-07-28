package Example.Example_15;

/**
 * 위젯
 */
public class CWidget {
	private int m_nVal = 0;
	private static int m_nVal_Static = 0;
	
	/** 값을 반환한다 */
	public int getVal() {
		return m_nVal;
	}
	
	/** 클래스 멤버 값을 반환한다 */
	public int getVal_Static() {
		return CWidget.m_nVal_Static;
	}
	
	/** 값을 변경한다 */
	public void setVal(int a_nVal) {
		m_nVal = a_nVal;
		CWidget.m_nVal_Static = a_nVal;
	}
}
