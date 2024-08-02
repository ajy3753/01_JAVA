package chap02_abstractNInterface;

public class V40 extends SmartPhone implements NotePen {
	// 기본 생성자
	public V40() {
		super("LG");
	}

	// 제원 출력
	@Override
	public String printInformation() {
		return "V40은 " + super.getMaker() + "에서 만들어졌고 제원은 다음과 같다.\n" + makeCall() + "\n" + takeCall() + "\n" + picture()
				+ "\n" + charge() + "\n" + touch() + "\n" + "블루투스 펜 탑재 여부 : " + bluetoothPen() + "\n";
	}

	// 전화 걸기
	@Override
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
	}

	// 전화 받기
	@Override
	public String takeCall() {
		return "수신 버튼을 누름";
	}

	// 촬영 방식
	@Override
	public String picture() {
		return "1200, 1600만 트리플 카메라";
	}

	// 충전 방식
	@Override
	public String charge() {
		return "고촉 충전, 고속 무선 충전";
	}

	// 터치 방식
	@Override
	public String touch() {
		return "정전식";
	}

	// 블루투스펜 탑재 여부
	@Override
	public boolean bluetoothPen() {
		return false;
	}
}
