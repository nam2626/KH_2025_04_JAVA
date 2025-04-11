
public class E04_Quest {

	public static void main(String[] args) {
		//배열 생성 후 임의 숫자 10개를 저장
						//		0  1  2  3...
		int[] arr = new int[] {23,54,34,234,6,7,237,643,111,33};
		
		//배열에 저장된 값들 중 홀수의 개수를 출력
		//홀수 개수 저장할 변수 선언
		int count = 0;
		
		//반복문 배열의 처음 요소부터 마지막 요소까지 접근하면서 홀수인지 체크
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] % 2 == 1)//배열의 요소가 홀수 인지 체크
				count++;//홀수 개수 증가
		}
		
		System.out.println("홀수 개수 : " + count);
		
		
	}

}






