package t240703;

import java.util.Scanner;

public class T_02 {
	public static void main(String[] args) {
		/*
		 * 키보드로 정수를 입력 받아 정수가 양수이면서 짝수일 때만 "짝수다"를 출력하고
		 * 짝수가 아니면 "홀수다"를 출력하세요.
		 * 양수가 아니면 "양수만 입력해주세요."를 출력하세요.
		 * 
		 * ex.
		 * 숫자를 한 개 입력하세요 : -8
		 * 양수만 입력해주세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num = 1;
		while(num != 0) {
			System.out.print("정수 입력 (종료 : 0) : ");
			num = sc.nextInt();
			
			if(num < 0) {
				System.out.println("양수만 입력해주세요.\n");
			}
			else if(num == 0) {
				System.out.println("프로그램이 종료되었습니다.");
			}
			else if(num % 2 == 0) {
				System.out.println("입력하신 숫자는 짝수입니다.\n");
			}
			else {
				System.out.println("입력하신 숫자는 홀수입니다.\n");
			}
		}

	}

}
