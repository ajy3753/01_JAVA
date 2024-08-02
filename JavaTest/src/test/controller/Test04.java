package test.controller;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		/*
		 * [문제 4] main의 argument로 1자리 정수형(1부터 9까지만) 값을 2개 입력 받아, 사칙연산 결과를 출력한다. 단, 나누는
		 * 수(분모)가 0이거나 0보다 작으면 결과는 0 처리한다. (입력값과 결과는 모두 int 형으로 처리한다)
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 정수 입력 : ");
		int a = sc.nextInt();

		System.out.print("두 번째 정수 입력 : ");
		int b = sc.nextInt();

		System.out.println("합 : " + (a + b));
		System.out.println("차 : " + (a - b));
		System.out.println("곱 : " + (a * b));
		if (b <= 0) {
			System.out.println("나누기 : 0");
		} else {
			System.out.println("나누기 : " + (a / b));
		}

		sc.close();
	}
}
