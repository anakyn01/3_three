package com.simple.blog.dto;

public class BlogListRequestVO {

	//캡슐 => 자바에서는 은닉 vue는 (html+css+script)
	private String search;

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}
	
	
}
