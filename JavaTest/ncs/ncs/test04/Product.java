package ncs.test04;

public class Product {
	// 변수
	private String name;
	private int price;
	private int quantity;

	// 생성자
	public Product() {
	}

	public Product(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// 메소드
	public String information() {
		return "상품명 : " + this.name + "\n가격 : " + this.price + "원\n수량 : " + this.quantity + "개\n총 구매 가격 : " + getTotal()
				+ "원";
	}

	// getter()
	public String getName() {
		return this.name;
	}

	public int getPrice() {
		return this.price;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public int getTotal() {
		return (this.price * this.quantity);
	}

	// setter()
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
