package bbs.page.pagination.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import bbs.page.pagination.domain.BoardVO;

@Repository
public class PageDAOImpl implements PageDAO {
	
	@Inject//의존성 주입 코드에서 직접생성하는 것이아니라 외부에서 주입하는 방식 이를통해 객체간의 결합도를 낮추고 코드의 재사용성과 테스트 용이성을 높인다
    private SqlSessionTemplate sql;//데이터를 엑세스하는 레이어 
	
	private static String namespace = "bbs.page.pagination.mappers.board";
	
	@Override
	public List<BoardVO> list() throws Exception {
		return sql.selectList(namespace + ".list");
	}

}
