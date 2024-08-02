package point;

public class Circle extends Point {
	// 매개변수
	private int radius;

	// 기본 생성자
	public Circle() {}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	// toString
	@Override
	public String toString() {
		return null;
	}

	// getter
	public int getRadius() {
		return this.radius;
	}

	// setter
	public void setRadius(int radius) {
		this.radius = radius;
	}
}
