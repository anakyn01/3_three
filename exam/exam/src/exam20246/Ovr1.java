package exam20246;

public class Ovr1 {

	public static void main(String[] args) {
Ovr1 a1 = new Ovr1();
Ovr1 a2 = new Ovr2();
System.out.println(a1.sun(3, 2) + a2.sun(4, 5));
	}
	
	int sun(int x, int y) {
		return x + y;
	}

}

class Ovr2 extends Ovr1{
	int sun(int x, int y) {
		return x - y + super.sun(x, y);
	}
}



