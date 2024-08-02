package practice01;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		/*
		 * [클래스 실습예제]
		 * 실행용 메소드로 기본 생성자를 통해 Member type의 객체를 생성하고,
		 * changeName()을 이용해 값 변경 후 printName()을 이용해 출력.
		 */
		
		Scanner sc = new Scanner(System.in);
		Member m = new Member("zzanggu", "sin", "짱구", 30, '남', "010-0000-0000", "zzang@gu.net");
		
		System.out.print("이름 변경 : ");
		String name = sc.next();
		
		m.changeName(name);
		
		sc.close();
	}
}
