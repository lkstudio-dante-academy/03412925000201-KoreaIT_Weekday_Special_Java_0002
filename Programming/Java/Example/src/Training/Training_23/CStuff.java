package Training.Training_23;

/**
 * 물건
 */
public class CStuff {
	private int m_nPrice = 0;
	private int m_nNumStuffs = 0;
	
	private String m_oName = "";
	
	/** 생성자 */
	public CStuff(String a_oName, int a_nPrice, int a_nNumStuffs) {
		this.m_nPrice = a_nPrice;
		this.m_nNumStuffs = a_nNumStuffs;
		
		this.m_oName = a_oName;
	}
	
	/** 가격을 반환한다 */
	public int getPrice() {
		return m_nPrice;
	}
	
	/** 재고를 반환한다 */
	public int getNumStuffs() {
		return m_nNumStuffs;
	}
	
	/** 이름을 반환한다 */
	public String getName() {
		return m_oName;
	}
	
	/** 재고를 변경한다 */
	public void setNumStuffs(int a_nNumStuffs) {
		m_nNumStuffs = Math.max(0, a_nNumStuffs);
	}
}
