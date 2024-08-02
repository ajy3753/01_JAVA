package student;

public class StudentMenu {
	private StudentController ssm = new StudentController();
	
	// 기본 생성자, 필드
	public StudentMenu() {
		// 학생 정보 출력
		System.out.println("===== 학생 정보 출력 =====");
		Student[] sArr = ssm.printStudent();
		for(int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i].inform());
		}
		System.out.println();
		
		// 학생 성적 출력
		System.out.println("===== 학생 성적 출력 =====");
		System.out.println("학생 점수 합계 : " + ssm.avgScore()[0]);
		System.out.println("학생 점수 평균 : " + ssm.avgScore()[1] + "\n");
		
		// 성적 결과 출력
		System.out.println("===== 성적 결과 출력 =====");
		for(int i = 0; i < sArr.length; i++) {
			System.out.print(sArr[i].getName() + " 학생은 ");
			if(sArr[i].getScore() >= ssm.CUT_LINE) {
				System.out.println("통과입니다.");
			}
			else {
				System.out.println("재시험 대상입니다.");
			}
		}
	}
}
