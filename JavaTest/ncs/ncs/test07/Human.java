package ncs.test07;

public class Human {
	// 매개변수
	private String name;
	private int age;
	private int height;
	private int weight;

	// 생성자
	public Human() {
	}

	public Human(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// 메소드
	@Override
	public String toString() {
		return name + "\t" + age + "\t" + height + "\t" + weight + "\t";
	}

	// getter
	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public int getHeight() {
		return this.height;
	}

	public int getWeight() {
		return this.weight;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
