package com.cocea.lesson.cons;

public class Cons {
//�����ڴ� ��ü�� �ʱ�ȭ �ϴµ� ���Ǵ� Ư���޼ҵ� �����ڴ� Ŭ������ ��ü�� �����ɶ� ȣ��˴ϴ�
	int x;
	int y;
	int q;
	int w;
	
	//�ڹ� ������
	//������ �Ű�����
	public Cons(int q) {
		x = 5;
		y = 10;
		w = q;
	}
	
	public static void main(String[] args) {
		Cons myObj = new Cons(5); //��ü����
		System.out.println(myObj.w);
	}
}