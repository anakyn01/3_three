package exam20245;

abstract class Vehicle{//추상 클래스 => 객체를 직접 생성 ? 못함(반드시 상속받아 사용해야 클래스) 추상메서드
	String name;
	abstract public String getName(String val);
	
	public String getName() {
		return "Vehicle name:" + name;
	}
}
class Car extends Vehicle{
	public Car(String val) {
		name = super.name = val;
	}
	public String getName(String val) {
		return "Car name:" + val;
	}
	public String getName(byte val) {
		return "Car name:" + val;
	}
}


public class Bike {
	public static void main(String[] args) {
Vehicle obj = new Car("Spark");
System.out.println(obj.getName());

	}

}
