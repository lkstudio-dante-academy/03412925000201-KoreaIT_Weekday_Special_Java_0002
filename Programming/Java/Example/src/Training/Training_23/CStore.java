package Training.Training_23;

import java.util.ArrayList;
import java.util.List;

/**
 * 상점
 */
public class CStore {
	private List<CStuff> m_oListStuffs = new ArrayList<>();
	
	/** 물건 종류 개수를 반환한다 */
	public int getNumKinds_Stuff() {
		return m_oListStuffs.size();
	}
	
	/** 물건을 반환한다 */
	public CStuff getStuff(int a_nIdx) {
		return m_oListStuffs.get(a_nIdx);
	}
	
	/** 물건을 추가한다 */
	public void addStuff(CStuff a_oStuff) {
		m_oListStuffs.add(a_oStuff);
	}
	
	/** 물건을 구입한다 */
	public void buyStuff(int a_nIdx) {
		CStuff oStuff = m_oListStuffs.get(a_nIdx);
		oStuff.setNumStuffs(oStuff.getNumStuffs() - 1);
	}
}
