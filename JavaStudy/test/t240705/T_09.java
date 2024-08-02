package t240705;

import java.util.Scanner;

public class T_09 {
	public static void main(String[] args) {
		/*
		 * 정수를 입력 받아 양수일 때만 1부터 입력 받은 수까지 홀/짝을 나눠서
		 * 홀수면 '박', 짝수면 '수'를 출력하도록 하세요.
		 * 단, 입력 받은 수가 양수가 아니면 "양수가 아닙니다"를 출력하세요.
		 * 
		 * ex.
		 * 정수 : 5
		 * 박수박수박
		 */

		Scanner sc = new Scanner(System.in);
		
		int num;
		
		do {
			System.out.print("양의 정수 입력 : ");
			num = sc.nextInt();
			
			if(num <= 0) {
				System.out.println("양수가 아닙니다.\n");
			}
			else {
				for(int i = 1; i <= num; i++) {
					if(i % 2 == 1) {
						System.out.print("박");
					}
					else {
						System.out.print("수");
					}
				}
				System.out.println("\n");
			}
		} while(num != 0);

	}
}
