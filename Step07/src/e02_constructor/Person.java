package e02_constructor;

public class Person {
	//이름, 나이, Person정보 출력하는 메서드
	String name;
	int age;
	
	/*
	 * 		생성자(Constructor)
	 * 			생성자는 객체를 하나 생성 할때 제일 먼저 실행되는 메서드
	 * 			만약에 생성자를 직접 작성하지 않으면,
	 * 			자바 컴파일러가 자동으로 아무런 일을 안하는 기본 생성자를 추가
	 * 			Person(){}
	 * 		
	 * 		생성자 문법 특징
	 * 			1. 리턴타입이 없는 메서드
	 * 			2. 메서드 이름이 클래스 이름과 같음. 
	 * 		
	 */
	Person(){
		System.out.println("Person 기본 생성자");
	}
	
	Person(String n){
		System.out.println("Person(String) 생성자");
		name = n;
	}
	
	void printInfo() {
		System.out.println(name + " / " + age);
	}
}





