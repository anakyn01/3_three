package com.cocea.lesson.object;

public class FatherImpl implements Familly {

	@Override
	public void famillySound() {
	System.out.println("im your father");

	}

	@Override
	public void run() {
	System.out.println("1'll give you a new name Darth Vader");

	}
	

}
class Child{
	public static void main(String[] args) {
		FatherImpl fatherImpl = new FatherImpl();
		fatherImpl.famillySound();
		fatherImpl.run();
	}
}





