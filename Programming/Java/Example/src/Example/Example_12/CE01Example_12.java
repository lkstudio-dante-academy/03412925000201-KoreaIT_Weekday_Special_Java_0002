package Example.Example_12;

/*
 * 재귀 호출 (Recursive Call) 이란?
 * - 메서드가 자기 자신을 다시 호출하는 구조를 의미한다. (+ 즉, 재귀 호출은 반복을 끝내기 위한
 * 명령문이 반드시 필요하다는 것을 알 수 있다.)
 *
 * 재귀 호출은 재귀적으로 발생하는 복잡한 문제를 쉽게 풀어 내는 것이 가능하기 때문에
 * 고급 알고리즘 (+ Ex. 다이나믹 프로그래밍) 을 공부하기 위해서 필수로 공부해야되는 기능이다. (+ 즉,
 * 재귀 호출을 통해 복잡한 문제를 단순화 시킨다는 것을 의미한다.)
 *
 * Ex)
 * void someMethod() {
 *		someMethod();
 * }
 *
 * someMethod();
 *
 * 위와 같이 재귀 호출을 끝내기 위한 명령문을 작성하지 않을 경우 무한 루프에 빠진다는 것을 알 수 있다.
 */

import java.util.Scanner;

/**
 * Example 12 (메서드 - 4)
 */
public class CE01Example_12 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		System.out.print("정수 (팩토리얼) 입력 : ");
		int nVal_Factorial = oScanner.nextInt();
		
		System.out.printf("%d! = %d\n", nVal_Factorial, getVal_Factorial(nVal_Factorial));
		
		System.out.print("\n정수 (피보나치) 입력 : ");
		int nVal_Fibonacci = oScanner.nextInt();
		
		System.out.printf("결과 : %d\n", getVal_Fibonacci(nVal_Fibonacci));
		int[] oValues = new int[10];
		
		for(int i = 0; i < oValues.length; ++i) {
			oValues[i] = i + 1;
		}
		
		System.out.println("\n=====> 배열 <=====");
		
		for(int i = 0; i < oValues.length; ++i) {
			System.out.printf("%d, ", oValues[i]);
		}
		
		int nVal_Sum = getVal_Sum(oValues, 0);
		System.out.printf("\n\n합계 : %d\n", nVal_Sum);
	}
	
	/** 팩토리얼 값을 반환한다 */
	private static int getVal_Factorial(int a_nVal) {
		// 재귀 호출이 불가능 할 경우
		if(a_nVal <= 0) {
			return 1;
		}
		
		/*
		 * 아래와 같이 메서드는 자기 자신을 다시 호출하는 것이 가능하다. (+ 즉, 재귀 호출 구조라는 것을
		 * 알 수 있다.)
		 */
		return a_nVal * getVal_Factorial(a_nVal - 1);
	}
	
	/** 피보나치 값을 반환한다 */
	private static int getVal_Fibonacci(int a_nVal) {
		// 재귀 호출이 불가능 할 경우
		if(a_nVal <= 1) {
			return (a_nVal <= 0) ? 0 : 1;
		}
		
		return getVal_Fibonacci(a_nVal - 1) + getVal_Fibonacci(a_nVal - 2);
	}
	
	/** 합계를 반환한다 */
	private static int getVal_Sum(int[] a_oValues, int a_nIdx) {
		// 재귀 호출이 불가능 할 경우
		if(a_nIdx >= a_oValues.length) {
			return 0;
		}
		
		return a_oValues[a_nIdx] + getVal_Sum(a_oValues, a_nIdx + 1);
	}
}
