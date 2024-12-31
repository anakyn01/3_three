package spring.mvc.v2.vo;

public class V2EditRequestVO {
	
	//멤버변수 => 특정객체와 연결된 변수. 클래스 변수, 인스턴스 변수. 객체가 가지고 있는 속성과 기능을 그 객체의 멤버라 한다
	//이중 속성은 멤버변수라 칭하고 기능은 메서드라 칭한다. alt+shft+s
	private int blogContSeq;
	private String title;
	private String contBdy;
	
	//getter
	public int getBlogContSeq() {return blogContSeq;}
	public String getTitle() {return title;}
	public String getContBdy() {return contBdy;}
	
	//setter
	public void setBlogContSeq(int blogContSeq) {this.blogContSeq = blogContSeq;}
	public void setTitle(String title) {this.title = title;}
	public void setContBdy(String contBdy) {this.contBdy = contBdy;}
	

/*
 VO(Value Object) or DTO(data transfer object)라고 함
 좀 전까지 값을 전달하는 방법으로 Map을 사용함
 Map의 장점
 - 굉장히 유연해서 변경에 강하다 but 무슨 값이 있는지 실행하기 전에 아무도 모른다는 단점이 있다
 - 반면에 VO(Value Object)는 값의 이름과 타입을 미리 정의해서 사용하는 방법입니다.
 - 코드만 보고 내용물을 파악할 수 있는 장점[자동완성이 된다는 최대장점]이 있는데 but 코드를 더 많이 써야하므로 번거롭다는 단점이 있음.
 - 프로젝트를 하다가 원리원칙을 중요하게 여기는 AA, PM을 만나면 반드시 VO 를 사용하세요~ 하는 지침을 받는다.
 
 * PM(project manager) 프로젝트 총괄(장) : 모든 관리업무를 책임지는 사람 -  커뮤니케이션 
 * PL(project leader) :pm을 도와서 프로젝트의 리딩을 담당, 개발, 관리능력, 고급기술 등 커뮤니케이션 - 세부관리까지
 * AA(application architect) : 공통로직, 개발표준, 프레임워크 등 공통업무 설계자
 * TA(technical architect), OS, WEB,WAS,DB설치 등 하드웨어와 네트워크 구축
 * DA(data architect) : 데이터 표준, 구조, 품질, 마이그레이션 등 DB설계자
 * QA(quality assurance) : 산출물과 소스코드에 대한 품질을 보증하는 담당자
 * BA(business architect) : 기술적 관점이 아닌 비지니스 관점의 프로세스 설계자
 * 개발자(developer) : 프로젝트의 최하단에서 실제 개발을 진행하는 사람
 */


}
