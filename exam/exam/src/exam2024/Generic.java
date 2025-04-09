package exam2024;

class Printer{//void�� ���� ��� ��ȯ���� ���� 
	//printŬ������ ������ �޼��带 �����ε� �ϰ� �ֽ��ϴ�
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
		//Container ��ü�� �����ϰ� ���׸� Ÿ�� �Ķ���ͷ� 0(���� ���ͷ�)�� ����
	}
	public static class Container <T>{
		//�����̳� Ŭ������ ���׸�Ÿ�� <T>�� ������ �ν��Ͻ� ����value�� ���� �����մϴ�
		T value;
		public Container(T t) {
			value= t;
		}
		public void print() {//print() �ż���� 
			new Printer().print(value);
			//Printer��ü�� �����Ͽ� print(value)�� ȣ���մϴ�
		}
	}

}
