package chap02_abstractNInterface;

public class Run {
	public static void main(String[] args) {
		/*
		 * [Interface 실습문제] 갤럭시 노트9와 V40을 만들기에 필요한 기술들의 상속 구조를 나타낸 클래스 다이어그램이다. 설명을 보고
		 * 클래스, 인터페이스를 구현한 뒤 갤럭시 노트 9과 V40의 제원을 출력하는 프로그램을 작성하시오.
		 */

		// PhoneController 객체 생성하고 method() 호출 후 반환 값을 String 배열에 담기
		PhoneController phController = new PhoneController();
		String[] results = phController.method();

		// 반복문을 이용하여 String 배열의 각 인덱스 출력
		for (String res : results) {
			System.out.println(res);
		}
	}
}