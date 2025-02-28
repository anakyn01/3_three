package com.simple.blog.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.simple.blog.dto.BlogListRequestVO;
import com.simple.blog.dto.BlogListResponseVO;

@Mapper //두개의 유형간에 매핑을 처리하는 Mapper인터페이스를 정의 하는데 사용합니다
public interface BlogMapper {
	int delete(int blgContSeq);
	//리스트
	List<BlogListResponseVO> selectList (BlogListRequestVO blogListRequestVO);
	//List<BlogListResponseVO> 리턴유형 객체목록 selectList[메서드 이름]
	//BlogListRequestVO blogListRequestVO[매개변수의 인스턴스]
}
