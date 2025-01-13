package com.my.homework.dto;

public class HomeEditRequestVO {

	// 멤버변수 설정
	private int blogContSeq;
	private String title;
	private String contBdy;
	public int getBlogContSeq() {
		return blogContSeq;
	}
	public void setBlogContSeq(int blogContSeq) {
		this.blogContSeq = blogContSeq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContBdy() {
		return contBdy;
	}
	public void setContBdy(String contBdy) {
		this.contBdy = contBdy;
	}
	
	
	
}
