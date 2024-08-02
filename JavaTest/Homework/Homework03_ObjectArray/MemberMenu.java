package Homework03_ObjectArray;

import java.util.Scanner;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	private int choice;
	private String id, name, password, email;
	private char gender;
	private int age;

	public void mainMenu() {
		System.out.println("최대 등록 가능한 회원 수는 " + MemberController.size + "명입니다.");
		System.out.println("현재 등록된 회원 수는 " + mc.existMemberNum() + "명입니다.");

		if (mc.existMemberNum() < 10) {
			System.out.println("1. 새 회원 등록");
		} else {
			System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
		}

		System.out.println("2. 회원 검색");
		System.out.println("3. 회원 정보 수정");
		System.out.println("4. 회원 삭제");
		System.out.println("5. 모두 출력");
		System.out.println("9. 끝내기");

		System.out.print("메뉴 번호 : ");
		choice = sc.nextInt();

		switch (choice) {
		case 1:
			insertMember();
			break;
		case 2:
			searchMember();
			break;
		case 3:
			updateMember();
			break;
		case 4:
			deleteMember();
			break;
		case 5:
			printAll();
			break;
		case 9:
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력헤주세요.\n");
			mainMenu();
		}
	}

	// 1. 새 회원 등록
	public void insertMember() {
		System.out.println("새 회원을 등록합니다.");

		System.out.print("아이디 : ");
		id = sc.next();
		if (mc.checkId(id) == false) {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			insertMember();
		}

		System.out.print("이름 : ");
		name = sc.next();

		System.out.print("비밀번호 : ");
		password = sc.next();

		System.out.print("이메일 : ");
		email = sc.next();

		do {
			System.out.print("성별 (F / M ): ");
			gender = sc.next().charAt(0);
			if (gender != 'F' && gender != 'M') {
				System.out.println("성별을 다시 입력하세요.");
			}
		} while (gender != '남' && gender != '여');

		System.out.print("나이 : ");
		age = sc.nextInt();

		mc.insertMember(id, name, password, email, gender, age);
		System.out.println();
		mainMenu();
	}

	// 2. 회원 검색
	public void searchMember() {
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");

		System.out.print("메뉴 번호 : ");
		choice = sc.nextInt();

		switch (choice) {
		case 1:
			searchId();
			break;
		case 2:
			searchName();
			break;
		case 3:
			searchemail();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.\n");
			mainMenu();
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 메인으로 돌아갑니다.\n");
			mainMenu();
		}
	}

	// 2-1. 아이디로 검색하기
	public void searchId() {
		System.out.print("검색할 아이디 : ");
		id = sc.next();

		if (mc.searchId(id) != null) {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(mc.searchId(id) + "\n");
		} else {
			System.out.println("검색 결과가 없습니다. 메인 화면으로 돌아갑니다.\n");
			mainMenu();
		}

		mainMenu();
	}

	// 2-2. 이름으로 검색하기
	public void searchName() {
		System.out.print("검색할 이름 : ");
		name = sc.next();

		if (mc.searchName(name) != null) {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(mc.searchName(name) + "\n");
		} else {
			System.out.println("검색 결과가 없습니다. 메인 화면으로 돌아갑니다.\n");
			mainMenu();
		}

		mainMenu();
	}

	// 2-3. 이메일로 검색하기
	public void searchemail() {
		System.out.print("검색할 이메일 : ");
		email = sc.next();

		if (mc.searchEmail(email) != null) {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(mc.searchEmail(email) + "\n");
		} else {
			System.out.println("검색 결과가 없습니다. 메인 화면으로 돌아갑니다.\n");
			mainMenu();
		}

		mainMenu();
	}

	// 3. 회원 정보 수정
	public void updateMember() {
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");

		System.out.print("메뉴 번호 : ");
		choice = sc.nextInt();

		switch (choice) {
		case 1:
			updatePassword();
			break;
		case 2:
			updateName();
			break;
		case 3:
			updateEmail();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.\n");
			mainMenu();
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 메인으로 돌아갑니다.\n");
			mainMenu();
		}
	}

	// 3-1. 비밀번호 수정하기
	public void updatePassword() {
		System.out.print("수정할 회원의 아이디 : ");
		id = sc.next();

		System.out.print("수정할 비밀번호 : ");
		password = sc.next();

		if (mc.updatePassword(id, password)) {
			System.out.println("수정이 성공적으로 되었습니다.\n");
		} else {
			System.out.println("존재하지 않는 아이디입니다.\n");
		}

		mainMenu();
	}

	// 3-2. 이름 수정하기
	public void updateName() {
		System.out.print("수정할 회원의 아이디 : ");
		id = sc.next();

		System.out.print("수정할 이름 : ");
		name = sc.next();

		if (mc.updateName(id, name)) {
			System.out.println("수정이 성공적으로 되었습니다.\n");
		} else {
			System.out.println("존재하지 않는 아이디입니다.\n");
		}

		mainMenu();
	}

	// 3-3. 이메일 수정하기
	public void updateEmail() {
		System.out.print("수정할 회원의 아이디 : ");
		id = sc.next();

		System.out.print("수정할 이메일 : ");
		email = sc.next();

		if (mc.updateEmail(id, email)) {
			System.out.println("수정이 성공적으로 되었습니다.\n");
		} else {
			System.out.println("존재하지 않는 아이디입니다.\n");
		}

		mainMenu();
	}

	// 4. 회원 삭제
	public void deleteMember() {
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");

		System.out.print("메뉴 번호 : ");
		choice = sc.nextInt();

		switch (choice) {
		case 1:
			deleteOne();
			break;
		case 2:
			deleteAll();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			mainMenu();
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 메인으로 돌아갑니다.\n");
			mainMenu();
		}
	}

	// 4-1. 특정 회원 삭제하기
	public void deleteOne() {
		System.out.print("삭제할 회원의 아이디 : ");
		id = sc.next();

		System.out.print("정말 삭제하시겠습니까? (y / n) : ");
		char answer = sc.next().charAt(0);

		if (answer == 'y' || answer == 'Y') {
			if (mc.delete(id)) {
				System.out.println("성공적으로 삭제하였습니다.\n");
			} else {
				System.out.println("존재하지 않는 아이디입니다.\n");
			}
		} else {
			System.out.println("취소되었습니다.\n");
		}

		mainMenu();
	}

	// 4-2. 모든 회원 삭제하기
	public void deleteAll() {
		System.out.print("정말 삭제하시겠습니까? (y / n) : ");
		char answer = sc.next().charAt(0);

		if (answer == 'y' || answer == 'Y') {
			mc.deleteAll();
			System.out.println("성공적으로 삭제하였습니다.\n");
		} else {
			System.out.println("취소되었습니다.\n");
		}

		mainMenu();
	}

	// 5. 모두 출력
	public void printAll() {
		if (mc.existMemberNum() > 0) {
			mc.printAll(mc.existMemberNum());
			System.out.println();
		} else {
			System.out.println("저장된 회원이 없습니다.\n");
		}

		mainMenu();
	}

	// 막줄 세이버
}
