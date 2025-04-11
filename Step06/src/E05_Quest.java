import java.util.Arrays;
import java.util.Scanner;

public class E05_Quest {
	/*
	 * 	정수형 배열 길이가 7인 배열을 생성한 뒤에
	 * 	배열에 숫자를 전부 사용자로부터 입력받아서 저장 후에
	 * 	배열에 저장된 모든 값을 출력
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1. 배열 생성
		int[] arr = new int[7];
		//2. 반복문
		for(int i = 0;i < arr.length;i++) {
		//	-> 1. 숫자 입력
		//	-> 2. 입력 받은 숫자를 배열에 저장
			System.out.print("숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		//3. 반복문
		//	배열에 전체 요소를 출력
		for(int i=0;i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
	}

}

