package thread_4;

public class Sync_6 {

	public static void main(String[] args) {
Calculator calculator = new Calculator();

User1Thread user1Thread = new User1Thread();
user1Thread.setCaculator(calculator);
user1Thread.start();
//User1Thread Calculator동기화 메소드인 setMemory1()을 실행하는 순간 Calculator객체를 잠근다

//2초 일시정지후에 잠금이 해제되면 비로소 User2Thread 동기화 블록을 실행한다
User2Thread user2Thread = new User2Thread();
user2Thread.setCaculator(calculator);
user2Thread.start();

	}

}
/*
 * 
public synchonized void method(){
}
동기화 메소드를 실행하는 즉시 객체는 잠금이 일어나고 
메소드 실행이 끝나면 잠금이 풀린다
메소드 전체가 아닌 일부 영역을 실행할때만 객체 잠금을 걸고 싶으면 
 
메서드 (){
synchronized(공유객체){
}
}


스레드 동기화(공유)
스레드는 하나의 객체를 공유해서 작업한다
다른 스레드에 의해서 객체 내부 데이터가 변경될수 있다
계산 객체 
처음에 100을 먼저저장하고 2초간 일시정지 상태를 가진다
그동안에 다른스레드가 필드값을 50으로 변경한다
2초가 지나거 memory필드의 값을 출력하면 저장한 50이 나온다
그런데 이렇게 하면 저장된 데이터가 날아가버린다
스레드는 사용중인 객체를 다른 스레드가 변경할수 없도록 스레드 작업이 끝날때 까지
객체에 잠금을 걸어준다
이를 위해서 동기화(synchronized) 메소드와 블록을 제공한다

객체 내부에 동기화 메소드와 동기화 블록이 여러개가 있다면 스레드가 이들중에 하나를 
실행할때 다른 스레드는 해당메소드는 물론이고 동기화 메소드 및 블록도 실행할수 없다
일반 매소드는 가능합니다
*/
