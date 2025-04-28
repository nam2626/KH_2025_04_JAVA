package e05_interface;

public class EatMain {

	public static void main(String[] args) {
		Dog d = new Dog();
		
		Eat e = d;
		e.eat("생고기");
		
		Student s = new Student();
		s.study();
		
		//부모클래스에 Eat를 구현을 안했기 때문에 Eat로 형변환이 안됨.
//		e = (Eat) s;
//		e.eat("도시락");
		
		HighStudent hs = new HighStudent();
		hs.eat("도시락");
		
		e = hs;
		e.eat("컵라면");
		
		//자식 클래스들 중에는 해당 인터페이스를 받을 수도 있기때문에 
		//강제 형변환 시킬 수 있으나 인터페이스를 구현하지 않은 상태면
		//캐스팅 오류 발생함
		Student std = hs;
		e = (Eat) std;
		e.eat("국밥");
		
	}

}
