package ncs.test08;

public class UserTest {

	public static void main(String[] args) {
		/*
		 * [문제 8] 상속받은 Object 클래스의 메소드를 오버라이딩하여 프로그램을 작성한다. 3개의 User 객체를 생성하여 배열에 셋팅한 후
		 * 각 객체의 모든 정보를 처리 출력한다. (for문 사용) users가 참조하는 객체들의 복사본을 만든다(for문 사용) 복사본의 객체
		 * 정보를 모두 출력한다(for each문 사용) users와 copyUsers의 각 index별 객체의 값들이 일치하는지 확인 출력한다.
		 * 
		 * <사용 데이터> id password name age gener phone user01 pass01 김철수 32 M
		 * 010-1234-5678 user02 pass02 이영희 25 F 010-5555-7777 user03 pass03 황진이 20 F
		 * 010-9874-5632
		 */

		// users
		User[] users = new User[3];
		users[0] = new User("user01", "pass01", "김철수", 32, 'M', "010-1234-5678");
		users[1] = new User("user02", "pass02", "이영희", 25, 'F', "010-5555-7777");
		users[2] = new User("user03", "pass03", "황진이", 20, 'F', "010-9874-5632");

		System.out.println("users list ---------------------------------------------");
		for (int i = 0; i < users.length; i++) {
			System.out.println(users[i].toString());
		}
		System.out.println();

		// copyUsers
		User[] copyUsers = new User[users.length];
		for (int i = 0; i < copyUsers.length; i++) {
			copyUsers[i] = (User) users[i].clone();
		}

		System.out.println("copyUsers ----------------------------------------------");
		for (User copy : copyUsers) {
			System.out.println(copy.toString());
		}
		System.out.println();

		// users와 copyuesrs 비교
		System.out.println("비교 결과 -----------------------------------------------");
		for (int i = 0; i < users.length; i++) {
			System.out.println(copyUsers[i].equals(users[i]));
		}
	}

}
