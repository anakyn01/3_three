package com.cocea.lesson.cons;

public class Cons {
//생성자는 객체를 초기화 하는데 사용되는 특수메소드 생성자는 클래스의 객체가 생설될때 호출됩니다
	int x;
	int y;
	int q;
	int w;
	
	//자바 생성자
	//생성자 매개변수
	public Cons(int q) {
		x = 5;
		y = 10;
		w = q;
	}
	
	public static void main(String[] args) {
		Cons myObj = new Cons(5); //객체생성
		System.out.println(myObj.w);
	}
}
