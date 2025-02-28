package com.cocea.lesson.object;

import java.util.ArrayList;
import java.util.Iterator;

public class Iter {

	public static void main(String[] args) {
		//반복자 => ArrayList와 HashSet과 같은 컬렉션을 반복하는데 사용할수 있는 객체
		ArrayList<String> nums = new ArrayList<String>();
		nums.add("one");
		nums.add("two");
		
		//반복자 사용
		Iterator<String> it = nums.iterator();
		
		//반복할때는 .hasNext
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("_________________");
		
		Iterator<String> itt = nums.iterator();//정의하지 않으면 에러발생
		
		//각각의 개별 출력 .next()
		System.out.println(itt.next());
		System.out.println(itt.next());
		
		
		

		

	}

}
