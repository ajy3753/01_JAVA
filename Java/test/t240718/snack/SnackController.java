package t240718.snack;

import java.util.Scanner;

public class SnackController {
	private Snack s = new Snack();
	
	public SnackController() {
		super();
	}
	
	public String saveDate(String kind, String name, String flavor, int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		return "저장 완료되었습니다.";
	}
	
	public void confirmData(char ch) {
		if(ch == 'y') {
			String res = s.infomation();
			System.out.println(res);
		}
	}

}
