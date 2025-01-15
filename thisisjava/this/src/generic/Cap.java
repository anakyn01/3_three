package generic;

public class Cap<T> {//캡슐, 접근제어자 한정자
	//스프링부트에서 는 롬복으로 getter setter를 자동생성
	
	//필드
	private T t;

	public T getT() {//리턴
		return t;
	}

	public void setT(T t) {//설정
		this.t = t;
	}
	
	

}
