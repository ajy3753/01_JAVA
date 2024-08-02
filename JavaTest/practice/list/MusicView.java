package list;

import java.util.Scanner;

public class MusicView {
	// 필드
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	// 메인 메뉴
	public void mainMenu() {
		while(true) {
			System.out.println("********** 메인 메뉴 **********");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("7. 곡명 오름차순 정렬");
			System.out.println("8. 가수명 내림차순 정렬");
			System.out.println("9. 종료");
			
			System.out.print("메뉴 번호 선택 : ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1 :
				addList();
				break;
			case 2 :
				addAtZero();
				break;
			case 3 :
				printAll();
				break;
			case 4 :
				searchMusic();
				break;
			case 5 :
				removeMusic();
				break;
			case 6 :
				setMusic();
				break;
			case 7 :
				ascTitle();
				break;
			case 8 :
				descSinger();
				break;
			case 9 :
				System.out.println("프로그램 종료");
				return;
			default :
				System.err.println("잘못된 입력입니다. 다시 입력해주세요.\n");
			}
		}
	}
	
	// 1. 마지막 위치에 곡 추가
	public void addList() {
		// 1) 곡명과 가수명을 사용자에게 입력 받는다.
		// 2) MusicController에 addList()를 이용해서 입력한 정보를 넘기고
		// 3) 추가 성공 시 "추가 성공", 추가 실패 시 "추가 실패"를 출력
		System.out.println("\n===== 1. 마지막 위치에 곡 추가 =====");
		
		System.out.print("곡 명 : ");
		String title = sc.next();
		System.out.print("가수 명 : ");
		String singer = sc.next();
		
		if(mc.addList(new Music(title, singer)) == 1) {
			System.out.println("추가 성공\n");
		}
		else {
			System.err.println("추가 실패. 메인으로 돌아갑니다.\n");
		}
	}
	
	// 2. 첫 위치에 곡 추가
	public void addAtZero() {
		// 1) 곡명과 가수명을 사용자에게 입력 받음
		// 2) MusicController에 addZero()를 이용해서 입력한 정보를 넘기고
		// 3) 추가 성공 시 "추가 성공", 추가 실패 시 "추가 실패"를 출력
		System.out.println("\n===== 2. 첫 위치에 곡 추가 =====");
		
		System.out.print("곡 명 : ");
		String title = sc.next();
		System.out.print("가수 명 : ");
		String singer = sc.next();
		
		if(mc.addAtZero(new Music(title, singer)) == 1) {
			System.out.println("추가 성공\n");
		}
		else {
			System.err.println("추가 실패. 메인으로 돌아갑니다.\n");
		}
	}
	
	// 3. 전체 곡 목록 출력
	public void printAll() {
		// MusicController에 printAll() 반환값을 출력
	}
	
	// 4. 특정 곡 검색
	public void searchMusic() {
		// 1) 사용자에게 곡명을 입력 받고 MusicController에 있는 searchMusic으로 넘긴다
		// 2) searchMusic()의 반환값에 따라 반환값이 없으면 "검색한 곡이 없습니다", 있으면 "검색한 곡은 000(곡명, 가수명)입니다." 출력
	}
	
	// 5. 특정 곡 삭제
	public void removeMusic() {
		// 1) 사용자에게 삭제할 곡명을 입력받고 MusicController에 removeMusic으로 넘긴다
		// 2) 반환값에 따라 반환값이 없으면 "삭제할 곡이 없습니다", 있으면 "000(곡명, 가수명)을 삭제했습니다." 출력
	}
	
	// 6. 특정 곡 정보 수정
	public void setMusic() {
		// 1) 사용자에게 수정하려는 곡명과 수정한 곡명, 가수명을 입력받아 MusicController에 setMusic으로 값을 넘긴다
		// 2) 검색 결과 값이 없으면 "수정할 곡이 없습니다", 결과값이 있고 수정했으면 "000(곡명, 가수명)의 값이 변경 되었습니다" 출력
	}
	
	// 7. 곡명 오름차순 정렬
	public void ascTitle() {
		// MusicController에 ascTitle()의 값에 따라 성공 시 "정렬 성공", 실패 시 "정렬 실패" 출력
	}
	
	// 8. 가수명 내림차순 정렬
	public void descSinger() {
		// MusicController에 descSinger() 값에 따라 성공 시 "정렬 성공", 실패 시 "정렬 실패" 출력
	}
}