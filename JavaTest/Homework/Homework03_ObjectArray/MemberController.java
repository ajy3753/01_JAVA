package Homework03_ObjectArray;

public class MemberController {
	private Member[] m = new Member[size];
	public static final int size = 10;

	// 현재 회원 수 반환
	public int existMemberNum() {
		int count = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				count++;
				continue;
			}
			break;
		}
		return count;
	}

	// 아이디 중복 체크
	public boolean checkId(String inputId) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getId().equals(inputId)) {
				return false;
			}
		}
		return true;
	}

	// 새 회원 등록
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] == null) {
				m[i] = new Member(id, name, password, email, gender, age);
				break;
			}
		}

	}

	// 아이디 조회
	public String searchId(String id) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getId().equals(id)) {
				return m[i].inform();
			}
		}
		return null;
	}

	// 이름 조회
	public String searchName(String name) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getName().equals(name)) {
				return m[i].inform();
			}
		}
		return null;
	}

	// 이메일 조회
	public String searchEmail(String email) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getEmail().equals(email)) {
				return m[i].inform();
			}
		}
		return null;
	}

	// 비밀번호 수정
	public boolean updatePassword(String id, String password) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getId().equals(id)) {
				m[i].setPassword(password);
				return true;
			}
		}
		return false;
	}

	// 이름 수정
	public boolean updateName(String id, String name) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getId().equals(id)) {
				m[i].setName(name);
				return true;
			}
		}
		return false;
	}

	// 이메일 수정
	public boolean updateEmail(String id, String email) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getId().equals(id)) {
				m[i].setEmail(email);
				return true;
			}
		}
		return false;
	}

	// 특정 회원 삭제
	public boolean delete(String id) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getId().equals(id)) {
				for (int j = i; j < (m.length - 1); j++) {
					m[j] = m[j + 1];
				}
				m[m.length - 1] = null;
				return true;
			}
		}
		return false;
	}

	// 전체 회원 삭제
	public void deleteAll() {
		for (int i = 0; i < m.length; i++) {
			m[i] = null;
		}
	}

	// 모든 회원 정보 출력
	public Member[] printAll(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(m[i].inform());
		}
		return null;
	}

	//
}
