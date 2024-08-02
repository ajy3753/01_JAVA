package t240703;

import java.util.Scanner;

public class T_04 {
	public static void main(String[] args) {
		/*
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		 * 단, 입력한 수는 1보다 크거나 같아야 합니다.
		 * 1 미만의 숫자가 입력됐다면
		 * "1 이상의 숫자를 입력해주세요"가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		 * 
		 * ex.
		 * 1 이상의 숫자를 입력하세요 : 4
		 * 1 2 3 4
		 * 
		 * 1 이상의 숫자를 입력하세요 ; 0
		 * 1 이상의  숫자를 입력해주세요.
		 * (반복)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		while(num < 1) {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
			
			if(num < 1) {
				System.out.println("1 이상의 정수를 입력해주세요.\n");
			}
		}
		
		for(int i = 1; i <= num; i++) {
			System.out.print(i + "\t");
		}
		
		/*
		 * <다른 방식>
		 * 
		 * while(true) {
		 * 		System.out.print("정수 입력 : ");
		 * 		int num = sc.nextInt();
		 * 
		 * 		if(num > 0) {
		 * 			for(int i = 1; i <= num; i++) {
		 * 				System.out.print(i + "\t");
		 * 			}
		 * 			break;
		 * 		}
		 * 		else {
		 * 			System.out.println("1 이상의 정수를 입력해주세요.\n");
		 * 		}
		 * }
		 */
		
	}
}
