package base_1;

public class Student {
	
	private int no;
	private String name;
	
	//생성자
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public int getNo() {return no;}
	public String getName() {return name;}

	public void setNo(int no) {this.no = no;}
	public void setName(String name) {this.name = name;}
	
	@Override//재정의하여 학생번호와 이름해시코드를 합한 새로운 해시코드를 리턴하기위함 번호와 이름이 같으면 동일한 해시코드가 생성됨
	public int hashCode() {
int hashCode = no + name.hashCode();
return hashCode;
	}

	@Override
	public boolean equals(Object obj) {//Student객체인지 확인하고 학생번호와 이름이 같으면 true
if(obj instanceof Student target) {
	if(no == target.getNo() && name.equals(target.getName())) {
		//지정한 번호와 이름이 같으면
		return true;
	}
}
return false;
	}
}
/*
객체 해시코드 : 객체를 식별하는 정수를 말한다
- Object의 hashCode()메소드는 객체의 메모리 번지를 이용해서 해시코드를 생성하기 때문에
객체마다 다른정수값을 리턴한다 
- hashCode()메소드의 용도는 equals()메소드와 비슷한데 
두객체가 동등한지를 비교할때 주로 사용한다

*/
