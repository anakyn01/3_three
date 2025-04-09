package intel2023;

public class Main3 {
	static int a = 0;//global a => 0
	static int func(int t) {//매개변수 T를 받아 a에 더하고 그값을 리턴하는 함수
		a = a + t;//a에 t를 더한 값을 다시 a에 저장
		return a;//수정된 a를 리턴
	}
	

	public static void main(String[] args) {
for(int i=0; i <5; i++) {//반복문에서 func를 5번 호출
	func(i);//개별 i값이 호출
}
System.out.print(a);
/*
a + 0 = a = 0 + 0 = 0
a + 1 = 0+1 = 1
a + 2 = 1+2 = 3
a + 3 = 3 + 3 = 6
a + 4 = a = 6 + 4 = 10
*/
	}

}
