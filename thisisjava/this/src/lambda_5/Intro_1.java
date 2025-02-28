package lambda_5;

public class Intro_1 {
	
	static void myMethod() {//일반 함수
		System.out.println("^^^^^^^");
	}
	
	public static void main(String[] args) {
		myMethod();
	}

}
/*
함수형 인터페이스 사용이유[불변성, 순수함수, 고차함수]
- 코드의 간결성
- 가독성 향상
- 고차함수(다른 함수를 인자로 받거나 반환하는 함수)
이는 함수형 프로그래밍 패러다임에 중요한 특징이며 특히 컬렉션 처리나 스트림API에서 성능을 발휘함

class MyComponent extends Component{
 constructor(props){
   super(props);
   this.state = {}
 }
}

Const MyComponent = () => {
  const [] = useState(0);
}

함수형 프로그래밍 : 함수를 정의하고 이함수를 데이터 처리부로 보내 데이터를 처리하는 기법
java8부터 람다식을 지원하였음
데이터처리부 제공되는 함수 역활을 하는 매개변수를 가진 중괄로 블록이다
function 함수명 (매개변수){
}
함수명()
람다식 ? => 이름이 없는 인터페이스 구현 객체

람다식: (매개변수, ...) -> {처리내용}

인터페이스가 단 하나의 추상 메소드를 가질때 이를 함수형 인터페이스라고 얘기한다
인터페이스가 함수형 인터페이스임을 보장하기 위해서는 @FunctionalInterface 어노테이션을 붙인다

추상화 : 특정 세부 정보를 숨기고 사용자에게 필수적인 정보만 보여주는 프로세스 
추상화에는 
추상클래스[객체를 생성하는데 사용할수 없는 제한된 클래스{이클래스에 접근하려면 다른 클래스에서 상속 받아야 함}, 
추상메소드 : 추상 클래스에서 사용할수 있고 본문이 없습니다 본문은 하위 클래스에서 제공된다
인터페이스 : 바디가 없는 구현체









*/
