package e03_method;

import java.util.Scanner;

public class E05_SortArray {

	//배열 내용을 일렬로 출력하는 메서드
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%2d ", arr[i]);
		}
		System.out.println();
	}
	
	//버블 정렬
	public static void sortBuble(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			//j j+1 값을 비교해서 큰 값을 j+1번째로 저장 
			//두값을 비교해서 큰값이 뒤로 가게끔 서로 교환
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			printArray(arr);
		}
		
	}
	
	public static void sortSelect(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			//비교할 인덱스 번호
			// 제일 작은 값이 있는 인덱스를 저장할 변수
			int idx = i;
			for(int j = i + 1; j < arr.length; j++) {
				//작은 값에 해당하는 인덱스값을 idx에 저장
				if(arr[idx] > arr[j])
					idx = j;
			}
			//제일 작은 값이 있는 인덱스와 기준 인덱스 값과 교환
			int temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;
			
			printArray(arr);
		}
	}
	
	public static void insertSort() {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		//배열 첫번째 요소부터 마지막 요소까지 숫자 입력받아서 저장
		for (int i = 0; i < arr.length; i++) {
			System.out.print("숫자 입력 : ");
			arr[i] = sc.nextInt();
			//삽입 정렬 수행
			
			printArray(arr);
		}
	}
	
	public static void main(String[] args) {
		int[] arr1 = new int[] {5,7,9,3,1};
		sortBuble(arr1);
		System.out.println();
		int[] arr2 = new int[] {5,7,9,3,1};
		sortSelect(arr2);
		System.out.println();
		
		insertSort();
	}

}




