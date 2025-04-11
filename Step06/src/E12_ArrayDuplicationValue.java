import java.util.Arrays;

public class E12_ArrayDuplicationValue {

	public static void main(String[] args) {
		//정수형 배열 길이가 7인 배열을 생성
		int[] arr = new int[7];
		//랜덤으로 배열에 숫자를 저장, 저장 범위 : 4~20
		for(int i=0;i<arr.length;i++) {
			int n = (int)(Math.random() * 17) + 4;
			arr[i] = n;
		}
		
		//배열 내용 전체 출력 
		System.out.println(Arrays.toString(arr));
		
	}

}



