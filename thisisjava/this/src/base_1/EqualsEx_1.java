package base_1;

public class EqualsEx_1 {

public static void main(String[] args) {
Member obj1 = new Member("blue");
Member obj2 = new Member("blue");
Member obj3 = new Member("red");

//동등비교 1)
if(obj1.equals(obj2)) {
	System.out.println("동등합니다");
}else {
	System.out.println("다름");
}

System.out.println();

//동등비교 2)
if(obj1.equals(obj3)) {
	System.out.println("동등합니다");
}else {
	System.out.println("다름");
}

	}

}
/*
Object 클래스
- 클래스를 선언할때 extends 키워드로 다른 클래스를 상속하지 않으면 암시적으로 java Object클래스를 상속하게 됩니다
그래서 모든 클래스는 자바의 Object의 자식이거나 자손이다

그렇기 때문에 Object가 가진 메소드는 모든 객체에서 사용할수 있다
- Object 메소드 -
boolean equals(Object obj) : 객체의 번지를 비교하고 결과[boolean ]를 리턴
public boolean equals(Object obj) 매개변수 타입이 Object이기 때문에
모든 객체가 매개값으로 대입될수 있다
equals() 메소드는 비교연산자인 == 과 동일한 결과를 리턴한다
두객체가 동일한 객체라면 true를 리턴하고 그렇지 않으면 false를 리턴한다

Object obj1 = new Object();
Object obj2 = obj1;
boolean result = obj1.equals(obj2);
boolean result = (obj1 == obj2); 결과값 동일
일반적으로  Object의 equals()메소드는 재정의해서 동등비교용으로 사용한다
동등비교란 객체가 비록달라도 내부의 데이터가 같은지를 비교한다


int hashCode() : 객체의 해시코드를 리턴
String toString() : 객체 문자정보를 리턴

Object

System String Number
              Integer
              
              
              
              
*/