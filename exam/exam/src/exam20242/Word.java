package exam20242;

public class Word {

	public static void main(String[] args) {
		A b = new B();//a Ŀ�ǵ� b �ν��Ͻ��� b�� �ְ�
		b.paint();//b�� ����Ʈ �Լ�
		b.draw();//b�� draw�Լ�
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

class B extends A{//Ŭ���� b�� a�� ���
	public void paint() {
		super.draw();//�θ� ��ο� 
		System.out.print("C");
		this.draw();//�ڱ��ڽ�
	}
	public void draw() {
		System.out.print("D");
	}
}



