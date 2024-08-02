package Homework04_Inheritance;

public class Person {
	// 매개변수
	private String name;
	private int age;
	private double height;
	private double weight;

	// 생성자
	public Person() {
	}

	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// 메소드
	@Override
	public String toString() {
		return null;
	}

	// getter
	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public double getHeight() {
		return this.height;
	}

	public double getWeight() {
		return this.weight;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
