package com.spring.ljh;

import java.util.ArrayList;

public class Labda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> numbers =new ArrayList<Integer>();
numbers.add(5);numbers.add(9);numbers.add(8);numbers.add(1);
numbers.forEach((n) -> {System.out.println(n);});
	}

}
/*람다 표현식
 - 자바 8에서 추가됨
 - 매개변수를 받아서 값을 리턴하는 코드블록
 - 메소드와 비슷하지만 이름이 필요없고 메소드 본문에서 바로 구현할 수 있습니다.
 */
 