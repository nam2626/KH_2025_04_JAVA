import java.util.Scanner;

public class E14_Review {

	public static void main(String[] args) {
		//문자열 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		//입력 받은 문자열을 문자형 배열로 변환
		char[] arr = str.toCharArray();
		
		//배열의 처음 값부터 마지막 값까지 a가 몇번 나오는지 카운트
		int count = 0;
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] == 'a')
				count++;
		}
		
		//a 글자 개수를 출력
		System.out.println("a 문자 개수 : " + count);
	}

}






