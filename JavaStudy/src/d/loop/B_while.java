package d.loop;

import java.util.Scanner;

public class B_while {
	/*
	 * [표현법]
	 * 
	 * while(조건문) { 반복문; 증감식; }
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 0;

		/*
		 * for(int i = 0; i < 5; i++) { System.out.prinln("안녕하세요."); }
		 */

		/*
		 * while(i < 5) { System.out.println("안녕하세요."); i++; }
		 * 
		 * // 사용자가 0을 입력할 때까지 반복해서 숫자를 입력받아 그대로 출력해라 while(true) {
		 * System.out.print("숫자 입력 : "); int n = sc.nextInt(); if(n == 0) { break; }
		 * System.out.println(n); }
		 * 
		 * // 1 ~ 10000 사이의 홀수만을 출력 // while문을 이용해서 하기
		 * 
		 * while(i <= 10000) { if(i % 2 == 1) { System.out.print(i + "\t"); } i++; }
		 * 
		 * // 1부터 랜덤값(1~100)까지의 합계를 출력 // 1에서부터 n까지의 총합계 : nn
		 * 
		 * int n = (int)(Math.random() * 101 + 1); int sum = 0;
		 * 
		 * while(i <= n) { sum += i; i++; }
		 * 
		 * System.out.println("1부터 " + n + "까지의 합 : " + sum);
		 * 
		 */

		// 사용자에게 문자열을 입력받아
		// 해당 문자열의 짝수자리 글자만 출력
		// 문자열 입력 : hello
		// el

		System.out.print("문자열 입력 : ");
		String str = sc.next();

		while (i < str.length()) {
			if (i % 2 == 1) {
				System.out.print(str.charAt(i) + "\t");
			}
			i++;
		}

	}
}
