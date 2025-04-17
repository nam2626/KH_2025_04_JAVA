package e03_method;

public class E01_ArrayParam {
	static void printArray(int[] ary) {
		//배열에 내용 출력
		for(int i = 0;i < ary.length ; i++) {
			System.out.print(ary[i]+" ");
		}
		System.out.println();
	}
	//매개변수 받은 배열의 값을 1씩 증가하는 메서드
	static void addArray(int[] ary) {
		for(int i = 0;i < ary.length; i++) {
//			ary[i] += 1;
			ary[i]++;
		}
	}
	/*
	 * 가변길이 매개변수
	 * 		보낸 인자값을 배열로 만들어서 처리
	 * 		추가적으로 다른 값이 필요하면
	 * 		가변길이로 선언 매개변수 앞에 선언을 해야함.
	 * 
	 * 		예시>
	 * 		printArgs(int n, int m, int ... arr) O
	 * 		printArgs(int n, int m, int ... arr, int a) X
	 * 		printArgs(int n, int m, int ... arr, String a) X
	 * 
	 */	
	static void printArgs(int...ary) {
		for(int i = 0 ;i < ary.length ; i++) {
			System.out.print(ary[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5};
		printArray(arr);
		addArray(arr);
		printArray(arr);
		printArgs(1,2,3,4,5,6,7,8,9);
		printArgs(1,2,5,6,7,8,9);
		printArgs(1,2,3,4,5,6,7,8,9,10,12,13,15,65);
		printArray(new int[] {3,4,5,6,7,8,9,10});
		printArray(new int[] {3,4,5,6,7,8,9,10});
	}

}
