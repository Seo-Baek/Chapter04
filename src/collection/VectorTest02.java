package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VectorTest02 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("둘리");
		list.add("마이콜");
		list.add("도우너");
		
		
		//순회1
		int count = list.size();
		for(int i = 0; i < count; i++) {
			String s = list.get(i);
			System.out.println(s);
		}
		
		list.remove(1);
		
		//순회2
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
		//순회3
		for(String s : list) {		//이터레이터를 구현하고 있는 객체는 가늫하다
			System.out.println(s);
		}
		
	}

}
