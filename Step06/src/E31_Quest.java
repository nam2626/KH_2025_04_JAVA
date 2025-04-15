
public class E31_Quest {
	//달팽이 채우기
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int row = 0, col = 0, n = 1;
		
		//가로방향 채움
		for( ;col < 5;col++ ) {
			arr[row][col] = n++;
		}
		
		col--;
		row++;
		//세로방향 채움
		for( ;row < 5; row++) {
			arr[row][col] = n++;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int c = 0; c < arr[i].length; c++) {
				System.out.printf("%2d ",arr[i][c]);
			}
			System.out.println();
		}
	}

}
