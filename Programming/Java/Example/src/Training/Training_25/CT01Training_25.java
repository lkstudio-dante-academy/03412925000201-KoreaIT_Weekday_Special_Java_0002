package Training.Training_25;

/*
 * Java 연습 문제 25
 * - 사칙 연산 수식 계산하기
 * - 사용자로부터 사칙 연산 수식을 입력 받아 해당 수식을 계산해서 결과를 출력하기
 * - 단, 사칙 연산의 우선 순위를 고려해서 수식을 계산해야한다
 *
 * Ex)
 * 수식 입력 : 2 + 2 * 2
 * 결과 : 6
 */

import java.util.Scanner;
import java.util.Stack;

/**
 * Training 25
 */
public class CT01Training_25 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		System.out.print("수식 입력 : ");
		String oExpression = oScanner.nextLine();
		
		double dblResult = getResult_Calc(oExpression);
		System.out.printf("결과 : %f\n", dblResult);
	}
	
	/**
	 * 상수
	 */
	private static final String DIGITS = "0123456789.";
	private static final String OPERATORS = "+-*/()";
	
	/** 우선 순위를 반환한다 */
	private static int getPriority(String a_oOperator, boolean a_bIsPush) {
		switch(a_oOperator) {
			case "+":
			case "-":
				return 2;
			
			case "*":
			case "/":
				return 1;
		}
		
		return (a_bIsPush && a_oOperator.equals("(")) ? 0 : 3;
	}
	
	/** 토큰을 반환한다 */
	private static String getToken(String a_oExpression, int a_nIdx_Start) {
		StringBuilder oToken = new StringBuilder();
		
		for(int i = a_nIdx_Start; i < a_oExpression.length(); ++i) {
			oToken.append(String.format("%c", a_oExpression.charAt(i)));
			
			boolean bIsDigit = i + 1 < a_oExpression.length();
			bIsDigit = bIsDigit && DIGITS.contains(String.format("%c", a_oExpression.charAt(i)));
			bIsDigit = bIsDigit && DIGITS.contains(String.format("%c", a_oExpression.charAt(i + 1)));
			
			// 숫자가 아닐 경우
			if(!bIsDigit) {
				break;
			}
		}
		
		return oToken.toString();
	}
	
	/** 수식 결과를 반환한다 */
	private static double getResult_Calc(String a_oExpression) {
		String oPostfix = infix_ToPostfix(a_oExpression);
		Stack<Double> oStackOperands = new Stack<>();
		
		int nIdx = 0;
		
		while(nIdx < oPostfix.length()) {
			String oToken = getToken(oPostfix, nIdx);
			nIdx += oToken.length();
			
			// 공백 일 경우
			if(Character.isWhitespace(oToken.charAt(0))) {
				continue;
			}
			
			// 연산자 일 경우
			if(OPERATORS.contains(oToken)) {
				double dblRhs = oStackOperands.pop();
				double dblLhs = oStackOperands.pop();
				
				double dblResult = switch(oToken) {
					case "+" -> dblLhs + dblRhs;
					case "-" -> dblLhs - dblRhs;
					case "*" -> dblLhs * dblRhs;
					case "/" -> dblLhs / dblRhs;
					default -> 0.0;
				};
				
				oStackOperands.push(dblResult);
				continue;
			}
			
			double dblOperand = Double.parseDouble(oToken);
			oStackOperands.push(dblOperand);
		}
		
		return oStackOperands.pop();
	}
	
	/** 중위 -> 후위 표기법을 변환한다 */
	private static String infix_ToPostfix(String a_oInfix) {
		StringBuilder oPostfix = new StringBuilder();
		Stack<String> oStackOperators = new Stack<>();
		
		int nIdx = 0;
		
		while(nIdx < a_oInfix.length()) {
			String oToken = getToken(a_oInfix, nIdx);
			nIdx += oToken.length();
			
			// 공백 일 경우
			if(Character.isWhitespace(oToken.charAt(0))) {
				continue;
			}
			
			// 피연산자 일 경우
			if(!OPERATORS.contains(oToken)) {
				oPostfix.append(String.format("%s ", oToken));
				continue;
			}
			
			// ) 일 경우
			if(oToken.contains(")")) {
				while(!oStackOperators.empty()) {
					String oOperator = oStackOperators.pop();
					
					// ( 일 경우
					if(oOperator.equals("(")) {
						break;
					}
					
					oPostfix.append(oOperator);
				}
				
				continue;
			}
			
			int nPriority_Token = getPriority(oToken, true);
			
			while(!oStackOperators.empty()) {
				String oOperator = oStackOperators.peek();
				int nPriority_Operator = getPriority(oOperator, false);
				
				// 토큰의 우선 순위가 높을 경우
				if(nPriority_Token < nPriority_Operator) {
					break;
				}
				
				oPostfix.append(oStackOperators.pop());
			}
			
			oStackOperators.push(oToken);
		}
		
		while(!oStackOperators.empty()) {
			oPostfix.append(oStackOperators.pop());
		}
		
		return oPostfix.toString();
	}
}
