
public class E06_StringEquals {

	public static void main(String[] args) {
		String str1 = "안녕하세요";
		String str2 = "안녕하세요";
		String str3 = new String("안녕하세요");
		
		System.out.println(str1 == str2);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		//안녕하세요가 저장된 메모리 주소값으로 비교
		//문자열 값을 기준으로 비교하는게 아니라, 메모리 주소값이 동일한지 체크
		System.out.println(str1 == str3);
		System.out.println(str2 == str3);
		//실제 저장된 문자열 값을 기준으로 동일한지 비교한다.
		System.out.println(str1.equals(str3));
		System.out.println(str2.equals(str3));
		
		
	}

}
