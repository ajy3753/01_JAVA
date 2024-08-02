package b.operator;

import java.util.Scanner;

public class Operator5 {
	/*
	 * 논리연산자 두 개의 논리값을 연산해주는 연산자 논리연산한 결과도 논리값이 된다.
	 * 
	 * 논리값 && 논리값 : 왼쪽, 오른쪽에 두 논리값이 모두 true일 때만 결과가 true이다 논리값 || 논리값 : 왼쪽, 오른쪽 두 값
	 * 중 하나라도 true라면 결과는 true가 된다
	 * 
	 * && true && true -> true; true && false -> false; false && true -> false;
	 * false && false -> false; => 앞의 결과가 false일 경우 뒤의 조건은 굳이 실행하지 않는다.
	 * 
	 * || true && true -> true; true && false -> true; false && true -> true; false
	 * && false -> false; => 앞의 결과가 true일 경우 뒤의 조건은 굳이 실행하지 않아도 된다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 사용자에게 숫자를 입력 받아 해당 숫자가 1 ~ 100 사이의 값인지 확인
		int num;
		System.out.print("정수 하나 입력 : ");
		num = sc.nextInt();

		boolean result = (num >= 1) && (num <= 100);
		System.out.println("사용자가 입력한 값은 1 이상 100 이하이다 : " + result);

		// 사용자에게 알파벳 하나를 입력받아 대소문자를 확인
		// 문자 하나 입력 :
		// 사용자가 입력한 값이 대문자 입니다 : (true/false)

		char ch;
		System.out.print("알파벳 하나 입력 : ");
		ch = sc.next().charAt(0); // 문자 하나를 입력 받을 때는 charAt를 이용

		boolean res1 = (ch >= 65) && (ch <= 90);
		boolean res2 = (ch >= 'a') && (ch <= 'z');
		boolean res3 = (ch >= 'A') && (ch <= 'Z');
		System.out.println("사용자가 입력한 값이 대문자 입니다 : " + res1);
		System.out.println("사용자가 입력한 값이 소문자 입니다 : " + res2);
		System.out.println("사용자가 입력한 값이 알파벳 입니다. : " + (res2 || res3));

		int num2 = 10;
		boolean result2 = (num2 < 5) && (++num > 0);
		System.out.println("연산 후의 num2 : " + num2);
	}
}
