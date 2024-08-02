package t240731;

import java.util.Objects;

public class Farm {
	private String kind;
	
	// 기본 생성자
	public Farm() {}
	
	public Farm(String kind) {
		this.kind = kind;
	}
	
	// 메소드
	@Override
	public String toString() {
		return "Farm [kind=" + kind + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(kind);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Farm other = (Farm) obj;
		return Objects.equals(kind, other.kind);
	}
	
	// getter
	public String getKind() {
		return this.kind;
	}
	
	// setter
	public void setKind(String kind) {
		this.kind = kind;
	}
}
