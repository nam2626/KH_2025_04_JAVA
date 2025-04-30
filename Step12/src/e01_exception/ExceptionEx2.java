package e01_exception;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
			//int[] arr = { 5, 32, 1, 3, 11, 5, 6 };
			int[] arr = null;

			for (int i = 0; i <= arr.length; i++) {
				System.out.println(500 / arr[i]);
			}
		}catch (ArithmeticException e) {
			System.out.println("0으로 나누었습니다.");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위가 벗어났습니다.");
		}catch (NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println("빈객체를 실행했습니다.");
			e.printStackTrace();
		}catch (Exception e) {
			//모든 Exception 클래스들의 부모 클래스라서
			//모든 종류의 Exception을 받을수 있음.
			System.out.println("알수 없는 에러 발생");
		}
		System.out.println("프로그램 종료");
	}

}
