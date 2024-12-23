package com.spring.hyi.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public int join(Map<String, Object> map) {
		return this.sqlSessionTemplate.insert("member.join", map);
	}
	
	
	
	
	
	
}
