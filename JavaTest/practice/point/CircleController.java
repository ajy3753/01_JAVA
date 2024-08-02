package point;

public class CircleController {
	// 변수
	private Circle c = new Circle();
	private final double PI = 3.14;
	
	// 필드를 초기화하고, 원의 둘레 정보를 반환 (둘레 : PI * 반지름 * 2)
	public String calcCircum(int x, int y, int radius) {
		c = new Circle(x, y, radius);
		return x + ", " + y + ", " +  radius + " / " + (PI * radius * 2);
	}
	
	// 필드를 초기화하고, 원의 넓이 정보를 반환 (넓이 : PI * 반지름 * 반지름)
	public String calcArea(int x, int y, int radius) {
		c = new Circle(x, y, radius);
		return x + ", " + y + ", " +  radius + " / " + (PI * radius * radius);
	}
}
