
public class E02_PrintMain {
	/*
	 * 여러줄 주석 
	 */
	
	//한줄 단위 주석
	
	/*
	 * 	주석
	 * 		코드에 설명문을 작성하는 영역
	 * 		주석은 실행이 안되는 코드
	 * 
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(10);
		//System.out.println(10 + 5);
		System.out.println(10 - 5);
		
		System.out.println("Hello");
		System.out.println("Hello" + "World");
		System.out.println("Hello" + 10 + 20);	
		
		
		/*
		 * System.out.println(1); System.out.println(2); System.out.println(3);
		 * System.out.println(4);
		 */
		
		System.out.print("-----------------\n"); // \n 줄바꿈 문자
		System.out.print("Hello");
		System.out.print("World\n");
		System.out.print("---------\n\n--------\n");
		System.out.println("\\n"); // \\ 역슬래시 한개로 출력
		System.out.println("\""); // \" 큰따옴표 출력
		System.out.println("1\t2"); // 탭사이즈 만큼 띄워쓰기
		
		//         숫자     숫자
		//안녕하세요9282갑시다2234
		System.out.println("안녕하세요"+9282+"갑시다"+2234);
		System.out.printf("안녕하세요%d갑시다%d",9282,2234);
		 
	}

}





