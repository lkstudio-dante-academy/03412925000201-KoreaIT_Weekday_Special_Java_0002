package Training.Training_22;

/**
 * 그림판
 */
public class CCanvas {
	private int m_nNumShapes = 0;
	private CShape[] m_oShapes = new CShape[5];
	
	/** 도형을 추가한다 */
	public void addShape(CShape a_oShape) {
		// 배열이 가득 찼을 경우
		if(m_nNumShapes >= m_oShapes.length) {
			CShape[] oShapes_New = new CShape[m_oShapes.length * 2];
			
			for(int i = 0; i < m_nNumShapes; ++i) {
				oShapes_New[i] = m_oShapes[i];
			}
			
			m_oShapes = oShapes_New;
		}
		
		m_oShapes[m_nNumShapes++] = a_oShape;
	}
	
	/** 모든 도형을 그린다 */
	public void drawShapes_All() {
		for(int i = 0; i < m_nNumShapes; ++i) {
			m_oShapes[i].draw();
		}
	}
}
