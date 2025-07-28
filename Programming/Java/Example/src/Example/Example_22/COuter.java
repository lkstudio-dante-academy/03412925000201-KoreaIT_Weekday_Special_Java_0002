package Example.Example_22;

/**
 * 외부 클래스
 */
public class COuter {
	/**
	 * 중첩 클래스
	 */
	public static class CNested {
		private int m_nVal = 0;
		
		/** 값을 증가 시킨다 */
		public void incrVal(int a_nVal) {
			m_nVal += a_nVal;
			COuter.m_nVal_Static += a_nVal;
		}
		
		/** 정보를 출력한다 */
		public void showInfo() {
			System.out.printf("멤버 변수 (내부) : %d\n", m_nVal);
			System.out.printf("클래스 변수 (외부) : %d\n", COuter.m_nVal_Static);
		}
	}
	
	private static int m_nVal_Static = 0;
	
	/** 값을 증가 시킨다 */
	public void incrVal(int a_nVal) {
		COuter.m_nVal_Static += a_nVal;
	}
	
	/** 정보를 출력한다 */
	public void showInfo() {
		System.out.printf("클래스 변수 (외부) : %d\n", COuter.m_nVal_Static);
	}
}
