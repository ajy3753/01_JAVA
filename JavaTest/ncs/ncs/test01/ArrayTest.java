package ncs.test01;

public class ArrayTest {
	public static void main(String[] args) {
		/*
		 * [문제1] 2차원 배열에 들어있는 데이터들의 합계와 평균을 구한다. 합계와 평균 값은 double로 처리하고, 소수점 아래 둘째자리까지
		 * 출력되게 한다.
		 * 
		 * <사용 데이터> int [][] array = {{12, 41, 36, 56, 21}, {82, 10, 12, 61, 45}, {14,
		 * 16, 18, 78, 65}, {45, 26, 72, 23, 34}};
		 */

		int[][] array = { { 12, 41, 36, 56, 21 }, { 82, 10, 12, 61, 45 }, { 14, 16, 18, 78, 65 },
				{ 45, 26, 72, 23, 34 } };

		double sum = 0;
		double count = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}

		System.out.printf("합계 : %.2f \n", sum);
		System.out.printf("평균 : %.2f \n", (sum / count));

	}
}
