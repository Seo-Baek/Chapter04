package chapter04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();
		
		System.out.println(now);  //toString이 오버라이딩 되어있을 것.
		printDate1(now);
		printDate2(now);
	}
	public static void printDate1(Date d) {
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/ MM/ dd  hh:mm:ss");
		System.out.println(sdf.format(d));
	}
	public static void printDate2(Date d) {
		//년도+1900 밀리니엄 버그때문에ㅋㅎㅎ
		int year = d.getYear(); //deprecate 나중의 자바 버전에선 없어질 것이니 사용하지 말라는 것
		
		//월(0~11까지임 +1해야함)
		int month = d.getMonth();
		
		//일
		int date = d.getDate();
		
		//시각
		int hours = d.getHours();
		
		//분
		int minutes = d.getMinutes();
		
		//초
		int seconds = d.getSeconds();
		System.out.println((year + 1900) + "-" + (month + 1) + "-" + date + " " + hours + ":" + minutes + ":" + seconds);
		
	}
	
}
