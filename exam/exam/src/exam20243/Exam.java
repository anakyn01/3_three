package exam20243;

public class Exam {

	public static void main(String[] args) {

		int a = 0;//초기화 
		for (int i=1; i <999; i++) {//1부터 998까지 반복
			if(i%3==0 && i%2 !=0)//i가 3의 배수이면서 홀수인지 확인
				a=i;//조건을 만족하는 1값을 변수 a에 저장
		}
        System.out.print(a);
	}

}
