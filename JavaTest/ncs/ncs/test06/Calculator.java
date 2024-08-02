package ncs.test06;

public class Calculator {
	private InvalidException iE = new InvalidException();

	public double getSum(int data) {
		double sum = 0;
		for (int i = 0; i <= data; i++) {
			sum += i;
		}

		if (data >= 2 && data <= 5) {
			System.out.println("결과값 : " + sum);
		} else {
			System.out.println(iE.InvalidException());
		}

		return sum;
	}
}
