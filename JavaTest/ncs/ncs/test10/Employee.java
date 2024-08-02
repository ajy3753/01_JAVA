package ncs.test10;

public abstract class Employee {
	// 매개변수
	private String name;
	private int number;
	private String department;
	private int salary;

	// 생성자
	public Employee() {
	}

	public Employee(String name, int number, String department, int salary) {
		this.name = name;
		this.number = number;
		this.department = department;
		this.salary = salary;
	}

	// 메소드
	public abstract double tax();

	// getter
	public String getName() {
		return this.name;
	}

	public int getNumber() {
		return this.number;
	}

	public String getDepartment() {
		return this.department;
	}

	public int getSalary() {
		return this.salary;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
