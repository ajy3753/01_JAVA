package test.controller;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		/*
		 * [문제 1] 키보드로 1개의 정수향(int) 데이터를 입력 받아, 1 ~ 100 사이의 값일 때만 2의 배수인지 아닌지를 출력 처리한다.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 (1 ~ 100) : ");
		int num = sc.nextInt();

		if (num >= 1 && num <= 100) {
			if (num % 2 == 0) {
				System.out.println("2의 배수입니다.");
			} else {
				System.out.println("2의 배수가 아닙니다.");
			}
		} else {
			System.out.println("1 ~ 100 사이의 정수가 아닙니다.");
		}

		sc.close();
	}
}
