package exam20242;

class Parent{
	int compute(int num) {//7
		if(num <= 1)
			return num;//1
		return compute(num -1) + compute(num-2);
		//6 + 5 11
	}
}
class Child extends Parent{
	int compute(int num) {
		if(num <= 1)
			return num;//1
		return compute(num -1) + compute(num-3);
		//6 + 4 10
	}
}

public class Main {

	public static void main(String[] args) {
		Parent obj = new Child();
		System.out.print(obj.compute(7));
/*compute(7) = compute(6) + compute(4)
compute(6) =
compute(5) =
*/		
	}

}
