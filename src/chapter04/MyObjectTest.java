package chapter04;

public class MyObjectTest {
	public static void main(String[] args) {
		//MyObject myObject = new MyObject();
		MyObject myObject2 = MyObject.getInstance(); //Factory Method ����ڰ� ���� ������ �ʰ� �޼ҵ带 ���Ͽ� ����� ��
		System.out.println(myObject2);
	}

}
