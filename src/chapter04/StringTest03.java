package chapter04;

public class StringTest03 {
	public static void main(String[] args) {
		String s = "aBcABCabcABC";
		
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf("abc"));
		System.out.println(s.indexOf("abc", 7)); //못 찾으면 음수, 어디서부터 찾을까
		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 8));//3~8까지
		
		String s2 = "         ab cd     ";
		String s3 = "dfg,hijk,lmn,opq";
		
		String s4 = s2.concat(s3);
		System.out.println(s4);
		
		System.out.println("----" + s2.trim() + "----"); //앞뒤 공백을 없애는 것
		System.out.println("----" + s2.replaceAll(" ", "") + "----"); //중간 공백을 빼기 위해 앞의 파라미터를 뒤의 인자로 바꿔주는 메소드 사용
		
		
		String[] tokens = s3.split(","); //구분문자 기준으로 나누는 것
		for(String str : tokens) {
			System.out.println(str);
		}
		
		//StringBuffer Test
		StringBuffer sb = new StringBuffer("");
		sb.append("Hello");
		sb.append(" ");
		sb.append("World");
		sb.append(2020);
		System.out.println(sb);
		
		//String str = "Hello" + " " + "World" + 2020;
		String str = new StringBuffer("Hello").append(" ").append("World").append(2020).toString(); //append 가 리턴하는 곳은 자기자신, 마지막엔 스트링으로 형을 맞춰줌.
		System.out.println(str);
		
		//주의: + 연산자로 문자열(String)을 더할 떄
		String str2 = "";
		StringBuffer sb2 = new StringBuffer("");
		for ( int i = 0; i < 1000000; i++) {
			//str2 += i;
			//str2 = new StringBuffer(Str2),append(i);
			sb.append(i);								//이 방법이 훨씬~~~~~~ 빠름
			
		}
		
		//format
		String name = "둘리";
		int score = 100;
		
		System.out.println(name + "님의 점수는 " + score + "입니다.");
		System.out.println(String.format("%s님의 점수는 %d입니다.", name, score));
		
	}

}
