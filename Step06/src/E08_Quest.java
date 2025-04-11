
public class E08_Quest {

	public static void main(String[] args) {
		String str = "Hello World";
		char[] arr = str.toCharArray();
		
		//arr 배열에 있는 문자들을 전부 대문자로 변환해서 출력
		for(int i=0;i<arr.length;i++) {
			if(arr[i] >= 'a' && arr[i] <= 'z')
				arr[i] -= 32;
		}
		
		str = new String(arr);
		System.out.println(str);
	}

}
