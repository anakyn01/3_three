package com.cocea.lesson.object;

import java.util.HashMap;

public class Hash {

	//key pk => primary key
	public static void main(String[] args) {
		
		//키값과 벨류를 전부 출력할때
		HashMap<String, String> number = new HashMap<String, String>();
		number.put("1", "one");
		number.put("2", "two");
		number.put("3", "three");
		for (String z : number.keySet()) {
			System.out.println("key: " + z + " value: " + number.get(z));
		}
		
		
		//키값만 필요한 경우 => keySet() , 값만 필요한 경우 values() for-each사용
		HashMap<String, String> brand = new HashMap<String, String>();
		brand.put("bmw","840i");
		brand.put("merced","e300");
		brand.put("hyundai","grand");
		//각각의 필요한부분을 반복 키값만
		for (String i : brand.keySet()) {
			System.out.println(i);
		}
		System.out.println("       ");
		for (String q : brand.values()) {//값만
			System.out.println(q);
		}
		
		
		
		
		
		
		
		//앞전에서 했던것처럼 스트링을 추가할때 문제가 생길경우 그럴땐 key / value
		HashMap<String, String> capital = new HashMap<String, String>();
		capital.put("한국", "서울");
		capital.put("독일", "베를린");
		capital.put("미국", "DC");
		System.out.println(capital);
		//항목에 개별 엑세스
		System.out.println("____________________");
		System.out.println(capital.get("한국"));
		System.out.println(capital.remove("독일"));
		System.out.println(capital);
	}

}
