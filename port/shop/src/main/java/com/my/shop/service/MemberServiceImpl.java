package com.my.shop.service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.my.shop.persistence.MemberDAO;
import com.my.shop.vo.MemberVO;

@Service//비즈니스 로직을 처리하는 클래스에 사용 비즈니스계층
public class MemberServiceImpl implements MemberService {
	
	@Inject
	private MemberDAO dao;

	@Override
	public void signup(MemberVO vo) throws Exception {
		dao.signup(vo);

	}

	@Override
	public MemberVO signin(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void signout(HttpSession session) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
