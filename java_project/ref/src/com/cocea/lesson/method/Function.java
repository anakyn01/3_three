package com.cocea.lesson.method;

public class Function {
	
	//���Ǹ� ����Ʈ ��Ʈ ������
	static void myMethod() {
		System.out.println("����Ʈ��Ʈ ������ ���� ȣ�⸸ ����Ʈ��Ʈ����");
	}
	
	//
	static void myName(String fname) {
		System.out.println(" ���� ���� "+ fname + "�� �Դϴ�");
	}
	
	//�Ű������� �ΰ��� �Լ��� �μ��� ������ ���� ���� �˴ϴ�
	static void Iam(String fname, int age){
		System.out.println(fname + " is " + age);
	}
	
	//���� return�� ���� void��ſ� ������ type�� ���ϴ�
	//����Ҷ� print�ؾߵ�
	static int myNums(int x) {
		return 5 + x;
	}
	
	static int plus(int q, int w) {
		return q + w;
	}
	
	/*�����ε�[Ÿ���� �ٸ��� ������ �޼����] �������̵�[Ŭ������ �Ը��� �°� ������]*/
	static int plusMethodInt(int v, int m) {
		return v + m;
	}
	
	static double plusMethodDouble(double v, double m) {
		return v + m;
	}
	
	

	public static void main(String[] args) {
		
		int myNum1 = plusMethodInt(8, 5);
		double myNum2 = plusMethodDouble(4.3, 6.26);
		System.out.println("int: " + myNum1);
		System.out.println("double: " + myNum2);
		
		int e = plus(5, 3);
		System.out.println(e);
		
		System.out.println(myNums(3));
		myMethod();
		myName("Ȳ");
		Iam("ghkd",47);
		
/*
�ż���
- Ŭ���� ������ ����Ǿ�� �մϴ�
- ȣ���Ҷ��� �ż����()
- print port���� ȣ�⸸
- �����θ� ȣ���ϴ°� ����Լ��� �Ѵ�
static[Ŭ������ ���ϰ� Ŭ������ ��ü�� �ƴ϶�°� �ǹ�] void[��ȯ���� ���ٴ� ���� �ǹ�] 
myMethod() �޼��� ��Ī

function �Լ���(){}
�Լ��� = () => {}

*/
		
		
		
		
		
		
		
String Meth = "�ż���� ȣ��ɶ��� ����Ǵ� �ڵ����\n"+
"�޼ҵ�� Ư�� �۾��� �����ϴµ� ����ϸ� �Լ� ����� �մϴ�\n"+
"�� �޼ҵ带 ����ϳ���? dry �ڵ带 �����Ϸ��� �ѹ� �����ϰ� ������ ����ϼ���";
System.out.println(Meth);
	}

}