package Training.Training_09;

/*
 * Java 연습 문제 9
 * - 구구단 출력하기
 * - 사용자로부터 정수 2 개를 입력 받아 해당 정수 범위에 있는 구구단을 출력한다
 * - 단, 입력 순서에 상관 없이 작은 수부터 큰 수까지 구구단이 출력되어야한다
 *
 * Ex)
 * 정수 (2 개) 입력 : 4 2
 * 2 * 1 = 2
 * 2 * 2 = 4
 * 2 * 3 = 6
 * ...이하 생략
 *
 * 3 * 1 = 3
 * 3 * 2 = 6
 * 3 * 3 = 9
 * ...이하 생략
 *
 * 4 * 1 = 4
 * 4 * 2 = 8
 * 4 * 3 = 12
 * ...이하 생략
 */

import java.util.Scanner;

/**
 * Training 9
 */
public class CT01Training_09 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		System.out.print("정수 (2 개) 입력 : ");
		
		int nValA = oScanner.nextInt();
		int nValB = oScanner.nextInt();
		
		// 보정이 필요 할 경우
		if(nValA > nValB) {
			int nTemp = nValA;
			nValA = nValB;
			nValB = nTemp;
		}
		
		for(int i = nValA; i <= nValB; ++i) {
			System.out.printf("=====> %d 단 <=====\n", i);
			
			for(int j = 1; j < 10; ++j) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
			
			System.out.println();
		}
	}
}
