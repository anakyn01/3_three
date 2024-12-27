package spring.mvc.v2;

public class TypeCasting {

	public static void main(String[] args) {
		
		//캐스팅 확장
int myInt = 9;
double myDouble = myInt;
System.out.println(myInt);
System.out.println(myDouble);
		//캐스팅 축소
double newDouble = 9.9999d;
int newInt = (int)newDouble;
System.out.println(myDouble);
System.out.println(myInt);
		
		String casting ="자바 타입 캐스팅\n"+
	"형변환은 한 기본 데이터 유형의 값을 다른 유형에 할당하는 것을 말한다.\n"+
	"자바에는 두 가지 유형의 캐스팅이 있습니다.\n"+
	"와이드닝 캐스팅(자동) : 작은 글자를 큰 글자크기로 변환\n"+
	"byte->short->char->int->long->float->double\n"+
	"수동캐스팅 : 큰 글자를 작은 크기의 글자로 변환할 때\n"+
	"double->float->long->int->char->short->byte\n";
		System.out.println(casting);

	}

}
