
public class E16_Review {

	public static void main(String[] args) {
		//숫자 저장
		int n = (int)(Math.random() * 100000) + 1;
		System.out.println("n : " + n);
		
		//각 자리수 합
		int num = n, sum = 0;
		while(num > 0) {
			sum += num % 10;
			num /= 10;
		}
		
		System.out.println("자리수 합 : " + sum);
		
		int m = 0;
		
		for(int i = 1;i <= n ; i++) {
			if(i + sum == n) {
				m = i;
				break;
			}
		}
		if(m != 0)
			System.out.println("생성자 : "+ m);
		else
			System.out.println("생성자에 해당하는 숫자가 없습니다.");
	}

}





