package com.cocea.lesson.object;

class Rider{
	protected int price= 300;
	public void talk() {
		System.out.println("오 저렴한데");
	}
}

public class Bike extends Rider {
    //필드
	private int bikePrice = 100;
	
	public static void main(String[] args) {
		// 오토바이에 상속받으려면 상속받는 값을 담기위해 객체로 만듬
		//클래스는 객체를 만들기 위한 템플릿
		Bike myBike = new Bike();
		//객체명이 슈퍼클래스에게 상속받은 attribute와 method를 사용
	    myBike.talk();//객체명.상속받은 매서드 명
	    //protected int price= 300; 상속받음
		System.out.println(myBike.price + " " + myBike.bikePrice );
//객체
	}

}
