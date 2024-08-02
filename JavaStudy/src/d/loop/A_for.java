package d.loop;

import java.util.Scanner;

public class A_for {
	/*
	 * <반목문> 프로그램 흐름을 제어하는 제어문 중 하나. 어떤 실행코드를 반복적으로 수행시켜준다.
	 * 
	 * 크게 두 종류로 나뉨(for / while (do-while)
	 * 
	 * * for문
	 * 
	 * for(초기식; 조건식; 증감식) { // 반복횟수를 지정하기 위해서는 제시하는 것들 반복적으로 실행시키고자 하는 코드 더미
	 * 
	 * - 초기식 : 반복문이 수행될 때 "처음에 단 한번만 실행하는 구문" (반복문 안에서 사용될 변수를 선언 및 초기화하는 작업)
	 * 
	 * - 조건식 : "반복문이 수행될 조건"을 작성하는 구문. 조건식이 true일 경우 해당 반복을 실행 조건식이 false가 되는 순간
	 * 반복문을 탈출 (초기식에서 제시된 변수를 가지고 조건식을 정함)
	 * 
	 * - 증감식 : 반복문을 제어하는 변수 값을 증감 시키는 구문
	 * 
	 * tip for문 안에 초기식, 조건식, 증감식 각각 생략 가능하다. (단, 생략해서 쓰는 경우가 없다.) (보통 초기식에 제시된 변수를
	 * 가지고 증감을 시킴 while 사용)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * // 10번 반복하는 반복문 for(int i = 0; i < 10; i++) { System.out.println("안녕하세요"); }
		 * 
		 * // 1 ~ 5까지 순차적으로 출력하세요 (1 2 3 4 5) for(int i = 1; i <= 5; i++) {
		 * System.out.print(i + "\t"); } System.out.println("");
		 * 
		 * // 5 ~ 1 까지 순차적으로 출력 for(int i = 5; i > 0; i--) { System.out.print(i + "\t");
		 * }
		 * 
		 * 
		 * // 정수 n을 입력 받아 1부터 n까지 1씩 증가시키면서 출력해라 // 정수 입력 : 6 // 1 2 3 4 5 6
		 * 
		 * int n; System.out.print("정수 입력 : "); n = sc.nextInt(); sc.nextLine();
		 * 
		 * for(int i = 1; i <= n; i++) { System.out.print(i + "\t"); }
		 * 
		 * 
		 * // 1 ~ 10까지의 숫자 중 홀수만 출력 // 1 3 5 7 9 for(int i = 1; i <= 10; i++) { if(i % 2
		 * != 0) { System.out.print(i + "\t"); } }
		 * 
		 * // 1부터 100까지의 총합을 구해라 // 1 + 1 + 3;
		 * 
		 * int sum = 0; for(int i = 1; i <= 100; i++) { sum += i; }
		 * System.out.println("1 ~ 100까지의 총합 : " + sum);
		 * 
		 * 
		 * // 정수 n을 입력 받아 1부터 n까지 1씩 증가하며 모든 수를 더해서 출력하라. // 정수입력 : 5 // 1부터 5까지의 합 : 15
		 * 
		 * int n2; int sum2 = 0; System.out.print("정수 입력 : "); n2 = sc.nextInt();
		 * sc.nextLine();
		 * 
		 * for(int i = 1; i <= n2; i++) { sum2 += i; }
		 * 
		 * System.out.println("1부터 " + n2 + "까지의 합 : " + sum2);
		 */

		/*
		 * java.lang.Math 클래스에서 제공하는 random() 메소드를 호출하면 매번 다른 랜덤값을 받을 수 있다.
		 * 
		 * Math.random() 호출시 -> 0.0 ~ 0.9999999999 사이의 랜덤값을 반환
		 * 
		 * int num = Math.random() // double형이라서 int로 랜덤값을 받을 수 없다.
		 * 
		 * int num = (int)(Math.random() * 10) -> 0 ~ 9 int num = (int)(Math.random() *
		 * 10) + 1 -> 1 ~ 10
		 * 
		 * [원하는 범위 지정 공식] int num = (int)(Math.random() * ((최대값 + 1) - 최소값)) + 최소값 int
		 * num = (int)(Math.random() * (랜덤으로 가져오고 싶은 숫자의 갯수) + 시작하고 싶은 숫자
		 */

		/*
		 * 
		 * int random = (int)(Math.random() * 10); System.out.println(random);
		 * 
		 * // random(1~10)한 숫자 n을 생성해서 1부터 n까지 모두 더한 값을 출력하세요 // random 수 : 5 // 1 ~
		 * 5까지의 합 : 15
		 * 
		 * int n3; int sum3 = 0;
		 * 
		 * n3 = (int)(Math.random() * 10 + 1); for(int i = 1; i <= n3; i++) { sum3 += i;
		 * }
		 * 
		 * System.out.println("랜덤 숫자 : " + n3); System.out.println("1 ~ " + n3 +
		 * "까지의 합 : " + sum3);
		 * 
		 * // random(5 ~ 50)한 숫자 n을 생성해서 1부터 n까지의 숫자 중 짝수만 출력해라(50 포함) // random 수 : 10
		 * // 2 4 6 8 10
		 * 
		 * int n4; n4 = (int)(Math.random() * 46 + 5); System.out.println("랜덤 숫자 : " +
		 * n4);
		 * 
		 * for(int i = 1; i <= n4; i++) { if(i % 2 == 0) { System.out.print(i + "\t"); }
		 * }
		 * 
		 */

		/*
		 * 각 인덱스별 문자 출력 H -> str.charAt(0); e -> str.charAt(1); l -> str.charAt(2); ...
		 * 
		 * 문자열.length() : 문자열의 길이를 구하는 방법
		 */

		/*
		 * 
		 * String str = "Hello";
		 * 
		 * System.out.println("문자열 길이 : " + str.length()); for(int i=0; i <
		 * str.length(); i++) { System.out.println(str.charAt(i)); }
		 * 
		 * // 사용자에게 문자열을 입력받아 해당 문자열의 짝수자리 글자만 출력 // 문자열 입력 : hello // el
		 * 
		 * String str2; System.out.print("문자열 입력 : "); str2 = sc.next(); sc.nextLine();
		 * 
		 * for(int i = 0; i < str2.length(); i++) { if((i + 1) % 2 == 0) {
		 * System.out.print(str2.charAt(i) + "\t"); } }
		 * 
		 * // 구구단 2단을 출력해보자 // 2 * 1 = 2 // ... // 2 * 9 = 18
		 * 
		 * for(int i = 1; i <= 9; i++) { System.out.println("2 * " + i + " = " + (2 *
		 * i)); }
		 * 
		 */

		// 구구단 2단부터 9단까지

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println("");
		}
	}
}
