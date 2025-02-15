package com.cocea.lesson.object;

class Parent{
	protected String brand = "ford";//상속시키는 클래스변수로 protected사용
	public void honk() {
		System.out.println("Tuut, tuut!");
	}
}

public class Inherit extends Parent {//클래스 Inherit 부모클래스 Parent에게 상속받는다
    private String modelName = "Mustang";
	
	public static void main(String[] args) {
		
	Inherit myCar = new Inherit();//객체를 만듬
	
	myCar.honk();//상속을 받아서 부모에 매서드를 사용할수 있음
	
	System.out.println(myCar.brand + " " + myCar.modelName);
		
String inherritance ="한 클래스에서 다른 클래스로 속성과 메서드를 상속\n"+
"한 클래스에서 다른 클래스로 속성과 메서드를 상속\n"+
"슈퍼클래스 (부모) =>  상속을 시키는 클래스\n"+
"하위 클래스 (자식) => 부모클래스로 상속받는 클래스\n"+
"클래스에서 상속하려면 extends 키워드를 사용합니다.\n"+
"상속을 사용해야 하는 이유와 시기\n" +
"코드 재사용에 유용합니다\n"+
"새 클래스를 만들때 기존 클래스의 속성과 메서드를 재사용 합니다\n"+
"상속된 메서드로 다양한 작업을 수행하는것이 다형성 입니다";
	}

}
