package t240710.object1;

public class Person {
	String name;
	int age;
	
	// 생성자
	public Person() {
		super();
		System.out.println("기본 생성자");
	}
	
	// this()는 본인의 생성자 호출, 생성자의 가장 첫번째 줄에 작성
	public Person(String name) {
		super();
		this.name = name;
		System.out.println("name : " + name);
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("name : " + name);
		System.out.println("age : " + age);
	}

	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
