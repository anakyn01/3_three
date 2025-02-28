package thread_4;

public class Calculator {
	
	private int memory;

	public int getMemory() {
		return memory;
	}
public synchronized void setMemory1(int memory) {//��ü�� ����ȭ ��� ����ȭ �޼ҵ�
this.memory = memory;//�޸𸮰� ����
try {
	Thread.sleep(2000); //2�ʰ� �Ͻ�����
}catch(InterruptedException e) {}
System.out.println(Thread.currentThread().getName() + ":" + this.memory);		
	}
	
//�ϳ��� �����常 ���� ������ �޼ҵ尡 �ȴ�

public void setMemory2(int memory) {//����ȭ ����� �����ϴ� �޼ҵ�
	synchronized(this) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {}
	}
	System.out.println(Thread.currentThread().getName() + ":" + this.memory);
}
	
	

}
