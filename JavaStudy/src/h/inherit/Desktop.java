package h.inherit;

public class Desktop extends Product {
	private boolean allinOne;

	public Desktop() {
		super();
		System.out.println("Desktop()");
	}

	public Desktop(String brand, String pCode, String pName, int price, boolean allinOne) {
		super(brand, pCode, pName, price);
		this.allinOne = allinOne;
	}
}
