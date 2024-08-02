package t240705;

import java.util.Scanner;

public class T_02 {

	public static void main(String[] args) {
		/*
		 * 주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.
		 * 
		 * ex.
		 * 주민번호를 입력하세요( - 포함) : 123456-2123456
		 * 
		 * 여자
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요( -  포함) : ");
		String jumin = sc.next();
		
		if(jumin.charAt(7) == '1' || jumin.charAt(7) == '3') {
			System.out.println("성별 : 남자");
		}
		else if(jumin.charAt(7) == '2' || jumin.charAt(7) == '4') {
			System.out.println("성별 : 여자");
		}
		else {
			System.out.println("주민번호가 잘못되었습니다.");
		}
	}

}
