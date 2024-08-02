package t240731;

import java.util.Objects;

public class Fruit {
	private String name;
	
	// 기본 생성자
	public Fruit() {}
	
	public Fruit(String kind, String name) {
		
	}
	
	// 메소드
	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return Objects.equals(name, other.name);
	}
	
	// getter
	public String getName() {
		return this.name;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
}
