package f.object.ex3;

public class Book {
	/*
	 * 접근제한자 : 해당구조에 접근할 수 있는 권한
	 */

	// 필드
	String title;
	String genre;
	String author;
	int maxPage;

	// 생성자
	/*
	 * 
	 */

	public String toStirng() {
		/*
		 * this : 인스턴스(메모리를 사용중인) 자기 자신을 의미 1) 자기 자신의 메모리를 가리킨다. 2) 생성자에서 다른 생성자를 호출할 수
		 * 있다. 3) 자기 자신의 주소를 반환할 수 있다.
		 */
		return "제목 : " + this.title + "\n장르 : " + this.genre + "\n저자 : " + this.author + "\n총 페이지 : " + this.maxPage;
	}

	public String getTitle() {
		return this.title;
	}
}
