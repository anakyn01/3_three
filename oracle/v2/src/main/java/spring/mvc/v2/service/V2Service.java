package spring.mvc.v2.service;

import java.util.Map;

public interface V2Service {

	int create(Map<String, Object> map);

	//read메소드 시그니처
	Map<String, Object> read(int blogContSeq);
	
	/*
	1) 마이바티스에서 sql
	2) dao오브젝트에서 명령선언하고
	3) impl에서 클래스 재정의
	4) 메소드 시그니처
	5) 콘트롤러에서 서비스 호출
	*/

}
