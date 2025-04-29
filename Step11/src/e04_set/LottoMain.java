package e04_set;

import java.util.TreeSet;

public class LottoMain {

	public static void main(String[] args) {
		//로또번호 1셋트 생성해서 출력
		//단, Set 사용
		TreeSet<Integer> set = new TreeSet<Integer>();
		while(set.size() < 6) set.add((int)(Math.random()*45)+1);
		System.out.println(set);
	}

}
