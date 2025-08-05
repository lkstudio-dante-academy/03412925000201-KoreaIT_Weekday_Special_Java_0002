package Training.Training_15;

/*
 * Java 연습 문제 15
 * - 삼각형 형태로 배열 초기화하기
 * - 사용자로부터 크기를 입력 받은 후 해당 크기만큼 배열을 생성한다
 * - 생성 된 배열을 반복문을 이용해서 1 부터 차례대로 삼각형 형태로 초기화한다
 *
 * Ex)
 * 크기 입력 : 5
 *
 * =====> 배열 <=====
 *  1  0  0  0  0
 * 12  2  0  0  0
 * 11 13  3  0  0
 * 10 15 14  4  0
 *  9  8  7  6  5
 */

import java.util.Scanner;

/**
 * Training 15
 */
public class CT01Training_15 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		System.out.print("크기 입력 : ");
		int nSize = oScanner.nextInt();
		
		int[][] oMatrix = new int[nSize][nSize];
		
		int i = -1;
		int j = -1;
		
		int nTimes = nSize;
		
		int nVal = 0;
		int nVal_Max = (nSize * (nSize + 1)) / 2;
		
		while(nVal < nVal_Max) {
			for(int k = 0; k < nTimes; ++k) {
				oMatrix[++i][++j] = ++nVal;
			}
			
			nTimes -= 1;
			
			for(int k = 0; k < nTimes; ++k) {
				oMatrix[i][--j] = ++nVal;
			}
			
			nTimes -= 1;
			
			for(int k = 0; k < nTimes; ++k) {
				oMatrix[--i][j] = ++nVal;
			}
			
			nTimes -= 1;
		}
		
		System.out.println("\n=====> 배열 <=====");
		
		for(int[] oValues : oMatrix) {
			for(int nVal_Matrix : oValues) {
				System.out.printf("%3d, ", nVal_Matrix);
			}
			
			System.out.println();
		}
	}
}
