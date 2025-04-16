
public class E35_Review {

	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i][i] = 1;
			arr[i][arr.length-1-i] = 1;
		}
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
