package com.my.homework.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.homework.dao.HomeDAO;
import com.my.homework.dto.HomeEditRequestVO;
import com.my.homework.mapper.BlogMapper;

@Service
public class HomeImpl implements HomeService{

	//서비스 생성자 주입 => 생성자를 통해 의존성을 주입하는 것을 생성자 주입이라고함
	//생성자의 매개변수로 빈으로 관리되는 클래스를 정의해두면
	// 스프링이 빈 인스턴스를 생성하고 클래스를 생성할 때 생성자의 매개변수로 전달한다
	private HomeDAO homeDAO;
	private BlogMapper blogMapper;
	
	@Autowired
	public HomeImpl(HomeDAO homeDAO, BlogMapper blogMapper) { // 종속성을 주입하기 위함
		this.homeDAO = homeDAO;
		this.blogMapper = blogMapper;
	}
	@Override
	public int create(Map<String, Object> map) {
		int seq = this.homeDAO.insert(map); // 숫자형 변수 seq =>
		// 대입 DAO에 insert 맵을
		return seq;
	}
	
	@Override
	public boolean delete(int blogContSeq) {
		return this.blogMapper.delete(blogContSeq) > 0;
	}

	@Override // read
	public Map<String, Object> read (int blogContSeq) {
		Map<String, Object> blogCont = this.homeDAO.selectOne(blogContSeq);
		return blogCont;
	}
	// edit
	@Override
	public boolean edit(HomeEditRequestVO homeEditRequestVO) {
		int affectRowsCount = this.homeDAO.update(homeEditRequestVO);
		// 데이터베이스에서 업데이트 작업을 수행하기 위해 호출한다
		// update 메서드는 업데이트 쿼리의 영향을 받는 행수를 나타내는 정수를 반환하는 것으로 가정한다
		return affectRowsCount > 0;
	}
	
	
}
