package t240709.practice1;

public class Member {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	// 생성자
	public Member() {}
	
	public Member(String id, String pwd, String name, int age, char gender, String phone, String email) {
		this.memberId = id;
		this.memberPwd = pwd;
		this.memberName = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
	}
	
	// 메소드
	public void changeName(String name) {
		System.out.println("변경 전 이름 : " + this.memberName);
		this.memberName = name;
		this.printName();
	}
	
	public void printName() {
		System.out.println("변경 된 이름 : " + this.memberName + "\n");
	}
	
	// 출력
	public void infomation() {
		System.out.println("아이디 : " + this.memberId);
		System.out.println("비밀번호 : " + this.memberPwd);
		System.out.println("이름 : " + this.memberName);
		System.out.println("나이 : " + this.age);
		System.out.println("성별 : " + this.gender);
		System.out.println("연락처 : " + this.phone);
		System.out.println("이메일 : " + this.email);
	}
}
