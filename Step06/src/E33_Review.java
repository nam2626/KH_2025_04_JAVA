
public class E33_Review {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i == 0 || i == arr.length - 1)
					arr[i][j] = 1;
				else {
					arr[i][0] = 1;
					arr[i][arr.length-1] = 1;
					break;
				}
			}
		}
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
