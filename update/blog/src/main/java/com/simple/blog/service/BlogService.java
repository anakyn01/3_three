package com.simple.blog.service;

import java.util.Map;

import com.simple.blog.dto.BlogEditRequestVO;

public interface BlogService {
	
	//write
	int create(Map<String, Object> map);
	
	//read
	Map<String, Object> read (int blogContSeq);
	
	//edit
	boolean edit(BlogEditRequestVO blogEditRequestVO);
	
	//delete
	boolean delete(int blogContSeq);

}
