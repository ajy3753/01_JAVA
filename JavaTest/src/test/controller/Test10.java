package test.controller;

public class Test10 {
	public static void main(String[] args) {
		/*
		 * [문제 10] 2차원 배열에 들어있는 데이터들 중 3의 배수만 골라내서 새로운 1차원 배열에 기록하고 출력한다. 단, 중복 값은 하나만
		 * 기록되게 한다.
		 * 
		 * <사용 데이터> int[][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18,
		 * 78}, {45, 26, 72, 23}}; int[] copyAr = new int[array의 행갯수 * 열갯수];
		 */

		int[][] array = { { 12, 41, 36, 56 }, { 82, 10, 12, 61 }, { 14, 16, 18, 78 }, { 45, 26, 72, 23 } };

		int size = 0;
		for (int i = 0; i < array.length; i++) {
			size += array[i].length;
		}

		int[] copyAr = new int[size];
		int copyIndex = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] % 3 == 0) {
					int count = 0;
					for (int n = 0; n < copyAr.length; n++) {
						if (copyAr[n] == array[i][j]) {
							count++;
						}
					}

					if (count == 0) {
						copyAr[copyIndex++] = array[i][j];
					}
				}
			}
		}

		System.out.print("copyAr : ");
		for (int i = 0; i < copyAr.length; i++) {
			if (copyAr[i] != 0) {
				System.out.print(copyAr[i] + "\t");
			}
		}
	}
}
