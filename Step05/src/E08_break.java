
public class E08_break {

	public static void main(String[] args) {
		int sum = 0, i = 1;
		
		//무한루프
		while(true) {
			sum += i;
			i++;
			//무한루프일때 반드시 반복문 종료하는 부분 필요
			if(sum >= 5000) break;
		}
		
		System.out.println(sum);
	}

}
