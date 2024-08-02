package ncs.test02;

public class StringTest {
	public static void main(String[] args) {
		/*
		 * [문제2] 주어진 String 데이터를 ","로 나누어 5개의 실수 데이터들을 꺼내어 합과 평균을 구한다. 단, String 문자열의 모든
		 * 실수 데이터를 배열로 만들어 계산한다. 합계와 평균은 모두 소수점 3자리까지만 표현한다.
		 * 
		 * <사용 데이터> String str = "1.22,4.12,5.93,8.71,9.34";
		 */

		String str = "1.22,4.12,5.93,8.71,9.34";
		String[] strArr = str.split(",");
		double sum = 0, count = 0;

		for (int i = 0; i < strArr.length; i++) {
			sum += Double.parseDouble(strArr[i]);
			count++;
		}

		System.out.printf("합계 : %.3f \n", sum);
		System.out.printf("평균 : %.3f \n", (sum / count));

	}
}
