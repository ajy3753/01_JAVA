package t240704;

import java.util.Scanner;

public class T_03 {

	public static void main(String[] args) {
		/* 
		 * 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		 * 만일 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요"를 출력하세요
		 * 
		 * ex.
		 * 첫 번째 숫자 : 1		첫 번째 숫자 : 7		첫 번째 숫자 : 0
		 * 두 번째 숫자 : 3		두 번째 숫자 : 6		두 번째 숫자 : 9
		 * 1 2 3				6 7					1 이상의 숫자를 입력해주세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int a = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int b = sc.nextInt();
		
		int min = (a < b) ? a : b;
		int max = (a < b) ? b : a;
		
		if(a > 0 && b > 0) {
			for(int i = min; i <= max; i++) {
				System.out.print(i + "\t");
			}
		}
		else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		

	}

}
