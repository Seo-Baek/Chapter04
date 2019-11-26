package collection;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		
		s.push("�Ѹ�");
		s.push("������");
		s.push("�����");
		
		while(!s.isEmpty()) {
			String str = s.pop();
			System.out.println(str);
		}
		
		//s.pop(); //������ ����ִ� ��� ���� �ϸ� �����ͼ����� �߻��Ѵ�.

		s.push("�Ѹ�");
		s.push("������");
		s.push("�����");
		
		System.out.println(s.pop());
		System.out.println(s.peek());  // ������ �ʰ� �� ���� ��ü�� �����ϴ� �Լ�
		System.out.println(s.pop());
	}

}
