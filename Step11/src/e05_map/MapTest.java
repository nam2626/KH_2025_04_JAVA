package e05_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import e03_list.Point;

public class MapTest {
	/*
	 * 	Map
	 * 		키값을 이용해서 데이터를 관리하는 형태
	 * 		키 와 값 한쌍의 페어로 이루어져 있음.
	 * 		키값은 중복이 안됨
	 * 
	 */
	public static void main(String[] args) {
		HashMap<String, Point> map = new HashMap<String, Point>();
		
		//데이터 추가
		map.put("A", new Point(10,7));
		map.put("B", new Point(21,17));
		map.put("Enemy", new Point(121,69));
		map.put("Player", new Point(5,10));
		map.put("B", new Point(33,44));
		
		System.out.println(map);
		
		//데이터 꺼내기 - 키값을 이용함
		System.out.println(map.get("Enemy"));
		System.out.println(map.get("B"));
		System.out.println(map.get("C"));
		
		//전체 데이터 꺼내기 - 1
		Set<String> key = map.keySet();
		for (String k : key) {
			System.out.println(k + " / " +map.get(k));
		}
		
		//전체 데이터 꺼내기 - 2
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String k = it.next();
			System.out.println(k + " / " + map.get(k));
		}
		
	}

}



