package com.cocea.lesson.object;

public class UserThrow {
	
	//method
	static void checkAge(int age) {
		if (age < 18) {
			//사용자 정의 오류
			throw new ArithmeticException("18세미만 이므로 사용 불가");
		}else {
			System.out.println("성인이므로 사용이 허가됨");
		}
	}

	public static void main(String[] args) {
		checkAge(19);
	}

}