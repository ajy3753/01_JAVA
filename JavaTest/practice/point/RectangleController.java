package point;

public class RectangleController {
	// 변수
	private Rectangle r = new Rectangle();
	
	// 필드를 초기화하고, 사각형의 둘레 정보를 반환 (둘레 : 2 * (너비 + 높이))
	public String calcPerimeter(int x, int y, int width, int height) {
		r = new Rectangle(x, y, width, height);
		return x + ", " + y + ", " + width + ", " + height + " / " + (2 * (width + height));
	}
	
	// 필드를 초기화하고, 사각형의 넓이 정보를 반환 (넓이 : 너비 * 높이)
	public String calcArea(int x, int y, int width, int height) {
		r = new Rectangle(x, y, width, height);
		return x + ", " + y + ", " + width + ", " + height + " / " + (width * height);
	}
}