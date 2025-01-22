package thread_4;

public class Name_3 {

	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName() + " 실행");
		
for (int i=0; i<3; i++) {
	Thread threadA = new Thread() {
		@Override public void run() {
			System.out.println(getName() + " 실행");
			}
		};
			threadA.start();
		}
Thread chatThread = new Thread() {
	@Override
	public void run() {
		System.out.println(getName() + " 실행");
	}
};
chatThread.setName("chat-thread");
chatThread.start();		
// 스레드는 자신의 이름을 가지고 있다. (메인스레드)main 작업스레드는 자동적으로 Thread-n이라는 이름을 
// thread.setName("스레드 이름"); 스레드의 이름은 디버깅 할때 어떤 스레드가 작업을 하는지 조사하는 목적으로 사용된다
// 현재코드를 어떤스레드가 실해하고 있는지 확인하려면 정적메소드 currentThread()로 객체의 참조를 얻은후
// getName()메소드로 이름을 출력해 본다
/*
Thread thread = Thread.currentThread();
System.out.println(thread.getName());
*/
	}

}
