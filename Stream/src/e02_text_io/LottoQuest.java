package e02_text_io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.TreeSet;

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
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%13s\n", "LOTTO"));
		sb.append("---------------------\n");
		list.forEach(set -> {
			sb.append("  ");
			set.forEach(item -> sb.append(String.format("%02d ", item)));
			sb.append("\n");
		});
		sb.append("---------------------\n");
		SimpleDateFormat sdf = new SimpleDateFormat(" yyyy/MM/dd HH:mm:ss");
		sb.append(sdf.format(Calendar.getInstance().getTime()));
		
		return sb.toString();
	}
	
	//생성한 로또 번호 문자열을 받아서 텍스트 파일로 출력하는 메서드
	public static void fileWrite(String str) {
		//파일 출력
		//파일명 2025_05_01_lotto.txt
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd");
		String fileName = sdf.format(Calendar.getInstance().getTime());
		fileName += "_lotto.txt";
		try(FileWriter fw = new FileWriter("c:\\test\\"+fileName);
			PrintWriter pw = new PrintWriter(fw)){
			pw.println(str);
			System.out.println(fileName + " 생성 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ArrayList<TreeSet<Integer>> list = createLotto(5);
//		list.stream().forEach(item -> System.out.println(item));
		String result = makeLottoForm(list);
		System.out.println(result);
		fileWrite(result);
		
	}

}
