package thread_4;

public class Name_3 {

	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName() + " ����");
		
for (int i=0; i<3; i++) {
	Thread threadA = new Thread() {
		@Override public void run() {
			System.out.println(getName() + " ����");
			}
		};
			threadA.start();
		}
Thread chatThread = new Thread() {
	@Override
	public void run() {
		System.out.println(getName() + " ����");
	}
};
chatThread.setName("chat-thread");
chatThread.start();		
// ������� �ڽ��� �̸��� ������ �ִ�. (���ν�����)main �۾�������� �ڵ������� Thread-n�̶�� �̸��� 
// thread.setName("������ �̸�"); �������� �̸��� ����� �Ҷ� � �����尡 �۾��� �ϴ��� �����ϴ� �������� ���ȴ�
// �����ڵ带 ������尡 �����ϰ� �ִ��� Ȯ���Ϸ��� �����޼ҵ� currentThread()�� ��ü�� ������ ������
// getName()�޼ҵ�� �̸��� ����� ����
/*
Thread thread = Thread.currentThread();
System.out.println(thread.getName());
*/
	}

}
