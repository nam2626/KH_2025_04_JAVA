
public class E28_Quest {
	/*
	 * 	1  2  3  4  5
	 *  6  7  8  9  10
	 *  11 12 13 14 15
	 *  16 17 18 19 20
	 *  21 22 23 24 25
	 * 
	 */
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
//		데이터 채우기
		int n = 1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) 
				arr[i][j] = n++;
		}
		
		//출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println();
		}
		
	}

}




