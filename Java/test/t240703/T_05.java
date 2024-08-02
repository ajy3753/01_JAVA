package t240703;

import java.util.Scanner;

public class T_05 {

	public static void main(String[] args) {
		/*
		 * 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
		 * 
		 * ex.
		 * 정수를 하나 입력하세요 : 8
		 * 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int sum = 1;
		
		while(true) {
			System.out.print("정수를 하나 입력하세요 : ");
			num = sc.nextInt();
			
			if(num > 0) {
				break;
			}
			else {
				System.out.println("1 이상의 정수를 입력하세요.\n");
			}
		}
		
		System.out.print("1");
		for(int i = 2; i <= num; i++) {
			sum += i;
			System.out.print(" + " + i);
		}
		
		System.out.print(" = " + sum);
	}

}
