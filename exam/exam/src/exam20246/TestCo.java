package exam20246;

public class TestCo {
//�ڹٿ��� ^��Ʈ XOR(��Ÿ�� ����)�����ڸ� ��Ÿ���ϴ� 
//�μ��ڿ� ��Ʈ �������� �񱳸� �����Ͽ� �κ�Ʈ�� �ٸ����� ����� 1 �������� 0�� �˴ϴ�
//���� 1 ^ 1 = 0  0 ^ 1 = 1
	public static void main(String[] args) {
int a=3, b=4, c=3, d=5;
if((a == 2 | a == c) & !(c>d) & (1==b  | a == b+c)) {
	if(7 == b ^ c != a) {
		System.out.println(a);
	}else {
		System.out.println(b);
	}
}else {
	a = c + d;
	if(7 == c ^ d != a) {
		System.out.println(a);
	}else {
		System.out.println(d);
	}
}
	}

}
