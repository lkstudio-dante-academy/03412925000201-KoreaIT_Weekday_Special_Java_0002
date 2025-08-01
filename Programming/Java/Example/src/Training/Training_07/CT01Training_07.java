package Training.Training_07;

/*
 * Java 연습 문제 7
 * - 피보나치 수열 출력하기
 * - 사용자로부터 수를 입력 받아 해당 개수 만큼 피보나치 수열 출력하기
 *
 * Ex)
 * 정수 입력 : 5
 * 0, 1, 1, 2, 3, 5, 8
 */

import java.util.Scanner;

/**
 * Training 7
 */
public class CT01Training_07 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int nNumValues = oScanner.nextInt();
		
		int nVal_Prev = 1;
		int nVal_PPrev = 0;
		
		System.out.printf("%d, %d, ", nVal_PPrev, nVal_Prev);
		
		for(int i = 0; i < nNumValues; ++i) {
			int nVal_Cur = nVal_Prev + nVal_PPrev;
			System.out.printf("%d, ", nVal_Cur);
			
			nVal_PPrev = nVal_Prev;
			nVal_Prev = nVal_Cur;
		}
		
		System.out.println();
	}
}
