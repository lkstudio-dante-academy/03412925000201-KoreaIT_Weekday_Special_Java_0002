package Training.Training_03;

/*
 * Java 연습 문제 3
 * - 비트 끄기
 * - 정수를 입력 받은 후 특정 자리의 비트를 끈 결과를 출력한다
 * - 비트의 위치는 가장 오른쪽이 0 이고 왼쪽으로 이동 할 수록 1 씩 증가한다
 *
 * Ex)
 * 정수 입력 : 10
 * 2 진수 : 1010
 *
 * 위치 입력 : 1
 * 2 진수 : 1000
 */

import java.util.Scanner;

/**
 * Training 3
 */
public class CT01Training_03 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int nVal = oScanner.nextInt();
		
		System.out.printf("2 진수 : %s\n", Integer.toString(nVal, 2));
		
		System.out.print("\n위치 입력 : ");
		int nPos = oScanner.nextInt();
		
		nVal &= ~(1 << nPos);
		System.out.printf("2 진수 : %s\n", Integer.toString(nVal, 2));
	}
}
