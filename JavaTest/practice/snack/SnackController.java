package snack;

public class SnackController {
	private Snack s = new Snack();
	
	// 기본 생성자
	public SnackController() {}
	
	// 필드
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		System.out.println("저장 완료되었습니다.");
		return null;
	}
	
	public String confirmData() {
		System.out.println("========== 스낵 정보 ==========");
		System.out.println(s.information());
		return null;
	}
}
