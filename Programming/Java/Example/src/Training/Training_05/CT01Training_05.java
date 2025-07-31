package Training.Training_05;

/*
 * Java 연습 문제 5
 * - 학점 계산하기 (+ if ~ else 조건문, switch ~ case 조건문 활용)
 * - 사용자로부터 1 ~ 100 사이의 점수를 입력 받아 해당 점수의 학점을 출력한다
 *
 * 세부 학점 범위
 * - 7 ~ 9 : +
 * - 4 ~ 6 : 0
 * - 0 ~ 3 : -
 *
 * Ex)
 * 점수 입력 : 95
 * A0 학점입니다.
 */

import java.util.Scanner;

/**
 * Training 5
 */
public class CT01Training_05 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int nScore = oScanner.nextInt();
		
		String oGrade = "";
		String oGrade_Detail = "";
		
		// F 학점 일 경우
		if(nScore < 60) {
			oGrade = "F";
		} else {
			// A 학점 일 경우
			if(nScore >= 90) {
				oGrade = "A";
			}
			// B 학점 일 경우
			else if(nScore >= 80) {
				oGrade = "B";
			}
			// C 학점 일 경우
			else if(nScore >= 70) {
				oGrade = "C";
			}
			// D 학점 일 경우
			else {
				oGrade = "D";
			}
			
			// + 학점 일 경우
			if(nScore >= 100 || nScore % 10 >= 7) {
				oGrade_Detail = "+";
			} else {
				oGrade_Detail = ((nScore % 10) <= 3) ? "-" : "0";
			}
		}
		
		System.out.println("\n=====> if ~ else 결과 <=====");
		System.out.printf("%s%s 학점입니다.\n", oGrade, oGrade_Detail);
		
		switch(nScore / 10) {
			case 9:
			case 10:
				oGrade = "A";
				break;
			
			case 8:
				oGrade = "B";
				break;
			
			case 7:
				oGrade = "C";
				break;
			
			case 6:
				oGrade = "D";
				break;
			
			default:
				oGrade = "F";
				break;
		}
		
		switch(nScore % 10) {
			case 9:
			case 8:
			case 7:
				oGrade_Detail = "+";
				break;
				
			case 6:
			case 5:
			case 4:
				oGrade_Detail = "0";
				break;
				
			default:
				oGrade_Detail = "-";
				break;
		}
		
		switch(oGrade) {
			case "F":
				oGrade_Detail = "";
				break;
		}
		
		switch(nScore) {
			case 100:
				oGrade_Detail = "+";
				break;
		}
		
		System.out.println("\n=====> switch ~ case 결과 <=====");
		System.out.printf("%s%s 학점입니다.\n", oGrade, oGrade_Detail);
	}
}
