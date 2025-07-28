package Example.Example_10;

/*
 * Java 변수 종류
 * - 지역 변수 (Local Variable)
 * - 멤버 변수 (Member Variable)			<- 클래스 학습 필요
 * - 클래스 변수 (Class Variable)			<- 클래스 학습 필요
 *
 * 지역 변수 (Local Variable) 란?
 * - 지역 내부에서 선언 된 변수를 의미한다.
 * Java 는 {} 기호를 통해 지역을 명시하는 것이 가능하며 해당 기호 내부에서 선언 된 변수를 지역 변수라 한다.
 *
 * 지역 변수는 변수가 선언 된 지역을 벗어나면 메모리에서 제거 되는 특징이 존재한다. (+ 즉,
 * 지역 변수가 선언 된 지역이 종료 되면 해당 변수에 더이상 접근이 불가능하다는 것을 알 수 있다.)
 *
 * 또한 지역 변수는 변수가 선언 된 지역 외부에서는 접근이 불가능하다. (+ 즉,
 * 외부 지역에서 다른 지역에 선언 된 지역 변수에 데이터를 할당 하거나 읽어들이는 것이 불가능하다는 것을
 * 의미한다.)
 */

/**
 * Example 10 (메서드 - 2)
 */
public class CE01Example_10 {
	/** 초기화 */
	public static void start(String[] args) {
		int nVal_Pow = getVal_Pow(2, 4);
		System.out.printf("결과 : %d\n", nVal_Pow);
		
		int nValA = 0;
		
		{
			int nValB = 20;
			
			/*
			 * 아래와 같이 하위 지역은 상위 지역의 일부로 인식하기 때문에 하위 지역에서
			 * 상위 지역에 선언 된 지역 변수에 접근하는 것이 가능하다.
			 */
			nValA = 10;
			
			System.out.println("\n=====> 하위 지역 <=====");
			System.out.printf("지역 변수 A : %d\n", nValA);
			System.out.printf("지역 변수 B : %d\n", nValB);
		}
		
		System.out.println("\n=====> 상위 지역 <=====");
		System.out.printf("지역 변수 A : %d\n", nValA);
		
		/*
		 * 아래와 같이 하위 지역에 선언 된 nValB 변수는 외부 지역에서 접근이 불가능 하다는 것을 알 수 있다.
		 * (+ 즉, 상위 지역도 외부 지역으로 인식 된다는 것을 알 수 있다.)
		 */
//		System.out.printf("지역 변수 B : %d\n", nValB);
	}
	
	/** 거듭 제곱 값을 반환한다 */
	private static int getVal_Pow(int a_nVal, int a_nPow) {
		int nVal_Pow = 1;
		
		for(int i = 0; i < a_nPow; ++i) {
			nVal_Pow *= a_nVal;
			
			/*
			 * 아래와 같이 nValA 는 start 메서드 내부에 선언 된 지역 변수이기 때문에
			 * getVal_Pow 메서드 내부에서 접근이 불가능하다는 것을 알 수 있다.
			 */
//			nVal_Pow *= nValA;
		}
		
		return nVal_Pow;
	}
}
