package t240709.object;

public class Member {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phonel;
	private String email;
	
	// 기본 생성자
	public Member() {}
	
	// 아이디, 비밀번호, 이름을 넘겨받아 초기화하는 생성자
	public Member(String id, String pwd, String name) {
		this.memberId = id;
		this.memberPwd = pwd;
		this.memberName = name;
	}
	
	// memberName의 필드값을 넘겨받은...
	public void changeName(String name) {
		this.memberName = name;
	}
	
	public void printName() {
		
	}
}
