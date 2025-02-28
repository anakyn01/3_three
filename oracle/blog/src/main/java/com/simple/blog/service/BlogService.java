package com.simple.blog.service;

import java.util.List;
import java.util.Map;

import com.simple.blog.dto.BlogEditRequestVO;
import com.simple.blog.dto.BlogListRequestVO;
import com.simple.blog.dto.BlogListResponseVO;

public interface BlogService {

	int create(Map<String, Object> map);
	
	//read
	Map<String, Object> read (int blogContSeq);
	//edit
	boolean edit(BlogEditRequestVO blogEditRequestVO);
	//delete
	boolean delete(int blogContSeq);

	//list 메소드 시그니처
	List<BlogListResponseVO> list(BlogListRequestVO blogListRequestVO);

}
