package com.my.shop.service;

import com.my.shop.vo.MemberVO;

public interface MemberService {
	
	//회원가입
	public void signup(MemberVO vo) throws Exception;

}
