
public class E31_Quest {
	//달팽이 채우기
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		// row : 행번호, col : 열번호, n : 채울값
		// sw : 증감값, k : 채울값의 개수
		int row = 0, col = -1, n = 1, sw = 1, k = 5;
		
		//가로방향 채움
		for(int i = 0 ;i < k; i++ ) {
			col += sw;
			arr[row][col] = n++;
		}
		k--;
		
		//세로방향 채움
		for(int i = 0 ;i < k; i++ ) {
			row += sw;
			arr[row][col] = n++;
		}
		
		sw = -sw;
		
		for (int i = 0; i < arr.length; i++) {
			for (int c = 0; c < arr[i].length; c++) {
				System.out.printf("%2d ",arr[i][c]);
			}
			System.out.println();
		}
	}

}
