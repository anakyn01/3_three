package base_1;

import java.util.HashSet;

public class HashCodeEx_2 {

	public static void main(String[] args) {
		
		
HashSet hashSet = new HashSet(); //��ü� �÷��� ����
Student s4 = new Student(3, "ȫ�浿");
hashSet.add(s4);
System.out.println("����� ��ü�� : " + hashSet.size());


Student s5 = new Student(3, "ȫ�浿");
hashSet.add(s5);
System.out.println("����� ��ü�� : " + hashSet.size());

Student s6 = new Student(4, "ȫ�浿");
hashSet.add(s6);
System.out.println("����� ��ü�� : " + hashSet.size());
//�ߺ���ü�� �������� ����		
		
		
		
Student s1 = new Student(1, "ȫ�浿");
Student s2 = new Student(1, "ȫ�浿");
Student s3 = new Student(2, "���ڱ�");
//�ؽ��ڵ尡 �������� �˻�
if(s1.hashCode() == s2.hashCode()) {//�ؽ��ڵ尡 �������� �˻�
	if(s1.equals(s2)) {
		System.out.println("���� ��ü�Դϴ�");
	}else {
		System.out.println("�����Ͱ� �ٸ��Ƿ� ���� ��ü�� �ƴմϴ�");
		
	}
	
}else {
	System.out.println("�ؽ��ڵ尡 �ٸ��Ƿ� ���� ��ü�� �ƴմϴ�");
	//������  no + name�� ������ 
}

	}

}
