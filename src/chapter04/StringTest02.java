package chapter04;

public class StringTest02 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "def";
		String s3 = s2;
		
		s2 = s1.toUpperCase(); // s2�� �ٲ������ s3�� ����� �־� ������ �ݷ����� �Ͼ�� ����.
		String s4 = s3.concat("??");
		String s5 = "!".concat(s2).concat("@");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		//equals�� �� �� ������ ��
		String s = null;
		System.out.println(equalsHello(s));
		
	}
	
	private static boolean equalsHello(String s) {
		//return s.contentEquals("Hello"); << null������ ���� ��� ������Ʈ �ͼ����� �Ͼ.
		return "Hello".equals(s);
	}

}
