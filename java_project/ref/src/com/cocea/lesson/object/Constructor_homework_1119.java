package com.cocea.lesson.object;

public class Constructor_homework_1119 {
	//매서드 호출될때 만 실행하는 코드블럭 static으로 만들때는 는 호출만, public으로 만들때는 객체후 실행
	static void StaticMethod() {
		System.out.println("정적");//호출만
	}
	public void PublicMethod() {
		System.out.println("출력포트에 객체만들고 실행해야 됩니다");
		
		//객체명.매서드명()
	}
	
	
	//프린트함수 위에 클래스에 속성값을 정의함
	int x;//1) 값을 넣지 않고 정의
	int y;//생성자에 값을 6을 대입
	String str;//생성자에 아무말 대잔치
	int a;
	int k;
	
	//2)클래스에 생성자 쓰기
	public Constructor_homework_1119(int b, int v, int e) {
		//3)정의한 변수에 값을 대입
		x = 10;
		y = 6;
		str = "아무말 대잔치";
		a = b;
		k = v;
		//e는 t와 같다
	}

	public static void main(String[] args) {
		//4)생성자 값을 사용하기 위해서 객체로 정의
		Constructor_homework_1119 nums = new Constructor_homework_1119(7, 3);
		//5) 사용함
System.out.println(nums.a);


String Con_desc = "생성자는 : 객체를 초기화 하는데 사용되는 특수 메서드"+
"클래스의 객체가 생성될때 호출됩니다"+
"객체 속성에 대한 초기값을 설정하는데 사용합니다"+
"자바에서 생성자를 만들때는 클래스명과 동일하게 사용합니다";

	}

}
