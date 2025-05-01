package review;

import java.util.Objects;

public class MemberDTO {
	private String id;
	private String name;
	private int age;
	
	public MemberDTO(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "id : " + id + ", 이름 : " + name 
				+ ", 나이 : " + age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof MemberDTO))
			return false;
		MemberDTO other = (MemberDTO) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
