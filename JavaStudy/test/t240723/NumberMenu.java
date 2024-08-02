package t240723;

import java.util.Scanner;

public class NumberMenu {
	public void menu(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		NumberController nc = new NumberController();
		try {
			boolean isDouble = nc.checkDouble(num1, num2);
			System.out.printf("%d는 %d의 배수인가? %c \n", num1, num2, isDouble);
		}
		catch(NumRangeException e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
	}
}
