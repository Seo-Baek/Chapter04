package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		
		v.addElement("�Ѹ�");
		v.addElement("������");
		v.addElement("�����");
		//v.add("");
		//v.addElement(obj);    add�� 1.4�� element�� 1.0�ŷ� �� �߿� �ϳ��� ���!
		
		//��ȸ1 �޼ҵ� ���
		int count = v.size();
		for(int i = 0; i < count; i++) {
			String s = v.elementAt(i);
			System.out.println(s);
		}
		
		v.removeElementAt(1);  //�ϳ����� ����
		
		
		//��ȸ2 ��ü������� �������� �𸣴� ������ ���� �������Ѵ�.
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()) {
			String s = e.nextElement();
			System.out.println(s);
		}
	}

}
