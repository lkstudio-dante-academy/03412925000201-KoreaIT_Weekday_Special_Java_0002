package Example.Example_11;

/*
 * 메서드 오버로딩 (Method Overloading) 이란?
 * - 동일한 이름의 메서드를 중복으로 구현 할 수 있는 기능을 의미한다. (+ 즉, 일반적으로 변수와 마찬가지로
 * 동일한 이름의 메서드를 구현하는 것은 불가능하다.)
 *
 * Java 는 메서드 한정으로 동일한 이름의 메서드를 구현 할 수 있는 메서드 오버로딩 기능을 지원하며
 * 메서드가 오버로딩 되기 위해서는 매개 변수 정보가 달라야한다. (+ 즉, 메서드 이름이 동일하더라도
 * 매개 변수가 정보가 다르다면 Java 는 서로 다른 메서드로 인식 된다는 것을 알 수 있다.)
 *
 * Ex)
 * void someMethod(int a_nVal);
 * void someMethod(int a_nValA, int a_nValB);
 *
 * 위의 경우 매개 변수 개수가 다르기 때문에 메서드 오버로딩 규칙이 성립 한다는 것을 알 수 있다.
 *
 * void someMethod(int a_nVal);
 * void someMethod(float a_fVal);
 *
 * 위의 경우 매개 변수 개수는 동일하지만 자료형이 서로 다르기 때문에 역시나 메서드 오버로딩 규칙이 성립한다는 것을
 * 알 수 있다.
 *
 * int someMethod(int a_nVal);
 * void someMethod(int a_nVal);
 *
 * 위의 경우 반환형이 다르지만 매개 변수 정보가 서로 동일하기 때문에 메서드 오버로딩 규칙이 성립하지 않는다는 것을
 * 알 수 있다. (+ 즉, 컴파일 에러가 발생한다.)
 *
 * 가변 길이 매개 변수 (Variable Parameter) 란?
 * - 일반적인 매개 변수와 달리 매개 변수의 개수가 고정 되어있지 않는 매개 변수를 의미한다. (+ 즉,
 * 가변 길이 매개 변수를 활용하면 매개 변수 개수가 유동적인 메서드를 구현하는 것이 가능하다.)
 *
 * 단, 가변 길이 매개 변수는 배열에 형태로 데이터를 전달 받기 때문에 동일한 자료형의 데이터만
 * 가변 길이 매개 변수로 전달하는 것이 가능하다. (+ 즉, 서로 다른 자료형의 데이터를
 * 가변 길이 매개 변수에 전달하는 것은 불가능하다는 것을 의미한다.)
 *
 * Ex)
 * void someMethod(int... a_oValues) {
 * 		// Do Something
 * }
 *
 * someMethod(1);
 * someMethod(1, 2);
 * someMethod(1, 2, 3);
 *
 * 위와 같이 가변 길이 매개 변수는 개수가 고정 되어있지 않기 때문에
 * 메서드 호출 시 마다 전달하는 데이터의 개수가 달라 질 수 있다는 것을 알 수 있다.
 */

/**
 * Example 11 (메서드 - 3)
 */
public class CE01Example_11 {
	/** 초기화 */
	public static void start(String[] args) {
		/*
		 * 아래와 같이 오버로딩 된 메서드는 입력으로 전달 되는 데이터를 기반으로 Java 컴파일러가
		 * 호출 할 메서드를 자동으로 판단 한다는 것을 알 수 있다. (+ 즉, 호출 할 메서드를 명시적으로
		 * 지정해 줄 필요가 없다는 것을 의미한다.)
		 */
		int nVal_MaxA = getVal_Max(10, 20);
		int nVal_MaxB = getVal_Max(10, 20, 30);
		
		System.out.println("=====> 메서드 오버로딩 <=====");
		System.out.printf("최대 값 A : %d\n", nVal_MaxA);
		System.out.printf("최대 값 B : %d\n", nVal_MaxB);
		
		/*
		 * 아래와 같이 가변 길이 매개 변수는 입력으로 전달 될 데이터를 Java 컴파일러가 자동으로 배열로
		 * 변환 해 준다. (+ 즉, 명시적으로 배열을 생성해서 전달하는 것도 가능하다는 것을 의미한다.)
		 *
		 * Ex)
		 * void someMethod(int... a_oValues) {
		 * 		// Do Something
		 * }
		 *
		 * someMethod(1, 2, 3)			<- new int[] { 1, 2, 3 } 배열로 변환
		 *
		 * 위와 같이 가변 길이 매개 변수에 전달 되는 데이터는 Java 컴파일러에 의해서 자동으로 배열로
		 * 변환 된다는 것을 알 수 있다.
		 */
		int nVal_SumA = getVal_Sum(1, 2, 3);
		int nVal_SumB = getVal_Sum(1, 2, 3, 4, 5, 6);
		int nVal_SumC = getVal_Sum(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		System.out.println("\n=====> 가변 길이 매개 변수 <=====");
		System.out.printf("합계 A : %d\n", nVal_SumA);
		System.out.printf("합계 B : %d\n", nVal_SumB);
		System.out.printf("합계 C : %d\n", nVal_SumC);
	}
	
	/** 최대 값을 반환한다 */
	private static int getVal_Max(int a_nValA, int a_nValB) {
		return (a_nValA >= a_nValB) ? a_nValA : a_nValB;
	}
	
	/** 최대 값을 반환한다 */
	private static int getVal_Max(int a_nValA, int a_nValB, int a_nValC) {
		int nVal_Max = getVal_Max(a_nValA, a_nValB);
		return getVal_Max(nVal_Max, a_nValC);
	}
	
	/** 합계를 반환한다 */
	private static int getVal_Sum(int... a_oValues) {
		int nVal_Sum = 0;
		
		/*
		 * 가변 길이 매개 변수는 배열의 형태로 데이터가 전달 되기 때문에 반복문과 length 변수를 활용하면
		 * 입력으로 전달 된 데이터에 접근하는 것이 가능하다. (+ 즉, foreach 반복문을 사용하는 것도
		 * 가능하다는 것을 의미한다.)
		 */
		for(int i = 0; i < a_oValues.length; ++i) {
			nVal_Sum += a_oValues[i];
		}
		
		return nVal_Sum;
	}
}
