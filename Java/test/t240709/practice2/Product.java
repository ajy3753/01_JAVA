package t240709.practice2;

public class Product {
	String pName;
	int price;
	String brand;
	
	public Product() {}
	
	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}
	
	public void information() {
		System.out.println("상품명 : " + this.pName);
		System.out.println("가격 : " + this.price + "원");
		System.out.println("브랜드 : " + this.brand + "\n");
	}
}
