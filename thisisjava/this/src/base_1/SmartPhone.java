package base_1;

public class SmartPhone {
	
	private String company;
	private String os;
	
	//������
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	//toString()�޼ҵ带 �������ؼ� ������� �ü���� ���յ� ���ڿ��� ����
	@Override
	public String toString() {//������ ���ڿ��� ��Ģ�� ����
		return company + ", " + os;
	}

}
