package thread_4;

public class Demon_7 {

	public static void main(String[] args) {
AutoSaveThread autoSaveThread = new AutoSaveThread();
autoSaveThread.setDaemon(true);//데몬 스레드
autoSaveThread.start();
//
try {
	Thread.sleep(3000);
}catch (InterruptedException e) {	
}
System.out.println("메인 스레드 종료");
	}

}
/*
데몬(daemon)스레드 
- 스레드의 작업을 돕는 보조적인 역활을 수행하는 스레드이다
- 주 스레드가 종료되면 데몬 스레드도 자동으로 종료된다
- 데몬 스레드 적용한 예
워드프로세서의 자동저장, 미디어플레이어 의 동영상 및 음악재생, 가비지 컬렉터 
스레드를 데몬으로 만들기 위해서는 주스레드가 메몬이 될 스레드의 setDaemon(true)를 호출한다
*/
