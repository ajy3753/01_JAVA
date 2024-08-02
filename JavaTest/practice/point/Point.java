package point;

public class Point {
	// 매개변수
	private int x;
	private int y;

	// 기본 생성자
	public Point() {}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// toString
	public String toString() {
		return null;
	}

	// getter
	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	// setter
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
}
