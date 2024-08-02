package ncs.test10;

public class Sales extends Employee implements Bonus {
	// 기본 생성자
	public Sales() {
	}

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	// 세금 계산, salary에 13% 적용한다.
	@Override
	public double tax() {
		return super.getSalary() * 0.13;
	}

	// 인센티브 지급, pay의 120%가 기존 salary에 더해진다.
	@Override
	public void incentive(int pay) {
		int incentive = super.getSalary() + (int) (pay * 1.2);
		super.setSalary(incentive);
	}
}
