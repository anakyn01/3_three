package com.cocea.lesson.method;

//10+9+8+7+6+5+4+3+2+1
public class Recursion {

	//스스로 호출하여 10까지의 모든 숫자를 더하세요
	public static void main(String[] args) {
      int result = sum(10);
      System.out.println(result);
      
      int rs = Sum(5, 10);
      System.out.println(rs);
	}
	public static int Sum(int start, int end) {
		if (end > start) {
			return end + Sum(start, end - 1);
		}else {
			return end;
		}
	}
	
	
	public static int sum(int k) {
		if (k > 0) {//0이상 일때 1,2,3,4,5,6,7,8,9,10
			return k + sum(k-1); //10 + (10-1) + (9-1)
		}else {
		    return 0;//중지
		}
	}

}
/*
재귀 함수
- 스스로를 호출하는 함수
- 복잡한 문제를 쉽게해결하기 위한 방법
*/
