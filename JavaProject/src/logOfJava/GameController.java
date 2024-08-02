package logOfJava;

public class GameController {
	// 필드가 뭐지 암온더넥스트레볼루션절대적룰을어쩌구
	private Player p = new Player();
	
	// 캐릭터 생성
	public void newCharacter(String player, String job) {
		new Player(player, job);
		System.out.println("캐릭터 생성이 완료되었습니다.\n");
	}
	
	// 기존 캐릭터 정보 불러오기
	public void loadCharacter() {
		// 이걸 내가 할 수가 잇나
		// 텍스트 파일로 저장 > 내보내기를 해서 이름, 직업, 남은 HP, 아이템 목록, 클리어 스테이지 수 등을 저장
		// 텍스트 파일을 불러와서 이 정보를 분류 > 새로 등록
		// 어려운가? 어려운거 같아여 왜냐면 지금도 머리가 안 돌아가기 때문이애요 내가 왜 이런걸 한다고 햇지
		// 여차하면 다 때려치고 도서관리시스템을
		// 그냥 아주 과제도 때려치고 잠은이루어진다를
	}
}
