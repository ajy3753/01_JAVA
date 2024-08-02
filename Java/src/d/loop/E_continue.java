package d.loop;

public class E_continue {
	/*
	 * continue : 반복문 안에 기술되는 구문 continue; 코드를 실행 시 그 뒤의 코드를 실행하지 않고 곧바로 다시 반복문의
	 * 상단으로 이동
	 */
	public static void main(String[] args) {

		int sum = 0;

		/*
		 * 
		 * // 1부터 10까지 홀수 출력 for(int i = 1; i <= 10; i++) { if(i % 2 == 0) { continue; }
		 * System.out.print(i + "\t"); }
		 * 
		 */

		// 1부터 100까지의 총합계
		// 단, 6의 배수값을 배고

		for (int i = 1; i <= 100; i++) {
			if (i % 6 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("1부터 100까지 6의 배수값만을 뺀 총합 : " + sum);
	}
}
