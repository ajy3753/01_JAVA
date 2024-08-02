package t240718.snack;

import java.util.Scanner;

public class SnackMenu {
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	
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
		
		scr.saveDate(kind, name, flavor, numOf, price);
		System.out.println("저장되었습니다.");
		
		System.out.print("저장된 정보를 확인하시겠습니까? (y / n ) : ");
		char ch = sc.next().charAt(0);
		scr.confirmData(ch);
	}
}
