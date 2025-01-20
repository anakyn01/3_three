package base_1;

public class SmartPhone {
	
	private String company;
	private String os;
	
	//생성자
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	//toString()메소드를 재정의해서 제조사와 운영체제가 결합된 문자열을 리턴
	@Override
	public String toString() {//리턴할 문자열과 규칙을 정함
		return company + ", " + os;
	}

}
