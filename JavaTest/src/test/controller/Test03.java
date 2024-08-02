package test.controller;

public class Test03 {
	public static void main(String[] args) {
		/*
		 * [문제 3] 1부터 100까지 모든 정수들의 합과 평균을 구하는 프로그램을 작성한다. 단, while문이나 do while문을 이용하여
		 * 작성한다. (합계와 평균은 double로 계산한다)
		 */

		double sum = 0;
		double count = 1;

		while (count <= 100) {
			sum += count;
			count++;
		}

		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (sum / count));
	}
}
