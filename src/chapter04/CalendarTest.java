package chapter04;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		
		//new Calendar(); 캘린더 자체는 추상클래스임 이것을 상속받아서 달력을 만들어라!
		
		Calendar cal = Calendar.getInstance();
		printDate(cal);
		
		
		cal.set(Calendar.YEAR, 2020);
		cal.set(Calendar.MONTH, 10); //MONTH(11)-1;
		cal.set(Calendar.DATE, 26); 
		printDate(cal);
		
		cal.set(2018, 2, 11); 
		cal.add(Calendar.DATE, 730);
		printDate(cal);
		
		
	}
	
	public static void printDate(Calendar cal) {
		String[] days = {"일", "월", "화", "수", "목", "금", "토"};
		//년도
		int year = cal.get(Calendar.YEAR);	// YEAR이 상수라서 대문자로 써야함. 변수와의 구분
		//월(0~11), +1
		int month = cal.get(Calendar.MONTH);
		//일
		int date = cal.get(Calendar.DATE);
		//요일[1(일) ~ 7(토)]
		int day = cal.get(Calendar.DAY_OF_WEEK);
		//시
		int hour = cal.get(Calendar.HOUR);
		//분
		int minute = cal.get(Calendar.MINUTE);
		//초
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(
				year 	+ "-"
			+ (month+1) + "-"
			+	date 	+ "(" 
			+ days[day-1] + ")" +" "
			+	hour 	+ ":"
			+	minute 	+ ":"
			+	second 	); 
		
		
		
	}

}
