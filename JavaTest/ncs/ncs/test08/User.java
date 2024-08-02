package ncs.test08;

public class User {
	// 매개변수
	String id;
	String password;
	String name;
	int age;
	char gender;
	String phone;

	// 생성자
	public User() {
	}

	public User(String id, String password, String name, int age, char gender, String phone) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}

	// 메소드
	@Override
	public String toString() {
		return id + "\t" + password + "\t" + name + "\t" + age + "\t" + gender + "\t" + phone;
	}

	@Override
	protected Object clone() {
		User copy = new User(id, password, name, age, gender, phone);
		return copy;
	}

	@Override
	public boolean equals(Object obj) {
		User tmp = (User) obj;
		return this.id.equals(tmp.id) && this.password.equals(tmp.password) && this.name.equals(tmp.name)
				&& this.age == tmp.age && this.gender == tmp.gender && this.phone.equals(tmp.phone);
	}

	// getter
	public String getId() {
		return this.id;
	}

	public String getPassword() {
		return this.password;
	}

	public String getname() {
		return this.name;
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

	// setter
	public void setId(String id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
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
}
