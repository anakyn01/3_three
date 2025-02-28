package com.my.shop.persistence;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.shop.vo.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {

//	@Inject
	@Autowired
	private SqlSession sql;
	
	private static String namespace="com.my.shop.mappers.memberMapper";
	
	@Override
	public void signup(MemberVO vo) throws Exception {
		sql.insert(namespace + ".signup", vo);
	}
	
	@Override
	public MemberVO signin(MemberVO vo) throws Exception {
		return sql.selectOne(namespace + ".signin", vo);
	}

}
