package Training.Training_11;

/*
 * Java 연습 문제 11
 * - 구구단 출력하기
 * - 2 ~ 9 단까지 구구단을 출력한다
 * - 단, 한 줄 출력되는 구구단은 3 개를 동시에 출력하고
 * 단이 바뀔 때마다 동시에 출력되는 구구단을 1 씩 줄인다
 *
 * Ex)
 * 2 * 1 = 2	3 * 1 = 3	4 * 1 = 4
 * 2 * 2 = 4	3 * 2 = 6	4 * 2 = 8
 * ...이하 생략
 *
 * 5 * 1 = 5	6 * 1 = 6
 * 5 * 2 = 10	6 * 2 = 12
 * ...이하 생략
 *
 * 7 * 1 = 7
 * 7 * 2 = 14
 * ...이하 생략
 *
 * 8 * 1 = 8
 * 8 * 2 = 16
 * ...이하 생략
 *
 * 9 * 1 = 9
 * 9 * 2 = 18
 * ...이하 생략
 */

/**
 * Training 11
 */
public class CT01Training_11 {
	/** 초기화 */
	public static void start(String[] args) {
		int nStep = 4;
		
		for(int i = 2; i < 10; i += nStep) {
			nStep = Math.max(1, nStep - 1);
			
			for(int j = 1; j < 10; ++j) {
				for(int k = 0; k < nStep; ++k) {
					// 구구단 출력이 불가능 할 경우
					if(i + k >= 10) {
						break;
					}
					
					int nVal = i + k;
					System.out.printf("%d * %d = %-4d", nVal, j, nVal * j);
				}
				
				System.out.println();
			}
			
			System.out.println();
		}
	}
}
