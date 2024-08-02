package file;

import java.util.ArrayList;
import java.util.Scanner;

public class FileMenu {
	// 필드
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	// 메소드
	// 메인 메뉴
	public void mainMenu() {
		System.out.println("******** My Note ********");
		System.out.println("1. 노트 새로 만들기");
		System.out.println("2. 노트 열기");
		System.out.println("3. 노트 열어서 수정하기");
		System.out.println("9. 끝내기");
		
		System.out.print("메뉴 번호 : ");
		int choice = sc.nextInt();
		sc.nextLine();
		
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
			return;
		default :
			System.err.println("잘못된 입력입니다. 다시 입력해주세요.\n");
			mainMenu();
		}
	}
	
	// 1. 노트 새로 만들기
	public void fileSave() {
		// 파일명과 저장할 값을 사용자에게 받음
		// "ex끝it"을 입력할 대까지 사용자가 내용을 입력하게 하고 그 값들을 StringBuilder에 저장
		// 저장할 파일명을 사용자에게 받는데 이때 이미 존재하는 파일명이라면 "이미 존재하는 파일입니다. 덮어쓰시겠습니까? (Y/N)"를 출력
		// Y -> FileController(fc)에 fileSave() 메소드로 파일명과 StringBuilder를 넘김
		// N -> "저장할 파일명을 입력해주세요"가 다시 나오게끔 반복
		
		System.out.println("\n===== 노트 새로 만들기 =====");
		System.out.println("파일에 저장할 내용을 입력하세요.");
		System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
		
		StringBuilder content = new StringBuilder();
		ArrayList<String> list = new ArrayList<>();
		
		while(true) {
			System.out.print("내용 : ");
			String str = sc.nextLine();
			
			if(str.equals("ex끝it")) {
				break;
			}
			else {
				list.add(str + "\n");
			}
		}
		
		for(int i = 0; i < list.size(); i++) {
			content.append(list.get(i));
		}
		
		System.out.println("\n< 입력된 내용 확인 >");
		System.out.println(content.toString());
		
		while(true) {
			System.out.print("파일 저장명 입력 (확장명 제외) : ");
			String fileName = sc.next() + ".txt";
			
			if(fc.checkName(fileName)) {
				System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까? (Y / N) : ");
				char answer = sc.next().charAt(0);
				if(answer == 'Y' || answer == 'y') {
					fc.fileSave(fileName, content);
					break;
				}
			}
			else {
				fc.fileSave(fileName, content);
				break;
			}
		}
		
		System.out.println("성공적으로 저장되었습니다.\n");
		mainMenu();
	}
	
	// 2. 노트 열기
	public void fileOpen() {
		// 받은 파일명을 fc에 checkName()의 매개변수로 넘겨 반환 값에 따라 나뉨
		// true일 경우 : fc의 fileOpen() 메소드의 매개변수로 넘겨 반환값 출력
		// false일 경우 : "없는 파일입니다." 출력 후 mainMenu()로 돌아감
		
		System.out.println("\n===== 노트 열기 =====");
		
		System.out.print("파일명 입력 (확장자 제외) : ");
		String fileName = sc.next() + ".txt";
		
		if(fc.checkName(fileName)) {
			System.out.println("\n< " + fileName + " >");
			System.out.println(fc.fileOpen(fileName).toString());
		}
		else {
			System.out.println("존재하지 않는 파일입니다. 메인 메뉴로 돌아갑니다.\n");
		}
		
		mainMenu();
	}
	
	// 3. 노트 열어서 수정하기
	public void fileEdit() {
		System.out.println("\n===== 노트 수정 =====");
		
		System.out.print("파일명 입력 (확장자 제외) : ");
		String fileName = sc.next() + ".txt";
		sc.nextLine();
		
		if(fc.checkName(fileName)) {
			System.out.println("\n< " + fileName + " >");
			System.out.println(fc.fileOpen(fileName).toString());
			
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			
			StringBuilder content = new StringBuilder();
			ArrayList<String> list = new ArrayList<>();
			
			while(true) {
				System.out.print("내용 : ");
				String str = sc.nextLine();
				
				if(str.equals("ex끝it")) {
					break;
				}
				else {
					list.add(str + "\n");
				}
			}
			
			for(int i = 0; i < list.size(); i++) {
				content.append(list.get(i));
			}
			
			System.out.println("\n< 입력된 내용 확인 >");
			System.out.println(content.toString());
			
			System.out.print("다시 입력하시겠습니까? (Y / N) : ");
			char answer = sc.next().charAt(0);
			if(answer != 'Y' && answer != 'y') {
				fc.fileEdit(fileName, content);
				System.out.println("성공적으로 수정되었습니다.\n");
			}
		}
		else {
			System.out.println("존재하지 않는 파일입니다. 메인 메뉴로 돌아갑니다.\n");
		}
		
		mainMenu();
	}
}