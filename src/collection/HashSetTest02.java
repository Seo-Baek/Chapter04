package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest02 {

	public static void main(String[] args) {
		Set<Money> s = new HashSet<>();
		
		s.add(new Money(1));
		s.add(new Money(2));
		s.add(new Money(3));
		
		Money m2 = new Money(2);
		System.out.println(m2.hashCode());	//���� ��� �ؽ��ڵ带 ������ �������񱳰� �Ǿ ���� ���� ������ �� ���´�.
		s.add(new Money(2));
		
		//collection����ϰ� ������ ���ͷ����;��̵� ��ȸ�� ������ ���� �� �ִ�.
		for(Money m : s) {
			System.out.println(m); // ������ ���� �������� ���´�.
		}
	}

}