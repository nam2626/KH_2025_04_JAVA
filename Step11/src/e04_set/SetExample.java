package e04_set;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {
	/*
	 * 		Set	
	 * 			1. 데이터를 중복해서 저장하지 않음
	 * 			2. 자동 정렬
	 */
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		//데이터 5건 추가
		System.out.println(set.add("JAVA"));
		System.out.println(set.add("HTML/CSS"));
		System.out.println(set.add("React"));
		System.out.println(set.add("JAVA"));
		System.out.println(set.add("Spring"));
		System.out.println(set.add("SQL"));
		
		System.out.println(set);
		
		//삭제
		System.out.println(set.remove("JAVA"));
		System.out.println(set.remove("JAVA1"));

		//데이터 개수
		System.out.println(set.size());

		//데이터 검색
		System.out.println(set.contains("React"));
		System.out.println(set.contains("React1"));
		
		//내용 비우기
//		set.clear();
		System.out.println(set);
		
		//set이 비었냐?
		System.out.println(set.isEmpty());
		
		//데이터 전체 조회 - 1
		for (String str : set) {
			System.out.println(str);
		}
		
		//데이터 전체 조회 - 2
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}





