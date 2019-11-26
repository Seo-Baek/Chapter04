package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		
		v.addElement("둘리");
		v.addElement("마이콜");
		v.addElement("도우너");
		//v.add("");
		//v.addElement(obj);    add는 1.4거 element는 1.0거로 둘 중에 하나만 써라!
		
		//순회1 메소드 방법
		int count = v.size();
		for(int i = 0; i < count; i++) {
			String s = v.elementAt(i);
			System.out.println(s);
		}
		
		v.removeElementAt(1);  //하나가ㅑ 빠짐
		
		
		//순회2 객체생성방법 시작점을 모르니 끝까지 가면 버려야한다.
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()) {
			String s = e.nextElement();
			System.out.println(s);
		}
	}

}
