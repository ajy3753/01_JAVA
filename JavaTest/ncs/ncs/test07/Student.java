package ncs.test07;

public class Student extends Human {
	// 매개변수
	private String number;
	private String major;

	// 생성자
	public Student() {
	}

	public Student(String name, int age, int height, int weight, String number, String major) {
		super(name, age, height, weight);
		this.number = number;
		this.major = major;
	}

	// 메소드
	@Override
	public String toString() {
		return super.toString() + number + "\t" + major;
	}

	// getter
	public String getNumber() {
		return this.number;
	}

	public String getMajor() {
		return this.major;
	}

	// setter
	public void setNumber(String number) {
		this.number = number;
	}

	public void setMajor(String major) {
		this.major = major;
	}
}
