package Training.Training_18;

/*
 * Java 연습 문제 18
 * - 야구 게임 제작하기
 * - 1 ~ 9 사이의 수에서 중복되지 않는 4 개의 수를 추출한다
 * - 사용자로부터 4 개의 수를 입력받아 스트라이크 or 볼 여부를 검사한다
 * - 입력 받은 수가 정답에 존재하고 위치가 동일 할 경우 스트라이크
 * - 입력 받은 수가 정답에 존재하지만 위치가 다를 경우 볼
 * - 4 스트라이크가 되면 게임을 종료한다
 *
 * Ex)
 * 정답 : 1 9 6 3
 *
 * 정수 (4 개) 입력 : 1 6 9 3
 * 결과 : 2 Strike, 2 Ball
 *
 * 정수 (4 개) 입력 : 1 9 6 3
 * 결과 : 4 Strike, 0 Ball
 *
 * 프로그램을 종료합니다.
 */

import java.util.Random;
import java.util.Scanner;

/**
 * Training 18
 */
public class CT01Training_18 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		int[] oAnswer = new int[4];
		
		setupAnswer(oAnswer);
		System.out.print("정답 : ");
		
		for(int nVal : oAnswer) {
			System.out.printf("%d, ", nVal);
		}
		
		System.out.println("\n");
		
		do {
			System.out.print("정수 (4 개) 입력 : ");
			String[] oTokens = oScanner.nextLine().split(" ");
			
			int nCount_Strike = 0;
			int nCount_Ball = 0;
			
			for(int i = 0; i < oTokens.length; ++i) {
				int nVal = Integer.parseInt(oTokens[i]);
				
				for(int j = 0; j < oAnswer.length; ++j) {
					// 숫자가 다를 경우
					if(nVal != oAnswer[j]) {
						continue;
					}
					
					nCount_Strike += (i == j) ? 1 : 0;
					nCount_Ball += (i != j) ? 1 : 0;
					
					break;
				}
			}
			
			System.out.printf("결과 : %d Strike, %d Ball\n\n",
					nCount_Strike, nCount_Ball);
			
			// 4 스트라이크 일 경우
			if(nCount_Strike >= oAnswer.length) {
				break;
			}
		} while(true);
		
		System.out.println("프로그램을 종료합니다.");
	}
	
	/** 정답을 설정한다 */
	private static void setupAnswer(int[] a_oValues) {
		Random oRandom = new Random();
		
		int[] oValues_Temp = {
			1, 2, 3, 4, 5, 6, 7, 8, 9
		};
		
		for(int i = 0; i < oValues_Temp.length; ++i) {
			int nIdx = oRandom.nextInt(0, oValues_Temp.length);
			
			int nTemp = oValues_Temp[i];
			oValues_Temp[i] = oValues_Temp[nIdx];
			oValues_Temp[nIdx] = nTemp;
		}
		
		for(int i = 0; i < a_oValues.length; ++i) {
			a_oValues[i] = oValues_Temp[i];
		}
	}
}
