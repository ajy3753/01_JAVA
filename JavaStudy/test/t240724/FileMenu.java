package t240724;

import java.io.File;
import java.util.Scanner;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	// 필드
	// 메인메뉴
	public void mainMenu() {
		System.out.println("***** My Note *****");
		System.out.println("1. 노트 새로 만들기");
		System.out.println("2. 노트 열기");
		System.out.println("3. 노트 열어서 수정하기");
		System.out.println("9. 끝내기");
		
		System.out.print("메뉴 번호 : ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1 :
			fileSave();
			break;
		case 2 :
			fileOpen();
			break;
		case 3 :
			fileEdit();
			break;
		case 9 :
			System.out.println("프로그램을 종료합니다.");
			break;
		default :
			System.err.println("잘못 입력하셨습니다. 다시 입력해주세요.\n");
			mainMenu();
		}
	}
	
	// 1. 노트 새로 만들기
	public void fileSave() {
		System.out.println("파일에 저장할 내용을 입력하세요.");
		System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
		
		String str = sc.next();
		
		if(str.equals("ex끝it")) {
			while(true) {
				System.out.print("저장할 파일명을 입력해주세요 (ex. myFile.txt) : ");
				String fileName = sc.next();
				File f = new File(fileName);
			}
		}
	}
	
	// 2. 노트 열기
	public void fileOpen() {
		
	}
	
	// 3. 노트 열어서 수정하기
	public void fileEdit() {
		
	}
}
