package chapter04;

public class StringTest02 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "def";
		String s3 = s2;
		
		s2 = s1.toUpperCase(); // s2가 바뀌었으나 s3가 붙잡고 있어 가비지 콜렉팅은 일어나지 않음.
		String s4 = s3.concat("??");
		String s5 = "!".concat(s2).concat("@");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		//equals를 할 떄 주의할 점
		String s = null;
		System.out.println(equalsHello(s));
		
	}
	
	private static boolean equalsHello(String s) {
		//return s.contentEquals("Hello"); << null값ㅇ디 들어올 경우 널포인트 익셉션이 일어남.
		return "Hello".equals(s);
	}

}
