package e01_object;

import java.util.Objects;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/*
	 * 객체가 가지고 있는 필드나 메서드의 결과를
	 * 외부에서 쉽게 확인이 가능하게 
	 * 필드와 메서드 결과를 문자열로 만들어 리턴하는 메서드
	 * 
	 *  재정의 하지 않으면
	 *  타입명@객체의 해시코드(16진수)
	 */
	@Override
	public String toString() {
		return name + " / " + age;
	}

	/*
	 * 	해시값 기반으로 사용되는 컬렉션에서 사용할 정수 값 제공하는 목적
	 * 	두 객체가 동일한 객체인지 확인하기위한 정수값을 제공하는 목적
	 * 
	 *  Object 클래스가 제공하는 기능으로는 객체의 주소값에 해당하는 해시값을 리턴 
	 */
	@Override
	public int hashCode() {
//		return name.hashCode() + age;
		return Objects.hash(name,age);
	}
	
	/*
	 * 객체 내부가 동일한 값인지 비교하기 위한 메서드 equals
	 * 비교할려는 객체를 Object 타입으로 받음
	 */
	@Override
	public boolean equals(Object obj) {
		//this, obj가 비교 절차
		//1. null 인지 체크
		if(obj == null) return false;
		//2. 메모리 주소 해시값이 같은지 비교
		if(this == obj) return true;
		//3. 객체 해시값이 다른지 확인
		if(obj.hashCode() != hashCode()) return false;
		//4. 받아온 obj가 현재객체랑 비교할 수 있는 타입인지 확인
		//	instanceof, getClass()
		if(obj instanceof Person) {
			//1. obj를 this와 동일한 타입으로 형변환
			Person temp = (Person) obj;
			//2. 가지고 있는 필드값 비교한 결과값 리턴
			return this.age == temp.age && this.name.equals(temp.name);
		}
		return false;
	}
	
	
	
}
