package com.my.homework.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class HomeDAO {
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	/*
	이 메서드 insert 데이터베이스에 레코드를 삽입하는 데이터 엑세스 계층(mybatis사용)
	*/
	public int insert(Map<String, Object> map) {
		int result = this.sqlSessionTemplate.insert("TB_BLG_CONT.insert", map);
		//숫자 변수 결과 = 데이터베이스 삽입에 대한 방법을 사용
		if (result > 0 && map.containsKey("seq_blg_cont")) {
		//삽입후에 result를 체크함 result > 0(성공[적어도 하나의 행을 영향을 받음) 
		//map.containsKey("seq_blg_cont") map키를 포함하는지 확인한다
			return (int) map.get("seq_blg_cont");
		//삽입이 성공하고 seq_blg_cont가 존재하는 경우 해당키와 연관된 값 	map.get("seq_blg_cont");을
		//반환하고 이를 정수로 변환
		}
		return -1;//실패했을 경우 -1를 리턴 
	}

}
