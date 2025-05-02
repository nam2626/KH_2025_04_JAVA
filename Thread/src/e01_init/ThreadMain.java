package e01_init;

import java.util.ArrayList;

public class ThreadMain {

	public static void main(String[] args) {
		ArrayList<ThreadRun> list = new ArrayList<ThreadRun>();
		
		//리스트에 스레드 10개 추가
		while(list.size() < 10)
			list.add(new ThreadRun());
		
		//스레드에게 작업을 시작 -> start()
//		for(int i=0;i<list.size();i++)
//			list.get(i).start();
		list.stream().forEach(t -> t.start());
	}

}




