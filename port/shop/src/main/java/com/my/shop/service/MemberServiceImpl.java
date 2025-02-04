package com.my.shop.service;

import javax.inject.Inject;

import com.my.shop.persistence.MemberDAO;
import com.my.shop.vo.MemberVO;

public class MemberServiceImpl implements MemberService {
	
	@Inject
	private MemberDAO dao;

	@Override
	public void signup(MemberVO vo) throws Exception {
		dao.signup(vo);

	}

}
