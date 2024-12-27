package com.simple.blog.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository//데이터에 접근하는 객체로 메퍼XML과 한쌍입니다
public class BlogDAO {
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;//맴버변수[특정객체와 연결된 변수의 하나 
	
	public int insert(Map<String, Object> map) {
		int result = this.sqlSessionTemplate.insert("TB_BLG_CONT.insert", map);
		if(result > 0 && map.containsKey("seq_blg_cont")) {
			return (int) map.get("seq_blg_cont");
		}
		return -1;
	}

}
