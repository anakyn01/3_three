package com.cocea.lesson.tutorial;

public class Loop {

	public static void main(String[] args) {
System.out.println("������ ������ ���ǿ� �����ϴ��� �ڵ������ �����մϴ�");

		//while
		int q = 0; //start index
		while (q < 5) {
			System.out.println(q);
			q++;//����������
			//���� ������[���� ���� �����ϰ� �۾� ����] ���������� [�۾��� ����� �Ŀ� ���� ����]
		}
		
		//Do/while
		int w = 0;
		do {
			System.out.println(w);
			w++;
		}
		while (w < 5);
		
		System.out.println("--------");	
		
		//++ --����
		int countdown = 3;
		
		while (countdown > 0) {
			System.out.println(countdown);
			countdown--;
		}
		
		//�ֻ���
		int dice = 1;//1+1=2 +1 =3
		
		while (dice <= 6) {
			if(dice < 6) {//5��
				System.out.println("No Yatzy");
			}else {//6��
				System.out.println("Yatzy");
			}
			dice = dice + 1;//��������
		}
		
		
		System.out.println("_________________________");
		
		/*for loop : �ڵ������ �� �� �ݺ����� ��Ȯ�� �˰� �ִ� ��� for���� ���
		for (statement 1; statement 2; statement 3) {}
		
		* statement 1 : �ڵ������ �����ϱ����� �ѹ� ����˴ϴ� start index
		* statement 2 : �ڵ������ �����ϱ����� ������ �����մϴ� last index
		* statement 3 : �ڵ������ ������Ŀ� �Ź� ����˴ϴ� ����� �ѵ������� ��������
		*/
		for (int e = 0; e < 5; e++) {
			System.out.println(e);
		}
		
		//¦���� ���
		for (int r = 0; r <= 10; r = r + 2) {
			System.out.println(r);
		}
		
		//���� �ȿ� ������ ��ġ ��ø����
		//Outer loop
		for (int t = 1; t <= 2; t++) {
			System.out.println("����: " + t);
			//inner loop
			for (int y =1; y <= 3; y++) {
				System.out.println(" ����: " + y);// 2 * 3
			}
		}
		
		//u�� 3�� �ݺ� ��ø���� o�� 4���ݺ�
		for (int u = 1; u <= 3; u++) {
			System.out.println("����: " + u);
			//inner loop
			for (int o =1; o <= 4; o++) {
				System.out.println(" ����: " + o);// 2 * 3
			}
		}	
		
	//for Each������ �迭(���� �ַ�ǿ� ���������͸� ��´�)�� ��Ҹ� �ݺ��ϴµ��� ���Ǵ� for-each����
	//syntax for(type variableName : arrayName) {}
	String[] cars = {"volvo","bmw","ford","mercedes"};
	for (String g: cars) {
		System.out.println(g);		
	}
	
	for (int l = 0; l <= 100; l += 10) {
		System.out.println(l);
	}

	}//print end
}//class end
/*
while (condition){
//code block
}
*/