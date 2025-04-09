
public class E21_Quest {
	/*
	 * 		1~100까지 숫자들 중 3과 5의 배수들의 평균을 출력
	 * 		
	 */
	public static void main(String[] args) {
		//합 저장할 변수 선언
		int sum = 0, count = 0;
		
		//1. 3과 5의 배수 출력
		//2. 배수들의 총합
		//3. 배수들의 개수
		for(int i=1;i<=100;i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				sum += i;
				count++;
				System.out.println(i);
			}
		}
		//4. 평균 출력
//		System.out.println(sum + " " + count);
		System.out.println((double)sum / count);
	}

}






