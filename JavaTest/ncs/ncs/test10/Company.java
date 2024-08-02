package ncs.test10;

public class Company {
	public static void main(String[] args) {
		/*
		 * [문제 10] Abstract 클래스에서 상속 받고 interface를 구현한 두 개의 클래스를 구현하라. (getXXX/setXXX는
		 * 직접 만들어서 사용한다.) 1. 사용 데이터를 기반으로 객체를 생성하여 배열에 넣는다. 2. 모든 객체의 기본 정보를 출력한다. (for문
		 * 사용) 3. 모든 객체에 인센티브 100씩 지급한 급여를 계산하고 다시 객체의 salary에 넣는다. 4. 모든 객체의 정보와 세금을
		 * 출력한다.
		 * 
		 * <사용 데이터> [name] [number] [department] [salary] Hilery 1 secretary 800 Clinten
		 * 2 sales 1200
		 */

		Employee[] employees = new Employee[2];
		employees[0] = new Secretary("Hilery", 1, "secretary", 800);
		employees[1] = new Sales("Clinten", 2, "sales\t", 1200);

		System.out.println("=== 기존 정보 ====================");
		System.out.println("name \t department \t salary");
		System.out.println("-------------------------------");
		for (int i = 0; i < employees.length; i++) {
			System.out.print(employees[i].getName() + "\t ");
			System.out.print(employees[i].getDepartment() + "\t ");
			System.out.println(employees[i].getSalary());
		}

		((Bonus) employees[0]).incentive(100);
		((Bonus) employees[1]).incentive(100);

		System.out.println("\n=== 인센티브 100 지급 ===========================");
		System.out.println("name \t department \t salary \t tax");
		System.out.println("-----------------------------------------------");
		for (int i = 0; i < employees.length; i++) {
			System.out.print(employees[i].getName() + "\t ");
			System.out.print(employees[i].getDepartment() + "\t ");
			System.out.print(employees[i].getSalary() + "\t\t ");
			System.out.println(employees[i].tax());
		}
	}
}