package chap01_poly;

public class Member {
	// 매개변수 (회원명, 회원 나이, 성별, 요리학원 쿠폰 개수)
	private String name;
	private int age;
	private char gender;
	private int couponCount = 0;

	// 기본 생성자
	public Member() {
	}

	public Member(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	// toString
	public String toString() {
		return "Member [name = " + getName() + ", age = " + getAge() + ", gender = " + getGender() + ", couponCount = "
				+ getCouponCount() + "]";
	}

	// getter
	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public char getGender() {
		return this.gender;
	}

	public int getCouponCount() {
		return this.couponCount;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setCouponCount(int couponCount) {
		this.couponCount = couponCount;
	}
}
