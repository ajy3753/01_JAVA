package ncs.test07;

public class StudentTest {

	public static void main(String[] args) {
		/*
		 * [문제 7] Human이라는 부모 클래스를 상속 받은 Student 클래스를 이용하여 프로그램을 작성한다. 3개의 Student 객체를
		 * 생성하여 배열에 셋팅한 후 각 객체의 모든 정보를 출력한다. (for문 사용)
		 * 
		 * <사용 데이터> name age height weight number major 홍길순 25 171 81 201401 영어영문학 한사랑
		 * 23 183 72 201402 건축학 임꺽정 26 175 65 201403 체육학
		 */

		Student[] stArr = new Student[3];
		stArr[0] = new Student("홍길순", 25, 171, 81, "201401", "영어영문학");
		stArr[1] = new Student("한사랑", 23, 183, 72, "201402", "건축학");
		stArr[2] = new Student("임꺽정", 26, 175, 65, "201403", "체육학");

		for (int i = 0; i < stArr.length; i++) {
			System.out.println(stArr[i].toString());
		}

	}

}
