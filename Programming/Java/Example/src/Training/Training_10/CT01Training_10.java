package Training.Training_10;

/*
 * Java 연습 문제 10
 * - 바위/가위/보 게임 제작하기
 * - 사용자로부터 바위/가위/보 중 하나를 입력받는다
 * - 컴퓨터는 랜덤하게 선택한다
 * - 사용자의 입력과 컴퓨터의 선택을 비교해서 결과를 출력한다
 * - 사용자가 승리했거나 무승부 일 게임을 다시 재개한다
 * - 사용자가 패배했을 경우 전적을 출력하고 게임을 종료한다
 *
 * Ex)
 * 정수 (1. 바위, 2. 가위, 3. 보) 입력 : 1
 * 결과 : 승리 (나 - 바위, 컴퓨터 - 가위)
 *
 * 정수 (1. 바위, 2. 가위, 3. 보) 입력 : 2
 * 결과 : 패배 (나 - 가위, 컴퓨터 - 바위)
 *
 * 전적 : 1 승 0 무 1 패
 * 프로그램을 종료합니다.
 */

import java.util.Random;
import java.util.Scanner;

/**
 * Training 10
 */
public class CT01Training_10 {
	/** 초기화 */
	public static void start(String[] args) {
		final int SELECT_ROCK = 1;
		final int SELECT_SCISSORS = 2;
		final int SELECT_PAPER = 3;
		
		final int RESULT_WIN = 1;
		final int RESULT_DRAW = 2;
		final int RESULT_LOSE = 3;
		
		Random oRandom = new Random();
		Scanner oScanner = new Scanner(System.in);
		
		int nCount_Win = 0;
		int nCount_Draw = 0;
		
		do {
			System.out.print("정수 (1. 바위, 2. 가위, 3. 보) 입력 : ");
			
			int nSelect_My = oScanner.nextInt();
			int nSelect_Computer = oRandom.nextInt(0, 3) + 1;
			
			int nResult = 0;
			
			// 무승부 일 경우
			if(nSelect_My == nSelect_Computer) {
				nResult = RESULT_DRAW;
			} else {
				int nSelect_MyNext = (nSelect_My % 3) + 1;
				nResult = (nSelect_MyNext == nSelect_Computer) ? RESULT_WIN : RESULT_LOSE;
			}
			
			nCount_Win += (nResult == RESULT_WIN) ? 1 : 0;
			nCount_Draw += (nResult == RESULT_DRAW) ? 1 : 0;
			
			String oStr_MySelect = "";
			String oStr_ComputerSelect = "";
			
			String oStr_Result = "";
			
			switch(nSelect_My) {
				case SELECT_ROCK:
					oStr_MySelect = "바위";
					break;
					
				case SELECT_SCISSORS:
					oStr_MySelect = "가위";
					break;
					
				case SELECT_PAPER:
					oStr_MySelect = "보";
					break;
			}
			
			switch(nSelect_Computer) {
				case SELECT_ROCK:
					oStr_ComputerSelect = "바위";
					break;
					
				case SELECT_SCISSORS:
					oStr_ComputerSelect = "가위";
					break;
					
				case SELECT_PAPER:
					oStr_ComputerSelect = "보";
					break;
			}
			
			switch(nResult) {
				case RESULT_WIN:
					oStr_Result = "승리";
					break;
					
				case RESULT_DRAW:
					oStr_Result = "무승부";
					break;
					
				case RESULT_LOSE:
					oStr_Result = "패배";
					break;
			}
			
			String oMsgA = String.format("나 - %s", oStr_MySelect);
			String oMsgB = String.format("컴퓨터 - %s", oStr_ComputerSelect);
			String oMsgC = String.format("결과 : %s", oStr_Result);
			
			System.out.printf("%s (%s, %s)\n\n", oMsgC, oMsgA, oMsgB);
			
			// 패배했을 경우
			if(nResult == RESULT_LOSE) {
				break;
			}
		} while(true);
		
		System.out.printf("전적 : %d 승 %d 무 1 패\n", nCount_Win, nCount_Draw);
		System.out.println("프로그램을 종료합니다.");
	}
}
