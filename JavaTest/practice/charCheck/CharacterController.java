package charCheck;

public class CharacterController {
	// 기본 생성자
	public CharacterController() {}
	
	// 메소드
	public int countAlpha(String s) throws CharCheckException {
		// 매개변수로 들어온 값에 영문자가 몇 개 들어있는지 반환
		// 문자열에 공백이 있다면 CharCharacterException 발생, 에러 메시지는 출력값 참고
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
				count++;
			}
			if(s.charAt(i) == ' ') {
				throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
			}
		}
		return count;
	}
}