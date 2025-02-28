package com.simple.blog.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.simple.blog.dto.BlogEditRequestVO;

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
	
	//read
	public Map<String, Object> selectOne(int blogContSeq){
		/*
		//매개변수를 blogContSeq로 사용
		//여기서 사용한 blogContSeq를 기반으로 데이터베이스에서 하나의 레코드를 검색한다
		//Map<String, Object> 이쿼리에 결과가 키가 문자열이고 값이 객체인 맵이 될것으로 예상해준다
		*/
		return this.sqlSessionTemplate.selectOne("TB_BLG_CONT.selectOne", blogContSeq);
	}
	
	//수정
	public int update(BlogEditRequestVO blogEditRequestVO) {
		return this.sqlSessionTemplate.update("TB_BLG_CONT.update", blogEditRequestVO);
	}
	
	
	
	
	
	
	
	
	
	
	

}
