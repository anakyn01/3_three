package com.simple.blog.dto;

public class BlogEditRequestVO {
	
	private int blogContSeq;
	private String title;
	private String contBdy;
	
	public int getBlogContSeq() {return blogContSeq;}
	public String getTitle() {return title;}
	public String getContBdy() {return contBdy;}
	
	public void setBlogContSeq(int blogContSeq) {this.blogContSeq = blogContSeq;}
	public void setTitle(String title) {this.title = title;}
	public void setContBdy(String contBdy) {this.contBdy = contBdy;}
	
}

/*
VO(Value Object) or DTO라고 함
좀전에 까지 값을 전달하는 방법으로 Map을 사용함
Map에 장점 
- 굉장히 유연해서 변경에 강하다 but 무슨값이 있는지 실행하기전에 아무도 로른다는 단점이 있습니다
반면 VO(Value Object)는 값의 이름과 타입을 미리 정의해서 사용하는 방법입니다
코드만 보고 내용물을 파악할수 있는 장점[자동완성이 된다는 최대 장점]이 있는데 but 코드를 더많이 써야 하므로 번거롭다는 단점이 있다
프로젝트를 하다가 원리원칙을 중요하게 여기는 AA, PM을 만나면 반드시 VO를 사용하라는 지침을 받습니다

PM(project manager):모든 관리업무를 책임지는 사람 커뮤니케이션
PL(project leader):pm을 도와서 프로젝트의 리딩을 담당,개발,관리능력,고급기술,등 을 커뮤니케이션 
AA(Application Architect):공통로직, 개발표준, 프레임워크 등 공통업무 설계자
TA(Technical Architect),OS,WEB,WAS,DB설치등 하드웨어와 네트워크 구축
DA(Data  Architect):데이터 표준, 구조, 품질, 마이그레이션 등 DB설계자
QA(Quality Assurance):산출물과 소스코드에 대한 품질을 보증하는 담당자
BA(business architect):기술적 관점이 아닌 비즈니스 관점의 프로세스 설계자
개발자(Developer):프로젝트의 최하단에서 실제 개발을 진행하는 사람
*/