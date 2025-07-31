package Training.Training_04;

/*
 * Java 연습 문제 4
 * - 비트 활성 여부 검사하기
 * - 사용자로부터 정수를 입력 받은 후 해당 정수를 2 진수 형태로 출력한다
 * - 위치를 입력 받아 해당 위치에 비트가 켜져있는지 검사한다
 * - 위치는 가장 오른쪽이 0 이고 왼쪽으로 갈수록 1 씩 증가한다
 *
 * Ex)
 * 정수 입력 : 10
 * 2 진수 : 1010
 *
 * 위치 입력 : 0
 * 비트 활성 여부 : false
 */

import java.util.Scanner;

/**
 * Training 4
 */
public class CT01Training_04 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int nVal = oScanner.nextInt();
		
		System.out.printf("2 진수 : %s\n", Integer.toString(nVal, 2));
		
		System.out.print("\n위치 입력 : ");
		int nPos = oScanner.nextInt();
		
		boolean bIsActive = (nVal & (1 << nPos)) != 0;
		System.out.printf("비트 활성 여부 : %s\n", bIsActive);
	}
}
