package com.cocea.lesson.object;

interface FirstInterface{
	public void myMethod();
}
interface SecondInterface{
	public void myOtherMethod();
}

class DemoImpl implements FirstInterface, SecondInterface{
	public void myMethod() {
		System.out.println("some text..");
	}
	public void myOtherMethod() {System.out.println("some other text");}
}

public class Two {

	public static void main(String[] args) {
		DemoImpl demoImpl = new DemoImpl();
		demoImpl.myMethod();
		demoImpl.myOtherMethod();
	}

}
