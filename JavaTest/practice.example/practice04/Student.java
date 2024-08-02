package practice04;

public class Student {
	// 매개변수
	private int grade;
	private int classroon;
	private String name;
	private double height;
	private char gender;
	
	// 기본 생성자
	public Student() {}
	
	public Student(int grade, int classroom, String name, double height, char gender) {
		this.grade = grade;
		this.classroon = classroom;
		this.name = name;
		this.height = height;
		this.gender = gender;
	}
	
	// information()
	public void information() {
		System.out.println("===== 학생 정보 =====");
		System.out.println(this.grade + "학년 " + this.classroon + "반");
		System.out.println("이름 : " + this.name);
		System.out.println("키 : " + this.height);
		System.out.println("성별 : " + this.gender);
	}
	
	// getter
	public int getGrade() {
		return this.grade;
	}
	
	public int getClassroom() {
		return this.classroon;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public char getGender() {
		return this.gender;
	}
	
	// setter
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void setClassroom(int classroom) {
		this.classroon = classroom;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
}
