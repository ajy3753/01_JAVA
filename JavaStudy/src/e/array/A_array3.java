package e.array;

import java.util.Scanner;

public class A_array3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 
		 * // 1. 크기가 10인 정수형 배열 생성 후 int[] arr = new int[10];
		 * 
		 * // 2. 반복문을 통해서 0번 인덱스부터 마지막 인덱스까지 모든 값을 1로 초기화 for(int i = 0; i < arr.length;
		 * i++) { arr[i] = 1; }
		 * 
		 * // 3. 반복문을 통해서 0 ~ 마지막 인덱스까지 전부 출력 for(int i = 0; i < arr.length; i++) {
		 * System.out.print(arr[i] + "\t"); }
		 * 
		 * // 4. 사용자에게 배열의 길이를 입력받아 해당 크기의 문자열 배열을 생성해라 // 길이 입력 : x
		 * 
		 * System.out.print("길이 입력 : "); int length = sc.nextInt(); String[] uArr = new
		 * String[length];
		 * 
		 * // 5. 반복문을 활용해서 매번 사용자에게 과일명을 입력받아 그 값을 strArr에 대입 (0 ~ 마지막 인덱스) // 좋아하는 과일을
		 * 입력 : 바나나
		 * 
		 * for(int i = 0; i < uArr.length; i++) {
		 * System.out.print("좋아하는 과일을 입력 (남은 횟수 : " + (uArr.length - i) +") : ");
		 * uArr[i] = sc.next(); }
		 * 
		 * // 6. 반복문을 이용해서 strArr에 있는 모든 값을 출력 for(int i = 0; i < uArr.length; i++) {
		 * System.out.println((i + 1) + "번째 항목 : " + uArr[i]); }
		 * 
		 * // 사용자에게 문자열 하나 입력받은 후 (단어 하나) // 각각의 인덱스에 있는 문자들을 char 배열에 옮겨담기
		 * 
		 * // 1. 사용자에게 문자열 하나 입력받은 후 System.out.print("문자열 입력 : "); String str =
		 * sc.next();
		 * 
		 * // 2. char 배열 생성하기 (길에 => 문자열의 길이) char[] cArr = new char[str.length()];
		 * 
		 * // 3. 반복문을 통해서 해당 문자열에서 각각 인덱스별 문자를 char배열에 각 인덱스값에 대입 for(int i = 0; i <
		 * cArr.length; i++) { cArr[i] = str.charAt(i); }
		 * 
		 * // 4. char 배열의 모든 index값을 전체 출력 for(int i = 0; i < cArr.length; i++) {
		 * System.out.print(cArr[i] + "\t"); }
		 * 
		 */

		// 사용자에게 배열의 길이를 입력받아 해당 길이의 정수형 배열 arr을 생성한다
		// arr에 모든 인덱스값에 1 ~ 100 사이의 랜덤값을 할당해주고
		// 이중 짝수인 값의 총합을 구하고 arr의 모든 값을 출력해라

		System.out.print("길이 입력 (정수만 가능) : ");
		int length2 = sc.nextInt();
		int[] iArr2 = new int[length2];
		int sum = 0;

		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int) (Math.random() * 100 + 1);
			System.out.print(iArr2[i] + "\t");

			if (iArr2[i] % 2 == 0) {
				sum += iArr2[i];
			}
		}

		System.out.println("\n짝수인 값의 총합 : " + sum);

	}
}
