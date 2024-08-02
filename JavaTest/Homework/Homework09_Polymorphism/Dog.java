package Homework09_Polymorphism;

public class Dog extends Animal {
	// 매개변수
	private final String PLACE = "애견카페";
	private int weight;
	
	// 기본 생성자
	public Dog() {}
	
	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		this.weight = weight;
	}

	// 추상 메소드 오버라이딩
	@Override
	public void speak() {
		System.out.println(this.toString());
		System.out.println("몸무게는 " + this.weight + "kg입니다.\n");
	}
	
	// getter
	public String getName() {
		return super.getName();
	}
	
	public String getKinds() {
		return super.getKinds();
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	// setter
	public void setName(String name) {
		super.setName(name);
	}
	
	public void setKinds(String kinds) {
		super.setKinds(kinds);
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}

}
