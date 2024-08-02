package t240731;

public class Run {
	/*
	 * MVC 패턴 : 각 클래스마다 역할(데이터, 화면, 요청 처리)을 부여해서 작업
	 * 			=> 유지보수가 용이
	 * 
	 * M (Model) : 데이터를 담당하는 역할 (데이터를 담기위한 클래스, 비즈니스 로직을 처리하기위한 클래스, 데이터가 보관되어 있는 보관함과 연결해서
	 * V (View) : 화면을 담당하는 역할. 즉, 사용자에게 보여지는 시각적인 요서 (입출력)
	 * C (Controller) : 사용자가 요청한 내용을 처리한 후, 그 결과를 돌려주는 역할
	 */
	public static void main(String[] args) {
		new FarmMenu().mainMenu();

	}

}
