
public class E30_Quest {
	/*
	 * 	2차원 배열 5행 5열짜리 생성
	 * 
	 * 	1	2	3	4	5		int sw = 1;
	 * 	10	9	8	7	6		sw = -sw;
	 * 	11	12	13	14	15		반복문 증감식에 sw를 이용
	 * 	20	19	18	17	16
	 * 	21	22	23	24	25
	 */
	public static void main(String[] args) {
		int[][] arr =  new int[5][5];
		
		int n = 1;
		int j = 0, sw = 1;
		for (int i = 0; i < arr.length; i++) {
			for( ; j >= 0 && j < arr[i].length; j += sw) {
				arr[i][j] = n++;
			}
			sw = -sw;
			j	+= sw;
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int c = 0; c < arr[i].length; c++) {
				System.out.printf("%2d ",arr[i][c]);
			}
			System.out.println();
		}
	}

}







