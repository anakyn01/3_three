package exam2024;

public class Main {

	public static void main(String[] args) {
		int sum = 0;//���� �ʱⰪ�� 0
		try {
			func();//�Լ��� ����
		}catch(NullPointerException e) {
			sum = sum + 1; //0+1 = 1
		}catch(Exception e) {
			sum = sum + 10;
		}finally {//����� ������� ����޴� 
			sum = sum  + 100;
		}
		System.out.print(sum);

	}
	
	static void func() throws Exception{//throw Ű����� ���ܸ� ��������� �߻���Ű�� ���� ���˴ϴ�
		//�������� �ǵ������� ���ܸ� ������ ����մϴ�
		throw new NullPointerException();
	}
	//���� ���������� NullPointerException()�� �߻���Ų��
	//���ܸ� �߻����Ѽ� func()�ż��带 ���������� try��ϵ� ����ϴ�
	//���ܰ� �߻��߱⶧���� ù��° catch ����� ����˴ϴ�
	
	/*
	MVP ����Ʈ
	1) �Լ��� ������Ʈ�ͼ����� ������ ������ ������ ù��° ĳġ����� ����˴ϴ�
	2) finally ����� ���� ���ο� ������� �ݵ�� ����ȴ�
	3) ���������� 1 + 100 = 101�� �Ǿ� ȭ�鿡 101�� ��µ˴ϴ�
	*/
	
	
	

}
