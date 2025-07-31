package Training.Training_02;

/*
 * Java 연습 문제 2
 * - 논리 연산자 결과 출력하기
 * - 논리 연산자를 사용하지 않고 논리 AND 연산자와 논리 OR 연산자 결과 출력하기
 *
 * Ex)
 * 정수 (2 개) 입력 : 10 0
 *
 * =====> 결과 <=====
 * 10 && 0 = false
 * 10 || 0 = true
 */

import java.util.Scanner;

/**
 * Training 2
 */
public class CT01Training_02 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		System.out.print("정수 (2 개) 입력 : ");
		
		int nValA = oScanner.nextInt();
		int nValB = oScanner.nextInt();
		
		int nBoolean_ValA = (nValA != 0) ? 1 : 0;
		int nBoolean_ValB = (nValB != 0) ? 1 : 0;
		
		System.out.println("\n=====> 결과 <=====");
		System.out.printf("%d && %d = %s\n", nValA, nValB, (nBoolean_ValA * nBoolean_ValB) != 0);
		System.out.printf("%d || %d = %s\n", nValA, nValB, (nBoolean_ValA + nBoolean_ValB) != 0);
	}
}
