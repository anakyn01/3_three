package exam2024;

public class Str {
	
	static void func(String[] m, int n) {//�Լ� 
		for (int i=1; i <n; i++) {//������ 1 ������ ���̺��� ���������� �������
			if(m[i-1].equals(m[i])) {//�� ���ڿ��� �������� ���մϴ�
				System.out.print("O");//������  O�� ���
			}else {
				System.out.print("N");//�ٸ��� N�� ���
			}
/*
equals()�ż��� 
== �����ڴ� ��ü�� ������(�ּ�)�� �������� equals()�� ���ڿ��� ������ ���մϴ�
*/
		}
		for (String mo : m) {//each any �迭M�� ���ڿ��� �ϳ��� ����մϴ�
			System.out.print(mo);
		}		
	}
	

	public static void main(String[] hyi) {
		String[] m = new String[3];
		m[0] = "A";//O
		m[1] = "A";//O
		m[2] = new String("A");
		func(m, 3);

	}

}
