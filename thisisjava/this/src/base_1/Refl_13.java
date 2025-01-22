package base_1;

public class Refl_13 {
	
	public static void main(String[] args) throws Exception{
		Class clazz = Any.class;
		//Class clazz = Class.forname("base_1.Any");
		//Any any = new Any(); Class clazz = any.getClass();
		System.out.println("패키지: " + clazz.getPackage().getName());
		System.out.println("클래스 간단 이름: " + clazz.getSimpleName());
		System.out.println("클래스 전체 이름: " + clazz.getName());
	}
/*
리플렉션
- 자바는 클래스와 인터페이스의 메타 정보를 Class객체로 관리한다
- 여기서 메타정보[패키지 정보, 타입정보, 맴버(생성자,필드,메소드)]는 말한다
- 이러한 메타정보를 프로그램에서 일고 수정하는 행위를 리플렉션이라고 한다

- 프로그램에서 클래스 객체를 얻으려하면 아래에 3가지 방법중에 하나를 이용한다
1)Class clazz = 클래스이름.class;
2)Class clazz = Class.forName("패키지 클래스이름");
3)Class clazz = 객체참조변수.getClass()

- 패키지 타입의 정보얻기
Package getPackage() : 패키지의 정보 
String getSimpleName() : 패키지를 제외한 타입 이름
String getName() : 패키지를 포함한 전체 타입이름
*/
}
