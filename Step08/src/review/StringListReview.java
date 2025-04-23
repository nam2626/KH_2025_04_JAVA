package review;

import java.util.ArrayList;

public class StringListReview {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		//데이터 추가
		list.add("A"); //맨뒤에 추가
		list.add("B");
		list.add(0,"C"); // 원하는 인덱스 데이터를 추가
		list.add("D");
		System.out.println(list);
		
		list.set(1, "F");//원하는 인덱스에 데이터를 교체
		System.out.println(list);
		//데이터 조회
		for(int i = 0;i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		//데이터 삭제
		list.remove("D"); // 동일한 데이터 삭제
		list.remove(0);//인덱스 번호를 이용해서 삭제
		System.out.println(list);
		
		//indexOf, contains
		System.out.println(list.indexOf("B"));
		System.out.println(list.contains("B"));
		System.out.println(list.indexOf("C"));
		System.out.println(list.contains("C"));
		
		//clear - 비우기
		list.clear();
		System.out.println(list);
	}

}



