package com.my.homework.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.my.homework.dto.HomeListRequestVO;
import com.my.homework.dto.HomeListResponseVO;

@Mapper
public interface BlogMapper {

	int delete(int blogContSeq);
	
	List<HomeListResponseVO> selectList (HomeListRequestVO homeListRequestVO);
}
