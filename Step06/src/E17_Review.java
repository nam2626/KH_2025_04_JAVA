import java.util.Arrays;

public class E17_Review {

	public static void main(String[] args) {
		//길이가 6인 정수형 배열을 선언하여
		//로또번호를 생성한 배열에 저장
		//단 로또번호 저장시 중복된 숫자는 저장되면 X
		//로또번호 범위 : 1 ~ 45
		
		//배열 생성
		int[] arr = new int[6];
		
		//반복문
		for(int i=0;i<arr.length;i++) {
		//	로또번호 1~45 랜덤 생성
		//	생성한 로또 번호 저장
			arr[i] = (int)(Math.random() * 45) + 1;
		//	중복 체크
			for(int j=0;j<i;j++) {
				//중복된 값이 있으면 i 감소시켜서 다음 반복때 새값 생성하게끔
				//인덱스 번호를 제어
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		//배열 전체 출력
		System.out.println(Arrays.toString(arr));
	}

}
