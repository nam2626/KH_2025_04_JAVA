package e02_random;

import java.util.Random;

public class Lotto {
	public static boolean isDuplicateNumber(int[] arr, int n) {
		for (int e : arr) {
			if (e == n)
				return true;
		}
		return false;
	}

	public static int[] generateLotto() {
		// 배열 생성
		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {
			// 숫자 랜덤으로 뽑음
//			int n = (new Random()).nextInt(1, 46);
			// 중복 체크
//			while (isDuplicateNumber(arr, n)) {
//				n = (new Random()).nextInt(1, 46);
//			}
			int n = 0;
			while (isDuplicateNumber(arr, (n = (new Random()).nextInt(1, 46)))) ;
			// 숫자 배열에 저장
			arr[i] = n;
		}

		// 배열 리턴
		return arr;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%2d ", arr[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) 
			printArray(generateLotto());
	}

}



