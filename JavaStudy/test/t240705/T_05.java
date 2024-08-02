package t240705;

import java.util.Scanner;

public class T_05 {

	public static void main(String[] args) {
		/*
		 * 키, 몸무게를 double로 입력 받고
		 * BMI 지수를 계산하여 계산결과에 따라
		 * 저체중 / 정상체중 / 과체중 / 비만을 출력하세요
		 * 
		 * BMI = 몸무게 / (키(m) * 키(m))
		 * 18.5 미만 : 저체중
		 * 18.5 이상 23 미만 : 정상체중
		 * 23 이상 25 미만 : 과체중
		 * 25이상 30 미만 : 비만
		 * 30 이상 : 고도 비만
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m) 입력 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg) 입력 : ");
		double weight = sc.nextDouble();
		
		double BMI = weight / (height * height);
		System.out.println("BMI 지수 : " + BMI);
		
		if(BMI < 18.5) {
			System.out.println("상태 : 저체중");
		}
		else if(BMI < 23) {
			System.out.println("상태 : 정상체중");
		}
		else if(BMI < 25) {
			System.out.println("상태 : 과체중");
		}
		else if(BMI < 30) {
			System.out.println("상태 : 비만");
		}
		else {
			System.out.println("상태 : 고도비만");
		}

	}

}
