package Example.Example_07;

/*
 * 중첩 반복문이란?
 * - 반복문 내부에 반복문을 작성하는 구조를 의미한다. (+ 즉, 반복문은 필요에 따라 중첩이 가능하다는 것을
 * 의미한다.)
 *
 * Ex)
 * for(int i = 0; i < 10; ++i) {
 * 		for(int j = 0; j < 10; ++j) {
 * 			// Do Something
 * 		}
 * }
 *
 * 위와 같이 반복문 내부에 반복문을 작성하면 외부 반복문이 반복 할 때마다 내부 반복문이 실행 된다는 것을
 * 알 수 있다. (+ 즉, 위의 경우 내부 반복문은 10 번 실행 된다는 것을 알 수 있다.)
 */

/**
 * Example 7 (반복문 - 2)
 */
public class CE01Example_07 {
	/** 초기화 */
	public static void start(String[] args) {
		for(int i = 2; i < 10; ++i) {
			System.out.printf("=====> %d 단 <=====\n", i);
			
			for(int j = 1; j < 10; ++j) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
			
			System.out.println();
		}
	}
}
