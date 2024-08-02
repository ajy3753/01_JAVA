package t240731;

import java.util.Objects;

public class Vegetable {
	private String name;
	
	// 기본 생성자
	public Vegetable() {}
	
	public Vegetable(String kind, String name) {
		
	}
	
	
	// 메소드
	@Override
	public String toString() {
		return "Vegetable [name=" + name + "]";
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
		Vegetable other = (Vegetable) obj;
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
