package base_1;

public class RecodeEx_4 {

	public static void main(String[] args) {
		
		Person p = new Person("winter", "snow", 100);
		
		//getter 메소드 호출
System.out.println(p.id());	
System.out.println(p.toString());

Person p1 = new Person("winter", "snow", 100);
Person p2 = new Person("winter", "snow", 100);

System.out.println("p1 : " + p1.hashCode());
System.out.println("p2 : " + p2.hashCode());
System.out.println(" 둘이 같아요? " + p1.equals(p2));

// 데이터 전달을 위한 DTO를 작성할때 반복적으로 사용되는 코드를 줄이기 위해 java14부터 recode가 도입되었습니다
//public record Person(String name, int age){}
//소스를 컴파일 할때 private final필드가 자동생성되고 생성자 / Getter메소드가 자동추가된다
//그리고 hashCode(), equals(), toString() 메소드를 재정의한 코드로 자동추가 된다
	}

}
