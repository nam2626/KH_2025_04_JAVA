package e01_class;

public class Person {
	//클래스 안에 선언된 변수는 해당 객체가 일을 할 때 사용되는 변수이다.
	//이런 변수들을 필드(field) 라고 함.
	//이름
	String name;
	//나이
	int age;
	
	/*
	 * 	메서드(method)
	 * 		특정한 하나의 기능을 구현한 코드를 메서드
	 * 		클래스가 수행할 특정 기능 1개를 표현
	 * 		메서드를 만들때에는 반드시 하나의 기능만 담당하게끔 만듬
	 * 
	 * 		리턴타입 메서드명([매개변수....]){
	 * 			실행할 코드...
	 * 			[return [값];]
	 * 		}
	 */
	
	//리턴 X, 매개변수 O
	void init(String n, int a) {
		name = n;
		age = a;
	}
	//리턴 X, 매개변수 X
	void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}


