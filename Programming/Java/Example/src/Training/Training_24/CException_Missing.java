package Training.Training_24;

/**
 * 회원 없음 예외
 */
public class CException_Missing extends Exception {
	/** 생성자 */
	public CException_Missing(String a_oName) {
		super(String.format("%s 은(는) 존재하지 않습니다.", a_oName));
	}
}
