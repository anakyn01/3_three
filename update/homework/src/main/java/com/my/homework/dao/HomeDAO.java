package com.my.homework.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.homework.dto.HomeEditRequestVO;

@Repository
public class HomeDAO {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	//insert
	public int insert(Map<String, Object>map) {
		int result = this.sqlSessionTemplate.insert("TB_BLG_CONT.insert",map);
		//숫자 변수 결과 = db삽입에 대한 방법
		if(result >0 && map.containsKey("seq_blg_cont")) {
			//삽입후 result를 체크함  result가 0보다 크면 성공
			//map.containsKey("seq_blg_cont") = map키를 포함하는지 확인
			return (int) map.get("seq_blg_cont");
		}
		return -1;
	}
	//select
	public Map<String, Object> selectOne(int blogContSeq) {
		return this.sqlSessionTemplate.selectOne("TB_BLG_CONT.selectOne",blogContSeq);
	}
	//update
	public int update(HomeEditRequestVO homeEditRequestVO) {//커맨드 v2
		return this.sqlSessionTemplate.update("TB_BLG_CONT.update", homeEditRequestVO);
	}
	
	
	
}
