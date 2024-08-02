package ncs.test04;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		/*
		 * [문제 4] Product 클래스를 작성하고, 키보드로 각 필드에 기록할 값을 입력받아 객체 초기화에 사용한다. 가격과 수량을 계산하여
		 * 구매 가격을 출력한다. getXXX()/setXXX()는 만들어서 사용한다. infomaton() 메소드로 상품정보를 출력 처리하고, 총
		 * 구매가격은 getter를 사용하여 계산한다.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("===== 상품 정보 등록 =====");

		System.out.print("상품명 : ");
		String name = sc.nextLine();

		System.out.print("가격 : ");
		int price = sc.nextInt();

		System.out.print("수량 : ");
		int quantity = sc.nextInt();

		System.out.println();
		sc.close();

		Product prd = new Product(name, price, quantity);
		System.out.println("===== 상품 정보 출력 =====");
		System.out.println(prd.information());

	}

}
