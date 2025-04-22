package e04_wrapper;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		//리스트 생성
		//리스트 생성시 <>에는 리스트에 저장할 데이터 타입 작성
		//단 <> 안에 쓰는 데이터 타입은 레퍼런스형만 가능
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//데이터 추가
		list.add(10);
		list.add(11);
		list.add(13);
		list.add(13);
		list.add(6);
		list.add(2);
		list.addFirst(30);
		list.addLast(70);
		System.out.println(list.toString());
		
		//데이터 삭제 - 인덱스로 삭제
		//2번 인덱스에 해당하는 데이터가 삭제
//		list.remove(2);
		System.out.println(list.remove(2));
		System.out.println(list.toString());
		
		//데이터 삭제 - 동일한 데이터 값을 검색해서 삭제
		list.remove(new Integer(2));
		System.out.println(list.toString());
		
		//저장된 데이터 개수
		System.out.println("저장된 데이터 개수 : " + list.size());
		
		//저장된 데이터 가져오기 - 인덱스
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}





