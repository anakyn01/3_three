package com.my.homework.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.my.homework.dto.HomeListRequestVO;
import com.my.homework.dto.HomeListResponseVO;

@Mapper
public interface HomeMapper {
	//delete
	int delete(int blgConSeq);
	//list
    List<HomeListResponseVO> selectList (HomeListRequestVO homeListRequestVO);
    //homeListRequestVO라는 객체를 매개변수로 받아 조건에 맞는 레코드 리스트를 반환.
    //반환 타입은 List<HomeListResponseVO>로, 여러 개의 HomeListResponseVO 객체를 포함한 리스트
}
