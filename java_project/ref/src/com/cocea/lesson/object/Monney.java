package com.cocea.lesson.object;

class Legacy{
	//내가 가지고 있는돈 3억 상속받는 사람에게만 필요
	protected int legacyMoney = 3;//1)유산
	//너에게 유산을 물려줄께 메서드
	public void myTalk() {//2)유언장
		System.out.println("내가 죽거든 너에게 전재산을 물려주마");
	}
}

public class Monney extends Legacy{

	private String iam ="내가 조선에 장남이다";
	//난 부모님에 장남
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//부모님에게 3억을 물려받음	
		Monney myfirst = new Monney();///장남임을 입증하고
		myfirst.myTalk();//먼저 유언장을 상속 받음
		
		System.out.println("다른 형제들이 유언장을 보여봐");
		System.out.println("내가 상속받은 돈은 얼마나면 " + myfirst.legacyMoney + "이다");


	}

}
