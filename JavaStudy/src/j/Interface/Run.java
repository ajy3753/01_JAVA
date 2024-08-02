package j.Interface;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		/*
		 * 인터페이스를 상속받은 클래스는 그냥 클래스이다. 인터페이스에서도 다형성은 성립된다. = 부모의 참조변수로 자식 객체를 담을 수 있다.
		 * 
		 * 인터페이스 - 추상 메소드 + 상수 필드로만 이루어진 클래스 - 추상 메소드로만 이루어져있기 때문에 객체를 직접 생성할 수 없다. - 참조
		 * 변수로 사용은 가능핟.
		 * 
		 * 추상 메소드 - 미완성된 메소드로 구현부({})가 구현되어 있지않은 메소드 - 무조건 오버라이딩 후 호출이 가능하다
		 */

		Scanner sc = new Scanner(System.in);

		Dog d1 = new Dog();
		d1.eat();
		d1.makeSound();

		Animal[] ani = new Animal[5];
		for (int i = 0; i < ani.length; i++) {
			System.out.println("추가할 동물을 선택해주세요.");
			System.out.print("1. 강아지 2. 고양이 : ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				ani[i] = new Dog();
				break;
			case 2:
				ani[i] = new Cat();
			}
		}

		for (int i = 0; i < ani.length; i++) {
			ani[i].makeSound();
		}
	}
}
