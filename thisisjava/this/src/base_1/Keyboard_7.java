package base_1;

public class Keyboard_7 {

	public static void main(String[] args) throws Exception{
//초기화
		int speed = 0; int keyCode = 0;

while(true) {//react에서 토글기능
	
	//Enter 키를 읽지 않앗을때만 실행
	if(keyCode != 13 && keyCode != 10) {
		
		if(keyCode == 49) {//숫자 1을 읽었을 경우
			speed++;			
		} else if (keyCode == 50) {//숫자 2
			speed--;
		} else if (keyCode == 51) {//숫자 3 빠져나옴
			break;
		}
		System.out.println("--------------------------");
		System.out.println("1.증속 | 2.감속 | 3.중지");
		System.out.println("--------------------------");
		System.out.println("현재 속도 = " + speed);
	}
	//키를 하나씩 읽음
	keyCode = System.in.read();
}
System.out.println("프로그램 종료");
	}

}
//키보드로 부터 입력된 키를 읽기 위해서 System클래스에서 in 필드를 제공한다 in필드를 이용해서 read()메소드를 호출하면 입력된 키의 코드값을 얻을수 잇다
//int KeyCode = System.in.read();
//Exception : 예외 예외처리(try catch[java.lang.Exception] 
//예외 던지기(throw[개발자가 의도적으로 예외를 발생], throws Exception[자신을 호출하는 메소드에 예외처리에 대한 책임을 떠넘김]