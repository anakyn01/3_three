package base_1;

import java.util.Properties;
import java.util.Set;

public class Props_9 {

	public static void main(String[] args) {
//운영체제와 사용자 정보출력
String osName = System.getProperty("os.name");
String userName = System.getProperty("user.name");
String userHome = System.getProperty("user.home");
System.out.println(osName);
System.out.println(userName);
System.out.println(userHome);

//자바버전과 cpu와 캐릭터 인코딩, 자바클래스 패스를 출력
Properties props = System.getProperties();
Set keys = props.keySet();

for(Object objkey : keys) {
	String key = (String) objkey;
	String value = System.getProperty(key);
	System.out.printf("%-40s:  %s\n", key, value);
	//%-40s 문자열을 40자의 길이로 맞춤, 오른쪽 정렬대신에 왼쪽정렬 %s\n
}

	}

}
/*
시스템 프로퍼티 [자바가 시작될때 자동 설정되는 시스템의 속성]읽기
java.specification.version
java.home : jdk디렉토리 경로
os.name
user.home : 사용자 이름
user.dir : 현재 디렉토리 경로
*/
