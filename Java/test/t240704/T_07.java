package t240704;

import java.util.Scanner;

public class T_07 {

	public static void main(String[] args) {
		/*
		 * 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		 * 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		 * 
		 * ex.
		 * 문자열 : application
		 * 문자 : i
		 * application에 i가 존재하는 위치(인덱스) : 4 8
		 * i 개수 : 2
		 */
		
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		
		System.out.print("검색할 문자 : ");
		char search = sc.next().charAt(0);
		
		char[] arr = new char[str.length()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		System.out.print( str + "에 " + search + "가 존재하는 위치(인덱스) : ");
		for(int i = 0; i < arr.length; i++) {
			if(search == arr[i]) {
				System.out.print(i + "\t");
				cnt++;
			}
		}
		
		System.out.println("\n" + search + "의 개수 : " + cnt);

	}

}
