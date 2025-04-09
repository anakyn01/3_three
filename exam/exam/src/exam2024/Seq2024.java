package exam2024;

class Parent{
	int x,y;//클래스의 인스턴스 변수 부모크랠스의 인스턴스변수 로 사용
	//생성자
	Parent(int x, int y){//(1)
	//x와 y를 인자로 받아서 인스턴스 변수 x와 y 에 값을 할당
	//this.x = x; this.y = y;는 각각 현재인스턴스의 x와 y 에 값을 저장하는 역활을 한다
		this.x = x;
		this.y = y;
	}
	int getT() {//(2) 부모클래스에서 정의된 getT() 매서드는 x * y 값을 리턴
		//이는 부모 클래스의 인스턴스변수 x와 y를 이용해서 계산된 결과를 리턴
		return x * y;
	}
}

class Child extends Parent{//차일드 클래스는 패런츠 클래스에서 상속받음
	int x;//자식클래스에서 x라는 변수를 정의
	
	//차일드에 생성자 
	Child(int x){//3)
		super(x+1, x);//부모 클래스의 생성자를 호출하는 방식으로 super(x+1, x)를 사용
		this.x = x;//자식 클래스의 x는 this.x = x를 통해 인스턴스 변수에 할당
	}
	int getT(int n) {//(4) 메소드 부모클래스의 getT()메소드를 호출한후 
		return super.getT() + n;
		//부모클래스에서 계산된 x * y값에 n을 추가한 결과를 리턴
	}
	
}

public class Seq2024 {

	public static void main(String[] args) {//(5) 자바에서는 특별한 이벤트에 약속이 없는한 메인프린트함수를 출력함
Parent parent = new Child(3); //(6)
/*
Child 객체를 생성하고 이를 Parent타입의 참조변수 parent에 저장합니다
이때 차일드 클래스의 생성자가 호출됩니다
Child(3)가 호출되면 먼저 부모 클래스의 생성자 Parent(int x, int y)가 호출되며
x +1과 x가 전달됩니다
super(4, 3)이 실행되므로 부모 클래스의 x는 4, y는 3으로 초기화 됩니다
*/

System.out.println(parent.getT());//(7)
/*
parent Parent타입 이지만 실제로는 Child객체를 가리키고 있습니다
그래서 자식클래스에서 오버라이드된 메서드 getT(int n)가 아닌 부모 클래스의 getT()메소드가 호출된다
부모 클래스의 getT()는 x * y를 리턴하는데 값은 4 * 3을 출력
*/
System.out.println("=====================");
System.out.println("실행순서 : 5[메인프린트 함수] ->(6)[프린프함수에 선언한 객체] ->(3)[차일드에 생성자]->(1)[부모클래스의 생성자]->(7)[시스템에서 빌려온 프린트]->(2)[부모 클래스의 호출함수 실행]");
	
	
	











	
	
	
	
	
	}

}
