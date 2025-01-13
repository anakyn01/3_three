package spring.mvc.v2.vo;
/*
목록요청 VO는 처리에 필요한 값을 들고 다니는 컨테이너 역활을 하는 객체입니다
- 스프링이 HTTP요청 매개변수를 담아서 컨트롤러 메소드에 전달하면
- 컨트롤러가 서비스에 전달하고
- 서비스는 매퍼인터페이스에 전달하고
- 매퍼 인터페이스는 매퍼XML에 전달합니다
*/
public class V2ListRequestVO {
	//목록요청 VO멤버변수 
	private String search;

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}
	
	

}
