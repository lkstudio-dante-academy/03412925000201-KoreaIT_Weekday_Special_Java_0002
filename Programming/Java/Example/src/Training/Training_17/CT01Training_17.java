package Training.Training_17;

/*
 * Java 연습 문제 17
 * - 2 차원 배열 이동 시키기 (+ 메서드 활용)
 * - 요구 사항은 연습 문제 14 참고
 */

import java.util.Scanner;

/**
 * Training 17
 */
public class CT01Training_17 {
	/** 초기화 */
	public static void start(String[] args) {
		final int MENU_MOVE_UP = 1;
		final int MENU_MOVE_DOWN = 2;
		final int MENU_MOVE_LEFT = 3;
		final int MENU_MOVE_RIGHT = 4;
		final int MENU_EXIT = 5;
		
		Scanner oScanner = new Scanner(System.in);
		
		int[][] oMatrix = {
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 }
		};
		
		System.out.println("=====> 배열 <=====");
		printValues(oMatrix);
		
		System.out.println();
		
		do {
			System.out.println("=====> 메뉴 <=====");
			System.out.println("1. 위로 이동");
			System.out.println("2. 아래로 이동");
			System.out.println("3. 왼쪽으로 이동");
			System.out.println("4. 오른쪽으로 이동");
			System.out.println("5. 종료");
			
			System.out.print("\n선택 : ");
			int nMenu = oScanner.nextInt();
			
			// 종료 일 경우
			if(nMenu == MENU_EXIT) {
				break;
			}
			
			switch(nMenu) {
				case MENU_MOVE_UP: {
					moveValues_Up(oMatrix);
					break;
				}
				case MENU_MOVE_DOWN: {
					moveValues_Down(oMatrix);
					break;
				}
				case MENU_MOVE_LEFT: {
					moveValues_Left(oMatrix);
					break;
				}
				case MENU_MOVE_RIGHT: {
					moveValues_Right(oMatrix);
					break;
				}
			}
			
			System.out.println("-----> 배열 - 이동 후");
			printValues(oMatrix);
			
			System.out.println();
		} while(true);
		
		System.out.println("프로그램을 종료합니다.");
	}
	
	/** 메뉴를 출력한다 */
	private static void printMenu() {
		System.out.println("=====> 메뉴 <=====");
		System.out.println("1. 위로 이동");
		System.out.println("2. 아래로 이동");
		System.out.println("3. 왼쪽으로 이동");
		System.out.println("4. 오른쪽으로 이동");
		System.out.println("5. 종료");
		
		System.out.print("\n선택 : ");
	}
	
	/** 값을 출력한다 */
	private static void printValues(int[][] a_oMatrix) {
		for(int[] oValues : a_oMatrix) {
			for(int nVal : oValues) {
				System.out.printf("%d, ", nVal);
			}
			
			System.out.println();
		}
	}
	
	/** 값을 위로 이동 시킨다 */
	private static void moveValues_Up(int[][] a_oMatrix) {
		for(int i = 0; i < a_oMatrix[0].length; ++i) {
			int nVal = a_oMatrix[0][i];
			
			for(int j = 0; j < a_oMatrix.length - 1; ++j) {
				a_oMatrix[j][i] = a_oMatrix[j + 1][i];
			}
			
			a_oMatrix[a_oMatrix.length - 1][i] = nVal;
		}
	}
	
	/** 값을 아래로 이동 시킨다 */
	private static void moveValues_Down(int[][] a_oMatrix) {
		for(int i = 0; i < a_oMatrix[0].length; ++i) {
			int nVal = a_oMatrix[a_oMatrix.length - 1][i];
			
			for(int j = a_oMatrix.length - 1; j > 0; --j) {
				a_oMatrix[j][i] = a_oMatrix[j - 1][i];
			}
			
			a_oMatrix[0][i] = nVal;
		}
	}
	
	/** 값을 왼쪽으로 이동 시킨다 */
	private static void moveValues_Left(int[][] a_oMatrix) {
		for(int i = 0; i < a_oMatrix.length; ++i) {
			int nVal = a_oMatrix[i][0];
			
			for(int j = 0; j < a_oMatrix[i].length - 1; ++j) {
				a_oMatrix[i][j] = a_oMatrix[i][j + 1];
			}
			
			a_oMatrix[i][a_oMatrix[i].length - 1] = nVal;
		}
	}
	
	/** 값을 오른쪽으로 이동 시킨다 */
	private static void moveValues_Right(int[][] a_oMatrix) {
		for(int i = 0; i < a_oMatrix.length; ++i) {
			int nVal = a_oMatrix[i][a_oMatrix[i].length - 1];
			
			for(int j = a_oMatrix[i].length - 1; j > 0; --j) {
				a_oMatrix[i][j] = a_oMatrix[i][j - 1];
			}
			
			a_oMatrix[i][0] = nVal;
		}
	}
}
