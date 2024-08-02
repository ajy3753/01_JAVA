package student;

public class StudentController {
	private Student[] sArr = new Student[5];
	public final int CUT_LINE = 60;
	
	// 기본 생성자
	public StudentController() {
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student("홍길동", "자바", 20);
	}
	
	// 객체 배열에 있는 학생 데이터 반환
	public Student[] printStudent() {
		return sArr;
	}
	
	// 객체 배열의 점수를 합한 값 반환
	public int sumScore() {
		int sum = 0;
		for(int i = 0; i < sArr.length; i++) {
			sum += sArr[i].getScore();
		}
		return sum;
	}
	
	// double 배열을 만들어 sumScore의 리턴 값을 0번째 인덱스에 저장하고,
	// 합의 평균을 1번째 인덱스에 저장 후 배열 리턴
	public double[] avgScore() {
		double[] scoreArr = new double[2];
		scoreArr[0] = sumScore();
		scoreArr[1] = (scoreArr[0] / sArr.length);
		return scoreArr;
	}
}
