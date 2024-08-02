package e.array;

public class B_Array_Copy {
	public static void main(String[] args) {

		int[] origin = { 1, 2, 3, 4, 5 };

		System.out.println("=========== 원본 배열 출력 ===========");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + "\t");
		}
		System.out.println("\n");

		/*
		 * 
		 * // 단순하게 origin을 다시 대입시킨 copy 배열을 생성
		 * 
		 * int[] copy = origin;
		 * 
		 * System.out.println("========== 복사본 배열 출력 =========="); for(int i = 0; i <
		 * copy.length; i++) { System.out.print(copy[i] + "\t"); }
		 * System.out.println("\n");
		 * 
		 * // copy의 값만을 수정해도 원본의 값이 함께 변경된다. // 왜? origin과 copy가 같은 메모리를 참조하고 있기 때문 (참조
		 * 변수의 주소값이 동일) // 얕은 복사 : 주소값 복사
		 * 
		 * copy[2] = 99; System.out.println("---------- 복사본 값 변경 후 ----------"); for(int
		 * i = 0; i < origin.length; i++) { System.out.print(origin[i] + "\t"); }
		 * System.out.println("\n");
		 * 
		 * // 배열 복사 방법 // 1. for문을 활용한 방법 // 새로운 배열을 만들어서 반복문을 통해 원본배열의 값들을 새로운 배열에 대입
		 * 
		 * // origin 배열과 크기가 같은 coy 배열 생성 int[] copy = new int[origin.length];
		 * 
		 * // origin 배열에 있는 모든 값을 copy 배열로 전달 for(int i = 0; i < origin.length; i++) {
		 * copy[i] = origin[i]; }
		 * 
		 * System.out.println("========== 복사본 배열 출력 =========="); for(int i = 0; i <
		 * copy.length; i++) { System.out.print(copy[i] + "\t"); }
		 * 
		 */

		// 2. 새로운 배열 생성 후 arraycopy() 메소드를 이용해서 복사하기
		// int[] copy2 = origin.clone();
		int[] copy2 = new int[10];

		// System.arraycopy(원본 배열, 복사 시작할 인덱스, 복사본 배열, 복사본 배열의 시작 인덱스, 복사할 갯수
		System.arraycopy(origin, 2, copy2, 4, 3);

		System.out.println("========== 복사본 배열 출력 ==========");
		for (int i = 0; i < copy2.length; i++) {
			System.out.print(copy2[i] + "\t");
		}
		System.out.println("\n");

	}
}
