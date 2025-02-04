package com.my.shop.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.my.shop.vo.MemberVO;

public class MemberDAOImpl implements MemberDAO {
	
	@Inject
	private SqlSession sql;//sql에 명령어를 가져옴
	
	//매퍼설정
	private static String namespace="com.my.shop.mappers.memberMapper";

	//회원가입
	@Override
	public void signup(MemberVO vo) throws Exception {
		sql.insert(namespace + ".signup", vo);

	}

}
