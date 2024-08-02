package practice06;

public class Run {
	public static void main(String[] args) {
		/*
		 * [생성자 실습예제]
		 * 실행용 메소드로 기본 생성자와 매개변수 3개인 생성자, 매개변수 5개인 생성자들을 통해
		 * 각각의 객체 생성 후 inform()을 통해 출력
		 */
		
		Book b1 = new Book("토끼와 거뿎이", "도서출판 뽁뽁", "용왕", 5900, 0.2);
		Book b2 = new Book("효녀 심청", "동해", "심봉사");
		
		b1.inform();
		b2.inform();
	}
}
