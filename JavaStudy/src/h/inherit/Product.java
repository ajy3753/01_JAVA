package h.inherit;
//Product 클래스를 정의하세요.

// String brand, String pCode, String pName, int price

public class Product {
	// 매개 변수
	private String brand;
	private String bCode;
	private String pName;
	private int price;

	// 생성자
	public Product() {
	}

	public Product(String brand, String bCode, String pName, int price) {
		this.brand = brand;
		this.bCode = bCode;
		this.pName = pName;
		this.price = price;
	}

	// 메소드
	public String information() {
		return "브랜드 : " + this.brand + " 상품코드 : " + this.bCode + " 상품명 : " + this.pName + " 가격 : " + this.price + "원";
	}

	// getter
	public String getBrand() {
		return this.brand;
	}

	public String getBCode() {
		return this.bCode;
	}

	public String getPName() {
		return this.pName;
	}

	public int getPrice() {
		return this.price;
	}

	// setter
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setBCode(String bCode) {
		this.bCode = bCode;
	}

	public void setPName(String pName) {
		this.pName = pName;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
