package Example.Example_23;

/**
 * 외부 클래스
 */
public class COuter {
	/**
	 * 멤버 내부 클래스
	 */
	public class CInner_Member {
		private int m_nVal = 0;
		
		/** 값을 증가 시킨다 */
		public void incrVal(int a_nVal) {
			m_nVal += a_nVal;
			
			/*
			 * 아래와 같이 외부 클래스 이름과 this 키워드를 조합하면 동일한 이름의 외부 클래스 멤버에
			 * 접근하는 것이 가능하다.
			 */
			COuter.this.m_nVal += a_nVal;
		}
		
		/** 정보를 출력한다 */
		public void showInfo() {
			System.out.printf("멤버 변수 (내부) : %d\n", m_nVal);
			System.out.printf("멤버 변수 (외부) : %d\n", COuter.this.m_nVal);
		}
	}
	
	/** 지역 내부 클래스 객체를 반환한다 */
	public INested getInner_Local() {
		/**
		 * 지역 내부 클래스
		 */
		class CInner_Local implements INested {
			private int m_nVal = 0;
			
			/** 값을 증가 시킨다 */
			@Override
			public void incrVal(int a_nVal) {
				m_nVal += a_nVal;
				COuter.this.m_nVal += a_nVal;
			}
			
			/** 정보를 출력한다 */
			@Override
			public void showInfo() {
				System.out.printf("멤버 변수 (내부) : %d\n", m_nVal);
				System.out.printf("멤버 변수 (외부) : %d\n", COuter.this.m_nVal);
			}
		}
		
		return new CInner_Local();
	}
	
	/** 익명 내부 클래스 객체를 반환한다 */
	public INested getInner_Anonymous() {
		return new INested() {
			private int m_nVal = 0;
			
			/** 값을 증가 시킨다 */
			@Override
			public void incrVal(int a_nVal) {
				m_nVal += a_nVal;
				COuter.this.m_nVal += a_nVal;
			}
			
			/** 정보를 출력한다 */
			@Override
			public void showInfo() {
				System.out.printf("멤버 변수 (내부) : %d\n", m_nVal);
				System.out.printf("멤버 변수 (외부) : %d\n", COuter.this.m_nVal);
			}
		};
	}
	
	private int m_nVal = 0;
	
	/** 값을 증가 시킨다 */
	public void incrVal(int a_nVal) {
		m_nVal += a_nVal;
	}
	
	/** 정보를 출력한다 */
	public void showInfo() {
		System.out.printf("멤버 변수 (외부) : %d\n", m_nVal);
	}
}
