package chapter04;

public class WrapperClass02 {

	public static void main(String[] args) {
		String s = "123456";
		int i = Integer.parseInt(s);
		
		//cf. �ݴ�� �ϴ� ���
		String s2 = String.valueOf(i);
		System.out.println(s + ":" + s2);
		
		int a = Character.getNumericValue('F');  //�ƽ�Ű �ڵ尪
		System.out.println(a);
		
		//2����
		String s3 = Integer.toBinaryString(15); //�������� 01���ռ��� �����ϱ�
		System.out.println(s3);
		
		//16����
		String s4 = Integer.toHexString(256);
		System.out.println(s4);
		
	}

}
