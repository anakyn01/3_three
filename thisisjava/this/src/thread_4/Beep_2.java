package thread_4;

import java.awt.*;

public class Beep_2 {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {//작업 스레드가 실행하는 코드
				Toolkit toolkit = Toolkit.getDefaultToolkit();	
				for (int i=0; i < 5; i++) {
				toolkit.beep();
				try { Thread.sleep(500);} catch (Exception e) {}
				}
			}
		});
		thread.start();//스레드 실행
		
		//메인함수가 실행하는 작업
		for(int i=0; i < 5;  i++) {
			System.out.println("띵");
			try { Thread.sleep(500);} catch (Exception e) {}
		}
	}

}
/*
스레드(음악)1(실행)(종료) 스레드(글자)(실행대기)(실행)
*/







