package practice06;

public class Book {
	// 매개변수
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	// 기본 생성자
	public Book() {}
	
	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	
	public Book(String title, String publisher, String author, int price, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	// inform()
	public void inform() {
		System.out.println("===== 도서 정보 =====");
		System.out.println("도서명 : " + this.title + "( " + this.publisher + " )");
		System.out.println("저자명 : " + this.author);
		System.out.println("판매가격 : " + this.price + " ( 할인률 : " + this.discountRate + "% )");
	}
	
	// getter
	public String getTitle() {
		return this.title;
	}
	
	public String getPublisher() {
		return this.publisher;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public double getDiscountRate() {
		return this.discountRate;
	}
	
	// setter
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
}
