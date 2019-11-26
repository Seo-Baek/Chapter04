package chapter04;

public class StringTest03 {
	public static void main(String[] args) {
		String s = "aBcABCabcABC";
		
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf("abc"));
		System.out.println(s.indexOf("abc", 7)); //�� ã���� ����, ��𼭺��� ã����
		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 8));//3~8����
		
		String s2 = "         ab cd     ";
		String s3 = "dfg,hijk,lmn,opq";
		
		String s4 = s2.concat(s3);
		System.out.println(s4);
		
		System.out.println("----" + s2.trim() + "----"); //�յ� ������ ���ִ� ��
		System.out.println("----" + s2.replaceAll(" ", "") + "----"); //�߰� ������ ���� ���� ���� �Ķ���͸� ���� ���ڷ� �ٲ��ִ� �޼ҵ� ���
		
		
		String[] tokens = s3.split(","); //���й��� �������� ������ ��
		for(String str : tokens) {
			System.out.println(str);
		}
		
		//StringBuffer Test
		StringBuffer sb = new StringBuffer("");
		sb.append("Hello");
		sb.append(" ");
		sb.append("World");
		sb.append(2020);
		System.out.println(sb);
		
		//String str = "Hello" + " " + "World" + 2020;
		String str = new StringBuffer("Hello").append(" ").append("World").append(2020).toString(); //append �� �����ϴ� ���� �ڱ��ڽ�, �������� ��Ʈ������ ���� ������.
		System.out.println(str);
		
		//����: + �����ڷ� ���ڿ�(String)�� ���� ��
		String str2 = "";
		StringBuffer sb2 = new StringBuffer("");
		for ( int i = 0; i < 1000000; i++) {
			//str2 += i;
			//str2 = new StringBuffer(Str2),append(i);
			sb.append(i);								//�� ����� �ξ�~~~~~~ ����
			
		}
		
		//format
		String name = "�Ѹ�";
		int score = 100;
		
		System.out.println(name + "���� ������ " + score + "�Դϴ�.");
		System.out.println(String.format("%s���� ������ %d�Դϴ�.", name, score));
		
	}

}
