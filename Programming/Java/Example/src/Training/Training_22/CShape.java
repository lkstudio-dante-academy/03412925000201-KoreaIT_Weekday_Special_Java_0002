package Training.Training_22;

/**
 * 도형
 */
public class CShape {
	private int m_nColor = 0;
	
	/** 생성자 */
	public CShape(int a_nColor) {
		this.m_nColor = a_nColor;
	}
	
	/** 모양을 반환한다 */
	public String getStr_Shape() {
		return "";
	}
	
	/** 색상을 반환한다 */
	public String getStr_Color() {
		String[] oStrings = {
				"빨간색", "녹색", "파란색"
		};
		
		return oStrings[m_nColor];
	}
	
	/** 도형을 그린다 */
	public void draw() {
		// Do Something
	}
	
	/**
	 * 색상
	 */
	public static final int COLOR_RED = 0;
	public static final int COLOR_GREEN = 1;
	public static final int COLOR_BLUE = 2;
}

/**
 * 선
 */
class CLine extends CShape {
	/** 생성자 */
	public CLine(int a_nColor) {
		super(a_nColor);
	}
	
	/** 모양을 반환한다 */
	@Override
	public String getStr_Shape() {
		return "선";
	}
	
	/** 도형을 그린다 */
	@Override
	public void draw() {
		String oColor = this.getStr_Color();
		System.out.printf("%s 선을 그렸습니다.\n", oColor);
	}
}

/**
 * 삼각형
 */
class CTriangle extends CShape {
	/** 생성자 */
	public CTriangle(int a_nColor) {
		super(a_nColor);
	}
	
	/** 모양을 반환한다 */
	@Override
	public String getStr_Shape() {
		return "삼각형";
	}
	
	/** 도형을 그린다 */
	@Override
	public void draw() {
		String oColor = this.getStr_Color();
		System.out.printf("%s 삼각형을 그렸습니다.\n", oColor);
	}
}

/**
 * 사각형
 */
class CRectangle extends CShape {
	/** 생성자 */
	public CRectangle(int a_nColor) {
		super(a_nColor);
	}
	
	/** 모양을 반환한다 */
	@Override
	public String getStr_Shape() {
		return "사각형";
	}
	
	/** 도형을 그린다 */
	@Override
	public void draw() {
		String oColor = this.getStr_Color();
		System.out.printf("%s 사각형을 그렸습니다.\n", oColor);
	}
}
