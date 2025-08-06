package Training.Training_16;

/*
 * Java 연습 문제 16
 * - 배열 이동 시키기 (+ 메서드 활용)
 * - 요구 사항은 연습 문제 13 번 참고
 */

import java.util.Scanner;

/**
 * Training 16
 */
public class CT01Training_16 {
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
		printValues(oValues);
		
		System.out.println();
		
		do {
			printMenu();
			int nMenu = oScanner.nextInt();
			
			// 종료 일 경우
			if(nMenu == MENU_EXIT) {
				break;
			}
			
			switch(nMenu) {
				case MENU_MOVE_LEFT: {
					moveValues_Left(oValues);
					break;
				}
				case MENU_MOVE_RIGHT: {
					moveValues_Right(oValues);
					break;
				}
			}
			
			System.out.println("-----> 배열 - 이동 후");
			printValues(oValues);
			
			System.out.println();
		} while(true);
		
		System.out.println("프로그램을 종료합니다.");
	}
	
	/** 메뉴를 출력한다 */
	private static void printMenu() {
		System.out.println("=====> 메뉴 <=====");
		System.out.println("1. 왼쪽으로 이동");
		System.out.println("2. 오른쪽으로 이동");
		System.out.println("3. 종료");
		
		System.out.print("\n선택 : ");
	}
	
	/** 값을 출력한다 */
	private static void printValues(int[] a_oValues) {
		for(int nVal : a_oValues) {
			System.out.printf("%d, ", nVal);
		}
		
		System.out.println();
	}
	
	/** 값을 왼쪽으로 이동 시킨다 */
	private static void moveValues_Left(int[] a_oValues) {
		int nVal = a_oValues[0];
		
		for(int i = 0; i < a_oValues.length - 1; ++i) {
			a_oValues[i] = a_oValues[i + 1];
		}
		
		a_oValues[a_oValues.length - 1] = nVal;
	}
	
	/** 값을 오른쪽으로 이동 시킨다 */
	private static void moveValues_Right(int[] a_oValues) {
		int nVal = a_oValues[a_oValues.length - 1];
		
		for(int i = a_oValues.length - 1; i > 0; --i) {
			a_oValues[i] = a_oValues[i - 1];
		}
		
		a_oValues[0] = nVal;
	}
}
