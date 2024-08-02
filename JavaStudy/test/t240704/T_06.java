package t240704;

import java.util.Scanner;

public class T_06 {

	public static void main(String[] args) {
		/*
		 * 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		 * 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요
		 * 
		 * ex.
		 * 양의 정수 : 5
		 * 1 2 3 4 5
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int length = sc.nextInt();
		
		int[] iArr = new int[length];
		for(int i = 0; i < length; i++) {
			iArr[i] = (i + 1);
			System.out.print(iArr[i] + "\t");
		}

	}

}
