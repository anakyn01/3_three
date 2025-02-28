package spring.mvc.v2;

public class TypeCasting {

	public static void main(String[] args) {
		
		
		//캐스팅 확장
	      int myInt = 9;
	      double myDouble = myInt;
	      System.out.println(myInt);
	      System.out.println(myDouble);

	      //캐스팅 축소   
	      double newDouble = 9.999d;
	      int newInt = (int)newDouble;
	      System.out.println(newDouble);
	      System.out.println(newInt);

		
		String casting = "자바 타입 캐스팅|n" +
		"형변환은 한 기본 데이터 유형의 값을 다른 유형에 할당하는 것을 말함|n"+
		"자바에는 두가지 유형의 캐스팅이 있다|n" +
		"와이드닝 캐스팅(자동) : 작은 글자를 큰 글자크기로 변환|n" +
		"byte -> short ->char -> int -> long ->floate ->double|n" +
		"수동 캐스팅 : 큰 글자를 작은 크기의 글자로 변환 할때|n" +
		"double -> float -> long -> int -> char -> short -> byte |n";
		
		System.out.println(casting);

	}

}
