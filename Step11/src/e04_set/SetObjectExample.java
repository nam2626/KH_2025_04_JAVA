package e04_set;

import java.util.HashSet;
import java.util.TreeSet;

import e03_list.Point;

public class SetObjectExample {

	public static void main(String[] args) {
//		HashSet<Point> set = new HashSet<>();
		TreeSet<Point> set = new TreeSet<Point>();
		//Point 5건 저장, 그중에 한건은 동일한 객체를 저장
		set.add(new Point(10, 4));
		set.add(new Point(3, 5));
		set.add(new Point(7, 11));
		set.add(new Point(10, 4));
		set.add(new Point(21, 43));
		set.add(new Point(6, 7));
		
		System.out.println(set);
	}

}



