package t240705;

import java.util.Scanner;

public class T_11 {

	public static void main(String[] args) {
		/*
		 * 1부터 100 사이의 정수 중 임의의 난수가 정해지고
		 * 사용자는 정해진 난수를 맞추는데 몇 번 만에 맞췄는지 출력하세요
		 */
		
		Scanner sc = new Scanner(System.in);
		int random = (int)(Math.random() * 100 + 1);
		int cnt = 1;
		
		while(true) {
			System.out.print("1 ~ 100 사이의 임의의 난수를 맞춰보세요 : ");
			int num = sc.nextInt();
			
			if(num == random) {
				System.out.println("정답입니다!!");
				System.out.println(cnt + "회만에 맞추셨습니다!");
				break;
			}
			else if(num < 1 || num > 100) {
				System.out.println("※※※ 1 ~ 100 사이의 숫자를 입력해주세요.\n");
			}
			else if(num > random) {
				System.out.println("DOWN!\n");
				cnt++;
			}
			else {
				System.out.println("UP!\n");
				cnt++;
			}
		}
		
		sc.close();
	}

}
