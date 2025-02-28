package com.spring.hyi;

import java.util.HashMap;

public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		
		capitalCities.put("영국", "런던");
		capitalCities.put("독일", "베를린");
		System.out.println(capitalCities);

	}
/*
ArrayList는 항목을 정렬된 컬렉션으로 저장하고 인덱스 번호 int타입으로 엑세스해야 한다
내장 어레이는 값을 정해놓고 외장어레이는 객체화 시켜서 여러값을 담는다
그러나 HashMap는 키 / 값을 쌍으로 저장하고 인덱스로 엑새스 합니다
*/
}
