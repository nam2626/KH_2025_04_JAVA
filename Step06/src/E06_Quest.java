
public class E06_Quest {
	/*
	 * 	정수형 배열 길이가 10인 배열을 생성하고, 임의값으로 초기화
	 * 	1. 배열에 저장된 값의 총합을 출력
	 * 	2. 배열에 저장된 값들 중에 제일 큰값
	 * 	3. 배열에 저장된 값들 중에 제일 작은 값을 출력
	 * 
	 */
	public static void main(String[] args) {
		int[] arr = new int[] {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10};
		int sum, min, max;
		sum = min = max = arr[0];
		
		for(int i = 1 ;i < arr.length; i++) {
			sum += arr[i];
			
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
			
		}
		
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);
		System.out.println("총합 : " + sum);
	}

}


