package t240709.practice6;

public class Book {
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	// 생성자
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
	
	// 할인율 계산하기
	public int setDiscountPrice() {
		int discountPrice = (int)(this.price - (this.price / this.discountRate));
		return discountPrice;
	}
	
	// info
	public void information() {
		System.out.println("제목 : " + this.title);
		System.out.println("출판사 : " + this.publisher);
		System.out.println("작가 : " + this.author);
		System.out.println("판매가 : " + this.setDiscountPrice() + "원 (-" + this.discountRate + "%)");
		System.out.println("원가 : " + this.price + "\n");
	}
}
