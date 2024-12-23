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
}
