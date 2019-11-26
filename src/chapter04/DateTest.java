package chapter04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();
		
		System.out.println(now);  //toString�� �������̵� �Ǿ����� ��.
		printDate1(now);
		printDate2(now);
	}
	public static void printDate1(Date d) {
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/ MM/ dd  hh:mm:ss");
		System.out.println(sdf.format(d));
	}
	public static void printDate2(Date d) {
		//�⵵+1900 �и��Ͼ� ���׶�����������
		int year = d.getYear(); //deprecate ������ �ڹ� �������� ������ ���̴� ������� ����� ��
		
		//��(0~11������ +1�ؾ���)
		int month = d.getMonth();
		
		//��
		int date = d.getDate();
		
		//�ð�
		int hours = d.getHours();
		
		//��
		int minutes = d.getMinutes();
		
		//��
		int seconds = d.getSeconds();
		System.out.println((year + 1900) + "-" + (month + 1) + "-" + date + " " + hours + ":" + minutes + ":" + seconds);
		
	}
	
}
