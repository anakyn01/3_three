package com.cocea.lesson.math;

public class Math_1 {

	//예약어는 클래스명으로 사용하면 안된다
	public static void main(String[] args) {
		//최대값 내장객체(프로그래밍에서 설치후 import를 하지 않는걸)
		System.out.println(Math.max(5, 10));
		System.out.println(Math.min(5, 10));
		//제곱근
		System.out.println(Math.sqrt(64));
		//절대값 은 양수
		System.out.println(Math.abs(-7));
		//난수 0.0포함 1.0[last index 미포함]제외 사이의 난수를 리턴
		int randomNum = (int)(Math.random() * 101);//0 ~ 100
		System.out.println(randomNum);
		
		//올림
		System.out.println(Math.ceil(0.60)); //1.0
		System.out.println(Math.ceil(0.40)); //1.0
		
		//floor 자름
		System.out.println(Math.floor(0.60));
		System.out.println(Math.floor(0.40));
		
		//floorDiv
		System.out.println(Math.floorDiv(10, 5));
		
		//floorMod
		System.out.println(Math.floorMod(-10, 4));
		
		
		
		
		
		
		
	}

}
