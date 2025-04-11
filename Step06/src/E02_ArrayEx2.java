
public class E02_ArrayEx2 {

	public static void main(String[] args) {
		//배열 생성과 동시에 초기화 하는 방법 - 1
		int[] arr1 = {1,2,3,4,5,6,9,10};
		
		System.out.println("배열 개수 확인 : " + arr1.length);
		
		//배열 내용 출력
		for(int i = 0;i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		//배열 생성과 동시에 초기화 하는 방법 - 2
		int[] arr2 = new int[] {10,11,12,13};
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");			
		}
		System.out.println();
		//배열 전체값 출력하는 방법
		for(int n : arr2) {
			System.out.print(n + " ");
		}
		System.out.println();
		
	}

}





