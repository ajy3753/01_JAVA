package c.control;

import java.util.Scanner;

public class A_if2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * 나이를 입력 받아
		 * 
		 * 13세 이하 : 어린이 13세 초과 19세 이하 : 청소년 19세 초과 : 성인
		 * 
		 * 나이를 입력 : xx xx세는 xxx에 속합니다.
		 */

		int age = 0;
		System.out.print("나이를 입력하세요 : ");
		// age = sc.nextInt();

		if (age <= 13) {
			System.out.println(age + "세는 어린이에 속합니다.");
		} else if (age > 19) {
			System.out.println(age + "세는 성인에 속합니다.");
		} else {
			System.out.println(age + "세는 청소년에 속합니다.");
		}

		/*
		 * 성별을 (m/f)(대소문자 상관x)로 입력받아 남학생인지 여학생인지 출력하는 프로그램을 작성하세요
		 * 
		 * 성별(m/f) : x 남학생입니다 / 여학생입니다 / 잘못 입력하셨습니다.
		 */

		char gender = 'F';
		System.out.print("성별 입력 (M/F) : ");
		// gender = sc.next().charAt(0);

		if (gender == 'm' || gender == 'M') {
			System.out.println("남학생입니다.");
		} else if (gender == 'f' || gender == 'F') {
			System.out.println("여학생입니다.");
		} else {
			System.out.println("M 또는 F로만 입력해주세요. (대소문자 상관X)");
		}

		/*
		 * 정수(양수)를 입력 받아 짝수인지 홀수인지 출력하는 프로그램을 작성해라
		 * 
		 * 정수 입력 : xx 짝수다 / 홀수다 / 양수가 아닙니다
		 */

		int num = 0;
		System.out.print("정수 입력(양수만 가능) : ");
		// num = sc.nextInt();
		// sc.nextLine();

		if (num % 2 == 0 && num > 0) {
			System.out.println("짝수입니다.");
		} else if (num < 0 || num == 0) {
			System.out.println("0 이상의 양수만 입력해주세요.");
		} else {
			System.out.println("홀수입니다.");
		}

		/*
		 * 과일을 구매하는 프로그램을 작성하여봅시다. 구매하고자 하는 과일을 입력하면 그에 맞는 가격이 출력되는 프로그램을 작성해주세요. 구매하고자
		 * 하는 과일 : 사과(2000), 바나나(3000), 딸기(5000) 입력 : xx xx의 가격은 xxxx입니다 / 잘못입력하셨습니다.
		 */

		String fruit = "사과";
		System.out.println("구매하려는 과일의 이름을 입력해주세요.");
		System.out.println("1.사과\t 2.바나나\t 3.딸기");
		System.out.print("입력 : ");
		// fruit = sc.next();
		// sc.nextLine();

		switch (fruit) {
		case "사과":
			System.out.println("사과의 가격은 2000원입니다.");
			break;
		case "바나나":
			System.out.println("바나나의 가격은 3000원입니다.");
			break;
		case "딸기":
			System.out.println("딸기의 가격은 5000원입니다.");
			break;
		default:
			System.out.println("잘못 입력하셨거나 판매하지 않는 과일입니다.");
			break;
		}

		/*
		 * 월을 입력 받아 해당 월에 말일이 며칠까지 있는지를 출력하는 프로그램 작성
		 * 
		 * 월을 입력하세요 : xx xx월은 xx일까지입니다.
		 * 
		 * 1, 3, 5, 7, 10, 12 => 31 4, 6, 9, 11 => 30
		 */

		int month;
		System.out.print("월을 입력하세요 : ");
		month = sc.nextInt();
		sc.nextLine();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "월은 31일까지입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "월은 30일까지입니다.");
			break;
		case 2:
			System.out.println(month + "월은 28일까지입니다.");
			break;
		default:
			System.out.println("숫자를 잘못 입력하셨습니다.");
			return;
		}
	}
}
