package base_1;

public class EqualsEx_1 {

public static void main(String[] args) {
Member obj1 = new Member("blue");
Member obj2 = new Member("blue");
Member obj3 = new Member("red");

//����� 1)
if(obj1.equals(obj2)) {
	System.out.println("�����մϴ�");
}else {
	System.out.println("�ٸ�");
}

System.out.println();

//����� 2)
if(obj1.equals(obj3)) {
	System.out.println("�����մϴ�");
}else {
	System.out.println("�ٸ�");
}

	}

}
/*
Object Ŭ����
- Ŭ������ �����Ҷ� extends Ű����� �ٸ� Ŭ������ ������� ������ �Ͻ������� java ObjectŬ������ ����ϰ� �˴ϴ�
�׷��� ��� Ŭ������ �ڹ��� Object�� �ڽ��̰ų� �ڼ��̴�

�׷��� ������ Object�� ���� �޼ҵ�� ��� ��ü���� ����Ҽ� �ִ�
- Object �޼ҵ� -
boolean equals(Object obj) : ��ü�� ������ ���ϰ� ���[boolean ]�� ����
public boolean equals(Object obj) �Ű����� Ÿ���� Object�̱� ������
��� ��ü�� �Ű������� ���Եɼ� �ִ�
equals() �޼ҵ�� �񱳿������� == �� ������ ����� �����Ѵ�
�ΰ�ü�� ������ ��ü��� true�� �����ϰ� �׷��� ������ false�� �����Ѵ�

Object obj1 = new Object();
Object obj2 = obj1;
boolean result = obj1.equals(obj2);
boolean result = (obj1 == obj2); ����� ����
�Ϲ�������  Object�� equals()�޼ҵ�� �������ؼ� ����񱳿����� ����Ѵ�
����񱳶� ��ü�� ��ϴ޶� ������ �����Ͱ� �������� ���Ѵ�


int hashCode() : ��ü�� �ؽ��ڵ带 ����
String toString() : ��ü ���������� ����

Object

System String Number
              Integer
              
              
              
              
*/