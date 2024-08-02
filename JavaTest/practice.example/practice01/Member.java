package practice01;

public class Member {
	// 매개변수
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	// 기본 생성자
	public Member() {}
	
	public Member(String memberId, String memberPwd, String memberName, int age, char gender, String phone, String email) {
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
	}
	
	// 메소드
	public void changeName(String name) {
		System.out.println("변경 전 이름 : " + this.memberName);
		this.memberName = name;
		printName();
	}
	
	public void printName() {
		System.out.println("변경 후 이름 : " + this.memberName);
		System.out.println("성공적으로 변경되었습니다.\n");
	}
	
	// getter
	public String getMemberId() {
		return this.memberId;
	}
	
	public String getMemberPwd() {
		return this.memberPwd;
	}
	
	public String getMemberName() {
		return this.memberName;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public char getGender() {
		return this.gender;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	// setter
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
