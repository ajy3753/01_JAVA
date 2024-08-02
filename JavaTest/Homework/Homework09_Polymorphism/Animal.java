package Homework09_Polymorphism;

public abstract class Animal {
	// 매개변수
	private String name;
	private String kinds;
	
	// 기본 생성자
	public Animal() {};
	
	public Animal(String name, String kinds) {
		this.name = name;
		this.kinds = kinds;
	}
	
	// toString
	public String toString() {
		return "저의 이름은 " + this.name + "이고, 종은 " + this.kinds + "입니다.";
	}
	
	// 추상 메소드
	public abstract void speak();
	
	// getter
	public String getName() {
		return this.name;
	}
	
	public String getKinds() {
		return this.kinds;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
}
