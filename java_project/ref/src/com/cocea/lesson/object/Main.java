package com.cocea.lesson.object;

interface Student{
	public void studentSound();
	public void lesson();
}

class OneImpl implements Student{
	public void studentSound() {System.out.println("Student 상속받음");};
	public void lesson() {System.out.println("Student 상속받음");};
}

public class Main {

	public static void main(String[] args) {

		OneImpl oneImpl = new OneImpl();
		oneImpl.studentSound();
		oneImpl.lesson();
	}

}
