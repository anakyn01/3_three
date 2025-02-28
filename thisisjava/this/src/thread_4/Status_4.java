package thread_4;

public class Status_4 {

	public static void main(String[] args) {//2)대기하고 있던 메인스레드가 출력
//다른 스레드에게 실행을 양보 스레드가 처리하는 작업중에 반복적인 실행 for, while문을 포함하는 경우가 많은데
//가끔 반복문이 무의미한 반복을 하는 경우가 있다 
/*
public void run(){
	while(true)
		if(work){
		System.out.println("작업 내용");
		}
	}
}
거짓을 경우 어떠한 실행문도실행하지 않고 무의미한 반복을 한다
이때는 다른 스레드에게 실행을 양보하고 자신을 실행대기 상태로 가는것이 프로그램에 성능에 도움이 된다

function exam (student){//문제 푸세요
   개념정리가 안된것 같아요 열심히 학습하세요 
   function student (sam){
   sam = 모르겠어요
      function student (sam){
	   sam = 모르겠어요  
		   function student (sam){
		   sam = 모르겠어요  
		   }
	   }
   }
}
*/
		
		
		
// 다른 스레드의 종료를 기다림(계산 스레드의 작업이 종료된후에 그 결과값을 받아 처리하는 경우)
			SumThread sumThread = new SumThread();
			sumThread.start();
			try {
				sumThread.join();
			}catch (InterruptedException e) {	
			}
			System.out.println(" 합: " + sumThread.getSum());//1)더하는 값이 첫번째 종료시켜
			
			
	}

}
/*
new => 스레드 객체 생성
RUNNABLE => 호출하면 곧바로 실행되는 것이 아니라 실행대기 상태를
CPU 스케쥴링에 따라 실행 상태로 넘어간다
run() => 실행
일시정지 
보냄
- sleep() : 주어진 시간동안 스레드를 일시정지 시간이 지나면 자동으로 실행대기
- join() : 일시정지 상태가 된다 실행대기 상태가 되려면 join()메소드를 가진 스레드가 종료되어야 한다
- wait() : 동기화 블록 내에서 스레드를 일시 정지 상태로 만든다 연산 for 1000 1000

벗어남
- interrupt() : 일시 정지 상태일 경우에 InterruptedException을 발생시켜 
실행 대기 상태 또는 종료 상태로 만든다
- notify() : 대기 중인 하나의 스레드만을 깨운다
- notifyAll() : 대기 중인 모든 스레드를 깨운다
(대기 중인 모든 스레드가 실행될기회를 가지므로 더 안전하고 예측가능하다)

실행 대기(양보) : 실행 상태에서 다른 스레드에게 실행을 양보하고 실행대기 상태가 된다

Terminated => 실행할 코드가 없으면 종료
*/
