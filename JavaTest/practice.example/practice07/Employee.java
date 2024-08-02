package practice07;

public class Employee {
	// 매개변수
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;
	
	// 기본 생성자
	public Employee() {}
	
	public Employee(int empNO, String empName) {
		this.empNo = empNo;
		this.empName = empName;
	}
	
	public Employee(int empNo, String empName, String dept, String job, int age, char gender, int salary, double bonusPoint, String phone, String address) {
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.address = address;
	}
	
	// getter
	public int getEmpNo() {
		return this.empNo;
	}
	
	public String getEmpName() {
		return this.empName;
	}
	
	public String getDept() {
		return this.dept;
	}
	
	public String getJob() {
		return this.job;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public char getGender() {
		return this.gender;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public double getBonusPoint() {
		return this.bonusPoint;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	// setter
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
}
