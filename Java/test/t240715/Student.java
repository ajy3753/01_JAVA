package t240715;

public class Student {
	/*
	 * 학생성적관리 프로그램 Student class : name(String), classRoom(int), javaScore(double),
	 * sqlScore(double), praticeScore(double) - 각 필드 데이터의 getter / setter, 기본 생성자,
	 * 모든 필드 데이터를 초기화하는 생성자 작성 - toString : 학생의 정보를 "xx반 xxx학생 xx점 xx점 xx점"으로 정보를
	 * 반환하는 메소드 (각 점수는 자바, sql, practice순으로 출력한다.) - isPassd : 모든 점수가 50점 이상이면서 평균이
	 * 60점 이상이면 true 아니면 false를 반환하는 메소드 - reTest : 학생의 모든 점수를 랜덤(0 ~ 100)으로 다시 부여하는
	 * 메소드(반환없음)
	 */

	// 매개변수
	private String name;
	private int classRoom;
	private double javaScore;
	private double sqlScore;
	private double practiceScore;

	// 기본 생성자
	public Student() {
	}

	public Student(String name, int classRoom, double javaScore, double sqlScore, double practiceScore) {
		this.name = name;
		this.classRoom = classRoom;
		this.javaScore = javaScore;
		this.sqlScore = sqlScore;
		this.practiceScore = practiceScore;
	}

	// 메소드
	public String toString() {
		return this.classRoom + "반 " + this.name + " 학생\n" + this.javaScore + "점 " + this.sqlScore + "점 "
				+ this.practiceScore + "점";
	}

	public boolean isPassd() {
		double java = this.javaScore;
		double sql = this.sqlScore;
		double practice = this.practiceScore;
		double avg = (java + sql + practice) / 3.0;

		if (java >= 50 && sql >= 50 && practice >= 50 & avg >= 60) {
			return true;
		}

		return false;
	}

	public void reTest() {
		setJavaScore((int) (Math.random() * 101));
		setSqlScore((int) (Math.random() * 101));
		setPraticeScore((int) (Math.random() * 101));
	}

	// getter()
	public String getName() {
		return this.name;
	}

	public int getClassRoom() {
		return this.classRoom;
	}

	public double getJavaScore() {
		return this.javaScore;
	}

	public double getSqlScore() {
		return this.sqlScore;
	}

	public double getPracticeScore() {
		return this.practiceScore;
	}

	// setter()
	public void setName(String name) {
		this.name = name;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}

	public void setJavaScore(double javaScore) {
		this.javaScore = javaScore;
	}

	public void setSqlScore(double sqlScore) {
		this.sqlScore = sqlScore;
	}

	public void setPraticeScore(double practiceScore) {
		this.practiceScore = practiceScore;
	}
}
