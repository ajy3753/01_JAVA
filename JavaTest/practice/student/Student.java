package student;

public class Student {
	// 매개변수
	private String name;
	private String subject;
	private int score;
	
	// 기본 생성자
	public Student() {}
	
	public Student(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	
	// inform()
	public String inform() {
		return "이름 : " + this.name + " / 과목 : " + this.subject + " / 점수 : " + this.score;
	}
	
	// getter
	public String getName() {
		return this.name;
	}
	
	public String getSubject() {
		return this.subject;
	}
	
	public int getScore() {
		return this.score;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
}
