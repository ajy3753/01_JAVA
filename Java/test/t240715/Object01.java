package t240715;

import java.util.Scanner;

public class Object01 {

	public static void main(String[] args) {
		// 정수 num1, num2, num3을 입력받아 홀짝을 출력하라
		// 입력 : 6 4 7
		// 출력 : 짝 짝 홀

		Scanner sc = new Scanner(System.in);

		/*
		 * 
		 * System.out.print("정수 3개 입력 : "); int num1 = sc.nextInt(); int num2 =
		 * sc.nextInt(); int num3 = sc.nextInt();
		 * 
		 * char ch1 = (num1 % 2 == 0) ? '짝' : '홀'; char ch2 = (num2 % 2 == 0) ? '짝' :
		 * '홀'; char ch3 = (num3 % 2 == 0) ? '짝' : '홀';
		 * 
		 * System.out.printf("출력 : %c %c %c \n\n", ch1, ch2, ch3);
		 * 
		 * // 정수(0 ~ 100)을 입력 받아, 0부터 입력 받은 수까지 출력 // 입력 : 7 // 출력 : 0 1 2 3 4 5 6 7
		 * 
		 * System.out.print("정수 입력(1 ~ 100) : "); int n = sc.nextInt();
		 * 
		 * for(int i = 0; i <= n; i++) { System.out.print(i + "\t"); }
		 * 
		 * System.out.println("\n");
		 * 
		 */

		// 번호를 입력한 횟수를 구하는 프로그램을 작성한다.
		// 번호(1 ~ 20)까지를 무작위로 10번 입력 받는다.
		// 입력 받은 1 ~ 20까지의 수가 각각 몇 번 입력되었는지를 출력한다.
		//
		// 입력 : 1 5 7 10 15 6 1 7 7 2
		// 입력 횟수 : 2 1 0 0 2 0 3 0 0 1 0 0 0 0 1 0 0 0 0 0

		/*
		 * 
		 * int[] inputArr = new int[10];
		 * 
		 * System.out.print("입력 (1 ~ 20) : "); for(int i = 0; i < inputArr.length; i++)
		 * { inputArr[i] = sc.nextInt(); }
		 * 
		 * System.out.print("입력 횟수 : "); for(int i = 1; i <= 20; i++) { int count = 0;
		 * 
		 * for(int j = 0; j < inputArr.length; j++) { if(i == inputArr[j]) { count++; }
		 * } System.out.print(count + " "); }
		 * 
		 */

		/*
		 * int[] arr = new int[20]; for(int i = 0; i < 10; i++) { int num =
		 * sc.nextInt(); arr[num - 1]++; }
		 */

		// 학생성적관리 프로그램을 만들고자 한다. 학생 10명을 생성한 후 reTest를 실행하여 모든 학생의 점수를 출력해라.
		// Student class : name(String), classRoom(int), javaScore(double),
		// sqlScore(double), praticeScore(double)
		// 각 필드 데이터의 getter/setter, 기본생성자, 모든 필드 데이터를 초기화하는 생성자를 작성하고
		// 또한 toString()으로 학생의 정보를 "xx반 xxx학생 xx점 xx점 xx점"으로 정보를 반환하는 메스드를 작성.
		// 각 점수는 자바, sql, practice순으로 출력한다.
		// isPassd : 모든 점수가 60점 이상이면서 평균이 60점 이상이면 true 아니면 false를 반환하는 메소드
		// reTest : 학생의 모든 점수를 랜덤(0 ~ 100)으로 다시 부여하는 메소드(반환없음)

		Student[] stArr = new Student[10];
		for (int i = 0; i < stArr.length; i++) {
			String name = "std" + (i + 1);
			int classRoom = (int) (Math.random() * 10 + 1);
			double java = 0;
			double sql = 0;
			double practice = 0;

			stArr[i] = new Student(name, classRoom, java, sql, practice);
			stArr[i].reTest();

			System.out.println(stArr[i].toString());
			System.out.println("합격 여부 : " + (stArr[i].isPassd() ? "합격" : "불합격") + "\n");
		}

		sc.close();

	}

}
