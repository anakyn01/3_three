package intel;

public class Test3 {
//�μ� a��b�� �ִ������� ���ϴ°�
	public static void main(String[] args) {
int a=26, b=91, g=0;
int c = a < b ? a:b;//a�� b�� ���������� �ʱ�ȭ
for (int i=1; i <c; i++) {//i�� 1���� 25���� �ݺ��մϴ�
	if(a%i==0 && b%i==0)
		g=i;
}
System.out.println(g);
//1,13�ε� �μ��� ������߿� ���� ū���� ��µ˴ϴ�
	}

}
