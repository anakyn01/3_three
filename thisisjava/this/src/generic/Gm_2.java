package generic;

public class Gm_2 {
	//제한된 타입 파라미터
	public static <Q extends Number> boolean compare(Q q1, Q q2) {
		
		//Number의 메소드 사용
		double g1 = q1.doubleValue();
		double g2 = q2.doubleValue();
		
		//
		return (g1 == g2);
	}
	
	
	//제네릭 메소드 <T> 여러가지 타입유형을 사용하기 위하여 
	public static <T> Cap<T> capsule(T t){//타입 파라미터 정의
		Cap<T> cap = new Cap<T>();
		cap.setT(t);
		return cap;
	}

	public static void main(String[] args) {
	//제한된 파라미터
	boolean result1 = compare(10, 20);//Q를 integer로
	System.out.println(result1);
	System.out.println();
		
	boolean result2 = compare(4.5, 4.5);//Q를 Double로
	System.out.println(result2);
	System.out.println();	
		
	//래퍼클래스
Integer myInt = 5; Double myDouble = 5.99; Character myChar = 'A';
System.out.println(myInt.intValue());	
System.out.println(myDouble.doubleValue());
System.out.println(myChar.charValue());
Integer onehund = 100;
String mytrans = onehund.toString();
System.out.println(mytrans.length());
		
		
	//제네릭 메소드 호출
	Cap<Integer> cap1 = capsule(100);//T를 Integer로 대체	
	//변수에 대입
	int intValue = cap1.getT();
	//출력
	System.out.println(intValue);
	
	//제네릭 메소드 호출
	Cap<String> cap2 = capsule("anaaa");//T를 String으로 대체	
	String strValue = cap2.getT();
	System.out.println(strValue);
	
		

String limit = "제한된 타입 파라미터"
+ "경우에 따라서는 타입 파라미터를 대체하는 구체적인 타입을 제한할 필요가 있다"
+ "예를 들어 숫자를 연산하는 제네릭 메소드는 대체 타입으로 Number또는 자식 클래스"
+ "(Byte, Short, Integer, Long, Double)로 제한할 필요가 있다"
+ "이처럼 모든 타입으로 대체할수 없고 특정타입과 자식 또는 구현관계에 있는 타입만 대체할수 있는 "
+ "타입 파라미터를 제한된 타입(bounded type parameter) 파라미터 라 한다"
+ "syntax 는 "
+ "public <T extends 상위타입> 리턴타입 메소드 (매개변수, ....){...}"
+ "public <T extends Number> boolean compare(T t1, T t2){"
+ "double v1 = t1.doubleValue()"
+ "double v2 = t2.doubleValue()"
+ "return (v1 == v2)"
+ "}";	

String data = "더이상 단순화 될수 없는 값을 원시값 이라 한다"
+ "자바, 자바스크립트, 파이선, C, C++, C#, react, vue는 원시값을 제외한 모든것이 객체"
+ "자바에서 래퍼 클래스란 기본 데이터 유형을 객체로 사용한다"
+ "byte => Byte, short => Short, int => Integer, char => Character"
+ "예를 들어 Collection 객체를 사용할때 ArrayList의 기본유형을 사용할수 없는 경우"
+ "(목록은 객체에만 저장할수 있습니다) 그래서 레퍼클래스를 사용합니다"
+ "잘못된 예 ArrayList<int> Num = new ArrayList<>();"
+ "OK ArrayList<Integer> Num = new ArrayList<Integer>();"
+ "객체를 다루게 되었으므로 특정 객체에 대한 정보를 얻을수 있다"
+ "변환을 할수 있다";


String txt = "제네릭 메소드는 타입 파라미터를 가지고 있는 메소드를 말한다\n"
+ "타입 파라미터가 매소드 선언부에 정의된다는 점에서 제네릭 타입과 차이가 있다\n"
+ "제네릭 메소드는 리턴타입 앞에 <>기호를 추가하고 타입 파라미터를 정의한뒤\n "
+ "리턴 타입과 개개변수 타입에서 사용한다\n"
+ "public <A, B, ...> 리턴타입 메소드명 (매개변수,...){...}\n"
+ "예를들어 박스 클래스로 만들경우\n "
+ "public <T> Box<T> boxing(T t){....}\n"
+ "메소드는 타입 파라미터 <T>로 정의하고 매개변수 타입과 리턴 타입에서 T를 사용한다\n"
+ "Box<Integer> box1 = boxing(100);\n"
+ "BOx<String> box2 = boxing('안녕하세요')\\n";
System.out.println(txt);

String wild = "와일드카드 타입 파라미터"
+ "매개값이나 리턴 타입을 사용할때 타입 파라미터로 (와일드 카드)를 사용할수 있다"
+ "? (범위에 있는 모든 타입을 대체할수 있다는 표시이다)"
+ "예를 들어 슈퍼클래스가 person이고 하위로 worker student[extends Student]"
+ "리턴타입 메소드명(제네릭 타입 <? extends Student> 변수) {...}"
+ "부모 클래스인 person만 가능하도록 할수 있습니다"
+ "리턴타입 메소드명(제네릭 타입 <? super Worker> 변수) {...}"
+ "어떤 타입이든 가능하도록 매개변수를 선언할수도 있다"
+ "리턴타입 메소드명(제네릭 타입 <?> 변수) {...}";

	}

}
