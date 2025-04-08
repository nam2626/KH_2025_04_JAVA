
public class E14_switch {
	/*
	 * 	switch는 case 옆에 있는 값과 일치하면
	 * 	일치하는 순간부터 switch 내부의 코드를 전부 순서대로 실행한다.
	 * 	(switch가 끝나거나, break를 만날때까지)
	 * 	break : switch를 강제로 종료시키는 키워드
	 * 	switch에서 비교가능한 값은 정수, 문자, 문자열 만 가능
	 * 	default : 위에 case에 동일한 값이 없을때 실행되는 영역
	 * 			  (if문으로 따지자면 else와 동일한 역할)
	 * 
	 */
	public static void main(String[] args) {
		int no = 3;
		
		switch(no) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.println("???");
		}
	}

}
