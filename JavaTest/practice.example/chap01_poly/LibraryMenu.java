package chap01_poly;

import java.util.Scanner;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	private int choice = 0;

	// 메인 메뉴
	public void mainMenu() {
		System.out.println("===== 회원 등록 =====");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 (F / M) : ");
		char gender = sc.next().charAt(0);
		while (true) {
			if (gender != 'F' && gender != 'M') {
				System.err.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				System.out.print("성별 (F / M) : ");
				gender = sc.next().charAt(0);
				continue;
			}
			break;
		}

		lc.insertMember(new Member(name, age, gender));

		do {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				myInfo();
				break;
			case 2:
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.err.println("잘못 입력하셨습니다. 다시 입력해주세요.\n");
			}
		} while (choice != 9);
	}

	// 1. 마이페이지
	public void myInfo() {
		System.out.println(lc.myInfo() + "\n");
	}

	// 2. 도서 전체 조회
	public void selectAll() {
		for (int i = 0; i < lc.selectAll().length; i++) {
			System.out.println(i + "번 도서 : " + lc.selectAll()[i]);
		}
		System.out.println();
	}

	// 3. 도서 검색
	public void searchBook() {
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.next();

		for (int i = 0; i < lc.searchBook(keyword).length; i++) {
			if (lc.searchBook(keyword)[i] == null) {
				break;
			}
			System.out.println(lc.searchBook(keyword)[i]);
		}
		System.out.println();
	}

	// 4. 도서 대여하기
	public void rentBook() {
		for (int i = 0; i < lc.selectAll().length; i++) {
			System.out.println(i + "번 도서 : " + lc.selectAll()[i]);
		}

		System.out.print("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		int result = lc.rentBook(index);

		switch (result) {
		case 0:
			System.out.println("성공적으로 대여되었습니다.\n");
			break;
		case 1:
			System.err.println("나이 제한으로 대여가 불가능합니다.\n");
			break;
		case 2:
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.\n");
			break;
		}
	}
}
