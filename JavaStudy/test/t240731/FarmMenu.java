package t240731;

import java.util.Scanner;

public class FarmMenu {
	// 필드
	private Scanner sc = new Scanner(System.in);
	private FarmController fc = new FarmController();
	
	// 메인 메뉴
	public void mainMenu() {
		System.out.println("========== Farm 마트 =========");
	}
	
	public void adminMenu() {
		
	}
	
	public void customerMenu() {
		
	}
	
	public void addNewKind() {
		while(true) {
			int amount = 0;
			
			Farm newItem = null;
			
			if(fc.addNewKind(newItem, amount)) {
				System.out.println("새 농산물이 추가되었습니다.\n");
				break;
			}
			else {
				System.err.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.\n");
			}
		}
	}
	
	public void removeKind() {
		
	}
	
	public void changeAmount() {
		
	}
	
	public void printFarm() {
		
	}
	
	public void buyFarm() {
		
	}
	
	public void removeFarm() {
		
	}
	
	public void printButFarm() {
		
	}
}
