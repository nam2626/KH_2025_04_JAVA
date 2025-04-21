package e06_static;

public class StaticVar {
	/*
	 *  클래스가 JVM에 로딩될 때 메모리에 올라감(클래스가 처음 사용될 때).
	 *  프로그램 시작부터 끝날때까지 유지되는 메모리.
	 *  어느곳에서나 접근 가능함(접근제어자 기준으로 접근).
	 */
	public static int n1 = 10;
	public int n2 = 20;
	
	public static void main(String[] args) {
		//static 키워드가 붙어있으면 미리 메모리가 할당되었기 떄문에 접근이 가능
		System.out.println(n1);
		//n2는 StaticVar의 필드이기 때문에 아직 생성이 안되었다.
		//그래서 static 메서드에서 접근이 불가능하다.
//		System.out.println(n2);
		//non-static에 접근할려면 반드시 생성 후에 접근
		StaticVar v = new StaticVar();
		System.out.println(v.n2);
		//static으로 선언된 변수, 상수, 메서드에 접근하는 방법
		//클래스명.변수명, 클래스명.상수명, 클래명.메서드()
		System.out.println(StaticVar.n1);
		System.out.println(Math.PI);
		//객체명.변수명, 객체명.메서드() --> 객체도 큰의미로는 클래스
		//								객체도 static 영역에 접근 가능
		System.out.println(v.n1);
		
	}

}


