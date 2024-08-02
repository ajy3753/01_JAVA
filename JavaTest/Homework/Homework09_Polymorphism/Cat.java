package Homework09_Polymorphism;

public class Cat extends Animal {
	// 매개변수
	private String location;
	private String color;
	
	// 기본 생성자
	public Cat() {};
	
	public Cat(String name, String kinds, String location, String color) {
		super(name, kinds);
		this.location = location;
		this.color = color;
	}
	
	// 추상 메소드 오버라이딩
	@Override
	public void speak() {
		System.out.println(this.toString());
		System.out.println(this.location + "에 서식하며, 색상은 " + this.color + "입니다.\n");
	}
	
	// getter
	public String getName() {
		return super.getName();
	}
	
	public String getKinds() {
		return super.getKinds();
	}
	
	public String getLocation() {
		return this.location;
	}
	
	public String getColor() {
		return this.color;
	}
	
	// setter
	public void setName(String name) {
		super.setName(name);
	}
	
	public void setKinds(String kinds) {
		super.setKinds(kinds);
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
}
