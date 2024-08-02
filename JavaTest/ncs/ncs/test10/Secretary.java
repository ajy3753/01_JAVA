package ncs.test10;

public class Secretary extends Employee implements Bonus {
	// 생성자
	public Secretary() {
	}

	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	// 세금 계산, salary에 10% 적용한다.
	@Override
	public double tax() {
		return super.getSalary() * 0.1;
	}

	// 인센티브 지급, pay의 80%가 기존 salary에 더해진다.
	@Override
	public void incentive(int pay) {
		int incentive = super.getSalary() + (int) (pay * 0.8);
		super.setSalary(incentive);
	}
}
