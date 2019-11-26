package chapter04;

public class WrapperClass {

	public static void main(String[] args) {
		Integer i = new Integer(1);
		Character c = new Character('A');
		Boolean b = new Boolean(true);
		
		System.out.println(i);
		System.out.println(c);
		System.out.println(b);
		
		Integer i2 = 10;		//컴파일러가 자동으로 new처럼생성
		Integer i3 = 10;
		System.out.println(i2 == i3);
		
		
		//Auto Unboxing (기본타입처럼 사용해도 아무문제 없다, 오히려 이익! 콘스탄트 풀 때문에!)
		//int j = 20 + i2.intValue();
		int j = 20 + i2;
		
	}

}
