package com.cocea.lesson.object;

import java.util.HashSet;

public class Contains {

	public static void main(String[] args) {
		
		HashSet<Integer> numbers = new HashSet<Integer>();
		
		numbers.add(4);
		numbers.add(7);
		numbers.add(8);
		
		for (int i = 1; i <= 10; i++) {
			//가정법
			if(numbers.contains(i)) {//넘버에 개별 이 존재한다면 1 ~ 10
				System.out.println(i + " 빙고" );
			}else {//존재하지 않는다면
				System.out.println(i + " null" );
			}
		}
	}

}
