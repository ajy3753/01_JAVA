package j.Interface;

public class Dog implements Animal {
	@Override
	public void move() {
		System.out.println("촐랑촐랑 뛰어다닌다.");
	}

	@Override
	public void eat() {
		System.out.println("촵촵챱 먹는다.");
	}

	@Override
	public void makeSound() {
		System.out.println("멍멍멍멍!");
	}
}
