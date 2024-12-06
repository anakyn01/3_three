package com.spring.hyi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.hyi.dao.BookDao;

//서비스 클래스는 비즈니스 클래스가 위치한곳 스프링 mvc에서 서비스 클래스는 컨트롤러와 DAO를 연결하는 역활을 한다

@Service//클라이언트의 요청에 대한 비즈니스 로직을 수행하는 컴포넌트
public class BookServiceImpl implements BookService {

	@Autowired
	BookDao bookDao;
}
