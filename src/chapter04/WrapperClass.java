package chapter04;

public class WrapperClass {

	public static void main(String[] args) {
		Integer i = new Integer(1);
		Character c = new Character('A');
		Boolean b = new Boolean(true);
		
		System.out.println(i);
		System.out.println(c);
		System.out.println(b);
		
		Integer i2 = 10;		//�����Ϸ��� �ڵ����� newó������
		Integer i3 = 10;
		System.out.println(i2 == i3);
		
		
		//Auto Unboxing (�⺻Ÿ��ó�� ����ص� �ƹ����� ����, ������ ����! �ܽ�źƮ Ǯ ������!)
		//int j = 20 + i2.intValue();
		int j = 20 + i2;
		
	}

}
