package com.my.homework.dto;
/*
목록요청 vo는 처리에 필요한 값을 들고 다니는 컨테이너 역할을 하는 객체
스프링이 http요청 매개변수를 담아서 컨트롤러 method에 전달 -> 컨트롤러가 서비스에 전달 -> 서비스는 매퍼인터페이스에 전달 -> 매퍼인터페이스는매퍼xml에전달
 */
public class HomeEditRequestVO {

	//멤버변수 설정
	private int blogContSeq;
	private String title;
	private String contBdy;
	
	//g
	public int getBlogContSeq() {return blogContSeq;}
	public String getTitle() {return title;}
	public String getContBdy() {return contBdy;}
	//s
	public void setBlogContSeq(int blogContSeq) {this.blogContSeq = blogContSeq;}
	public void setTitle(String title) {this.title = title;}
	public void setContBdy(String contBdy) {this.contBdy = contBdy;}
}
