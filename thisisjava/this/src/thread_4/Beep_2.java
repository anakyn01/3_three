package thread_4;

import java.awt.*;

public class Beep_2 {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {//�۾� �����尡 �����ϴ� �ڵ�
				Toolkit toolkit = Toolkit.getDefaultToolkit();	
				for (int i=0; i < 5; i++) {
				toolkit.beep();
				try { Thread.sleep(500);} catch (Exception e) {}
				}
			}
		});
		thread.start();//������ ����
		
		//�����Լ��� �����ϴ� �۾�
		for(int i=0; i < 5;  i++) {
			System.out.println("��");
			try { Thread.sleep(500);} catch (Exception e) {}
		}
	}

}
/*
������(����)1(����)(����) ������(����)(������)(����)
*/







