package com.cocea.lesson.object;

import java.util.ArrayList;

public class Arr_test_1119 {

	public static void main(String[] args) {
		
		//1) 자바 유틸 어레이 타입 : 문자열 엘리먼트 문자열 1 ~ 문자열 4
		ArrayList<String> str = new ArrayList<String>();
		str.add("문자열 1");
		str.add("문자열 2");
		str.add("문자열 3");
		str.add("문자열 4");
		str.set(1, "munja2");
		str.remove(3);
		
		for (String a : str) {
			System.out.println(a);
		}
		//2) 위에 어레이에 두번째 문자열을 munja2로 변경 .set
		//3) 위에 어레이에 4번째 문자열 항목을 제거 .remove
		//4) 임의에 변수 a를 사용하여 for-each출력
		
		//5) 자바유틸어레이, 변수타입 Integer, 항목 1 ~5 , 3번째에 22추가 임의변수 w 로 출력
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);//요소들을 엘리먼트 노드 차일드 노드
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(2, 22);
		
	   for(Integer w:nums) {
		   System.out.println(w);
	   }
		
	}

}