package intel2023;

public class Main3 {
	static int a = 0;//global a => 0
	static int func(int t) {//�Ű����� T�� �޾� a�� ���ϰ� �װ��� �����ϴ� �Լ�
		a = a + t;//a�� t�� ���� ���� �ٽ� a�� ����
		return a;//������ a�� ����
	}
	

	public static void main(String[] args) {
for(int i=0; i <5; i++) {//�ݺ������� func�� 5�� ȣ��
	func(i);//���� i���� ȣ��
}
System.out.print(a);
/*
a + 0 = a = 0 + 0 = 0
a + 1 = 0+1 = 1
a + 2 = 1+2 = 3
a + 3 = 3 + 3 = 6
a + 4 = a = 6 + 4 = 10
*/
	}

}
