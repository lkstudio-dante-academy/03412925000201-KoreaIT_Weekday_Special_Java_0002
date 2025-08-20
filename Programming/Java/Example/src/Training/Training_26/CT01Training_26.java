package Training.Training_26;

/*
 * Java 연습 문제 26
 * - 회원 관리 프로그램 제작하기 (+ 파일 활용)
 * - 요구 사항 연습 문제 21 번 참고
 */

import Training.Training_21.CManager_Member;

import java.util.Scanner;

/**
 * Training 26
 */
public class CT01Training_26 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		CManager_Member oManager = new CManager_Member();
		oManager.loadMembers_FromFile("P_T01Training_26_01.txt");
		
		do {
			printMenu();
			int nMenu = oScanner.nextInt();
			
			// 종료 일 경우
			if(nMenu == MENU_EXIT) {
				break;
			}
			
			switch(nMenu) {
				case MENU_ADD_MEMBER:
					addMember(oManager);
					break;
				
				case MENU_REMOVE_MEMBER:
					removeMember(oManager);
					break;
				
				case MENU_SEARCH_MEMBER:
					searchMember(oManager);
					break;
				
				case MENU_UPDATE_MEMBER:
					updateMember(oManager);
					break;
				
				case MENU_SHOW_MEMBERS_ALL:
					printMembers_All(oManager);
					break;
			}
			
			oManager.saveMembers_ToFile("P_T01Training_26_01.txt");
			System.out.println();
		} while(true);
		
		System.out.println("프로그램을 종료합니다.");
	}
	
	/**
	 * 메뉴
	 */
	private static final int MENU_ADD_MEMBER = 1;
	private static final int MENU_REMOVE_MEMBER = 2;
	private static final int MENU_SEARCH_MEMBER = 3;
	private static final int MENU_UPDATE_MEMBER = 4;
	private static final int MENU_SHOW_MEMBERS_ALL = 5;
	private static final int MENU_EXIT = 6;
	
	/** 메뉴를 출력한다 */
	private static void printMenu() {
		System.out.println("=====> 메뉴 <=====");
		System.out.println("1. 회원 추가");
		System.out.println("2. 회원 제거");
		System.out.println("3. 회원 검색");
		System.out.println("4. 회원 갱신");
		System.out.println("5. 모든 회원 출력");
		System.out.println("6. 종료");
		
		System.out.print("\n선택 : ");
	}
	
	/** 회원을 추가한다 */
	private static void addMember(CManager_Member a_oManager) {
		Scanner oScanner = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String oName = oScanner.nextLine();
		
		System.out.print("전화 번호 입력 : ");
		String oPNumber = oScanner.nextLine();
		
		int nResult = a_oManager.findMember(oName);
		
		// 회원이 존재 할 경우
		if(nResult >= 0) {
			System.out.printf("%s 은(는) 이미 존재하는 회원입니다.\n", oName);
			return;
		}
		
		a_oManager.addMember(oName, oPNumber);
		System.out.printf("%s 을(를) 추가했습니다.\n", oName);
	}
	
	/** 회원을 제거한다 */
	private static void removeMember(CManager_Member a_oManager) {
		Scanner oScanner = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String oName = oScanner.nextLine();
		
		int nResult = a_oManager.findMember(oName);
		
		// 회원이 없을 경우
		if(nResult < 0) {
			System.out.printf("%s 은(는) 존재하지않습니다.\n", oName);
			return;
		}
		
		a_oManager.removeMember(oName);
		System.out.printf("%s 을(를) 제거했습니다.\n", oName);
	}
	
	/** 회원을 검색한다 */
	private static void searchMember(CManager_Member a_oManager) {
		Scanner oScanner = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String oName = oScanner.nextLine();
		
		int nResult = a_oManager.findMember(oName);
		
		// 회원이 없을 경우
		if(nResult < 0) {
			System.out.printf("%s 은(는) 존재하지않습니다.\n", oName);
			return;
		}
		
		System.out.println("=====> 회원 정보 <=====");
		a_oManager.searchMember(oName);
	}
	
	/** 회원을 갱신한다 */
	private static void updateMember(CManager_Member a_oManager) {
		Scanner oScanner = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String oName = oScanner.nextLine();
		
		int nResult = a_oManager.findMember(oName);
		
		// 회원이 없을 경우
		if(nResult < 0) {
			System.out.printf("%s 은(는) 존재하지않습니다.\n", oName);
			return;
		}
		
		System.out.print("새로운 이름 입력 : ");
		String oName_New = oScanner.nextLine();
		
		System.out.print("새로운 전화 번호 입력 : ");
		String oName_PNumber = oScanner.nextLine();
		
		nResult = a_oManager.findMember(oName_New);
		
		// 회원이 존재 할 경우
		if(nResult >= 0) {
			System.out.printf("%s 은(는) 이미 존재하는 회원입니다.\n", oName_New);
			return;
		}
		
		a_oManager.updateMember(oName, oName_New, oName_PNumber);
		System.out.printf("기존 %s 의 정보를 갱신했습니다.\n", oName);
	}
	
	/** 모든 회원을 출력한다 */
	private static void printMembers_All(CManager_Member a_oManager) {
		System.out.println("=====> 모든 회원 정보 <=====");
		a_oManager.showMembers_All();
	}
}
