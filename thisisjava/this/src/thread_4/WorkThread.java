package thread_4;

public class WorkThread extends Thread{
	
	//�ʵ�
	public boolean work = true;
	
	//������
	public WorkThread(String name) {
		setName(name);
	}
	
	//�޼ҵ�
	@Override
	public void run() {
		while(true) {
			if(work) {
				System.out.println(getName() + ": �۾�ó��");
			}else {
				Thread.yield();//�纸�޼ҵ带 ���
			}
		}
	}

}
