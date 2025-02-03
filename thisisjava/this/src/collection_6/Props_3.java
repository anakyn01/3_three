package collection_6;

import java.util.Properties;

public class Props_3 {

	public static void main(String[] args) throws Exception{
		//Properties 컬렉션 생성
Properties properties = new Properties();
//동일한 경로 1:1 폴더를 건너뜀 상대경로 인터넷에서 칠때 미국이던 영국이던 니폰 절대경로 
properties.load(Props_3.class.getResourceAsStream("pro.properties"));

//자바빈즈 = 언제든 재사용 가능한 모듈 (java beans 또는 컴포넌트 [Dont Reapeat Your self])
//주어진 키에 대한 값을 읽기
String driver = properties.getProperty("driver");
String url = properties.getProperty("url");
String username = properties.getProperty("username");
String password = properties.getProperty("password");
String admin = properties.getProperty("admin");

//값을 출력
System.out.println("driver : " + driver);
System.out.println("url : " + url);
System.out.println("username : " + username);
System.out.println("password : " + password);
System.out.println("admin : " + admin);






	}
	
}
