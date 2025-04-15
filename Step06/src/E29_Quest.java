
public class E29_Quest {
	/*
	 * 	2차원 배열 5행 5열짜리 생성
	 * 
	 * 	1	6	11	16	21
	 * 	2	7	12	17	22
	 *  3	8	13	18	23
	 *  4	9	14	19	24
	 *  5	10	15	20	25
	 */
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		int n = 1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[j][i] = n++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println();
		}
	}

}







