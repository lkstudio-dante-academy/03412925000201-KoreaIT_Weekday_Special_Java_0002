package Example.Example_09;

/*
 * 메서드 or 함수 (Method or Function) 란?
 * - 명령문의 일부 or 전체를 떼어내서 재사용 할 수 있는 기능을 의미한다. (+ 즉, 메서드를 활용하면
 * 중복적으로 작성하는 명령문을 최소화 시키는 것이 가능하다.)
 *
 * 프로그래밍은 수학에서 시작했기 때문에 함수 또한 수학의 개념과 유사하다. (+ 즉, 함수는 입력과 출력이
 * 존재 한다는 것을 알 수 있다.)
 *
 * 단, 수학에서 함수는 반드시 입력과 출력이 존재하지만 프로그래밍에서 함수는 입력과 출력이 존재 할 수도 있고
 * 존재하지 않을 수도 있다. (+ 즉, 입력과 출력의 존재 여부에 따라 4 가지 유형이 존재 한다는 것을 알 수 있다.)
 *
 * Java 메서드 유형
 * - 입력 O, 출력 O			<- int someMethod(int a_nValA, int a_nValB)
 * - 입력 O, 출력 X			<- void someMethod(int a_nValA, int a_nValB)
 * - 입력 X, 출력 O			<- int someMethod()
 * - 입력 X, 출력 X			<- void someMethod()
 *
 * Java 메서드 구현 방법
 * - 반환형 (출력) + 메서드 이름 + 매개 변수 (입력) + 메서드 몸체
 *
 * Ex)
 * void someMethod(int a_nValA, int a_nValB) {
 * 		// Do Something
 * }
 *
 * someMethod(10, 20);
 *
 * 위와 같이 구현 된 메서드는 호출 (실행) 하는 것으로 메서드 내부에 존재하는 명령문을 동작 시키는 것이 가능하다.
 * (+ 즉, 메서드 내부에 존재하는 명령문은 메서드가 호출 되지 않으면 동작 하지 않는다는 것을 의미한다.)
 *
 * 또한 메서드에 매개 변수 (입력) 이 존재하면 반드시 메서드를 호출하면서 매개 변수의 개수만큼 데이터를
 * 입력으로 전달 해줘야한다. (+ 즉, 데이터의 개수와 매개 변수의 개수가 일치하지 않으면 컴파일 에러가
 * 발생 한다는 것을 의미한다.)
 *
 * 메서드에 입력 데이터가 필요 한 이유
 * - 프로그래밍에서 메서드가 실행 되기 위해 필요 한 데이터는 매개 변수 (입력) 로 전달 받는 것이 일반적이다.
 * (+ 즉, 데이터를 외부에서 전달 받음으로서 다양한 결과를 출력하는 것이 가능하다.)
 *
 * Ex)
 * int someMethodA() {
 * 		return 10 + 20;
 * }
 *
 * int someMethodB(int a_nValA, int a_nValB) {
 * 		return a_nValA + a_nValB;
 * }
 *
 * int nResultA = someMethodA();				<- 30 할당
 * int nResultB = someMethodB();				<- 30 할당
 *
 * int nResultC = someMethodB(10, 20);			<- 30 할당
 * int nResultD = someMethodC(20, 30);			<- 50 할당
 *
 * 위와 같이 someMethodA 는 호출 할 때마다 항상 30 의 결과를 반환하는 반면 someMethodB 는
 * 메서드가 실행 되기 위해 필요한 데이터를 외부에서 전달 받음으로서 다양한 결과를 반환하는 것이 가능하다.
 */

import java.util.Scanner;

/**
 * Example 9 (메서드 - 1)
 */
public class CE01Example_09 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		System.out.print("수식 입력 : ");
		
		/*
		 * split 메서드란?
		 * - 문자열을 특정 문자를 기준으로 쪼개는 역할을 수행하는 메서드를 의미한다. (+ 즉,
		 * split 메서드를 활용하면 문자열을 분할 시키는 것이 가능하다.)
		 *
		 * split 메서드에 의해서 쪼개진 문자열은 배열로 반환된다. (+ 즉, 문자열을 분할 시키면
		 * 2 개 이상의 문자열이 될 수 있기 때문에 쪼개진 문자열을 모두 관리 할 수 있는 배열을
		 * 반환 한다는 것을 알 수 있다.)
		 *
		 * Ex)
		 * String oStr = "1 2 3";
		 * String[] oTokens = oStr.split(" ");			<- [ "1", "2", "3" ] 배열 반환
		 *
		 * 위와 같이 oStr 변수가 참조하는 문자열을 공백을 기준으로 쪼개면 [ "1", "2", "3" ] 배열이
		 * 반환 된다는 것을 알 수 있다. (+ 즉, oTokens 변수에는
		 * [ "1", "2", "3" ] 배열을 참조 할 수 있는 참조 값이 할당 된다는 것을 의미한다.)
		 */
		String[] oTokens = oScanner.nextLine().split(" ");
		
		/*
		 * parse 계열 메서드란?
		 * - 문자열을 특정 자료형의 데이터로 변환하는 역할을 수행하는 메서드를 의미한다. (+ 즉,
		 * parse 계열 메서드를 활용하면 문자열을 숫자로 변환하는 등의 작업이 가능하다.)
		 *
		 * Ex)
		 * String oStr = "10";
		 * int nVal = Integer.parseInt(oStr);			<- 정수 10 할당
		 *
		 * 위와 같이 parse 계열 메서드를 활용하면 문자열 "10" 을 정수 10 으로 변환하는 것이 가능하다.
		 */
		int nValA = Integer.parseInt(oTokens[0]);
		int nValB = Integer.parseInt(oTokens[2]);
		
		String oOperator = oTokens[1];
		
		/*
		 * 메서드를 호출하면서 명시 한 데이터는 순차적으로 매개 변수에 복사 된다. (+ 즉,
		 * 매개 변수의 자료형에 맞게 데이터를 명시해야한다는 것을 알 수 있다.)
		 */
		double dblResult = getResult_Calc(nValA, oOperator, nValB);
		
		System.out.printf("결과 : %f\n", dblResult);
	}
	
	/** 수식 결과를 반환한다 */
	private static double getResult_Calc(int a_nValA, String a_oOperator, int a_nValB) {
		switch(a_oOperator) {
			case "+":
				/*
				 * return 키워드란?
				 * - 점프문 중 하나로서 프로그램의 흐름을 메서드를 호출 한 곳으로 이동 시키는 역할을
				 * 수행하는 키워드를 의미한다. (+ 즉, return 키워드가 실행 되면
				 * 메서드 실행이 즉시 중단 된다는 것을 알 수 있다.)
				 *
				 * 또한 return 키워드는 메서드를 호출 한 곳으로 데이터를 반환하는 역할을 수행한다. (+ 즉,
				 * return 키워드 옆에 데이터를 명시하면 해당 데이터를 메서드를 호출 한 곳으로
				 * 반환 한다는 것을 알 수 있다.)
				 *
				 * 메서드에 반환 데이터가 존재 할 경우 반드시 return 키워드를 통해서 데이터를
				 * 반환 해줘야한다. (+ 즉, 데이터를 반환하지 않으면 컴파일 에러가 발생 한다는 것을
				 * 알 수 있다.)
				 */
				return a_nValA + (double)a_nValB;
			
			case "-":
				return a_nValA - (double)a_nValB;
			
			case "*":
				return a_nValA * (double)a_nValB;
			
			case "/":
				return a_nValA / (double)a_nValB;
		}
		
		return 0.0;
	}
}
