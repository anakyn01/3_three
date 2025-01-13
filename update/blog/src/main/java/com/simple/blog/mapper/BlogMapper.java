package com.simple.blog.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper //두개의 유형간에 매핑을 처리하는 Mapper인터페이스를 정의 하는데 사용합니다
public interface BlogMapper {
   int delete(int blgContSeq);
}