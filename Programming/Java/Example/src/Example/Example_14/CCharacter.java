package Example.Example_14;

/**
 * 캐릭터
 */
public class CCharacter {
	private int m_nLv = 0;
	private int m_nHp = 0;
	private int m_nAtk = 0;
	
	/*
	 * 생성자 (Constructor) 란?
	 * - new 키워드에 의해 객체가 생성 될 때 Java 컴파일러에 의해서 자동으로 호출 되는 메서드를 의미한다.
	 * (+ 즉, 생성자는 객체를 초기화 하기 위한 용도로 사용 되는 메서드라는 것을 알 수 있다.)
	 *
	 * Java 에서 객체가 생성 되기 위해서는 반드시 생성자가 호출 되어야하기 때문에 만약 클래스에 생성자가
	 * 존재하지 않을 경우 Java 컴파일러에 의해서 자동으로 기본 생성자가 구현된다. (+ 즉, 기본 생성자는
	 * 매개 변수가 존재하지 않는 생성자라는 것을 의미한다.)
	 *
	 * 단, 클래스에 생성자가 하나라도 구현 되어 있을 경우 Java 컴파일러는 더이상 기본 생성자를
	 * 자동으로 구현 해주지 않기 때문에 만약 기본 생성자가 필요하다면 반드시 명시적으로 기본 생성자를
	 * 구현 해줘야한다.
	 */
	
	/** 생성자 */
	public CCharacter() {
		/*
		 * this 키워드란?
		 * - 객체 자신을 가리키는 키워드를 의미한다. (+ 즉, this 키워드는 객체 자신을 참조 할 수 있는
		 * 참조 값이 할당 되어있다는 것을 알 수 있다.)
		 *
		 * 위임 생성자란?
		 * - 생성자에서 다른 생성자를 호출 할 수 있는 기능을 의미한다. (+ 즉, 위임 생성자를 활용하면
		 * 객체를 초기화 하기 위한 명령문의 중복을 최소화 시키는 것이 가능하다.)
		 */
		this(0, 0, 0);
	}
	
	/** 생성자 */
	public CCharacter(int a_nLv, int a_nHp, int a_nAtk) {
		this.m_nLv = a_nLv;
		this.m_nHp = a_nHp;
		this.m_nAtk = a_nAtk;
	}
	
	/** 레벨을 변경한다 */
	public void setLv(int a_nLv) {
		m_nLv = a_nLv;
	}
	
	/** 체력을 변경한다 */
	public void setHp(int a_nHp) {
		m_nHp = a_nHp;
	}
	
	/** 공격력을 변경한다 */
	public void setAtk(int a_nAtk) {
		m_nAtk = a_nAtk;
	}
	
	/** 정보를 출력한다 */
	public void showInfo() {
		System.out.printf("레벨 : %d\n", m_nLv);
		System.out.printf("체력 : %d\n", m_nHp);
		System.out.printf("공격력 : %d\n", m_nAtk);
	}
}
