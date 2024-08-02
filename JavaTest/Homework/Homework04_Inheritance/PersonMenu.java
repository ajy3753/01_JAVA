package Homework04_Inheritance;

import java.util.Scanner;

public class PersonMenu {
	// 변수
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	private int choice;

	// 메인메뉴
	public void mainMenu() {
		System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 학생은 " + pc.personCount()[0] + "명입니다.");

		System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 사원은 " + pc.personCount()[1] + "명입니다.\n");

		do {
			System.out.println("1. 학생 메뉴\n2.사원 메뉴\n9. 끝내기");
			System.out.print("메뉴 번호 : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				studentMenu();
				break;
			case 2:
				employeeMenu();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.err.println("잘못 입력하셨습니다. 다시 입력해주세요.\n");
			}
		} while (choice != 9);
	}

	// 1. 학생 메뉴
	public void studentMenu() {
		System.out.println("\n===== 학생 메뉴 =====");
		System.out.println("1. 학생 추가\n2.학생 보기\n9.메인으로");
		if (pc.personCount()[0] >= 3) {
			System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
		}

		System.out.print("메뉴 번호 : ");
		choice = sc.nextInt();

		switch (choice) {
		case 1:
			if (pc.personCount()[0] >= 3) {
				System.err.println("비활성화된 메뉴입니다. 다시 입력해주세요.\n");
				studentMenu();
			}
			insertStudent();
			break;
		case 2:
			printStudent();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.\n");
			mainMenu();
			break;
		default:
			System.err.println("잘못 입력하셨습니다. 다시 입력해주세요.\n");
			studentMenu();
		}
	}

	// 1-1. 학생 추가
	public void insertStudent() {
		System.out.print("학생 이름 : ");
		String name = sc.next();

		System.out.print("학생 나이 : ");
		int age = sc.nextInt();

		System.out.print("학생 키 : ");
		double height = sc.nextDouble();

		System.out.print("학생 몸무게 : ");
		double weight = sc.nextDouble();

		System.out.print("학생 학년 : ");
		int grade = sc.nextInt();

		System.out.print("학생 전공 : ");
		String major = sc.next();

		pc.insertStudent(name, age, height, weight, grade, major);

		if (pc.personCount()[0] < 3) {
			System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무키나 누르세요 : ");
			char answer = sc.next().charAt(0);
			if (answer != 'N' && answer != 'n') {
				System.out.println();
				insertStudent();
			} else {
				System.out.println("메인으로 돌아갑니다.\n");
				mainMenu();
			}
		} else {
			System.out.println("학생을 담을 수 있는 공간이 꽉찼기 때문에 학생 메뉴로 돌아갑니다.\n");
			studentMenu();
		}
	}

	// 1-2. 학생 보기
	public void printStudent() {

	}

	// 2. 사원 메뉴
	public void employeeMenu() {
		System.out.println("\n===== 사원 메뉴 =====");
		System.out.println("1. 사원 추가\n2.사원 보기\n9.메인으로");
		if (pc.personCount()[1] >= 10) {
			System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가 메뉴는 더 이상 활성화 되지 않습니다.");
		}

		System.out.print("메뉴 번호 : ");
		choice = sc.nextInt();

		switch (choice) {
		case 1:
			if (pc.personCount()[1] >= 10) {
				System.err.println("비활성화된 메뉴입니다. 다시 입력해주세요.\n");
				employeeMenu();
			}
			insertEmployee();
			break;
		case 2:
			printEmployee();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.\n");
			mainMenu();
			break;
		default:
			System.err.println("잘못 입력하셨습니다. 다시 입력해주세요.\n");
			employeeMenu();
		}
	}

	// 2-1. 사원 추가
	public void insertEmployee() {
		System.out.print("사원 이름 : ");
		String name = sc.next();

		System.out.print("사원 나이 : ");
		int age = sc.nextInt();

		System.out.print("사원 키 : ");
		double height = sc.nextDouble();

		System.out.print("사원 몸무게 : ");
		double weight = sc.nextDouble();

		System.out.print("사원 급여 : ");
		int salary = sc.nextInt();

		System.out.print("사원 부서 : ");
		String dept = sc.next();

		pc.insertEmployee(name, age, height, weight, salary, dept);

		if (pc.personCount()[1] < 10) {
			System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무키나 누르세요 : ");
			char answer = sc.next().charAt(0);
			if (answer != 'N' && answer != 'n') {
				System.out.println();
				insertEmployee();
			} else {
				System.out.println("메인으로 돌아갑니다.\n");
				mainMenu();
			}
		} else {
			System.out.println("사원을 담을 수 있는 공간이 꽉찼기 때문에 사원 메뉴로 돌아갑니다.\n");
			employeeMenu();
		}
	}

	// 2-2. 사원 보기
	public void printEmployee() {

	}
}
