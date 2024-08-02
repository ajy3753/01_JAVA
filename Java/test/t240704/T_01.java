package t240704;

import java.util.Scanner;

public class T_01 {
	public static void main(String[] args) {
		/*
		 * ex.
		 * 아이디 : myId
		 * 비밀번호 : myPassword12
		 * 로그인 성공
		 */
		
		Scanner sc = new Scanner(System.in);
		final String ID = "myId";
		final String PWD = "myPassword12";
		String id, pwd;
		
		System.out.print("아이디 : ");
		id = sc.next();
		
		System.out.print("비밀번호 : ");
		pwd = sc.next();
		
		// 아이디 일치
		// -> 패스워드 일치
		
		if(ID.equals(id)) {
			if(PWD.equals(pwd)) {
				System.out.println("로그인 성공!");
			}
			else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}
		else {
			System.out.println("아이디가 틀렸습니다.");
		}
 
	}

}
