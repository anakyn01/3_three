package com.cocea.lesson.object;

class Visa{
	//일본에 가는 방법 => 과정평가형이나 정보처리 산업기사 취득
	protected String cocea = "일본에 가는 방법";
	public void goJapan() {
		System.out.println("학생분들 일본에 가려면 정보처리 산업기사나 과정평가형 정보처리를 취득하셔야 해요");
		//정보처리 산업기사나 과정평가형 정보처리르 취득하셔야 해요
	}
	
}

public class Nippon extends Visa{
    //내이름은 누구누구 저 일본어 못하고 자바를 몰라요
	private String mytalk ="내이름은 누구입니다 저는 자바가 어려워요";
	
	public static void main(String[] args) {
		//내이름으로 객체 생성
		Nippon im = new Nippon();
		//학원에서 해주신 내용[코세아에 매서드 ]을 듣고 이해하였음
		im.goJapan();
		System.out.println(im.mytalk + "제가 일본에 취업하려면 어떻게 해야 할까요?" + im.cocea + "과정평가형 정보처리 취득하시는게 빠릅니다");

	}

}
