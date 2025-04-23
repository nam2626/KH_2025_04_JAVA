package e04_list;

import java.util.ArrayList;

public class StringListEx {

	public static void main(String[] args) {
		//문자열 저장하는 ArrayList 생성
		ArrayList<String> list = new ArrayList<String>();
		//문자열 데이터 5건 저장
		list.add("Java");
		list.add("HTML/CSS");
		list.add("javascript");
		list.add("react");
		list.add("Oracle");
		
		System.out.println(list);
		
		//데이터 삭제
		list.remove(2);
		System.out.println(list);
		list.remove("Oracle");
		System.out.println(list);
		
		//리스트에 있는 내용 전부 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println();
		
		System.out.println(list.indexOf("HTML/CSS"));
		System.out.println(list.indexOf("Test"));
		
	}

}



