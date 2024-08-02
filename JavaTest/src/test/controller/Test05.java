package test.controller;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		/*
		 * [문제 5] 키보드로 2개의 정수형 데이터를 입력 받아, 두 수가 모두 1부터 9까지의 수일 때만 두 수의 곱이 한 자리 수인지 두 자리
		 * 수인지를 출력한다.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 정수 입력 (1 ~ 9) : ");
		int a = sc.nextInt();

		System.out.print("두 번째 정수 입력 (1 ~ 9) : ");
		int b = sc.nextInt();

		if (a >= 1 && a <= 9 && b >= 1 && b <= 9) {
			if (a * b >= 10) {
				System.out.println("곱 결과는 두 자리 수입니다.");
			} else {
				System.out.println("곱 결과는 한 자리 수입니다.");
			}
		} else {
			System.out.println("입력값이 잘못되었습니다.");
		}

		sc.close();
	}
}
