package thread_4;

public class Demon_7 {

	public static void main(String[] args) {
AutoSaveThread autoSaveThread = new AutoSaveThread();
autoSaveThread.setDaemon(true);//���� ������
autoSaveThread.start();
//
try {
	Thread.sleep(3000);
}catch (InterruptedException e) {	
}
System.out.println("���� ������ ����");
	}

}
/*
����(daemon)������ 
- �������� �۾��� ���� �������� ��Ȱ�� �����ϴ� �������̴�
- �� �����尡 ����Ǹ� ���� �����嵵 �ڵ����� ����ȴ�
- ���� ������ ������ ��
�������μ����� �ڵ�����, �̵���÷��̾� �� ������ �� �������, ������ �÷��� 
�����带 �������� ����� ���ؼ��� �ֽ����尡 �޸��� �� �������� setDaemon(true)�� ȣ���Ѵ�
*/
