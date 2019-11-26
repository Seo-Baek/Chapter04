package chapter04;
public class ObjectTest02 {
       public static void main(String[] args) {
              Point p1 = new Point(10, 20);
              Point p2 = new Point(10, 20);
              Point p3 = p2;
              
              // 연산자 == : 두 객체의 동일성
              System.out.println(p1 == p2);
              System.out.println(p2 == p3);
              
              // 메소드 equals : 두 객체의 동질성(내용 비교)
              // equals 의 기본(Object) 구현은 동일성 비교(==)와 같다.
              //↑ hashcode()와 equals()가 오버라이딩 되어있지 않으면 Object를 그대로 받아 ==연산과 같이 동일성비교
              System.out.println(p1.equals(p2));
              System.out.println(p2.equals(p3));	
              
              //String Test
              String s1 = new String("ABC");
              String s2 = new String("ABC");
              
              System.out.println(s1 == s2);
              System.out.println(s1.equals(s2)); //String 에는 toString() equals()  hashCode()가 다 오버라이딩 되어있을 것
              System.out.println(s1.hashCode() + ":" + s2.hashCode()); // 이것은  내용기반 해쉬!주소기반 해쉬는 다를 것이다.
              System.out.println(System.identityHashCode(s1) + ":" +  System.identityHashCode(s2)); //주소기반 해쉬, 다르쥬? 둘은 사실 다른 객체!
              
              String s3 = "ABC";
              String s4 = "ABC";
              System.out.println(s3 == s4); // 왜 동일한 객체라고 할까?
              System.out.println(s3.equals(s4));
              System.out.println(s3.hashCode() + ":" + s4.hashCode());
              System.out.println(System.identityHashCode(s3) + ":" +  System.identityHashCode(s4));//왜주소까지같을까?
              //new String으로 바꾸긴하는데, 안 바꿀 때도 있음
              //String Constant(상수) Pool(저장장소,수영장같이) (안변하는 스트링들만  저장하는 곳)
              //String Pool에는 reference hashcode 두개가 있음
              //new를 하면 힙에 "ABC"를 바로 만든다.
              //같은 값을 처음 String Literal(new없이 만드는거)를 하면 new를 할지말지  고민한다.
              //메소드 에어리어에 값이 없으면 new를 한다.
              //32번라인에 다시 리터럴을 하니 Method Area에 값이 있어서 그냥 있는 걸로  쓴다. new는 이런 과정없이 무조건 만드는 것이다.
              
       }
}