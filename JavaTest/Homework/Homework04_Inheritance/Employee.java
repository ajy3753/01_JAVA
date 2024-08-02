package Homework04_Inheritance;

public class Employee extends Person {
	// 매개변수
	private int salary;
	private String dept;

	// 생성자
	public Employee() {
	}

	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(name, age, height, weight);
		this.salary = salary;
		this.dept = dept;
	}

	// 메소드
	@Override
	public String toString() {
		return null;
	}

	// getter
	public int getSalary() {
		return this.salary;
	}

	public String getDept() {
		return this.dept;
	}

	// setter
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
}
