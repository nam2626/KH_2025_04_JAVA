
public class E13_VarEx {

	public static void main(String[] args) {
		//통합 자료형, 데이터 타입은 컴파일러가 초기화하는 데이터를 보고 결정
		var num = 100;
		System.out.println(num * 2);
		
		//num = "Hello World";//타입이 컴파일 할때 이미 정수로 결정되어 있음
		
		num += 20;
		System.out.println(num);
		
		var flag = true;
		System.out.println(flag);
		
		var str = "Hello World";
		System.out.println(str);
		
		//var t; //통합 자료형은 반드시 초기화 해야함. 그래야 타입이 결정됨
		
	}

}



