package exam2024;

class Printer{//void가 들어가는 경우 반환값이 없음 
	//print클래스는 세개의 메서드를 오버로딩 하고 있습니다
	void print(Integer a) {
		System.out.println("A" + a);
	}
	void print(Object a) {
		System.out.println("B" + a);	
	}
	void print(Number a) {
		System.out.println("C" + a);
	}
}

public class Generic {

	public static void main(String[] args) {
		new Container<>(0).print();
		//Container 객체를 생성하고 제네릭 타입 파라미터로 0(정수 리터럴)을 전달
	}
	public static class Container <T>{
		//컨테이너 클래스는 제네릭타입 <T>를 가지고 인스턴스 변수value에 값을 지정합니다
		T value;
		public Container(T t) {
			value= t;
		}
		public void print() {//print() 매서드는 
			new Printer().print(value);
			//Printer객체를 생성하여 print(value)를 호출합니다
		}
	}

}
