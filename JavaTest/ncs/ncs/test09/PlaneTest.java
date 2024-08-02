package ncs.test09;

public class PlaneTest {
	public static void main(String[] args) {
		/*
		 * [문제 9] Abstract 클래스에서 상속 받은 두 개의 클래스를 구현하여 데이터를 입력 후 출력하라. 1. Airplane과
		 * Cargoplane 객체를 생성하고, 100씩 운항 후 정보를 출력하라. 2. Airplane과 Cargoplane 객체에 200씩 주유
		 * 후 객체 정보를 출력하라. (모든 클래스 변수의 getter, setter 함수는 직접 구현한다.)
		 * 
		 * <사용 데이터> [class type] [planeName] [fuelSize] Airplane L747 1000 Cargoplane
		 * C40 1000
		 */

		Airplane a = new Airplane("L747", 1000);
		Cargoplane c = new Cargoplane("C40", 1000);

		System.out.println("======== 기본 정보 ========");
		System.out.println("Plane \t\t fuelSize");
		System.out.println("--------------------------");
		System.out.println(a.getPlaneName() + " \t\t " + a.getFuelSize());
		System.out.println(c.getPlaneName() + " \t\t " + c.getFuelSize());

		System.out.println("\n======= 100 운항 후 =======");
		a.flight(100);
		c.flight(100);

		System.out.println("Plane \t\t fuelSize");
		System.out.println("--------------------------");
		System.out.println(a.getPlaneName() + " \t\t " + a.getFuelSize());
		System.out.println(c.getPlaneName() + " \t\t " + c.getFuelSize());

		System.out.println("\n======= 200 주유 후 =======");
		a.refuel(200);
		c.refuel(200);

		System.out.println("Plane \t\t fuelSize");
		System.out.println("--------------------------");
		System.out.println(a.getPlaneName() + " \t\t " + a.getFuelSize());
		System.out.println(c.getPlaneName() + " \t\t " + c.getFuelSize());
	}
}
