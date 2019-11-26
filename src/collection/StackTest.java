package collection;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		
		s.push("둘리");
		s.push("마이콜");
		s.push("도우너");
		
		while(!s.isEmpty()) {
			String str = s.pop();
			System.out.println(str);
		}
		
		//s.pop(); //스택은 비어있는 경우 팝을 하면 스택익셉션이 발생한다.

		s.push("둘리");
		s.push("마이콜");
		s.push("도우너");
		
		System.out.println(s.pop());
		System.out.println(s.peek());  // 꺼내지 않고 맨 위의 객체만 참조하는 함수
		System.out.println(s.pop());
	}

}
