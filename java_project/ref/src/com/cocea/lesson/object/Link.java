package com.cocea.lesson.object;

import java.util.LinkedList;

public class Link {

	public static void main(String[] args) {
	
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("x1");
		cars.add("x2");
		
		cars.addFirst("BMW ");
		cars.addLast(" 30d");
		System.out.println(cars);
		
		System.out.println("------------------------");
		
		System.out.println(cars.getFirst());
		System.out.println(cars.getLast());
		
		
String linkedlist ="ArrayList와 마찬가지로 동일유형의 여러 객체를 포함할수 있는 컬렉션\n"+
"같은 구성이 다릅니다 \n"+
"새로운 어레이가 추가 되면 가비지컬렉터로 보내고 새로 어레이를 구성한다 컴퓨터 입장에서는 불필요한 메모리를 소요한\n"+
"LinkedList는 색인 가지고 있어서 연결된다\n"+
"addFirst(), addLast(), removeFirst(), removeLast(), getFirst(), getLast()\n"+
"외부 인터페이스여서 import를 시켜야 합니다";
	}

}