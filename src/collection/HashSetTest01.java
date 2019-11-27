package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest01 {

	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		
		String s1 = new String("고길동");
		String s2 = new String("고길동");
		
		s.add("둘리");
		s.add("마이콜");
		s.add(s1); 		//동질성 테스트를 위해서!, 스트링 클래스에 들어가있으니까
		
		System.out.println(s.contains(s2)); 	//동질성테스트
		System.out.println(s.size());			//set은 순서가 없어서 순회는 가능하나 값빼는게 안됨
		
		String s3 = new String("고길동");
		s.remove(s3);
		System.out.println(s.size());
		
		//순회
		Iterator<String> it = s.iterator();	//다른 변수더라도 내용이 같으면 넣지 않는다 동질성테스트!
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		
	}

}
