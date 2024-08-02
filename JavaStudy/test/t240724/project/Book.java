package t240724.project;

public class Book {
	// 필드
	private String title;
	private String author;
	private String category;
	private int price;
	
	// 생성자
	public Book() {}
	
	public Book(String title, String author, String category, int price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	
	// 메소드
	
	// toString
	@Override
	public String toString() {
		return "Book [title = " + title + "]";
	}
	
	// getter
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public String getCategory() {
		return this.category;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	// setter
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuhor(String author) {
		this.author = author;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
}
