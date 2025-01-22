package base_1;

public class Wrapper_12 {

	public static void main(String[] args) {
		
		//boxing
Integer obj = 100;
System.out.println(obj.intValue());//intValue Integer객체 내부의 값을 리턴

//Unboxing
int value = obj;
System.out.println(value);
		
		
// 자바는 기본타입의 값을 갖는 객체를 생성할수 있다 포장클래스[값을 포장한다고 해서 붙여진 이름이다]
/*
포장하고 있는 기본타입을 변경할수 없고 단지 객체로 생성하는데 목적이 있다
박싱 => 기본 타입의 값을 레퍼클래스로 Integer obj = 100
언박싱 => 위에 반대 int value = obj;
*/
	}

}
