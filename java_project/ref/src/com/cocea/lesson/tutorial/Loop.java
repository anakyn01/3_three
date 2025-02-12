package com.cocea.lesson.tutorial;

public class Loop {

	public static void main(String[] args) {
System.out.println("루프는 지정된 조건에 도달하는한 코드블럭을 실행합니다");

		//while
		int q = 0; //start index
		while (q < 5) {
			System.out.println(q);
			q++;//후위연산자
			//전위 전산자[값이 먼자 증가하고 작업 수행] 후위연산자 [작업이 수행된 후에 값이 증가]
		}
		
		//Do/while
		int w = 0;
		do {
			System.out.println(w);
			w++;
		}
		while (w < 5);
		
		System.out.println("--------");	
		
		//++ --감소
		int countdown = 3;
		
		while (countdown > 0) {
			System.out.println(countdown);
			countdown--;
		}
		
		//주사위
		int dice = 1;//1+1=2 +1 =3
		
		while (dice <= 6) {
			if(dice < 6) {//5번
				System.out.println("No Yatzy");
			}else {//6번
				System.out.println("Yatzy");
			}
			dice = dice + 1;//개별증가
		}
		
		
		System.out.println("_________________________");
		
		/*for loop : 코드블록을 몇 번 반복할지 정확히 알고 있는 경우 for루프 사용
		for (statement 1; statement 2; statement 3) {}
		
		* statement 1 : 코드블록을 실행하기전에 한번 실행됩니다 start index
		* statement 2 : 코드블록을 실행하기위한 조건을 정의합니다 last index
		* statement 3 : 코드블록이 실행된후에 매번 실행됩니다 허락된 한도까지의 개별증가
		*/
		for (int e = 0; e < 5; e++) {
			System.out.println(e);
		}
		
		//짝수만 출력
		for (int r = 0; r <= 10; r = r + 2) {
			System.out.println(r);
		}
		
		//루프 안에 루프를 배치 중첩루프
		//Outer loop
		for (int t = 1; t <= 2; t++) {
			System.out.println("섹션: " + t);
			//inner loop
			for (int y =1; y <= 3; y++) {
				System.out.println(" 내용: " + y);// 2 * 3
			}
		}
		
		//u는 3번 반복 중첩으로 o는 4번반복
		for (int u = 1; u <= 3; u++) {
			System.out.println("섹션: " + u);
			//inner loop
			for (int o =1; o <= 4; o++) {
				System.out.println(" 내용: " + o);// 2 * 3
			}
		}	
		
	//for Each루프는 배열(단일 솔루션에 여러데이터를 담는다)의 요소를 반복하는데만 사용되는 for-each루프
	//syntax for(type variableName : arrayName) {}
	String[] cars = {"volvo","bmw","ford","mercedes"};
	for (String g: cars) {
		System.out.println(g);		
	}
	
	for (int l = 0; l <= 100; l += 10) {
		System.out.println(l);
	}

	}//print end
}//class end
/*
while (condition){
//code block
}
*/
