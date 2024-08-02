package logOfJava;

import java.util.Scanner;

public class GameMenu {
	// 필드
	private Scanner sc = new Scanner(System.in);
	private GameController gc = new GameController();
	private int choice;
	private char answer;
	
	// 게임 시작 메뉴
	public void startMenu() {
		System.out.println("***** Log Of Java *****");
		System.out.println("[1. 새 게임 시작하기]");
		System.out.println("[2. 이어하기]");
		System.out.println("[3. 종료]");
		
		System.out.print("메뉴 선택 : ");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1 :
			System.out.println("캐릭터 생성으로 이동합니다.\n");
			newGame();
			break;
		case 2 :
			break;
		case 3 :
			System.out.println("게임을 종료합니다.");
			return;
		default :
			System.err.println("잘못된 입력입니다. 처음으로 돌아갑니다.\n");
			startMenu();
		}
	}
	
	// 새 게임 시작하기
	public void newGame() {
		// 플레이어 이름 입력
		System.out.println("===== 캐릭터 생성 =====");
		System.out.print("플레이어 이름 : ");
		String player = sc.next();
		sc.nextLine();
		System.out.println();
		
		// 직업군 선택
		String job = "";
		do {
			System.out.print("[1. 검사] \t");
			System.out.println("ATK(MIN) ◆◆◆\t ATK(MAX) ◆◆◇\t HP ◆◆◆\t 치명타율 ◆◇◇\t 회피율 ◆◇◇");
			System.out.print("[2. 궁수] \t");
			System.out.println("ATK(MIN) ◆◆◇\t ATK(MAX) ◆◆◇\t HP ◆◆◇\t 치명타율 ◆◆◆\t 회피율 ◆◆◇");
			System.out.print("[3. 마법사] \t");
			System.out.println("ATK(MIN) ◆◆◇\t ATK(MAX) ◆◆◆\t HP ◆◇◇\t 치명타율 ◆◆◇\t 회피율 ◆◇◇");
			System.out.print("[4. 도적] \t");
			System.out.println("ATK(MIN) ◆◇◇\t ATK(MAX) ◆◆◇\t HP ◆◆◇\t 치명타율 ◆◆◆\t 회피율 ◆◆◆\t 아이템 드롭률 ◆◆◆");
			
			System.out.print("직업 선택 (숫자 입력) : ");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1 :
				System.out.println("검사를 선택하셨습니다.");
				job = "검사";
				break;
			case 2 :
				System.out.println("궁수를 선택하셨습니다.");
				job = "궁수";
				break;
			case 3 :
				System.out.println("마법사를 선택하셨습니다.");
				job = "마법사";
				break;
			case 4 :
				System.out.println("도적을 선택하셨습니다.");
				job = "도적";
				break;
			default :
				System.err.println("잘못된 입력입니다. 다시 입력해주세요.\n");
				break;
			}
		} while(choice < 1 || choice > 4);
		
		System.out.println("\n캐릭터 생성 정보 : " + player + " (" + job + ")");
		System.out.print("이 캐릭터로 게임을 시작하시겠습니까? (Y / N) : ");
		answer = sc.next().charAt(0);
		
		if(answer == 'Y' || answer == 'y') {
			gc.newCharacter(player, job);
			System.out.println("게임을 시작합니다.\n");
		}
		else {
			System.out.println("처음으로 돌아갑니다.\n");
			newGame();
		}
	}
}
