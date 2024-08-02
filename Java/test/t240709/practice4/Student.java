package t240709.practice4;

public class Student {
	int grade;
	int classroom;
	String name;
	double height;
	char gender;
	
	public Student() {}
	
	public Student(int grade, int classroom, String name, double height, char gender) {
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.height = height;
		this.gender = gender;
	}
	
	// setter
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void setClassroom(int classroom) {
		this.classroom = classroom;
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
	
	// getter
	public int getGrade() {
		return this.grade;
	}
	
	public int getClassroom() {
		return this.classroom;
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
	
	// 출력
	public void information() {
		System.out.println(this.getGrade() + "학년 " + this.getClassroom() + "반");
		System.out.println("이름 : " + this.getName());
		System.out.println("키 : " + this.getHeight() + "cm");
		System.out.println("성별 : " + this.getGender() + "\n");
	}
}
