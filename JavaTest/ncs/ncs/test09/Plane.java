package ncs.test09;

public abstract class Plane {
	// 매개변수
	private String planeName;
	private int fuelSize;

	// 생성자
	public Plane() {
	}

	public Plane(String planeName, int fuelSize) {
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}

	// 주유
	public void refuel(int fuel) {
		setFuelSize(this.fuelSize + fuel);
	}

	// 운항(Abstract method)
	public abstract void flight(int distance);

	// getter
	public String getPlaneName() {
		return this.planeName;
	}

	public int getFuelSize() {
		return this.fuelSize;
	}

	// setter
	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
}
