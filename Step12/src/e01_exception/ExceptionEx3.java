package e01_exception;

public class ExceptionEx3 {

	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println("나누기 결과 : " + 5 / 0);
			System.out.println(2);
		} catch (Exception e) {
			System.out.println(3);
		} finally {
			//try 영역에서 작업이 정상적으로 끝나든, 
			//Exception이 발생이 되든, 반드시 실행되는 영역			
			System.out.println(4);
		}
		System.out.println(5);
	}

}
