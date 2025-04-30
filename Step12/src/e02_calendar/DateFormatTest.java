package e02_calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DateFormatTest {

	public static void main(String[] args) {
		//날짜 생성
		Calendar cal = Calendar.getInstance();
		//날짜 서식 문자열을 이용해서 원하는 형태로 문자열을 만들어주는 클래스
		SimpleDateFormat sdf = new SimpleDateFormat();
		
		//연도 4자리
		sdf.applyPattern("yyyy");
		System.out.println(sdf.format(cal.getTime()));
		//연도 2자리
		sdf.applyPattern("yy");
		System.out.println(sdf.format(cal.getTime()));
		//월 1자리
		sdf.applyPattern("M");
		System.out.println(sdf.format(cal.getTime()));
		//월 2자리
		sdf.applyPattern("MM");
		System.out.println(sdf.format(cal.getTime()));
		//로컬 형식 월 약자
		sdf.applyPattern("MMM");
		System.out.println(sdf.format(cal.getTime()));
		//로컬 형식 월 풀네임
		sdf.applyPattern("MMMM");
		System.out.println(sdf.format(cal.getTime()));
		//일 1자리
		sdf.applyPattern("d");
		System.out.println(sdf.format(cal.getTime()));
		//일 2자리
		sdf.applyPattern("dd");
		System.out.println(sdf.format(cal.getTime()));
		//요일
		sdf.applyPattern("E");
		System.out.println(sdf.format(cal.getTime()));
		//요일 - 로컬형식 약자
		sdf.applyPattern("EEE");
		System.out.println(sdf.format(cal.getTime()));
		//요일 - 로컬형식 풀네임
		sdf.applyPattern("EEEE");
		System.out.println(sdf.format(cal.getTime()));
		//AM PM - 로컬형식
		sdf.applyPattern("a");
		System.out.println(sdf.format(cal.getTime()));
		//시간 - 12시간
		sdf.applyPattern("h");
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("hh");
		System.out.println(sdf.format(cal.getTime()));
		//시간 - 24시간
		sdf.applyPattern("H");
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("HH");
		System.out.println(sdf.format(cal.getTime()));
		//분
		sdf.applyPattern("m");
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("mm");
		System.out.println(sdf.format(cal.getTime()));
		//초
		sdf.applyPattern("s");
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("ss");
		System.out.println(sdf.format(cal.getTime()));
		
		//yyyy-MM-dd HH:mm:ss
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		//2022년 12월 05일 12시 35분 55초
		sdf.applyPattern("yyyy년 MMM dd일 HH시 mm분 ss초");
		System.out.println(sdf.format(cal.getTime()));
		
		//날짜 로컬 형식 변경
		sdf = new SimpleDateFormat("MMM MMMM E EEE EEEE", 
				Locale.ENGLISH);
		System.out.println(sdf.format(cal.getTime()));
	}

}





