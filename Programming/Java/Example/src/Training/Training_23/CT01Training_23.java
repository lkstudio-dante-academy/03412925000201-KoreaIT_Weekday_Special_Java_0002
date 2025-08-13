package Training.Training_23;

/*
 * Java 연습 문제 23
 * - 상점 시뮬레이션 제작하기
 * - 상점에는 서로 다른 가격의 물건 3 개가 존재한다
 * - 사용자로부터 초기 금액을 입력 받은 후 해당 금액으로 상점에 물건을 구입한다
 * - 단, 각 물건에는 재고가 존재하며 재고가 모두 떨어진 물건은 구입 불가
 *
 * Ex)
 * 초기 금액 입력 : 1000
 *
 * =====> 상점 <=====
 * 1. 물건 A 구입 (가격 : 150, 재고 : 2)
 * 2. 물건 B 구입 (가격 : 250, 재고 : 3)
 * 3. 물건 C 구입 (가격 : 500, 재고 : 1)
 * 4. 나가기
 *
 * 선택 (현재 소지 금액 : 1000) : 3
 * 물건 C 을(를) 구입했습니다.
 *
 * 선택 (현재 소지 금액 : 500) : 3
 * 물건 C 는 재고가 모두 소진되었습니다.
 */

import java.util.Scanner;

/**
 * Training 23
 */
public class CT01Training_23 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		CStore oStore = new CStore();
		oStore.addStuff(new CStuff("물건 A", 150, 2));
		oStore.addStuff(new CStuff("물건 B", 250, 3));
		oStore.addStuff(new CStuff("물건 C", 500, 1));
		
		System.out.print("소지 금액 입력 : ");
		int nAmount = oScanner.nextInt();
		
		final int MENU_EXIT = oStore.getNumKinds_Stuff() + 1;
		System.out.println();
		
		do {
			printMenu(oStore, nAmount);
			int nMenu = oScanner.nextInt();
			
			// 종료 일 경우
			if(nMenu == MENU_EXIT) {
				break;
			}
			
			CStuff oStuff = oStore.getStuff(nMenu - 1);
			
			// 금액이 부족 할 경우
			if(nAmount < oStuff.getPrice()) {
				System.out.println("비용이 부족합니다.\n");
				continue;
			}
			
			// 재고가 모두 소진 되었을 경우
			if(oStuff.getNumStuffs() <= 0) {
				System.out.printf("%s 은(는) 재고가 모두 소진 되었습니다.\n\n",
						oStuff.getName());
				
				continue;
			}
			
			nAmount = Math.max(0, nAmount - oStuff.getPrice());
			oStore.buyStuff(nMenu - 1);
			
			System.out.printf("%s 을(를) 구입했습니다.\n\n",
					oStuff.getName());
		} while(true);
		
		System.out.println("프로그램을 종료합니다.");
	}
	
	/** 메뉴를 출력한다 */
	private static void printMenu(CStore a_oStore, int a_nAmount) {
		System.out.println("=====> 상점 <=====");
		
		for(int i = 0; i < a_oStore.getNumKinds_Stuff(); ++i) {
			CStuff oStuff = a_oStore.getStuff(i);
			
			System.out.printf("%d. %s (금액 : %d, 재고 : %d)\n",
					i + 1, oStuff.getName(), oStuff.getPrice(), oStuff.getNumStuffs());
		}
		
		System.out.printf("%d. 나가기\n", a_oStore.getNumKinds_Stuff() + 1);
		System.out.printf("\n선택 (현재 소지 금액 : %d) : ", a_nAmount);
	}
}
