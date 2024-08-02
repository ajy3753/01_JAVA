package chap02_abstractNInterface;

public abstract class SmartPhone implements CellPhone, TouchDisplay {
	// 매개변수
	private String maker;

	// 기본 생성자
	public SmartPhone() {
	}

	public SmartPhone(String maker) {
		this.maker = maker;
	}

	// 스마트폰의 제원 정보 출력 (추상 메소드)
	public abstract String printInformation();

	// 전화 걸기
	@Override
	public String makeCall() {
		return null;
	}

	// 전화 받기
	@Override
	public String takeCall() {
		return null;
	}

	// 촬영 방식
	@Override
	public String picture() {
		return null;
	}

	// 충전 방식
	@Override
	public String charge() {
		return null;
	}

	// getter
	public String getMaker() {
		return this.maker;
	}

	// setter
	public void setMaker(String maker) {
		this.maker = maker;
	}
}
