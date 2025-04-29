package e02_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class ListExample {
	/*
	 * 	List 특징
	 * 		1. 데이터 중복
	 * 		2. 리스트에 저장된 데이터 순서가 보장됨
	 * 	
	 * 	ArrayList : 리스트에서 데이터를 배열로 관리(순차리스트)
	 * 	LinkedList : 리스트에서 데이터를 노드 단위로 관리
	 * 	Vector : ArrayList와 동일, 동기화가 추가
	 * 
	 */
	public static void main(String[] args) {
		//문자열 저장하는 ArrayList 생성
		ArrayList<String> list = new ArrayList<String>();
//		LinkedList<String> list = new LinkedList<String>();
//		Vector<String> list = new Vector<String>();
		//데이터 추가 - 7건
		list.add("HTML/CSS");
		list.add("js/jQuery");
		list.add("JAVA");
		list.add("react");
		list.add("JAVA");
		list.add("jsp/servlet");
		list.add("Spring");
		list.add("jsp/servlet");
		
		System.out.println(list);
		//데이터 삭제 - 인덱스 번호 2번에 해당하는 데이터 삭제
		list.remove(2);
		System.out.println(list);
		
		//데이터 삭제 - 리스트에 저장된 값 기준으로 데이터 삭제
		list.remove("jsp/servlet");
		System.out.println(list);
		
		//데이터에 저장된 데이터 개수
		System.out.println(list.size());
		
		//리스트에 저장된 특정 인덱스 데이터를 교체
		list.set(1, "C++");
		System.out.println(list);
		
		//리스트에 특정 인덱스 데이터를 저장
		list.add(1, "C#");
		System.out.println(list);
		
		//리스트에 특정 데이터가 있는지 확인
		System.out.println(list.contains("JAVA"));
		System.out.println(list.contains("sql"));
		
		//리스트에 특정 데이터가 몇번 인덱스에 있는지 확인
		System.out.println(list.indexOf("JAVA"));
		System.out.println(list.lastIndexOf("JAVA"));
		
		//리스트에 있는 모든 데이터를 삭제
//		list.clear();
//		System.out.println(list);
		//리스트에 데이터 없냐?
		System.out.println(list.isEmpty());
		//--------------------------------
		//데이터 꺼내는 방법 - 1
		for(int i = 0; i < list.size(); i++) {
			//인덱스 번호를 이용해서 꺼냄
			System.out.println(list.get(i));
		}
		//데이터 꺼내는 방법 - 2
		//foreach 문을 이용하여 꺼냄
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println("------");
		//데이터 꺼내는 방법 - 3
		//Iterator(반복자) : Collection의 데이터를 처음부터 마지막까지 접근할떄 사용
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			//다음 데이터 가져옴
			System.out.println(it.next());
		}
		
	}

}








