package Homework09_Polymorphism;

public class AnimalManager {
	public static void main(String[] args) {
		/*
		 * [추상 클래스, 인터페이스 실습문제2]
		 * 1. 추상 클래스인 Animal을 만든다.
		 * 2. Animal을 상속받은 Dog, cat 클래스를 각각 만든다.
		 * (이때 Animal 클래스의 추상 메소드를 오버라이딩 해야됨)
		 * 3. 실행용 클래스를 AnimalManager 클래스를 작성하고 그 안에 실행될 코드를 작성한다.
		 */
		
		Animal[] aniArr = new Animal[5];
		for(int i = 0; i < aniArr.length; i++) {
			int random = (int)(Math.random() * 20 + 10);
			if(random % 2 == 0) {
				aniArr[i] = new Dog("강쥐" + i, "개", random);
			}
			else {
				aniArr[i] = new Cat("고영" + i, "고양이", "톰캣", "자바");
			}
		}
		
		for(int i = 0; i < aniArr.length; i++) {
			aniArr[i].speak();
		}
	}
}
