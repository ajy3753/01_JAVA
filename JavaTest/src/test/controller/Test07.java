package test.controller;

public class Test07 {
	public static void main(String[] args) {
		/*
		 * [문제 7] 배열에 들어있는 데이터 중 홀수의 값들을 출력하고 합을 구한다. 단, continue를 이용하여 작성한다. (합계의 값은
		 * double로 처리한다)
		 * 
		 * <사용 데이터> int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		 */

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		double sum = 0;

		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
			sum += i;
		}

		System.out.println("합계 : " + sum);
	}
}
