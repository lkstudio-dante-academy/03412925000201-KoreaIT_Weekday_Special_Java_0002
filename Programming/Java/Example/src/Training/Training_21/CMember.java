package Training.Training_21;

/**
 * 회원
 */
public class CMember {
	private String m_oName = "";
	private String m_oPNumber = "";
	
	/** 생성자 */
	public CMember(String a_oName, String a_oPNumber) {
		this.m_oName = a_oName;
		this.m_oPNumber = a_oPNumber;
	}
	
	/** 이름을 반환한다 */
	public String getName() {
		return m_oName;
	}
	
	/** 전화 번호를 반환한다 */
	public String getPNumber() {
		return m_oPNumber;
	}
	
	/** 이름을 변경한다 */
	public void setName(String a_oName) {
		m_oName = a_oName;
	}
	
	/** 전화 번호를 변경한다 */
	public void setPNumber(String a_oPNumber) {
		m_oPNumber = a_oPNumber;
	}
	
	/** 정보를 출력한다 */
	public void showInfo() {
		System.out.printf("이름 : %s\n", m_oName);
		System.out.printf("전화 번호 : %s\n", m_oPNumber);
	}
}
