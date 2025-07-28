package Example.Example_13;

/**
 * 캐릭터
 */
public class CCharacter {
	public int m_nLv = 0;
	public int m_nHp = 0;
	public int m_nAtk = 0;
	
	/** 레벨을 증가 시킨다 */
	public void levelUp() {
		m_nLv += 1;
		m_nHp += 10;
		m_nAtk += 5;
	}
	
	/** 정보를 출력한다 */
	public void showInfo() {
		/*
		 * 아래와 같이 멤버 메서드는 동일한 클래스 or 객체에 존재하는 다른 멤버 접근하는 것이 가능하다. (+ 즉,
		 * 멤버 메서드는 멤버 변수에 접근하는 것이 가능하기 때문에 멤버 변수가 지니고 있는 데이터는
		 * 입력으로 전달 받을 필요가 없다는 것을 알 수 있다.)
		 */
		System.out.printf("레벨 : %d\n", m_nLv);
		System.out.printf("체력 : %d\n", m_nHp);
		System.out.printf("공격력 : %d\n", m_nAtk);
	}
}
