package chap01_poly;

public class Book {
	// 매개변수 (도서명, 저자명, 출판사명)
	private String title;
	private String author;
	private String publisher;

	// 기본 생성자
	public Book() {
	}

	public Book(String title, String author, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}

	// toString
	public String toString() {
		return null;
	}

	// getter
	public String getTitle() {
		return this.title;
	}

	public String getAuthor() {
		return this.author;
	}

	public String getPublisher() {
		return this.publisher;
	}

	// setter
	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
}
