package e03_method;

import java.util.Arrays;

public class E06_Lotto {

	public static void main(String[] args) {

		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {
			int n = (int) (Math.random() * 45) + 1;
			
			if(isNumberCheck(arr, n)) {
				i--;
				continue;
			}
			arr[i] = n;
		}
		sortBuble(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static boolean isNumberCheck(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == n)
				return true;
		}
		return false;
	}

	public static void sortBuble(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}
}
