package Homework04_Inheritance;

public class PersonController extends Person {
	// 변수
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];

	//
	public int[] personCount() {
		int[] countArr = new int[2];
		int studentCount = 0, employeeCount = 0;

		for (int i = 0; i < s.length; i++) {
			if (s[i] == null) {
				break;
			}
			studentCount++;
		}

		for (Employee emp : e) {
			if (emp == null) {
				break;
			}
			employeeCount++;
		}

		countArr[0] = studentCount;
		countArr[1] = employeeCount;

		return countArr;
	}

	// 학생 추가하기
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {

	}

	// 학생 보기
	public Student[] printStudent() {
		return this.s;
	}

	// 사원 추가하기
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {

	}

	// 사원 보기
	public Employee[] printEmployee() {
		return this.e;
	}
}
