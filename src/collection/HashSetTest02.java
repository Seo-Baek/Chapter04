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
		System.out.println(m2.hashCode());	//내용 기반 해쉬코드를 넣으면 동질성비교가 되어서 같은 값의 변수는 안 나온다.
		s.add(new Money(2));
		
		//collection상속하고 있으면 이터레이터없이도 순회할 범위를 구할 수 있다.
		for(Money m : s) {
			System.out.println(m); // 순서가 없어 랜덤으로 나온다.
		}
	}

}
