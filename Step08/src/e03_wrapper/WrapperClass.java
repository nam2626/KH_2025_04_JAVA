package e03_wrapper;

public class WrapperClass {
	/*
	 * 	Wrapper 클래스는 기존의 primitive(고정형) 변수 타입을
	 * 	reference 형 타입으로 바꿀때 사용되는 클래스
	 * 	각 타입에 대한 기능과 정보를 담고 있음
	 * 	
	 * 	primitive			wrapper
	 * 	int			->		Integer
	 * 	double		->		Double
	 * 	float		->		Float
	 *	boolean		->		Boolean
	 *	char		->		Character
	 *	short		->		Short
	 *	long		->		Long
	 *	byte		->		Byte 
	 * 
	 */
	public static void main(String[] args) {
		Integer n1 = 10;
		int n2 = 20;
		
		System.out.println(n1);
		System.out.println(n1 + 10);
		System.out.println(n1 + n2);
		System.out.println();
		
		//int 형 타입의 최대값, 최소값, 바이트수, 사이즈 -> 비트수
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		//문자열을 해당 타입의 값으로 변환
		System.out.println(Integer.parseInt("1234") * 2);
		System.out.println(Double.parseDouble("3.1415") * 2);
		
		//숫자 10에 대한 2진수, 8진수, 16진수 변환해서 출력
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toOctalString(10));
		System.out.println(Integer.toHexString(10));
		
		//16진수 표현 방법 - 0x 로 시작
		System.out.println(0x10);
		System.out.println(0xA);
		//8진수 표현 방법 - 0 으로 시작
		System.out.println(010);
		
		//auto boxing
		int i1 = 100;
		Integer i2 = i1;
		
		//auto unboxing
		int i3 = i2;
		
		//1.5 버전 미만에서 처리방법
		int i4 = 100;
		//boxing
		Integer i5 = new Integer(i4);
		System.out.println(i5);
		//unboxing
		int i6 = i5.intValue();
		System.out.println(i6);
	}

}



