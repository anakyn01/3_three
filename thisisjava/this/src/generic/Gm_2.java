package generic;

public class Gm_2 {
	//���ѵ� Ÿ�� �Ķ����
	public static <Q extends Number> boolean compare(Q q1, Q q2) {
		
		//Number�� �޼ҵ� ���
		double g1 = q1.doubleValue();
		double g2 = q2.doubleValue();
		
		//
		return (g1 == g2);
	}
	
	
	//���׸� �޼ҵ� <T> �������� Ÿ�������� ����ϱ� ���Ͽ� 
	public static <T> Cap<T> capsule(T t){//Ÿ�� �Ķ���� ����
		Cap<T> cap = new Cap<T>();
		cap.setT(t);
		return cap;
	}

	public static void main(String[] args) {
	//���ѵ� �Ķ����
	boolean result1 = compare(10, 20);//Q�� integer��
	System.out.println(result1);
	System.out.println();
		
	boolean result2 = compare(4.5, 4.5);//Q�� Double��
	System.out.println(result2);
	System.out.println();	
		
	//����Ŭ����
Integer myInt = 5; Double myDouble = 5.99; Character myChar = 'A';
System.out.println(myInt.intValue());	
System.out.println(myDouble.doubleValue());
System.out.println(myChar.charValue());
Integer onehund = 100;
String mytrans = onehund.toString();
System.out.println(mytrans.length());
		
		
	//���׸� �޼ҵ� ȣ��
	Cap<Integer> cap1 = capsule(100);//T�� Integer�� ��ü	
	//������ ����
	int intValue = cap1.getT();
	//���
	System.out.println(intValue);
	
	//���׸� �޼ҵ� ȣ��
	Cap<String> cap2 = capsule("anaaa");//T�� String���� ��ü	
	String strValue = cap2.getT();
	System.out.println(strValue);
	
		

String limit = "���ѵ� Ÿ�� �Ķ����"
+ "��쿡 ���󼭴� Ÿ�� �Ķ���͸� ��ü�ϴ� ��ü���� Ÿ���� ������ �ʿ䰡 �ִ�"
+ "���� ��� ���ڸ� �����ϴ� ���׸� �޼ҵ�� ��ü Ÿ������ Number�Ǵ� �ڽ� Ŭ����"
+ "(Byte, Short, Integer, Long, Double)�� ������ �ʿ䰡 �ִ�"
+ "��ó�� ��� Ÿ������ ��ü�Ҽ� ���� Ư��Ÿ�԰� �ڽ� �Ǵ� �������迡 �ִ� Ÿ�Ը� ��ü�Ҽ� �ִ� "
+ "Ÿ�� �Ķ���͸� ���ѵ� Ÿ��(bounded type parameter) �Ķ���� �� �Ѵ�"
+ "syntax �� "
+ "public <T extends ����Ÿ��> ����Ÿ�� �޼ҵ� (�Ű�����, ....){...}"
+ "public <T extends Number> boolean compare(T t1, T t2){"
+ "double v1 = t1.doubleValue()"
+ "double v2 = t2.doubleValue()"
+ "return (v1 == v2)"
+ "}";	

String data = "���̻� �ܼ�ȭ �ɼ� ���� ���� ���ð� �̶� �Ѵ�"
+ "�ڹ�, �ڹٽ�ũ��Ʈ, ���̼�, C, C++, C#, react, vue�� ���ð��� ������ ������ ��ü"
+ "�ڹٿ��� ���� Ŭ������ �⺻ ������ ������ ��ü�� ����Ѵ�"
+ "byte => Byte, short => Short, int => Integer, char => Character"
+ "���� ��� Collection ��ü�� ����Ҷ� ArrayList�� �⺻������ ����Ҽ� ���� ���"
+ "(����� ��ü���� �����Ҽ� �ֽ��ϴ�) �׷��� ����Ŭ������ ����մϴ�"
+ "�߸��� �� ArrayList<int> Num = new ArrayList<>();"
+ "OK ArrayList<Integer> Num = new ArrayList<Integer>();"
+ "��ü�� �ٷ�� �Ǿ����Ƿ� Ư�� ��ü�� ���� ������ ������ �ִ�"
+ "��ȯ�� �Ҽ� �ִ�";


String txt = "���׸� �޼ҵ�� Ÿ�� �Ķ���͸� ������ �ִ� �޼ҵ带 ���Ѵ�\n"
+ "Ÿ�� �Ķ���Ͱ� �żҵ� ����ο� ���ǵȴٴ� ������ ���׸� Ÿ�԰� ���̰� �ִ�\n"
+ "���׸� �޼ҵ�� ����Ÿ�� �տ� <>��ȣ�� �߰��ϰ� Ÿ�� �Ķ���͸� �����ѵ�\n "
+ "���� Ÿ�԰� �������� Ÿ�Կ��� ����Ѵ�\n"
+ "public <A, B, ...> ����Ÿ�� �޼ҵ�� (�Ű�����,...){...}\n"
+ "������� �ڽ� Ŭ������ ������\n "
+ "public <T> Box<T> boxing(T t){....}\n"
+ "�޼ҵ�� Ÿ�� �Ķ���� <T>�� �����ϰ� �Ű����� Ÿ�԰� ���� Ÿ�Կ��� T�� ����Ѵ�\n"
+ "Box<Integer> box1 = boxing(100);\n"
+ "BOx<String> box2 = boxing('�ȳ��ϼ���')\\n";
System.out.println(txt);

String wild = "���ϵ�ī�� Ÿ�� �Ķ����"
+ "�Ű����̳� ���� Ÿ���� ����Ҷ� Ÿ�� �Ķ���ͷ� (���ϵ� ī��)�� ����Ҽ� �ִ�"
+ "? (������ �ִ� ��� Ÿ���� ��ü�Ҽ� �ִٴ� ǥ���̴�)"
+ "���� ��� ����Ŭ������ person�̰� ������ worker student[extends Student]"
+ "����Ÿ�� �޼ҵ��(���׸� Ÿ�� <? extends Student> ����) {...}"
+ "�θ� Ŭ������ person�� �����ϵ��� �Ҽ� �ֽ��ϴ�"
+ "����Ÿ�� �޼ҵ��(���׸� Ÿ�� <? super Worker> ����) {...}"
+ "� Ÿ���̵� �����ϵ��� �Ű������� �����Ҽ��� �ִ�"
+ "����Ÿ�� �޼ҵ��(���׸� Ÿ�� <?> ����) {...}";

	}

}
