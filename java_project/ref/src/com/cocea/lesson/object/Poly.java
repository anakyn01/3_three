package com.cocea.lesson.object;

class Cow {
	public void animalSound() {//동물소리 함수를 파생
		System.out.println("음메");
	}
}

class Dog extends Cow{
	public void animalSound() {//동물소리 함수를 파생
		System.out.println("멍멍");
	}
}

class Rabit extends Cow{
	public void animalSound() {//동물소리 함수를 파생
		System.out.println("난 소리가 없어요");
	}
}


public class Poly {

	public static void main(String[] args) {
		// 상위 클래스에서 파생된 다른 클래스를 상위클래스 cow로 객체정의 함으로써 그속성들을 객체화 시켜 상속받아 사용
		Cow myCow = new Cow();
		Cow myDog = new Dog();
		Cow myRabit = new Rabit();
		
		myCow.animalSound();
		myDog.animalSound();
		myRabit.animalSound();
		
		
		System.out.println("다형성을 사용하여 코드량을 줄이고 모듈을 공유하였음");
				
String Dec = "자바 다형성\n"+
"다형성이란 '여러 형태를 의미 합니다[상속을 통해 관련된 여러 클래스가 있을때 발생함을 의미합니다]' \n"+
"상속을 받아서 단일 작업방식을 다양한 방식으로 수행합니다";
		
	}

}
