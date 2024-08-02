package t240703;

import java.util.Scanner;

public class T_03 {
	public static void main(String[] args) {
		/*
		 * 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고
		 * 합계와 평균을 계산하고 합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		 * 
		 * 합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우
		 * 합격 했을 경우 : 과목 별 점수와 합계, 평균, "축하합니다, 합격입니다!" 출력
		 * 불합격 했을 경우 : "불합격입니다."를 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[3];
		int sum = 0;
		double avg;
		
		System.out.print("국어 점수 : ");
		score[0] = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		score[1] = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		score[2] = sc.nextInt();
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		avg = (double)(sum / score.length);
		
		if(score[0] < 40 || score[1] < 40 || score[2] < 40 || avg < 60) {
			System.err.println("불합격입니다.");
		}
		else {
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
		}
		
	}
}
