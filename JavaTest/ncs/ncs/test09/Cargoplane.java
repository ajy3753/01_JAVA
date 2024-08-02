package ncs.test09;

public class Cargoplane extends Plane {
	// 생성자
	public Cargoplane() {
	}

	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	// 운항
	@Override
	public void flight(int distance) {
		int sub = 0;
		while (distance >= 10) {
			distance -= 10;
			sub += 50;
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
