package base_1;

public class Keyboard_7 {

	public static void main(String[] args) throws Exception{
//�ʱ�ȭ
		int speed = 0; int keyCode = 0;

while(true) {//react���� ��۱��
	
	//Enter Ű�� ���� �ʾ������� ����
	if(keyCode != 13 && keyCode != 10) {
		
		if(keyCode == 49) {//���� 1�� �о��� ���
			speed++;			
		} else if (keyCode == 50) {//���� 2
			speed--;
		} else if (keyCode == 51) {//���� 3 ��������
			break;
		}
		System.out.println("--------------------------");
		System.out.println("1.���� | 2.���� | 3.����");
		System.out.println("--------------------------");
		System.out.println("���� �ӵ� = " + speed);
	}
	//Ű�� �ϳ��� ����
	keyCode = System.in.read();
}
System.out.println("���α׷� ����");
	}

}
//Ű����� ���� �Էµ� Ű�� �б� ���ؼ� SystemŬ�������� in �ʵ带 �����Ѵ� in�ʵ带 �̿��ؼ� read()�޼ҵ带 ȣ���ϸ� �Էµ� Ű�� �ڵ尪�� ������ �մ�
//int KeyCode = System.in.read();
//Exception : ���� ����ó��(try catch[java.lang.Exception] 
//���� ������(throw[�����ڰ� �ǵ������� ���ܸ� �߻�], throws Exception[�ڽ��� ȣ���ϴ� �޼ҵ忡 ����ó���� ���� å���� ���ѱ�]