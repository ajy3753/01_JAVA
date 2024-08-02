package t240704;

import java.util.Scanner;

public class T_02 {

	public static void main(String[] args) {
		/*
		 * 사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
		 * 
		 * 관리자 : 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성
		 * 회원 : 게시글 작성, 게시글 조회, 댓글 작성
		 * 비회원 : 게시글 조회
		 * 
		 * ex.
		 * 권한을 확인하고자 하는 회원 등급 : 관리자
		 * 회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글 조회
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String member = sc.next();
		
		switch(member) {
		case "관리자" :
			System.out.println("[회원관리]\t[게시글 관리]\t[게시글 작성]\t[게시글 조회]\t[댓글작성]");
			break;
		case "회원" :
			System.out.println("[게시글 작성]\t[게시글 조회]\t[댓글작성]");
			break;
		case "비회원" :
			System.out.println("[게시글 조회]");
			break;
		default :
			System.out.println("잘못된 입력입니다.");
		}
		
	}

}
