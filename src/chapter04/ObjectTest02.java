package chapter04;
public class ObjectTest02 {
       public static void main(String[] args) {
              Point p1 = new Point(10, 20);
              Point p2 = new Point(10, 20);
              Point p3 = p2;
              
              // ������ == : �� ��ü�� ���ϼ�
              System.out.println(p1 == p2);
              System.out.println(p2 == p3);
              
              // �޼ҵ� equals : �� ��ü�� ������(���� ��)
              // equals �� �⺻(Object) ������ ���ϼ� ��(==)�� ����.
              //�� hashcode()�� equals()�� �������̵� �Ǿ����� ������ Object�� �״�� �޾� ==����� ���� ���ϼ���
              System.out.println(p1.equals(p2));
              System.out.println(p2.equals(p3));	
              
              //String Test
              String s1 = new String("ABC");
              String s2 = new String("ABC");
              
              System.out.println(s1 == s2);
              System.out.println(s1.equals(s2)); //String ���� toString() equals()  hashCode()�� �� �������̵� �Ǿ����� ��
              System.out.println(s1.hashCode() + ":" + s2.hashCode()); // �̰���  ������ �ؽ�!�ּұ�� �ؽ��� �ٸ� ���̴�.
              System.out.println(System.identityHashCode(s1) + ":" +  System.identityHashCode(s2)); //�ּұ�� �ؽ�, �ٸ���? ���� ��� �ٸ� ��ü!
              
              String s3 = "ABC";
              String s4 = "ABC";
              System.out.println(s3 == s4); // �� ������ ��ü��� �ұ�?
              System.out.println(s3.equals(s4));
              System.out.println(s3.hashCode() + ":" + s4.hashCode());
              System.out.println(System.identityHashCode(s3) + ":" +  System.identityHashCode(s4));//���ּұ���������?
              //new String���� �ٲٱ��ϴµ�, �� �ٲ� ���� ����
              //String Constant(���) Pool(�������,�����尰��) (�Ⱥ��ϴ� ��Ʈ���鸸  �����ϴ� ��)
              //String Pool���� reference hashcode �ΰ��� ����
              //new�� �ϸ� ���� "ABC"�� �ٷ� �����.
              //���� ���� ó�� String Literal(new���� ����°�)�� �ϸ� new�� ��������  ����Ѵ�.
              //�޼ҵ� ���� ���� ������ new�� �Ѵ�.
              //32�����ο� �ٽ� ���ͷ��� �ϴ� Method Area�� ���� �־ �׳� �ִ� �ɷ�  ����. new�� �̷� �������� ������ ����� ���̴�.
              
       }
}