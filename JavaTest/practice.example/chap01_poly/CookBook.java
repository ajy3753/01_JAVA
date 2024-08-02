package chap01_poly;

public class CookBook extends Book {
	// 매개변수 (요리학원 쿠폰 유무)
	private boolean coupon;

	// 기본 생성자
	public CookBook() {
	}

	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}

	// toString
	@Override
	public String toString() {
		return "CookBook [Book [title = " + super.getTitle() + ", author = " + super.getAuthor() + ", publisher = "
				+ super.getPublisher() + ", coupon = " + getCoupon() + "]";
	}

	// getter
	public boolean getCoupon() {
		return this.coupon;
	}

	// setter
	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}
}
