package com.cocea.lesson.object;

public class Method_2 {
	
	//�Լ� javascript function, = () => 
	static void myMethod() {
		System.out.println("�Լ��� ȣ���Ҷ��� ����Ǵ� �ڵ����");
	}
	//static
	static void myStaticMethod() {
		System.out.println("��ü�� �������� ����");
	}
	//public 
	public void myPublicMethod() {
		System.out.println("��ü�� ������");
	}
	
	public static void main(String[] args) {
		myMethod();//�Լ� ȣ���� �����Ʈ���� �Ѵ�
		
		System.out.println("-------------------------------");
		myStaticMethod();
		
		Method_2 newObj = new Method_2();//1)��ü ����
		newObj.myPublicMethod();//2)Ŀ�ǵ忡.�ż�������� ȣ��
	}

}
/*
�Լ��� �����θ� ȣ���ϴ� ����Լ��� �����ϰ� 
ȣ���Ҷ��� ����Ǵ� �ڵ����
- �ڹٿ����� static[��ü�� �������� �ʰ� ���]�� 
public[��ü�� �����ؾ����� ]���� �����Ҽ� �ִ�


*/










