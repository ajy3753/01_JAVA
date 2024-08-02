package f.object.ex4;

/*
 * 이름, 나이, 수학점수, 영어점수, 국어점수를 데이터로 가지고 있는 개체를 만들어라
 * 데이터는 직접 접근을 허용하지 않고 모두 간접적으로 set/get을 해줄 수 있도록 작성해라
 * 모든 데이터를 매개변수로 받아 초기화하면서 객체를 생성할 수 있는 생성자 작성
 */
public class Student {
	// 필드영역(데이터)
	private String name;
	private int age;
	private int mathScore;
	private int enScore;
	private int koScore;

	// 생성자 영역
	public Student() {
	}

	public Student(String name, int age, int math, int en, int ko) {
		this.name = name;
		this.age = age;
		this.mathScore = math;
		this.enScore = en;
		this.koScore = ko;
	}

	// 메소드 영역(기능)
	// getter, setter
	// 단축키 : altr + shift + s -> r
	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public int getMathScore() {
		return this.mathScore;
	}

	public int getEnScore() {
		return this.enScore;
	}

	public int getKoScore() {
		return this.koScore;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		if (age < 1) {
			this.age = 1;
			return;
		}
		this.age = age;
	}

	public void setMathScore(int math) {
		if (math < 0) {
			this.mathScore = 0;
			return;
		}
		this.mathScore = math;
	}

	public void setEnScore(int en) {
		if (en < 0) {
			this.enScore = 0;
			return;
		}
		this.enScore = en;
	}

	public void setKoScore(int ko) {
		if (ko < 0) {
			this.koScore = 0;
			return;
		}
		this.koScore = ko;
	}

	// 평균 구하기
	public double getEvg() {
		double evg = (this.mathScore + this.enScore + this.koScore) / 3.0;
		return evg;
	}

	public void printEvg() {
		System.out.println(this.getName() + " 님의 평균 : " + this.getEvg() + "\n");
	}

	// 전체 출력용
	public void printScore() {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("수학 점수 : " + this.mathScore);
		System.out.println("영어 점수 : " + this.enScore);
		System.out.println("국어 점수 : " + this.koScore + "\n");
	}

}
