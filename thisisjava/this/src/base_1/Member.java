package base_1;

public class Member {
	
	public String id;
	
	//생성자
	public Member(String id) {
		this.id = id;
	}
	
	@Override//Object의 equals()메소드를 재정의 하기위해
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {
			//obj가 member타입인지 검사하고 타입변환후에 target변수에 대입
			if(id.equals(target.id)) {//id문자열이 같은지 비교
				return true;
			}
		}
		return false;
	}

}
