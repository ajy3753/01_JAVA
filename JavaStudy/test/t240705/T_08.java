package t240705;

import java.util.Scanner;

public class T_08 {

	public static void main(String[] args) {
		/*
		 * 정수 두 개와 연산자를 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요.
		 * 단, 해당 프로그램은 연산자 입력에 "exit"라는 값이 들어올 때까지 무한 반복하며
		 * exit가 들어오면 "프로그램을 종료합니다"를 출력하고 종료합니다.
		 * 
		 * 또한 두번째 '나누기'면서 두 번째 정수가 0으로 들어오면,
		 * "0으로 나눌 수 없습니다. 다시 입력해주세요."를 출력하며,
		 * 없는 연산자가 들어올 시 "없는 연산자입니다. 다시 입력해주세요."라고 출력하고
		 * 두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.
		 * 
		 * ex.
		 * 연산자(+ - * / %) : +
		 * 정수1 : 10
		 * 정수2 : 4
		 * 10 + 4 = 14
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("연산자 (+, -, *, /, % ) : ");
			String input = sc.next();
			char opt = input.charAt(0);
			
			if(input.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else {
				if(opt != '+' && opt != '-' && opt != '*' && opt != '/' && opt != '%') {
					System.out.println("없는 연산자입니다. 다시 입력해주세요.\n");
					continue;
				}
			}
			
			System.out.print("첫 번째 정수 : ");
			int a = sc.nextInt();
			
			System.out.print("두 번째 정수 : ");
			int b = sc.nextInt();
			
			if((opt == '/' || opt == '%') && b == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.\n");
				continue;
			}
			
			int result;
			switch(opt) {
			case '+' :
				result = a + b;
				break;
			case '-' :
				result = a - b;
				break;
			case '*' :
				result = a * b;
				break;
			case '/' :
				result = a / b;
				break;
			default :
				result = a % b;
			}
			
			System.out.printf("%d %c %d = %d \n\n", a, opt, b, result);
		}

	}

}
