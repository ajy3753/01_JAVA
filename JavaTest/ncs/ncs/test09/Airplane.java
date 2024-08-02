package ncs.test09;

public class Airplane extends Plane {
	// 생성자
	public Airplane() {
	}

	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	// 운항
	@Override
	public void flight(int distance) {
		int sub = 0;
		while (distance >= 10) {
			distance -= 10;
			sub += 30;
		}

		setFuelSize((getFuelSize() - sub));
	}

	// getter
	public String getPlaneName() {
		return super.getPlaneName();
	}

	public int getFuelSize() {
		return super.getFuelSize();
	}

	// setter
	public void setPlaneName(String planeName) {
		super.setPlaneName(planeName);
	}

	public void setFuelSize(int fuelSize) {
		super.setFuelSize(fuelSize);
	}
}
