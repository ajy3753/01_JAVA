package practice04;

public class Run {
	public static void main(String[] args) {
		/*
		 * [필드 초기화 실습예제1]
		 * Student : 초기화 블럭을 이용해 각 필드 초기화
		 * Run : 실행용 메소드로 기본 생성자를 통해 Student 객체 생성 후 information()으로 정보 출력
		 */

		Student st = new Student(3, 1, "박수길", 178.6, '남');
		st.information();
	}
}
