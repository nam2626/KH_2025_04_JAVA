
public class E12_Operator {
	/*
	 * 	증감 연산자 : 변수의 값을 1씩 증가, 1씩 감소하는 연산자
	 * 				= 이 없어도 값을 변경시켜서 저장하는 연산자
	 * 
	 *  ++ : 1씩 증가,  -- : 1씩 감소
	 *  
	 *  ++변수	변수++	--변수	변수--
	 * 
	 */
	public static void main(String[] args) {
		
		int n1 = 10;
		
		n1++;
		System.out.println(n1);
		
		n1--;
		System.out.println(n1);
		
		System.out.println("-------");
		int n2 = 10;
		System.out.println(n2);
		System.out.println(n2++);//먼저 일하고 증가
		System.out.println(n2);
		System.out.println("-------");
		int n3 = 10;
		System.out.println(n3);
		System.out.println(++n3);//먼저 증가하고 일하기
		System.out.println(n3);
		System.out.println("-------");
		
		//--------------------------------------
		int a = 7, b = 4;
		int result = a++ + 5 * ++b + a; // 40 
		System.out.println(result);
		
	}

}



