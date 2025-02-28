package school.test.homework.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HomeDAO {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	//create
	public int insert(Map<String, Object> map) {
		return this.sqlSessionTemplate.insert("home.insert", map);
	}
	
	//read
	public Map<String, Object> selectDetail(Map<String, Object> map){
		return this.sqlSessionTemplate.selectOne("home.select_detail", map);
	}
	//sqlSessionTemplate 의 selectOne 메소드는 데이터를 한 개만 가져올 때 사용한다. 
	//만약 쿼리 결과 행 수가 0개면 selectOne 메소드는 null을 반환하게 되며 쿼리 결과가 여러 개면 
	//TooManyResultsException 예외를 던진다.
}
