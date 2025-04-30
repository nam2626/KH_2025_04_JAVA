package e02_calendar;

import java.util.Calendar;
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
		
		//위에 코드를 Calendar 이용해서 처리
		Calendar s = Calendar.getInstance();
		Calendar e = Calendar.getInstance();
		e.setTime(end);
		
		System.out.println(e.get(Calendar.DAY_OF_YEAR) - 
				s.get(Calendar.DAY_OF_YEAR));
		
	}

}
