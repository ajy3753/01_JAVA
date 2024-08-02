package chap01_poly;

public class AniBook extends Book {
	// 매개변수 (제한 나이)
	private int accessAge;

	// 기본 생성자
	public AniBook() {
	}

	public AniBook(String title, String author, String publisher, int accessAge) {
		super(title, author, publisher);
		this.accessAge = accessAge;
	}

	// toString
	@Override
	public String toString() {
		return "AniBook [Book [title = " + super.getTitle() + ", author = " + super.getAuthor() + ", publisher = "
				+ super.getPublisher() + ", accessAge = " + getAccessAge() + "]";
	}

	// getter
	public int getAccessAge() {
		return this.accessAge;
	}

	// setter
	public void setAcceccAge(int accessAge) {
		this.accessAge = accessAge;
	}
}
