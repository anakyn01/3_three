package com.spring.hyi.sub;

public class MemberNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	/*
	serialVersionUID직렬화된 객체의 송신자와 수신자가 호환되도록 하기 위해 역직렬화 프로세스 중에 사용되는 고유 식별자입니다.
	 명시적으로 선언하지 않으면 Java는 클래스 구조에 따라 자동으로 생성하지만 클래스 정의가 변경되면 문제가 발생할 수 있습니다. 
	를 선언하면 serialVersionUID직렬화 메커니즘이 사용 중인 클래스의 버전을 올바르게 식별할 수 있습니다.
	*/
}
