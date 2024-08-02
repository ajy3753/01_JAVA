package f.object.ex4;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		/*
		 * choi 객체 생성 : 최지원, 15살, 수학 : 70, 영어 : 60, 국어 : 80 kim 객체 생성 : 김도한, 18살, 수학 :
		 * 50, 영어 : 95, 국어 : 70
		 */

		Student choi = new Student("최지원", 15, 70, 60, 80);
		Student kim = new Student("김도한", 18, 50, 95, 70);

		// choi의 모든 과목의 평균을 출력
		// choi.printScore();
		// System.out.println(choi.getName() + " 님의 평균 : " + choi.getEvg() + "\n");

		// kim의 모든 과목의 평균을 출력
		// kim.printScore();
		// System.out.println(kim.getName() + " 님의 평균 : " + kim.getEvg() + "\n");

		// 사용자로부터 이름, 나이, 수학 점수, 영어 점수, 국어 점수를 입력받아
		// 평균을 구하고 출력하는 프로그램 작성

		Scanner sc = new Scanner(System.in);

		System.out.print("이름 입력 : ");
		String name = sc.next();

		System.out.print("나이 입력 : ");
		int age = sc.nextInt();

		System.out.print("수학 점수 입력 : ");
		int math = sc.nextInt();

		System.out.print("영어 점수 입력 : ");
		int en = sc.nextInt();

		System.out.print("국어 점수 입력 : ");
		int ko = sc.nextInt();

		Student user = new Student(name, age, math, en, ko);
		System.out.println();
		user.printScore();
		user.printEvg();

		sc.close();

		/*
		 * 캡슐화 ; 추상화를 통해서 정의된 속성들과 기능들을 하나로 묶어 관리하는 기법 클래스에서 가장 중요한 목적인
		 * "데이터의 접근제한(정보은닉)"을 원칙으로 외부로부터의 "데이터 접근을 막고" 대신에
		 * "데이터를 간적적으로 처리(값을 변경하거나, 가져오는 것 등)"할 메소드들을 클래스 내부에 작성하여 관리하는 것 다양한 기능을 묶어 하나의
		 * 큰 기능을 만들어 준 것.
		 */
	}
}
