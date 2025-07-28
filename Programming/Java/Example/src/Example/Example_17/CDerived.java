package Example.Example_17;

/**
 * 자식 클래스
 */
public class CDerived extends CBase {
	private String m_oStr = "";
	
	/** 생성자 */
	public CDerived(int a_nVal, float a_fVal, String a_oStr) {
		super(a_nVal, a_fVal);
		this.m_oStr = a_oStr;
	}
	
	/** 정보를 출력한다 */
	@Override
	public void showInfo_Internal() {
		System.out.printf("문자열 : %s\n", m_oStr);
	}
}
