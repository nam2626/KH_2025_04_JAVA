package e06_static;

public class NumberMain {

	public static void main(String[] args) {
//		싱글톤 패턴이 적용되면 생성자가
//		private으로 작성했기 때문에 외부에서는 생성이 불가능
//		Number n = new Number();
		Number n1 = Number.getInstance();
		Number n2 = Number.getInstance();
		Number n3 = Number.getInstance();
		Number n4 = Number.getInstance();
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		//생성자가 한번만 실행되었기 때문에 num이 1이다.
		System.out.println(n1.getNum());
		System.out.println(n2.getNum());
		System.out.println(n3.getNum());
		System.out.println(n4.getNum());
		System.out.println(Number.getInstance().getNum());
		
		
	}

}
