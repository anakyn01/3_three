package com.my.shop.persistence;

import java.util.List;

import com.my.shop.vo.CategoryVO;

//매퍼의 쿼리문을 호출하는 dao
public interface AdminDAO {
	
	//카테고리
	public List<CategoryVO> category() throws Exception;

}
