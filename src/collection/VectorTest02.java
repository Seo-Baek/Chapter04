package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VectorTest02 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("�Ѹ�");
		list.add("������");
		list.add("�����");
		
		
		//��ȸ1
		int count = list.size();
		for(int i = 0; i < count; i++) {
			String s = list.get(i);
			System.out.println(s);
		}
		
		list.remove(1);
		
		//��ȸ2
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
		//��ȸ3
		for(String s : list) {		//���ͷ����͸� �����ϰ� �ִ� ��ü�� ���q�ϴ�
			System.out.println(s);
		}
		
	}

}
