package test.controller;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		/*
		 * [문제 6] 키보드로 1개의 정수형(int) 데이터를 입력 받아, 1부터 5까지의 수일 때만 해당 숫자에 해당하는 결과를 출력한다. 단,
		 * switch문을 사용한다.
		 * 
		 * <실행 결과> 1 : ** 입력이 정상적으로 되었습니다! ** 2 : ** 조회가 시작되었습니다! ** 3 : ** 수정이 정상적으로
		 * 되었습니다! ** 4 : ** 삭제가 정상적으로 되었습니다! ** 5 : ** 정상적으로 종료 되었습니다! ** 1~5가 아닌 값이 입력
		 * 된 경우 : ** 다시 입력해 주세요! **
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 (1 ~ 5) : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("** 입력이 정상적으로 되었습니다! **");
			break;
		case 2:
			System.out.println("** 조회가 시작되었습니다! **");
			break;
		case 3:
			System.out.println("** 수정이 정상적으로 되었습니다! **");
			break;
		case 4:
			System.out.println("** 삭제가 정상적으로 되었습니다! **");
			break;
		case 5:
			System.out.println("** 정상적으로 종료 되었습니다! **");
			break;
		default:
			System.out.println("** 다시 입력해 주세요! **");
		}

		sc.close();
	}

}
