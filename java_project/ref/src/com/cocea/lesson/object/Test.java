package com.cocea.lesson.object;

interface AniMal_3{
	public void animalSound();//�ٵ� ���� ����ü
	public void sleep();
}

//�������̽����� ��ӹ޴� Ŭ���� 
class PigImpl implements AniMal_3{
	

	public void animalSound() {
		System.out.println("������ �ܲ�");//body
	}

	public void sleep() {
		System.out.println("zzz");
	}
}

public class Test {

	public static void main(String[] args) {
		PigImpl pigImpl = new PigImpl();//��ü����
		pigImpl.animalSound();
		pigImpl.sleep();
	}

}