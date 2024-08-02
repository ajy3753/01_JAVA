package snack;

public class Run {
	public static void main(String[] args) {
		/*
		 * [OOP 실습문제1]
		 * 다음과 같은 클래스를 작성하시오.
		 * 
		 * <사용 데이터>
		 * [kind]		[name]		[flavor]	[numOf]		[price]
		 * 빵			케이크		블루베리		1			15000
		 */

		SnackMenu sm = new SnackMenu();
		sm.menu();
	}
}
