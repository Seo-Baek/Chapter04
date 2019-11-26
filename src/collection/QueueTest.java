package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		
		
		q.offer("�Ѹ�");
		q.offer("������");
		q.offer("�����");
		
		while(!q.isEmpty()) {
			String s = q.poll();
			System.out.println(s);
		}
		
		//Queue�� ����ִ� ��� null�� �����Ѵ�.
		System.out.println(q.poll());
		
		q.offer("�Ѹ�");
		q.offer("������");
		q.offer("�����");
		
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.poll());
	}

}
