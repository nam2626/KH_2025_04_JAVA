
public class E09_continue {
	/*
	 * 	continue 키워드를 만나면,
	 * 	현재 실행중인 반복의 작업을 멈추고 다음 반복 작업으로 넘어가는키워드
	 * 
	 * 	주의할점은 다음 회차로 넘어갈때 제어변수가 적절하게 동작하는지 체크
	 * 	제어변수 변경이 없으면 무한루프에 빠질 가능성이 있다.
	 * 
	 */
	public static void main(String[] args) {
		int i = 1;
		
		while(i<=100) {
			
			if(i % 2 == 1) {
				i++;
				continue;
			}
			
			System.out.print(i + " ");
			i++;
		}
	}

}
