
public class E15_Review {

	public static void main(String[] args) {
		//정수형 배열에 데이터 초기화
		int[] arr = {5,7,2,3,1,6,8,9,10}; 
		
		//배열 전체 출력
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		//배열을 거꾸로 전체 출력
		for(int i=arr.length-1;i > -1;i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
