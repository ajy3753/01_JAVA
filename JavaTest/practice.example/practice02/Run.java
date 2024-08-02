package practice02;

public class Run {
	public static void main(String[] args) {
		/*
		 * [필드 실습 예제1]
		 * 실행용 메소드로 기본 생성자를 통해 Product type의 객체를 생성하고,
		 * information()을 이용해 출력
		 */

		Product prd = new Product("초코소라빵", 3400, "매일(희망사항)");
		prd.information();
	}
}
