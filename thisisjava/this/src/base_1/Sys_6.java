package base_1;

public class Sys_6 {

	public static void main(String[] args) {
	try {
int value = Integer.parseInt("1oo");//파싱 숫자를 웹사이트url에 숫자로 표기하는것이 아니라 문자열
	//}catch(NumberFormatException e) {
	}catch(Exception e) {
		/*System.err.println("[에러 내용]");
		System.err.println(e.getMessage());*/
		e.printStackTrace();
	}
	}
}
/*
필드
out : 콘솔에 문자 출력
err : 콘솔에 에러 출력
in : 키보드 입력

메소드
exit() : 프로세스 종료
currentTimeMillis() : 현재 시간을 밀리초 단위의 long값으로 리턴
nanoTime() : 현재 시간을 나노초 단위의 long값으로 리턴
getProperty() : 운영체제와 사용자 정보제공
getenv() : 운영체제의 환경변수 제공

JVM : 자바프로그램은 운영체제상에서 바로 실행되는것이 아니라 자바가상머신
그래서 운영체제에 모든 기능을 자바 코드로 직접 접근하기는 힘들다
java.lang 패키지에 속하는 System클래스를 사용한다
 System클래스
 - 프로그램 종료
 - 키보드 입력
 - 콘솔(모니터)출력
 - 현재 시간 읽기
 - 시스템 프로퍼티 읽기
*/
