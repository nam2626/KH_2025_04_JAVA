package e02_calendar;

import java.util.Date;

public class DDay {

	public static void main(String[] args) {
		//오늘 날짜부터 수능(2025/11/13)까지 몇일?
		//getTime() -> 밀리초 단위로 환산
		Date start = new Date("2025/04/30");
//		Date end = new Date(125,10,13);
		Date end = new Date("2025/11/13");
//		System.out.println(end);
		
		long dday = (end.getTime() - start.getTime())
				/ (1000 * 60 * 60 * 24) ;
		System.out.println(dday);
		
	}

}
