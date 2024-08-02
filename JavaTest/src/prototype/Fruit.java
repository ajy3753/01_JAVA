package prototype;

public class Fruit {
	private String fruit;
	private String color;
	
	public Fruit(String fruit, String color) {
		this.fruit = fruit;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Fruit [fruit=" + fruit + ", color=" + color + "]";
	}
}
