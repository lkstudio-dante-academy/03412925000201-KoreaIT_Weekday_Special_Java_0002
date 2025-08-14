package Training.Training_24;

/**
 * 회원 중복 예외
 */
public class CException_Duplicate extends Exception {
	/** 생성자 */
	public CException_Duplicate(String a_oName) {
		super(String.format("%s 은(는) 이미 존재하는 회원입니다.", a_oName));
	}
}
