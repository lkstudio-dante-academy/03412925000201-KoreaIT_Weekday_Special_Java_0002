package Training.Training_06;

/*
 * Java 연습 문제 6
 * - 합계/평균 구하기
 * - 사용자로부터 수를 입력 받은 입력 받은 수가 0 보다 크다면 수를 누적한다
 * - 입력 받은 수가 0 이하 일 경우 입력을 종료하고 합계와 평균을 출력한다
 *
 * Ex)
 * 1 번째 정수 : 1
 * 2 번째 정수 : 2
 * 3 번째 정수 : 3
 * 4 번째 정수 : 0
 *
 * =====> 결과 <=====
 * 합계 : 6
 * 평균 : 2.0
 */

import java.util.Scanner;

/**
 * Training 6
 */
public class CT01Training_06 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		int nVal_Sum = 0;
		int nNumValues = 0;
		
		while(true) {
			System.out.printf("%d 번째 정수 입력 : ", nNumValues + 1);
			int nVal = oScanner.nextInt();
			
			// 입력 종료 일 경우
			if(nVal <= 0) {
				break;
			}
			
			nVal_Sum += nVal;
			nNumValues += 1;
		}
		
		System.out.println("\n=====> 결과 <=====");
		System.out.printf("합계 : %d\n", nVal_Sum);
		System.out.printf("평균 : %f\n", nVal_Sum / (float)nNumValues);
	}
}
