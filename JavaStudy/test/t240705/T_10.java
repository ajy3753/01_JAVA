package t240705;

import java.util.Scanner;

public class T_10 {

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
		 * 
		 * "더 하시겠습니까?" 라고 추가로 물어보도록 하세요.
		 * 이때 N이나 n이 나오면 프로그램을 끝내고 Y나 y면 계속 진행하도록 하되
		 * Y, y, N, n이 아닌 다른 문자를 입력했을 경우 "잘못된 대답입니다. 다시 입력해주세요."를 출력하고
		 * 더 하겠냐는 물음을 반복하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		char cont = 'A';
		
		do {
			System.out.print("문자열 입력 : ");
			String str = sc.next();
			
			System.out.print("검색할 문자 : ");
			char search = sc.next().charAt(0);
			
			char[] arr = new char[str.length()];
			for(int i = 0; i < arr.length; i++) {
				arr[i] = str.charAt(i);
			}
			
			int cnt = 0;
			System.out.print( str + "에 " + search + "가 존재하는 위치(인덱스) : ");
			for(int i = 0; i < arr.length; i++) {
				if(search == arr[i]) {
					System.out.print(i + "\t");
					cnt++;
				}
			}
			
			System.out.println("\n" + search + "의 개수 : " + cnt);
			System.out.println();
			
			while(true) {
				System.out.print("더 하시겠습니까? (Y / N) : ");
				cont = sc.next().charAt(0);
				if(cont != 'y' && cont != 'Y' && cont != 'n' && cont != 'N') {
					System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
				}
				else {
					break;
				}
			}
			System.out.println();
			
		} while(cont != 'n' && cont != 'N');


	}

}
