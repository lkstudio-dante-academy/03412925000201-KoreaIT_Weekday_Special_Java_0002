package Example.Example_05;

/*
 * 조건문이란?
 * - 프로그램의 흐름을 제어하는 제어문 중 하나로서 주어진 조건에 따라 프로그램의 흐름을 분산 시키는 기능을
 * 의미한다. (+ 즉, 조건문을 활용하면 다양한 결과를 출력하는 프로그램을 제작하는 것이 가능하다.)
 *
 * Java 조건문 종류
 * - if ~ else
 * - switch ~ case
 *
 * Ex)
 * if(조건문 A) {
 * 		// 조건문 A 를 만족 할 경우 실행 할 명령문
 * } else if(조건문 B) {
 * 		// 조건문 B 를 만족 할 경우 실행 할 명령문
 * } else {
 * 		// 조건문 A 와 조건문 B 를 만족하지 않을 경우 실행 할 명령문
 * }
 *
 * switch(조건 데이터) {
 * 		case 조건 A:
 * 			// 조건 A 를 만족 할 경우 실행 할 명령문
 *
 * 		case 조건 B:
 * 			// 조건 B 를 만족 할 경우 실행 할 명령문
 *
 * 		default:
 * 			// 조건 A 와 조건 B 를 만족하지 않을 경우 실행 할 명령문
 * }
 *
 * 위와 같이 Java 는 if ~ else 조건문과 switch ~ case 조건문을 지원하며 만약 여러 조건문을 만족 할 경우
 * 가장 먼저 만족한 조건문에 해당하는 명령문만 실행 된다는 특징이 존재한다. (+ 즉, 조건문은
 * 위에서 아래 방향으로 순차적으로 검사 된다는 것을 알 수 있다.)
 *
 * if ~ else 조건문 vs switch ~ case 조건문
 * - if ~ else 조건문은 다양한 연산자를 활용해서 복잡한 조건을 검사하는 것이 가능하다. (+ 즉,
 * 관계 연산자와 같이 결과 데이터가 참 or 거짓이 반환 되는 모든 연산자를 사용 할 수 있다.)
 *
 * 단, if ~ else 조건문은 여러 조건문이 존재 할 경우 항상 처음부터 순차적으로 검사를 수행하기 때문에
 * switch ~ case 조건문에 비해 조건문을 비교하는 횟수가 많다는 단점이 존재한다.
 *
 * 반면 switch ~ case 조건문은 단순한 동등 비교만 가능하지만 if ~ else 조건문에 비해 Java 컴파일러에 의해
 * 명령문이 최적화 될 여지가 있다는 장점이 존재한다. (+ 즉, switch ~ case 조건문이 if ~ else 조건문에 비해
 * 빠르게 동작 할 수 있다는 것을 의미한다.)
 *
 * if vs else if
 * - if 문은 서로 다른 조건문이지만 else if 는 같은 조건문이라는 차이점이 존재한다. (+ 즉, if 문을
 * 연속으로 작성 할 경우 각 if 문은 별개의 조건문이라 조건을 모두 만족 할 경우 각 if 문에 존재하는 명령문이
 * 모두 실행 되는 반면 else if 문은 같은 조건문이기 때문에 가장 먼저 조건을 만족한 명령문만 실행 된다는 것을
 * 알 수 있다.)
 *
 * Ex)
 * int nVal = 10;
 *
 * if(nVal >= 5) {
 * 		// Do Something
 * }
 *
 * if(nVal >= 10) {
 * 		// Do Something
 * }
 *
 * 위의 경우 if 문은 서로 다른 조건문이기 때문에 첫 번째 조건문과 두 번째 조건문에 존재하는 명령문이
 * 모두 실행 된다는 것을 알 수 있다.
 *
 * if(nVal >= 5) {
 * 		// Do Something
 * } else if(nVal >= 10) {
 * 		// Do Something
 * }
 *
 * 반면 else if 문은 같은 조건문이기 때문에 먼저 조건을 만족 한 첫 번째 조건문에 존재하는 명령문만
 * 실행 된다는 것을 알 수 있다.
 */

import java.util.Scanner;

/**
 * Example 5 (조건문)
 */
public class CE01Example_05 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int nScore = oScanner.nextInt();
		
		System.out.println("\n=====> if ~ else 조건문 <=====");
		
		// F 학점 일 경우
		if(nScore < 60) {
			System.out.println("F 학점입니다.");
		} else {
			/*
			 * 아래와 같이 조건문은 필요에 따라 중첩이 가능하다. (+ 즉, 조건문 내부에 조건문을 작성하는 것이
			 * 가능하다는 것을 의미한다.)
			 */
			// A 학점 일 경우
			if(nScore >= 90) {
				System.out.println("A 학점입니다.");
			}
			// B 학점 일 경우
			else if(nScore >= 80) {
				System.out.println("B 학점입니다.");
			}
			// C 학점 일 경우
			else if(nScore >= 70) {
				System.out.println("C 학점입니다.");
			}
			// D 학점 일 경우
			else {
				System.out.println("D 학점입니다.");
			}
		}
		
		System.out.println("\n=====> switch ~ case 조건문 <=====");
		
		switch(nScore / 10) {
			case 9:
			case 10:
				System.out.println("A 학점입니다.");
				
				/*
				 * break 키워드란?
				 * - 점프문 중 하나로서 프로그램의 흐름을 가장 가까운 조건문 or 반복문 밖으로
				 * 이동 시키는 역할을 수행하는 키워드를 의미한다.
				 *
				 * switch ~ case 조건문은 if ~ else 조건문과 달리 조건을 만족한 명령문만을 실행하는 것이
				 * 아니기 때문에 특정 조건을 만족하는 명령문만을 실행하고 싶다면
				 * 반드시 break 키워드를 명시해서 프로그램의 흐름을 switch ~ case 조건문 밖으로
				 * 이동 시켜줘야한다.
				 */
				break;
			
			case 8:
				System.out.println("B 학점입니다.");
				break;
			
			case 7:
				System.out.println("C 학점입니다.");
				break;
			
			case 6:
				System.out.println("D 학점입니다.");
				break;
			
			default:
				System.out.println("F 학점입니다.");
				break;
		}
		
		System.out.print("\n정수 (1 ~ 10) 입력 : ");
		int nVal = oScanner.nextInt();
		
		int nVal_Sum = 0;
		
		switch(nVal) {
			case 10:
				nVal_Sum += 10;
			
			case 9:
				nVal_Sum += 9;
			
			case 8:
				nVal_Sum += 8;
			
			case 7:
				nVal_Sum += 7;
			
			case 6:
				nVal_Sum += 6;
			
			case 5:
				nVal_Sum += 5;
			
			case 4:
				nVal_Sum += 4;
			
			case 3:
				nVal_Sum += 3;
			
			case 2:
				nVal_Sum += 2;
			
			case 1:
				nVal_Sum += 1;
		}
		
		System.out.printf("1 ~ %d 합계 : %d\n", nVal, nVal_Sum);
	}
}
