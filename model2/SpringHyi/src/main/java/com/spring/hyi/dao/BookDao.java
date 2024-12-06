package com.spring.hyi.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository //해당 클래스가 데이터 접근 계층의 구현체임을 명시
public class BookDao {

	@Autowired //필요한 의존 객체 타입에 해당하는 빈을 찾아 주입
	SqlSessionTemplate sqlSessionTemplate;
	
	public int insert(Map<String, Object> map) {
		return this.sqlSessionTemplate.insert("book.insert", map);
	}
}
