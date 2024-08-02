package test.controller;

public class Test09 {
	public static void main(String[] args) {
		/*
		 * [문제 9] 2차원 배열에 들어있는 데이터 중 가장 큰 값과 가장 작은 값을 구한다.
		 * 
		 * <사용 데이터> int[][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18,
		 * 78}, {45, 26, 72, 23}};
		 */

		int[][] array = { { 12, 41, 36, 56 }, { 82, 10, 12, 61 }, { 14, 16, 18, 78 }, { 45, 26, 72, 23 } };

		int max = 0, min = 100;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (max < array[i][j]) {
					max = array[i][j];
				}
				if (min > array[i][j]) {
					min = array[i][j];
				}
			}
		}

		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
	}
}
