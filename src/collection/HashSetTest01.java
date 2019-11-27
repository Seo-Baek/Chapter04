package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest01 {

	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		
		String s1 = new String("��浿");
		String s2 = new String("��浿");
		
		s.add("�Ѹ�");
		s.add("������");
		s.add(s1); 		//������ �׽�Ʈ�� ���ؼ�!, ��Ʈ�� Ŭ������ �������ϱ�
		
		System.out.println(s.contains(s2)); 	//�������׽�Ʈ
		System.out.println(s.size());			//set�� ������ ��� ��ȸ�� �����ϳ� �����°� �ȵ�
		
		String s3 = new String("��浿");
		s.remove(s3);
		System.out.println(s.size());
		
		//��ȸ
		Iterator<String> it = s.iterator();	//�ٸ� �������� ������ ������ ���� �ʴ´� �������׽�Ʈ!
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		
	}

}
