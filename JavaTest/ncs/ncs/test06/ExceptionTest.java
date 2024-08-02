package ncs.test06;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		/*
		 * [문제 6] 2부터 5까지의 정수형 데이터만을 키보드로 입력 받아 1부터 받은 수까지의 합을 출력한다. 단, 입력 받은 수가 2부터
		 * 5까지의 범위를 벋어나면 InvalidException을 발생시켜 "입력 값에 오류가 있습니다" 라고 출력하고 프로그램을 종료한다.
		 */

		Scanner sc = new Scanner(System.in);

		Calculator c = new Calculator();
		InvalidException iE = new InvalidException();

		System.out.print("정수 입력 (2 ~ 5) : ");
		int data = sc.nextInt();
		c.getSum(data);

		sc.close();
	}
}
