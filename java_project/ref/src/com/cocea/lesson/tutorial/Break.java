package com.cocea.lesson.tutorial;

public class Break {

	public static void main(String[] args) {
		// loop���� break ����
		for (int q = 0; q < 10; q++) {
			if (q == 4) {
				break;//4���� ����
			}
			System.out.println(q);//0123
		}
	
		//continue �ǳʶٰ�
		for (int w = 0; w < 10; w++) {
			if (w == 4) {
				continue;//4�� �ǳ�..
			}
			System.out.println(w);//0123 56789
		}
	
	
	}

}