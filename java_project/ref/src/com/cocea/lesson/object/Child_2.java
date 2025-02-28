package com.cocea.lesson.object;

class YoungBrother implements Brother{
	public void brotherSound() {System.out.println("배가 고프다");}
	/*public static void main(String[] args) {
		System.out.println("배가 고프다니까");
	}*/
}

public class Child_2 {//출력포트는 처음 저장한 클래스명에서 사용하는것이 좋다
	//출력포트는 클래스로 지정한 이름에서만 가동이 가능함

	public static void main(String[] args) {
		YoungBrother youngBrother = new YoungBrother();
		youngBrother.brotherSound();

	}

}
