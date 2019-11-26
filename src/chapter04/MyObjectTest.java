package chapter04;

public class MyObjectTest {
	public static void main(String[] args) {
		//MyObject myObject = new MyObject();
		MyObject myObject2 = MyObject.getInstance(); //Factory Method 사용자가 직접 만들지 않고 메소드를 통하여 만드는 것
		System.out.println(myObject2);
	}

}
