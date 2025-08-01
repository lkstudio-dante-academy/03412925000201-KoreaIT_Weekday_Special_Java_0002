package Training.Training_08;

/*
 * Java 연습 문제 8
 * - 업/다운 게임 제작하기
 * - 1 ~ 99 사이의 수 중 1 개를 랜덤하게 선택한다
 * - 사용자로부터 정수를 입력 받아 해당 정수와 정답 여부를 비교한다
 * - 입력 받은 정수가 정답이 아닐 경우 정답을 맞출 수 있도록 가이드 메세지 출력
 * - 입력 받은 정수가 정답 일 경우 게임을 종료한다
 * - 단, 정답을 맞출 수 있는 기회는 3 번으로 제한
 *
 * Ex)
 * 정답 : 85
 *
 * 정수 입력 (남아 있는 횟수 : 3) : 80
 * 정답은 80 보다 큽니다.
 *
 * 정수 입력 (남아 있는 횟수 : 2) : 90
 * 정답은 90 보다 작습니다.
 *
 * 정수 입력 (남아 있는 횟수 : 1) : 85
 * 정답입니다.
 *
 * Case 1. 정답을 맞췄을 경우
 * 정답을 맞추는데 성공했습니다.
 *
 * Case 2. 정답을 맞추지 못했을 경우
 * 정답을 맞추는데 실패했습니다.
 */

import java.util.Random;
import java.util.Scanner;

/**
 * Training 8
 */
public class CT01Training_08 {
	/** 초기화 */
	public static void start(String[] args) {
		Random oRandom = new Random();
		Scanner oScanner = new Scanner(System.in);
		
		int nAnswer = oRandom.nextInt(1, 100);
		System.out.printf("정답 : %d\n\n", nAnswer);
		
		int nChance = 3;
		
		while(nChance > 0) {
			System.out.printf("정수 입력 (남아 있는 횟수 : %d) : ", nChance);
			int nVal = oScanner.nextInt();
			
			// 정답 일 경우
			if(nVal == nAnswer) {
				System.out.println("정답입니다.");
				break;
			}
			
			// 값이 작을 경우
			if(nVal < nAnswer) {
				System.out.printf("정답은 %d 보다 큽니다.\n", nVal);
			} else {
				System.out.printf("정답은 %d 보다 작습니다.\n", nVal);
			}
			
			nChance -= 1;
			System.out.println();
		}
		
		// 정답을 맞췄을 경우
		if(nChance > 0) {
			System.out.println("\n정답을 맞췄습니다.");
		} else {
			System.out.println("\n정답을 맞추는데 실패했습니다.");
		}
	}
}
