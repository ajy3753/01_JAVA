package e.array;

public class C_Array_Two {
	/*
	 * 2차원 배열 자료형이 같은 1차원 배열의 붂으로 배열 안에 다른 배열이 존재한다. 2차원 배열은 할당된 공간마다 인덱스 번호를 두 개 부여
	 * (앞번호는 몇 번째, 1자원 배열 인자 (행), 뒷 번호는 1차원 배열의 몇 번째 index인지)
	 */
	public static void main(String[] args) {
		/*
		 * 1. 2차원 배열 선언 (1차원 배열의 묶음을 참조하는 2차원 배열 참조 변수를 만든다) 자료형 [][] 배열명;
		 * 
		 * 2. 배열 할당 (실제 m 크기의 1차원 배열 n개를 만들어서 참조) 배일명 = new 자료형 [n][m];
		 * 
		 * 1차원 배열의 참조변수 묶음 먼저 생성할 수 있다.
		 * 
		 * 배열명 = new 자료형[n][]; 배열명[0] = 배열명[1] = 배열명[n] =
		 */

		int[][] arr;

		/*
		 * 
		 * // ar = new in[3][4]; 4개짜리 1차원 배열 3개 묶음 생성 arr = new int[3][]; arr[0] = new
		 * int[4]; arr[1] = new int[4]; arr[2] = new int[4];
		 * 
		 * // 배열 선언과 동시에 할당 int [][] arr2 = new int[3][4];
		 * 
		 * // 3. 배열의 값 대입 // 배열명[배열순번][인덱스] = 값;
		 * 
		 * arr[0][0] = 1; arr[1][1] = 2; arr[2][3] = 3;
		 * 
		 */

		// 3행 3열짜리 문자열 배열을 선언하고
		// 0행 0열부터 2행 2열까지 차례대로 접근하여 (행, 열) 값을 저장하기

		String[][] sArr = new String[3][3];

		sArr[0][0] = "(1행 1열)";
		sArr[0][1] = "(1행 2열)";
		sArr[0][2] = "(1행 3열)";
		sArr[1][0] = "(2행 1열)";
		sArr[1][1] = "(2행 2열)";
		sArr[1][2] = "(2행 3열)";
		sArr[2][0] = "(3행 1열)";
		sArr[2][1] = "(3행 2열)";
		sArr[2][2] = "(3행 3열)";

		// 2차원 배열 strArr의 모든 값을 출력해라
		for (int i = 0; i < sArr.length; i++) {
			for (int j = 0; j < sArr.length; j++) {
				System.out.print(sArr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		char[][] chArr = { { '가', '나', '다', '라', '마', '바', '사', '아', '자', '차', '카', '타', '파', '하' },
				{ '아', '야', '어', '여', '오', '요', '우', '유', '으', '이' } };

		for (int i = 0; i < chArr.length; i++) {
			for (int j = 0; j < chArr[i].length; j++) {
				System.out.print(chArr[i][j] + "\t");
			}
			System.out.println();
		}

		// 막줄 세이버즈
	}
}
