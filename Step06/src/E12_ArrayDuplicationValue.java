import java.util.Arrays;

public class E12_ArrayDuplicationValue {

	public static void main(String[] args) {
		//정수형 배열 길이가 7인 배열을 생성
		int[] arr = new int[7];
		//랜덤으로 배열에 숫자를 저장, 저장 범위 : 4~20
		for(int i=0;i<arr.length;i++) {
			//숫자를 랜덤으로 한개 생성
			arr[i] = (int)(Math.random() * 17) + 4;
			//중복 체크
			for(int j=0;j<i;j++) {
				//배열에 있는 요소값이 생성한 랜덤값과 같냐? 
				if(arr[j] == arr[i]) {
					i--;
					break;
				}
			}
		}
		
		//배열 내용 전체 출력 
		System.out.println(Arrays.toString(arr));
		
	}

}



