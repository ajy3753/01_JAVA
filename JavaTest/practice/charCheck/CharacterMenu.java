package charCheck;

import java.util.Scanner;

public class CharacterMenu {
	// 필드
	Scanner sc = new Scanner(System.in);
	CharacterController cc = new CharacterController();
	
	// 메소드
	public void menu() {
		// 사용자에게 문자열을 입력 받아 CharacterController의 countAlpha()에 매개변수로 넘겨주어 반환 값을 출력
		// 이때 countAlpha() 메소드를 호출하는 부분부터 try ~ catch를 이용하여 예외 처리
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		try {
			int length = cc.countAlpha(str);
			System.out.println("'" + str + "'에 포함된 영문자 개수 : " + length);
			
		} catch(CharCheckException e) {
			e.printStackTrace();
		} finally {
			sc.close();
			System.out.println("정상적으로 종료되었습니다.");
		}
	}
}
