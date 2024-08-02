package t240710.object2;

public class Product {
	private String pName;
	private int price;
	private String brand;
	
	// 생성자
	public Product() {}
	
	public Product(String name, int price, String brand) {
		this.pName = name;
		this.price = price;
		this.brand = brand;
	}

	// 메소드
	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	// 출력
	public void infomation() {
		System.out.println("제품명 : " + this.pName);
	}
}
