package e02_random;

import java.util.Random;

public class Lotto {
	public static boolean isDuplicateNumber(int[] arr, int n) {
		for (int e : arr) {
			if(e == n)
				return true;
		}
		return false;
	}
	
	public static int[] generateLotto() {
		//배열 생성
		int[] arr = new int[6];
		
		for(int i=0;i<arr.length;i++) {
			//숫자 랜덤으로 뽑음
			int n = (new Random()).nextInt(1, 46);
			//중복 체크
			if(isDuplicateNumber(arr, n)) {
				i--;
				continue;
			}
			//숫자 배열에 저장
			arr[i] = n;
		}
		
		//배열 리턴
		return arr;
	}
	
	public static void main(String[] args) {
		
	}

}
