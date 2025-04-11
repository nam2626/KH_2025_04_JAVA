
public class E07_ArrayEx4 {

	public static void main(String[] args) {
		char[] str1 = new char[] {'H','e','l','l','o',' ','W','o','r','l','d'};
		
		//문자열을 문자형 배열로 바꾸는 방법
		String s = "Hello World";
		char[] str2 = s.toCharArray();
		
		//str2의 내용 한글자씩 출력
		for(int i = 0;i<str2.length;i++) {
			System.out.print(str2[i]);
		}
		System.out.println();
		
		str2[6] = 'H';
		String r = new String(str2);//문자형 배열을 문자열로 변환하는 방법
		System.out.println(r);
	}

}




