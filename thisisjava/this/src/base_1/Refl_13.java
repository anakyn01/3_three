package base_1;

public class Refl_13 {
	
	public static void main(String[] args) throws Exception{
		Class clazz = Any.class;
		//Class clazz = Class.forname("base_1.Any");
		//Any any = new Any(); Class clazz = any.getClass();
		System.out.println("��Ű��: " + clazz.getPackage().getName());
		System.out.println("Ŭ���� ���� �̸�: " + clazz.getSimpleName());
		System.out.println("Ŭ���� ��ü �̸�: " + clazz.getName());
	}
/*
���÷���
- �ڹٴ� Ŭ������ �������̽��� ��Ÿ ������ Class��ü�� �����Ѵ�
- ���⼭ ��Ÿ����[��Ű�� ����, Ÿ������, �ɹ�(������,�ʵ�,�޼ҵ�)]�� ���Ѵ�
- �̷��� ��Ÿ������ ���α׷����� �ϰ� �����ϴ� ������ ���÷����̶�� �Ѵ�

- ���α׷����� Ŭ���� ��ü�� �������ϸ� �Ʒ��� 3���� ����߿� �ϳ��� �̿��Ѵ�
1)Class clazz = Ŭ�����̸�.class;
2)Class clazz = Class.forName("��Ű�� Ŭ�����̸�");
3)Class clazz = ��ü��������.getClass()

- ��Ű�� Ÿ���� �������
Package getPackage() : ��Ű���� ���� 
String getSimpleName() : ��Ű���� ������ Ÿ�� �̸�
String getName() : ��Ű���� ������ ��ü Ÿ���̸�
*/
}
