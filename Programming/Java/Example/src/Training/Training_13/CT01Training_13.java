package Training.Training_13;

/*
 * Java 연습 문제 13
 * - 배열 이동 시키기
 * - 길이 5 배열을 생성 후 1 부터 차례대로 초기화한다
 * - 사용자로부터 메뉴를 입력 받아 배열을 해당 방향으로 이동 시킨다
 *
 * Ex)
 * =====> 배열 <=====
 * 1, 2, 3, 4, 5
 *
 * =====> 메뉴 <=====
 * 1. 왼쪽으로 이동
 * 2. 오른쪽으로 이동
 * 3. 종료
 *
 * 선택 : 1
 * -----> 배열 - 이동 후
 * 2, 3, 4, 5, 1
 *
 * 선택 : 2
 * -----> 배열 - 이동 후
 * 1, 2, 3, 4, 5
 *
 * 선택 : 3
 * 프로그램을 종료합니다.
 */

import java.util.Scanner;

/**
 * Training 13
 */
public class CT01Training_13 {
	/** 초기화 */
	public static void start(String[] args) {
		final int MENU_MOVE_LEFT = 1;
		final int MENU_MOVE_RIGHT = 2;
		final int MENU_EXIT = 3;
		
		Scanner oScanner = new Scanner(System.in);
		
		int[] oValues = {
				1, 2, 3, 4, 5
		};
		
		System.out.println("=====> 배열 <=====");
		
		for(int nVal : oValues) {
			System.out.printf("%d, ", nVal);
		}
		
		System.out.println("\n");
		
		do {
			System.out.println("=====> 메뉴 <=====");
			System.out.println("1. 왼쪽으로 이동");
			System.out.println("2. 오른쪽으로 이동");
			System.out.println("3. 종료");
			
			System.out.print("\n선택 : ");
			int nMenu = oScanner.nextInt();
			
			// 종료 일 경우
			if(nMenu == MENU_EXIT) {
				break;
			}
			
			switch(nMenu) {
				case MENU_MOVE_LEFT: {
					int nVal = oValues[0];
					
					for(int i = 0; i < oValues.length - 1; ++i) {
						oValues[i] = oValues[i + 1];
					}
					
					oValues[oValues.length - 1] = nVal;
					break;
				}
				case MENU_MOVE_RIGHT: {
					int nVal = oValues[oValues.length - 1];
					
					for(int i = oValues.length - 1; i > 0; --i) {
						oValues[i] = oValues[i - 1];
					}
					
					oValues[0] = nVal;
					break;
				}
			}
			
			System.out.println("-----> 배열 - 이동 후");
			
			for(int nVal : oValues) {
				System.out.printf("%d, ", nVal);
			}
			
			System.out.println("\n");
		} while(true);
		
		System.out.println("프로그램을 종료합니다.");
	}
}
