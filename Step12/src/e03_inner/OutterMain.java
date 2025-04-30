package e03_inner;

import e03_inner.OutterClass.Inner;

public class OutterMain {

	public static void main(String[] args) {
		//Inner 클래스는 Outter 클래스가 생성되어야 생성이 가능.
//		Inner inner = new Inner(20);
		
		OutterClass outter1 = new OutterClass(10);
		OutterClass outter2 = new OutterClass(20);
		
		//Outter 클래스 객체를 이용하여 InnerClass 생성자 호출
		Inner inner1 = outter1.new Inner(100);
		inner1.printInner();
		Inner inner2 = outter1.new Inner(200);
		inner2.printInner();
		
		Inner inner3 = outter2.new Inner(300);
		Inner inner4 = outter2.new Inner(400);
		inner3.printInner();
		inner4.printInner();
		
		
	}

}



