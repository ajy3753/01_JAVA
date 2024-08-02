package j.Interface;

public interface Animal {
	/*
	 * interface에 사용 가능한 것 1. static 변수 2. 추상 메소드 - 미완성 메소드로 구현부({})가 없는 메소드 -
	 * abstract 추상 키워드를 붙여서 생성 - 생략되어 나타있다.
	 */
	public abstract void move();

	public abstract void eat();

	public abstract void makeSound();
}
