package t240724.project;

import java.util.Scanner;

// 사용자와의 소통을 위한 입출력을 담당하는 클래스
public class BookMenu {
	// 필드
	private Scanner sc = new Scanner(System.in);
	
	// 메소드
	public void mainMenu() {
		System.out.println("***** welcom KH Library *****");
		
		while(true) {
			System.out.println("===== 메인 메뉴 =====");
			System.out.println("1. 새 도서 등록");
			System.out.println("9. 종료");
			
			System.out.print("메뉴 번호 : ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1 :
				break;
			case 9 :
				System.out.println("프로그램 종료");
				return;	// 메소드 종료
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.\n");
			}
		}
	}
}
