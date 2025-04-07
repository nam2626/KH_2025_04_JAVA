
public class E04_else {
	/*
	 * 		else
	 * 			else 이전의 모든 조건문들이 거짓일때 실행되는 영역
	 * 			else는 마지막 조건문에 해당하기 떄문에 조건식이 없고,
	 * 			맨마지막에 작성됨
	 * 			if가 생략된 상태로 사용이 불가능
	 */
	public static void main(String[] args) {
		int n = 13;
		
		//n 에 저장된 숫자가 3의 배수인지 아닌지 출력
		if(n != 0 && n % 3 == 0) {
			System.out.println("3의 배수입니다.");
		}else{
			System.out.println("3의 배수가 아닙니다.");
		}
		/*
		String msg = n != 0 && n % 3 == 0 ? "3의 배수 입니다" : "3의 배수가 아닙니다.";
		System.out.println(msg);
		*/
	}

}



