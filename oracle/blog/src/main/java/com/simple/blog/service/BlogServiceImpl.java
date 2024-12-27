package com.simple.blog.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple.blog.dao.BlogDAO;

@Service
public class BlogServiceImpl implements BlogService {
	
	private BlogDAO blogDAO;
	/*생성자 주입
	생성자를 통해 의존성을 주입하는 것을 생성자 주입이라고 합니다
	생성자의 매개변수로 빈으로 관리되는 클래스를 정의하면
	스프링이 빈 인스턴스를 생성하고 클래스를 생성할때 생성자의 매개변수로 전달을 해줍니다
	*/
	@Autowired
	public BlogServiceImpl(BlogDAO blogDAO) {
		this.blogDAO = blogDAO;
	}
	
	@Override
	public int create(Map<String, Object> map) {
		int seq = this.blogDAO.insert(map);
		return seq;
	}
	

}
