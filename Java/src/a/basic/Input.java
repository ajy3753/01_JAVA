package a.basic;

import java.util.Scanner;
// 1) Scanner를 사용하기 위해서 외부로부터 가져온다.

public class Input {
	/*
	 * 키보드로 값을 입력하는 방법 Scanner를 사용한다. (java.util.Scanner 클래스를 이용한다)
	 * 
	 * [사용법] Scanner 이름 = new Scanner(System.in); ex) Scanner sc = new
	 * Scanner(System.in);
	 * 
	 * sc.next() : 사용자가 입력한 값 중 공백이 있을 경우, 공백 이전까지의 값만 가져온다. sc.nextLine() : 사용자가
	 * 입력한 값 중 \n(개행문자)를 포함하는 한 라인을 잃고 \n버린 나머지 값만 가져온다.
	 * 
	 * sc.nextByte(), sc.nextShort(), sc.nextInt(), sc.nextLong() sc.nextFloat(),
	 * sc.nextDouble(), 위처럼 정수나 실수를 입력 받는 코드를 작성했을 때 \n토근이 함께 들어오기 때문에
	 * sc.nextLine()을 통해서 비워주는 코드를 작성해야 한다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str1, str2;
		str1 = sc.next();
		sc.nextLine();
		str2 = sc.nextLine();

		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);

		System.out.println("====================");
		String namae, address;
		int age;
		float height;

		System.out.print("이름을 입력해주세요 : ");
		namae = sc.next();
		sc.nextLine();

		System.out.print("나이를 입력해주세요 : ");
		age = sc.nextInt();
		sc.nextLine();

		System.out.print("키를 입력해주세요 : ");
		height = sc.nextFloat();
		sc.nextLine();

		System.out.println("====================");
	}
}
