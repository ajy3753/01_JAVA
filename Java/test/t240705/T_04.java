package t240705;

import java.util.Scanner;

public class T_04 {

	public static void main(String[] args) {
		/*
		 * A, B, C 사원의 연봉을 입력 받고
		 * 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고
		 * 인센티브 포함 급여가 3000만원 이상이면 "3000 이상", 미만이면 "3000 미만"을 출력하세요.
		 * 
		 * [인센티브]
		 * A : 0.4
		 * B : 0
		 * C : 0.15
		 * 
		 * ex.
		 * A 사원의 연봉 : 2500
		 * B 사원의 연봉 : 2900
		 * C 사원의 연봉 : 2600
		 * 
		 * A 사원 연봉 /  연봉 + a : 2500 / 3500.0 (3000 이상)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A 사원의 연봉 : ");
		int a = sc.nextInt();
		
		System.out.print("B 사원의 연봉 : ");
		int b = sc.nextInt();
		
		System.out.print("C 사원의 연봉 : ");
		int c = sc.nextInt();
		
		double salaryA = a + (a * 0.4);
		double salaryB = b + (b * 0);
		double salaryC = c + (c * 0.15);
		
		System.out.printf("A 사원의 연봉 / 연봉 + a : %d / %f ", a, salaryA);
		System.out.println("(" + (salaryA >= 3000 ? "3000 이상" : "3000 미만") + ")");
		
		System.out.printf("A 사원의 연봉 / 연봉 + a : %d / %f ", b, salaryB);
		System.out.println("(" + (salaryB >= 3000 ? "3000 이상" : "3000 미만") + ")");
		
		System.out.printf("A 사원의 연봉 / 연봉 + a : %d / %f ", c, salaryC);
		System.out.println("(" + (salaryC >= 3000 ? "3000 이상" : "3000 미만") + ")");
	}

}
