package practice02;

public class Product {
	// 매개변수
	private String pName;
	private int price;
	private String brand;
	
	// 기본 생성자
	public Product() {}
	
	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}
	
	// information()
	public void information() {
		System.out.println("===== 상품 정보 =====");
		System.out.println("상품명 : " + this.pName);
		System.out.println("가격 : " + this.price);
		System.out.println("브랜드 : " + this.brand);
	}
	
	// getter
	public String getPName() {
		return this.pName;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	// setter
	public void setPName(String pName) {
		this.pName = pName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
}
