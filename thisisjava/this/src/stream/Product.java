package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Product {
	
	private int pno;
	private String name;
	private String company;
	private int price;
	//ci/cd  지속적 통합, 지속적 배포
	//자바에서 생성자를 만드는 이유? 객체를 생성할때 초기화 작업을 자동으로 수행하기 위함
	//1)초기화, 2)코드의 가독성, 3)객체생성 필수값 설정, 4) 다양한 객체 생성방법 제공(오버로딩)
	public Product(int pno, String name, String company, int price) {
		this.pno = pno;
		this.name = name;
		this.company = company;
		this.price = price;
	}
	
	//getter와 setter
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override//스트링에 변동사항이 많을때 스트링 빌더를 사용함...
	public String toString() {
		return new StringBuilder()
.append("{").append("pno:" + pno + ", ").append("name:" + name + ", ")
.append("company:" + company + ", ").append("price:" + price).append("}").toString();
	}
	
	//프린트
	public static void main(String[] na) {
		
		//List 컬렉션 생성
		List<Product> list = new ArrayList<>();
		for(int i =1; i <=5; i++) {
Product product = new Product(i, "상품"+i, "일만 시키는 회사 ", (int)(10000 * Math.random()));
list.add(product);
		}
		
		//객체 스트림 얻기
		Stream<Product> stream = list.stream();
		stream.forEach(any -> System.out.println(any));
		
	}
	

}
/* 자바유틸 컬렉션 인터페이스는 스트림과 패러럴 메소드를 가지고 있기 때문에 
자식 인터페이스인 List와 set 인터페이스를 구현한 모든 컬렉션에서 객체
스트림을 얻을수 있다*/
