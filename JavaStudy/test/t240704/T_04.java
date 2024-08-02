package t240704;

import java.util.Scanner;

public class T_04 {

	public static void main(String[] args) {
		/*
		 * 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		 * 
		 * ex.
		 * 숫자 : 4
		 * ==== 4단 ====
		 * 4 * 1 = 4
		 * 4 * 2 = 8
		 * ...
		 * 4 * 9 = 36
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int n = sc.nextInt();
		
		System.out.println("\n< " + n + "단 >");
		for(int i = 1; i <= 9; i++) {
			System.out.println(n + " * " + i + " = " + (n * i));
		}
		System.out.println();
		
		/*
		 * 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		 * 단, 9를 초과하는 숫자가 들어오면 "9 이하의 숫자만 입력해주세요"를 출력하세요.
		 * 
		 * ex.
		 * 숫자 : 5
		 * ==== 5단 ====
		 * ==== 6단 ====
		 * ==== 7단 ====
		 * ==== 8단 ====
		 * ==== 9단 ====
		 */
		
		System.out.print("숫자 입력(9 이하만) : ");
		n = sc.nextInt();
		
		if(n <= 9) {
			for(int i = n; i <= 9; i++) {
				System.out.println("\n==== " + i + "단 ====");
				for(int j = 1; j <= 9; j++) {
					System.out.println(i + " * " + j + " = " + (i * j));
				}
			}
		}
		else {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		}

	}

}
