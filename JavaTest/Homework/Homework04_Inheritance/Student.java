package Homework04_Inheritance;

public class Student extends Person {
	// 매개변수
	private int grade;
	private String major;

	// 생성자
	public Student() {
	}

	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(name, age, height, weight);
		this.grade = grade;
		this.major = major;
	}

	// 메소드
	@Override
	public String toString() {
		return null;
	}

	// getter
	public int getGrade() {
		return this.grade;
	}

	public String getMajor() {
		return this.major;
	}

	// setter
	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setMajor(String major) {
		this.major = major;
	}
}
