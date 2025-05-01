package e02_text_io;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.TreeSet;

import javax.swing.event.ListSelectionEvent;

public class LottoQuest {
	
	//로또번호 원하는 셋트만큼 생성하는 메서드
	public static ArrayList<TreeSet<Integer>> createLotto(int set){
		//List 생성
		ArrayList<TreeSet<Integer>> list = new ArrayList<TreeSet<Integer>>();
		//set 개수만큼 로또번호 셋트 생성해서 리스트에 저장
		Random r = new Random();
		while(list.size() < set) {
			TreeSet<Integer> ts = new TreeSet<Integer>();
			while(ts.size() < 6) {
				ts.add(r.nextInt(1,46));
			}
			list.add(ts);
		}
		//List 리턴
		return list;
	}
	
	//로또번호가 담긴 리스트를 받아서 제공되는 형식으로 로또 번호 문자열 생성
	public static String makeLottoForm(ArrayList<TreeSet<Integer>> list) {
		System.out.println(String.format("%13s", "LOTTO"));
		System.out.println("---------------------");
		list.forEach(set -> {
			System.out.print("  ");
			set.forEach(item -> System.out.print(String.format("%02d ", item)));
			System.out.println();
		});
		System.out.println("---------------------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(sdf.format(Calendar.getInstance().getTime()));
		
		return "";
	}
	
	//생성한 로또 번호 문자열을 받아서 텍스트 파일로 출력하는 메서드
	public static void fileWrite(String str) {
		
	}
	
	public static void main(String[] args) {
		ArrayList<TreeSet<Integer>> list = createLotto(5);
//		list.stream().forEach(item -> System.out.println(item));
		makeLottoForm(list);
	}

}
