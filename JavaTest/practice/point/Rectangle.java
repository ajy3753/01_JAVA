package point;

public class Rectangle extends Point {
	// 매개변수
	private int width;
	private int height;

	// 기본 생성자
	public Rectangle() {}

	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	// toString
	@Override
	public String toString() {
		return null;
	}

	// getter
	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}

	// setter
	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
