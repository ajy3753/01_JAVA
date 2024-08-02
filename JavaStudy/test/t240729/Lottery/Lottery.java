package t240729.Lottery;

import java.util.Objects;

public class Lottery {
	private String name;
	private String phone;
	
	// 기본 생성자
	public Lottery() {}
	
	public Lottery(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return name + "(" + phone + ")";
	}

	@Override
	public int hashCode() {
		String str = this.name + this.phone;
		return str.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Lottery) {
			Lottery lo = (Lottery)obj;
			if(this.name.equals(lo.getName()) && this.phone.equals(lo.getPhone())) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
