
public class E27_Array2D {

	public static void main(String[] args) {
		//2차원 배열 초기화
		int[][] arr1 = new int[][] {
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12}
		};
		
		for(int i=0;i<arr1.length;i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");				
			}
			System.out.println();
		}
		System.out.println();
		//------------------
		// 4행 4열 짜리 배열 생성 후에 
		// 배열 요소 전체를 출력
		int[][] arr2 = new int[4][4];
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}

}





