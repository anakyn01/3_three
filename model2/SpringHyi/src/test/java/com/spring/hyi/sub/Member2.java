package com.spring.hyi.sub;

public class Member2 {

	public String name;
	public int age;
	
	//생성자
	public Member2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//hashCode재정의 name과 age값이 같으면 동일한 hashCode가 리턴됨
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
	//equals 재정의 name과 age값이 같으면 true가 리턴됨 && and
	//instanceof 객체타입을 확인하는 연산자
	/*@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member2 target) {
			return target.name.equals(name)&&(target.age==age);
		}else {
			return false;
		}
	}*/
	
	
	
	
	
	
	
}
