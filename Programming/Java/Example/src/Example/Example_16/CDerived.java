package Example.Example_16;

/**
 * 자식 클래스
 */
public class CDerived extends CBase {
	private String m_oStr = "";
	
	/*
	 * 부모/자식 클래스 생성자 호출 순서
	 * - 클래스가 상속 관계에 놓여있을 때 생성자의 호출 순서는 반드시 부모 클래스 -> 자식 클래스 순으로
	 * 이루어져야한다.
	 *
	 * 따라서 자식 클래스 생성자에서는 반드시 부모 클래스의 생성자를 호출해야 되며 만약 부모 클래스의
	 * 생성자를 호출하는 명령문을 작성하지 않았을 경우 Java 컴파일러에 의해서 부모 클래스의 기본 생성자를
	 * 호출하는 명령문이 자동으로 추가된다. (+ 즉, 부모 클래스에 기본 생성자가 없을 경우 반드시
	 * 자식 클래스의 생성자에서 부모 클래스의 생성자를 호출해줘야한다는 것을 알 수 있다.)
	 */
	
	/** 생성자 */
	public CDerived(int a_nVal, float a_fVal, String a_oStr) {
		/*
		 * super 키워드란?
		 * - 부모를 가리키는 키워드를 의미한다. (+ 즉, super 키워드를 활용하면 부모 클래스의 생성자를
		 * 호출하는 등의 명령문을 작성하는 것이 가능하다.)
		 */
		super(a_nVal, a_fVal);
		
		this.m_oStr = a_oStr;
	}
	
	/*
	 * 메서드 오버라이드 (Method Override) 란?
	 * - 부모 클래스에 존재하는 메서드를 자식 클래스에서 재정의하는 기능을 의미한다. (+ 즉,
	 * 부모 클래스에 존재하는 멤버를 자식 클래스에도 정의하는 것이 가능하다.)
	 */
	
	/** 정보를 출력한다 */
	@Override
	public void showInfo() {
		/*
		 * 아래와 같이 부모 클래스와 동일한 메서드가 자식 클래스에 존재 할 경우 자식 클래스가
		 * 더 높은 우선 순위를 가진다.
		 *
		 * 따라서 부모 클래스에 존재하는 동일한 메서드를 호출하기 위해서는 반드시 super 키워드를
		 * 명시해줘야한다. (+ 즉, super 키워드를 명시하지 않으면 재귀 호출이 된다는 것을 알 수 있다.)
		 */
//		super.showInfo();
		
		this.showInfo_Child();
	}
	
	/** 정보를 출력한다 */
	public void showInfo_Child() {
		this.showInfo_Parent();
		System.out.printf("문자열 : %s\n", m_oStr);
		
		/*
		 * 부모 클래스에 존재하는 private 수준의 멤버는 자식 클래스에서 접근하는 것이 불가능하다. (+ 즉,
		 * private 수준은 클래스 내부에서만 접근이 가능하기 때문에 자식 클래스도 예외가 아니라는 것을
		 * 알 수 있다.)
		 */
//		System.out.printf("정수 : %d\n", m_nVal);
	}
}
