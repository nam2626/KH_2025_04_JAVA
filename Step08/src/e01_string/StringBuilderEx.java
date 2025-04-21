package e01_string;

public class StringBuilderEx {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));

		//문자열 뒤에 붙이기
		sb.append("AAAA");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		
		//replace(시작인덱스, 마지막 인덱스 + 1, "바꿀 문자열")
		sb.replace(0, 4, "BBBB");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		
		sb.delete(0, 4);
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		System.out.println();
		
		StringBuffer buffer = new StringBuffer("Hello");
		System.out.println(buffer);
		System.out.println(System.identityHashCode(buffer));
		
		buffer.append("World");
		System.out.println(buffer);
		System.out.println(System.identityHashCode(buffer));
		System.out.println();
		//-----------------------------
		String str = "Hello";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		
		str += "World";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
	}

}



