package thread_4;

public class Calculator {
	
	private int memory;

	public int getMemory() {
		return memory;
	}
public synchronized void setMemory1(int memory) {//전체가 동기화 블록 동기화 메소드
this.memory = memory;//메모리값 저장
try {
	Thread.sleep(2000); //2초간 일시정지
}catch(InterruptedException e) {}
System.out.println(Thread.currentThread().getName() + ":" + this.memory);		
	}
	
//하나의 스레드만 실행 가능한 메소드가 된다

public void setMemory2(int memory) {//동기화 블록을 포함하는 메소드
	synchronized(this) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {}
	}
	System.out.println(Thread.currentThread().getName() + ":" + this.memory);
}
	
	

}
