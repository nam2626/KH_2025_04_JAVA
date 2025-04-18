package e03_method;

public class E05_SortArray {

	//배열 내용을 일렬로 출력하는 메서드
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%2d ", arr[i]);
		}
		System.out.println();
	}
	
	//버블 정렬
	public static void sortBuble(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			//j j+1 값을 비교해서 큰 값을 j+1번째로 저장 
			//두값을 비교해서 큰값이 뒤로 가게끔 서로 교환
			for() {
				
			}
			printArray(arr);
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr1 = new int[] {5,7,9,3,1};
		printArray(arr1);
	}

}




