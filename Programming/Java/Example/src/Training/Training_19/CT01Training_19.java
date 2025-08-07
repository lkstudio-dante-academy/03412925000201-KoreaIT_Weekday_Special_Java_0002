package Training.Training_19;

/*
 * Java 연습 문제 19
 * - 하노이 탑 시뮬레이션 구현하기
 * - 사용자로부터 원반 개수를 입력 받은 해당 개수를 목적지에 옮기는 하노이 탑
 * 시뮬레이션을 구현한다
 *
 * Ex)
 * 원반 개수 입력 : 3
 * 1 번 원반 : A -> C 이동
 * 2 번 원반 : A -> B 이동
 * 1 번 원반 : C -> B 이동
 * 3 번 원반 : A -> C 이동
 * 1 번 원반 : B -> A 이동
 * 2 번 원반 : B -> C 이동
 * 1 번 원반 : A -> C 이동
 */

import java.util.Scanner;

/**
 * Training 19
 */
public class CT01Training_19 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		System.out.print("원반 개수 입력 : ");
		int nNum = oScanner.nextInt();
		
		printResult_HanoiTower(nNum, 'A', 'C', 'B');
	}
	
	/** 하노이 탑 결과를 출력한다 */
	private static void printResult_HanoiTower(int a_nNum, char a_chFrom, char a_chTo, char a_chBuffer) {
		// 결과 출력이 불가능 할 경우
		if(a_nNum <= 0) {
			return;
		}
		
		printResult_HanoiTower(a_nNum - 1, a_chFrom, a_chBuffer, a_chTo);
		
		System.out.printf("%d 번 원반 : %c -> %c 이동\n",
				a_nNum, a_chFrom, a_chTo);
		
		printResult_HanoiTower(a_nNum - 1, a_chBuffer, a_chTo, a_chFrom);
	}
}
