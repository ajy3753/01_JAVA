package t240704;

public class T_05 {
	public static void main(String[] args) {
		/*
		 * 길이가 10인 배열을 선언하고 1부터 10까지의 값을
		 * 반복문을 이용하여 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		 */
		
		int[] iArr = new int[10];
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = (i + 1);
			System.out.print(iArr[i] + "\t");
		}
		
		System.out.println();
		
		/*
		 * 길이가 10인 배열을 선언하고 1부터 10까지의 값을
		 * 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요
		 */
		
		int[] iArr2 = new int[10];
		for(int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (iArr2.length - i);
			System.out.print(iArr2[i] + "\t");
		}
		
		
	}
}
