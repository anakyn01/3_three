package com.next.page.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.next.page.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {
	
	@Inject
	private SqlSession sql;
	
	private static String namespace = "com.next.page.mappers.board";

	@Override
	public List<BoardVO> list() throws Exception {
		return sql.selectList(namespace + ".list");//sql세쎤 + 함수(네임스페이스 + 마이바티스 id)
	}

}
