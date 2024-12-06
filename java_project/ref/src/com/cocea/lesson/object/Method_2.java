package com.cocea.lesson.object;

public class Method_2 {
	
	//함수 javascript function, = () => 
	static void myMethod() {
		System.out.println("함수는 호출할때만 실행되는 코드블럭");
	}
	//static
	static void myStaticMethod() {
		System.out.println("객체를 생성하지 않음");
	}
	//public 
	public void myPublicMethod() {
		System.out.println("객체를 생성함");
	}
	
	public static void main(String[] args) {
		myMethod();//함수 호출을 출력포트에서 한다
		
		System.out.println("-------------------------------");
		myStaticMethod();
		
		Method_2 newObj = new Method_2();//1)객체 생성
		newObj.myPublicMethod();//2)커맨드에.매서드명으로 호출
	}

}
/*
함수는 스스로를 호출하는 재귀함수를 제외하고 
호출할때만 실행되는 코드블럭
- 자바에서는 static[객체를 생성하지 않고 사용]과 
public[객체로 생성해야지만 ]으로 생성할수 있다


*/











