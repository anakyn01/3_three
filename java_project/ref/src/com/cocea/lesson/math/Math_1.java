package com.cocea.lesson.math;

public class Math_1 {

	//������ Ŭ���������� ����ϸ� �ȵȴ�
	public static void main(String[] args) {
		//�ִ밪 ���尴ü(���α׷��ֿ��� ��ġ�� import�� ���� �ʴ°�)
		System.out.println(Math.max(5, 10));
		System.out.println(Math.min(5, 10));
		//������
		System.out.println(Math.sqrt(64));
		//���밪 �� ���
		System.out.println(Math.abs(-7));
		//���� 0.0���� 1.0[last index ������]���� ������ ������ ����
		int randomNum = (int)(Math.random() * 101);//0 ~ 100
		System.out.println(randomNum);
		
		//�ø�
		System.out.println(Math.ceil(0.60)); //1.0
		System.out.println(Math.ceil(0.40)); //1.0
		
		//floor �ڸ�
		System.out.println(Math.floor(0.60));
		System.out.println(Math.floor(0.40));
		
		//floorDiv
		System.out.println(Math.floorDiv(10, 5));
		
		//floorMod
		System.out.println(Math.floorMod(-10, 4));
		
		
		
		
		
		
		
	}

}