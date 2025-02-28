package com.cocea.lesson.object;

public class TryCatchFinally {

	public static void main(String[] args) {
		// 예외

		try {//코드블럭을 실행하는 곳
			int[] myNumbers = {1, 2, 3};
			System.out.println(myNumbers[11]);
			/*System.out.println("자바코드를 실행할때는 다양한 오류가 발생할수 있습니다.");
			System.out.println("프로그래머에 코딩에러, 잘못된 입력, DB관련 오류");
			System.out.println("오류가 발생하면 중지되고 오류메세지를 생성합니다");
			System.out.println("이를 오류를 throw한다고 합니다");*/
		}catch(Exception e) {//코드블럭에 오류가 있다면 캐치해서 알려줌
			System.out.println("No Good");
			//e.printStackTrace();
		}finally {//결과에 상관 없이 반드시 사용자에게 인지시켜야 하는 항목
			System.out.println("결과가 실패했던 성공했던 프로그래밍 종료");
		}
	}

}
