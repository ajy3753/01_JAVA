package t240705;

import java.util.Scanner;

public class T_06 {

	public static void main(String[] args) {
		/*
		 * 중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
		 * 평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고.
		 * 이때, 출석 비뮬은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
		 * 70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석시 Fail을 출력하세요.
		 * 
		 * ex.
		 * 중간고사 점수 : 80
		 * 기말고사 점수 : 30
		 * 과제 점수 : 60
		 * 출석 회수 : 18
		 * ===== 결과 =====
		 * 중간고사 점수(20) : 16.0
		 * 기말고사 점수(30) : 9.0
		 * 과제 점수 (30) : 18.0
		 * 출석 점수 (20): 18.0
		 * 총점 : 61.0
		 * Fail[점수 미달]
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간고사 점수 입력 : ");
		double middle = sc.nextDouble();
		
		System.out.print("기말고사 점수 입력 : ");
		double last = sc.nextDouble();
		
		System.out.print("과제 점수 입력 : ");
		double report = sc.nextDouble();
		
		System.out.print("출석 회수 : ");
		int check = sc.nextInt();
		
		double middleScore = middle *= 0.2;
		double lastScore = last *= 0.3;
		double reportScore = report *= 0.3;
		double checkScore = (check * 5.0) * 0.2;
		
		double total = middleScore + lastScore + reportScore + checkScore;
		
		System.out.println("======== 결과 ========");
		System.out.printf("중간고사 점수\t(20) : %.1f \n", middleScore);
		System.out.printf("중간고사 점수\t(30) : %.1f \n", lastScore);
		System.out.printf("중간고사 점수\t(30) : %.1f \n", reportScore);
		System.out.printf("출석 점수\t(20) : %.1f \n", checkScore);
		System.out.printf("총점 : %.1f \n", total);
		
		if((check * 5.0) < 70.0) {
			System.out.println("Fail [출석 회수 미만]");
		}
		else if(total < 70.0) {
			System.out.println("Fail [점수 미달]");
		}
		else {
			System.out.println("Pass");
		}

	}

}
