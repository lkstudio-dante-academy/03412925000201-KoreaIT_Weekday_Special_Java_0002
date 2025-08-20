package Training.Training_21;

import java.io.*;

/**
 * 회원 관리자
 */
public class CManager_Member {
	private int m_nCount_Member = 0;
	private CMember[] m_oMembers = new CMember[5];
	
	/** 회원 추가한다 */
	public void addMember(String a_oName, String a_oPNumber) {
		// 배열이 가득 찼을 경우
		if(m_nCount_Member >= m_oMembers.length) {
			CMember[] oMembers_New = new CMember[m_oMembers.length * 2];
			
			for(int i = 0; i < m_nCount_Member; ++i) {
				oMembers_New[i] = m_oMembers[i];
			}
			
			m_oMembers = oMembers_New;
		}
		
		CMember oMember = new CMember(a_oName, a_oPNumber);
		m_oMembers[m_nCount_Member++] = oMember;
	}
	
	/** 회원 제거한다 */
	public void removeMember(String a_oName) {
		int nResult = this.findMember(a_oName);
		
		for(int i = nResult; i < m_nCount_Member - 1; ++i) {
			m_oMembers[i] = m_oMembers[i + 1];
		}
		
		m_nCount_Member -= 1;
	}
	
	/** 회원 검색한다 */
	public void searchMember(String a_oName) {
		int nResult= this.findMember(a_oName);
		m_oMembers[nResult].showInfo();
	}
	
	/** 회원을 갱신한다 */
	public void updateMember(String a_oName,
							 String a_oName_New,
							 String a_oPNumber_New) {
		int nResult = this.findMember(a_oName);
		
		m_oMembers[nResult].setName(a_oName_New);
		m_oMembers[nResult].setPNumber(a_oPNumber_New);
	}
	
	/** 모든 회원 출력한다 */
	public void showMembers_All() {
		for(int i = 0; i < m_nCount_Member; ++i) {
			m_oMembers[i].showInfo();
			System.out.println();
		}
	}
	
	/** 회원을 탐색한다 */
	public int findMember(String a_oName) {
		for(int i = 0; i < m_nCount_Member; ++i) {
			// 회원이 존재 할 경우
			if(a_oName.equals(m_oMembers[i].getName())) {
				return i;
			}
		}
		
		return -1;
	}
	
	/** 회원을 로드한다 */
	public void loadMembers_FromFile(String a_oPath_File) {
		File oFile = new File(a_oPath_File);
		
		// 로드가 불가능 할 경우
		if(!oFile.exists()) {
			return;
		}
		
		try(BufferedReader oReader = new BufferedReader(new FileReader(oFile))) {
			m_nCount_Member = 0;
			
			while(oReader.ready()) {
				String oInfo_Member = oReader.readLine();
				String[] oTokens = oInfo_Member.split(",");
				
				this.addMember(oTokens[0], oTokens[1]);
			}
		} catch(Exception oException) {
			oException.printStackTrace();
		}
	}
	
	/** 회원을 저장한다 */
	public void saveMembers_ToFile(String a_oPath_File) {
		File oFile = new File(a_oPath_File);
		
		try(BufferedWriter oWriter = new BufferedWriter(new FileWriter(oFile))) {
			for(int i = 0; i < m_nCount_Member; ++i) {
				String oName = m_oMembers[i].getName();
				String oPNumber = m_oMembers[i].getPNumber();
				
				String oInfo_Member = String.format("%s,%s", oName, oPNumber);
				
				oWriter.write(oInfo_Member);
				oWriter.newLine();
			}
		} catch(Exception oException) {
			oException.printStackTrace();
		}
	}
}
