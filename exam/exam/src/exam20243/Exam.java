package exam20243;

public class Exam {

	public static void main(String[] args) {

		int a = 0;//�ʱ�ȭ 
		for (int i=1; i <999; i++) {//1���� 998���� �ݺ�
			if(i%3==0 && i%2 !=0)//i�� 3�� ����̸鼭 Ȧ������ Ȯ��
				a=i;//������ �����ϴ� 1���� ���� a�� ����
		}
        System.out.print(a);
	}

}
