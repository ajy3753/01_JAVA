package point;

import java.util.Scanner;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	private int choice = 0;
	
	// 메인메뉴
	public void mainMenu() {
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 원");
		System.out.println("2. 사각형");
		System.out.println("9. 끝내기");
		System.out.print("메뉴 번호 : ");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1 :
			circleMenu();
			break;
		case 2 :
			rectangleMenu();
			break;
		case 9 :
			System.out.println("프로그램을 종료합니다.");
			break;
		default : 
			System.err.println("잘못 입력하셨습니다. 다시 입력해주세요.\n");
			mainMenu();
		}
	}
	
	
	// 1. 원 메뉴
	public void circleMenu() {
		System.out.println("\n===== 원 메뉴 =====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1 :
			calcCircum();
			break;
		case 2 :
			calcCircleArea();
			break;
		case 9 :
			System.out.println("메인으로 돌아갑니다.\n");
			mainMenu();
			break;
		default :
			System.err.println("잘못 입력하셨습니다. 다시 입력해주세요.\n");
			circleMenu();
		}
	}
	
	// 1-1. 원 둘레
	public void calcCircum() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		
		System.out.println("원의 둘레 : " + cc.calcCircum(x, y, radius) + "\n");
		mainMenu();
	}
	
	// 1-2. 원 넓이
	public void calcCircleArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		
		System.out.println("원의 넓이 : " + cc.calcArea(x, y, radius) + "\n");
		mainMenu();
	}
	
	
	// 2. 사각형 메뉴
	public void rectangleMenu() {
		System.out.println("\n===== 사각형 메뉴 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1 :
			calcPerimeter();
			break;
		case 2 :
			calcRectArea();
			break;
		case 9 :
			System.out.println("메인으로 돌아갑니다.\n");
			mainMenu();
			break;
		default :
			System.err.println("잘못 입력하셨습니다. 다시 입력해주세요.\n");
			rectangleMenu();
		}
	}
	
	// 2-1. 사각형 둘레
	public void calcPerimeter() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.print("너비 : ");
		int width = sc.nextInt();
		
		System.out.print("높이 : ");
		int height = sc.nextInt();
		
		System.out.println("사각형의 둘레 : " + rc.calcPerimeter(x, y, width, height) + "\n");
		mainMenu();
	}
	
	// 2-2. 사각형 넓이
	public void calcRectArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.print("너비 : ");
		int width = sc.nextInt();
		
		System.out.print("높이 : ");
		int height = sc.nextInt();
		
		System.out.println("사각형의 넓이 : " + rc.calcArea(x, y, width, height) + "\n");
		mainMenu();
	}
}