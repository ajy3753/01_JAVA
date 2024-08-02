package snack;

import java.util.Scanner;

public class SnackMenu {
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	
	// menu()
	public void menu() {
		System.out.println("스낵류를 입력하세요.");
		
		System.out.print("종류 : ");
		String kind = sc.next();
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("맛 : ");
		String flavor = sc.next();
		
		System.out.print("개수 : ");
		int numOf = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		scr.saveData(kind, name, flavor, numOf, price);
		
		System.out.print("저장된 정보를 확인하시겠습니까? (Y / N) : ");
		char choice = sc.next().charAt(0);
		
		switch(choice) {
		case 'Y' :
		case 'y' :
			scr.confirmData();
			break;
		case 'N' :
		case 'n' :
			System.out.println("프로그램을 종료합니다.");
			break;
		default :
			System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
		}
	}
}
