package t240705;

import java.util.Scanner;

public class T_07 {

	public static void main(String[] args) {
		/*
		 * 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		 * 만일 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요"를 출력하면서
		 * 다시 사용자가 값을 입력하도록 하세요
		 */
		
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		while(true) {
			System.out.print("첫 번째 숫자 : ");
			a = sc.nextInt();
			
			System.out.print("두 번째 숫자 : ");
			b = sc.nextInt();
			
			if(a < 1 || b < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.\n");
			}
			else {
				break;
			}
		}
		
		int max = a > b ? a : b;
		int min = a > b ? b : a;
		
		for(int i = min; i <= max; i++) {
			System.out.print(i + "\t");
		}
		
		
	}

}
