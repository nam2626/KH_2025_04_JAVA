
public class E34_Review {

	public static void main(String[] args) {
		int[][] scores = { { 80, 90, 100 }, { 70, 85 }, { 90, 95, 85, 100 } };
		
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
				System.out.printf("%-3d ",scores[i][j]);
			}
			System.out.println(sum / scores[i].length);
		}
	}

}
