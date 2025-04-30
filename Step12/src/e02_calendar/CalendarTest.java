package e02_calendar;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		
		//연도
		System.out.println(calendar.get(Calendar.YEAR));
		//월
		System.out.println(calendar.get(Calendar.MONTH));
		//일
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		//요일
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		//12시간 기준 시간
		System.out.println(calendar.get(Calendar.HOUR));
		System.out.println(calendar.get(Calendar.AM_PM));
		//24시간 기준 시간
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
		//분
		System.out.println(calendar.get(Calendar.MINUTE));
		//초
		System.out.println(calendar.get(Calendar.SECOND));
		//밀리초
		System.out.println(calendar.get(Calendar.MILLISECOND));
		
		//연도를 내년으로 변경
		calendar.set(Calendar.YEAR, 2026);
		System.out.println(calendar.getTime());//Date 객체 리턴
		
		calendar.set(Calendar.DAY_OF_MONTH, -1);
		System.out.println(calendar.getTime());
		
	}

}
