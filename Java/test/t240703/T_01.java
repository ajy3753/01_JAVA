package t240703;

import java.util.Scanner;

public class T_01 {
	public static void main(String[] args) {
		/*
		 * 아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 "**메뉴입니다"를,
		 * 종료 번호를 누르면 "프로그램이 종료됩니다." 를 출력하세요
		 * 
		 * ex.
		 * 1. 입력
		 * 2. 수정
		 * 3. 조회
		 * 4. 삭제
		 * 7. 종료
		 * 메뉴 번호를 입력하세요 : n
		 * 조회 메뉴입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int menu = 0;
		while(menu != 7) {
			System.out.println("<메뉴>");
			System.out.println("1. 입력");
			System.out.println("2. 수정");
			System.out.println("3. 조회");
			System.out.println("4. 삭제");
			System.out.println("7. 종료");
			System.out.print("\n메뉴 번호를 입력하세요 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1 :
				System.out.println("입력 메뉴입니다.\n");
				break;
			case 2 :
				System.out.println("수정 메뉴입니다.\n");
				break;
			case 3 :
				System.out.println("조회 메뉴입니다.\n");
				break;
			case 4 :
				System.out.println("삭제 메뉴입니다.\n");
				break;
			case 7 :
				System.out.println("프로그램이 종료됩니다.");
				break;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.\n");
			}
		}
	}
}
