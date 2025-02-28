package com.my.homework.dto;

public class HomeEditRequestVO {
	
	//맴버변수 설정
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
	
	
	

}
