package t240709.practice6;

public class RunBook {

	public static void main(String[] args) {
		// Book : title, publisher, author, price, discountRate
		Book b1 = new Book("폰길동전", "짭출판사", "허쥰", 13500, 3.5);
		b1.information();
		
		Book b2 = new Book("불꽃효녀심청", "지게라이딩", "용왕백");
		b2.information();
	}

}
