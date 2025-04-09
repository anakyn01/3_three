package exam2024;

class B{
	int x = 3;
	int getX() {
		return x * 2;//6
	}
}

class A extends B{
	int x = 7;
	@Override//값이 다르게 나오게 하기 위함
	int getX() {
		return x * 3;//21
	}

}

public class Annotation {
	public static void main(String[] args) {
		/*B b1 = new B();
		A a1 = new A();
		System.out.println(b1.getX());
		System.out.println(a1.getX());*/
		B b1 = new A();
		A b2 = new A();
		
System.out.print(b1.getX() + b1.x + b2.getX() + b2.x );		
		/*System.out.println(b1.getX());//21 +
		System.out.println(b1.x);//3
		System.out.println(b2.getX());//21
		System.out.println(b2.x);//7*/
	}
	
	
	
	
	
	

}
