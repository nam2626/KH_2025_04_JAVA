package e03_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ListObjectExample {

	public static void main(String[] args) {
		ArrayList<Point> list = new ArrayList<>();
		Random r = new Random();
		// 리스트에 데이터 10건
		// 좌표 범위 : x,y 좌표 0~21 까지 랜덤하게 좌표 생성해서 저장
		while (list.size() < 10) {
			list.add(new Point(r.nextInt(22), r.nextInt(22)));
		}
		list.add(new Point(10, 7));
		
		// 리스트에 저장된 내용을 전부 출력
		Iterator<Point> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Point search = new Point(10, 7);
		System.out.println(list.contains(search));
		System.out.println(list.indexOf(search));
		System.out.println(list.remove(search));
	}

}
