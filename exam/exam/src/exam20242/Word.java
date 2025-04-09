package exam20242;

public class Word {

	public static void main(String[] args) {
		A b = new B();//a 커맨드 b 인스턴스로 b를 넣고
		b.paint();//b에 페인트 함수
		b.draw();//b에 draw함수
	}

}

class A{
	public void paint() {
		System.out.print("A");
		draw();//B
	}
	public void draw() {
		System.out.print("B");
		draw();//B
	}
}

class B extends A{//클래스 b는 a에 상속
	public void paint() {
		super.draw();//부모 드로우 
		System.out.print("C");
		this.draw();//자기자신
	}
	public void draw() {
		System.out.print("D");
	}
}



