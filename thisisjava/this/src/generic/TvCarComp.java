package generic;

public class TvCarComp {

	public static void main(String[] args) {
		
		Product<Tv, String> product1 = new Product<>();
		//k는 Tv로 대체 M은 스트링으로대체
		
		//setter[쓰고 설정하고] 매개값은 반드시 Tv와 String을 제공함
		product1.setKind(new Tv());//tv값을 넣기위해서 객체생성
		product1.setModel("스마트 TV");
		
		//getter 리턴값은 Tv와 String이 됨
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		//자동차를 선택할경우 Product<K, String>
		Product<Car, String> product2 = new Product<>();
		//setter[쓰고 설정하고] 매개값은 반드시 Car와 String을 제공함
		product2.setKind(new Car());
		product2.setModel("SUV");
		
		//getter 리턴값은 Car와 String이 됨
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
		
		
		
	}
	
}
