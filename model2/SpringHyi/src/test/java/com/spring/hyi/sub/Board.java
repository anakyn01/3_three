package com.spring.hyi.sub;

public class Board {

	private String subject;
	private String content;
	private String writer;
	
	//getter
	public String getSubject() {return subject;}
	public String getContent() {return content;}
	public String getWriter() {return writer;}
	
	//setter
	public void setSubject(String subject) {this.subject = subject;}
	public void setContent(String content) {this.content = content;}
	public void setWriter(String writer) {this.writer = writer;}

	//생성자 생성자를 사용하는 이유 맴버변수(클래스안에 변수)에 더 편하게 초기화 하기 위해서
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
}
