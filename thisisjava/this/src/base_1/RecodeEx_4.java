package base_1;

public class RecodeEx_4 {

	public static void main(String[] args) {
		
		Person p = new Person("winter", "snow", 100);
		
		//getter �޼ҵ� ȣ��
System.out.println(p.id());	
System.out.println(p.toString());

Person p1 = new Person("winter", "snow", 100);
Person p2 = new Person("winter", "snow", 100);

System.out.println("p1 : " + p1.hashCode());
System.out.println("p2 : " + p2.hashCode());
System.out.println(" ���� ���ƿ�? " + p1.equals(p2));

// ������ ������ ���� DTO�� �ۼ��Ҷ� �ݺ������� ���Ǵ� �ڵ带 ���̱� ���� java14���� recode�� ���ԵǾ����ϴ�
//public record Person(String name, int age){}
//�ҽ��� ������ �Ҷ� private final�ʵ尡 �ڵ������ǰ� ������ / Getter�޼ҵ尡 �ڵ��߰��ȴ�
//�׸��� hashCode(), equals(), toString() �޼ҵ带 �������� �ڵ�� �ڵ��߰� �ȴ�
	}

}
