package base_1;

public class ToStringEx_3 {

	public static void main(String[] args) {
	
    //객체에 데이터 insert
	SmartPhone mySamsung = new SmartPhone("삼성전자", "안드로이드");	
	SmartPhone myApple = new SmartPhone("애플", "ios");	
	
	//다른변수에 객체를 대입하여 toString
	String strObj = myApple.toString();
	System.out.println(strObj);
	
	System.out.println(mySamsung);
// Object의 toString()메소드는 객체의 문자정보를 리턴한다 객체의 문자정보란 객체를 문자열로 표현한값
// 기본적으로 Object의 toString()메소드는 '클래스명@16진수해시코드로 구성된 문자열을 리턴한다
// 예를 들어 Date클래스는 현재 날짜와 시간을 , String클래스는 저장된 문자열을 리턴하도록
// toString()메소드를 재정의하고 있다

	}

}
