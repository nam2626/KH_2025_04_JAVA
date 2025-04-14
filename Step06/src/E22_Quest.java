import java.util.Arrays;
import java.util.Scanner;

public class E22_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//길이가 5인 정수형 배열 생성
		int[] arr = new int[5];
		//반복문을 이용해서 숫자를 입력 받아서 저장
		//숫자 0을 입력할떄까지 입력을 받음
		//숫자 0을 입력하면 입력 받는 것을 종료
		int i = 0;
		while(true) {
			if(i + 1 == arr.length) {
				int[] temp = new int[arr.length + 5];
				System.arraycopy(arr, 0, temp, 0, arr.length);
				arr = temp;
			}
			
			System.out.print("숫자 입력 : ");
			arr[i] = sc.nextInt();
			if(arr[i] == 0){
				break;
			}
			i++;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
