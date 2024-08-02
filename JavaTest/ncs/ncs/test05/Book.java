package ncs.test05;

public class Book {
	// 변수
	private String title;
	private String author;
	private int price;
	private String publisher;
	private double discountRate;

	// 생성자
	public Book() {
	}

	public Book(String title, String author, int price, String pub, double rate) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = pub;
		this.discountRate = rate;
	}

	// getter
	public String getTitle() {
		return this.title;
	}

	public String getAuthor() {
		return this.author;
	}

	public int getPrice() {
		return this.price;
	}

	public String getPublisher() {
		return this.publisher;
	}

	public double getDiscountRate() {
		return this.discountRate;
	}

	public int getTotal() {
		return (int) (this.price - this.price * this.discountRate);
	}

	// setter
	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
}
