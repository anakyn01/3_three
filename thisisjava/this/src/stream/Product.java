package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Product {
	
	private int pno;
	private String name;
	private String company;
	private int price;
	//ci/cd  ������ ����, ������ ����
	//�ڹٿ��� �����ڸ� ����� ����? ��ü�� �����Ҷ� �ʱ�ȭ �۾��� �ڵ����� �����ϱ� ����
	//1)�ʱ�ȭ, 2)�ڵ��� ������, 3)��ü���� �ʼ��� ����, 4) �پ��� ��ü ������� ����(�����ε�)
	public Product(int pno, String name, String company, int price) {
		this.pno = pno;
		this.name = name;
		this.company = company;
		this.price = price;
	}
	
	//getter�� setter
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
	
	@Override//��Ʈ���� ���������� ������ ��Ʈ�� ������ �����...
	public String toString() {
		return new StringBuilder()
.append("{").append("pno:" + pno + ", ").append("name:" + name + ", ")
.append("company:" + company + ", ").append("price:" + price).append("}").toString();
	}
	
	//����Ʈ
	public static void main(String[] na) {
		
		//List �÷��� ����
		List<Product> list = new ArrayList<>();
		for(int i =1; i <=5; i++) {
Product product = new Product(i, "��ǰ"+i, "�ϸ� ��Ű�� ȸ�� ", (int)(10000 * Math.random()));
list.add(product);
		}
		
		//��ü ��Ʈ�� ���
		Stream<Product> stream = list.stream();
		stream.forEach(any -> System.out.println(any));
		
	}
	

}
/* �ڹ���ƿ �÷��� �������̽��� ��Ʈ���� �з��� �޼ҵ带 ������ �ֱ� ������ 
�ڽ� �������̽��� List�� set �������̽��� ������ ��� �÷��ǿ��� ��ü
��Ʈ���� ������ �ִ�*/
