import java.util.Arrays;

public class E23_Quest {
	//로또번호 5셋트 출력
	public static void main(String[] args) {
		
		for(int c=0;c<5;c++) {
			int[] lotto = new int[6];
			for(int i=0;i<lotto.length;i++) {
				lotto[i] = (int)(Math.random() * 45) + 1;
				for(int j=0;j<i;j++) {
					if(lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}
			System.out.println(Arrays.toString(lotto));
		}

	}

}
