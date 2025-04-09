package com.next.page.dao;

import java.util.List;

import com.next.page.domain.BoardVO;

public interface BoardDAO {
	
	public List<BoardVO> list() throws Exception;//매서드 서명
	//모든 클래스에서 해당매서드 접근 public{접근 제한자}
	//List<BoardVO> => 매서드의 반환유형 <BoardVO>값에 대한 객체
	//list() 
	//throws Exception => 매서드가 실행중에 예외를 드로우 할수 있음을 나타냄
	//내부적으로 예외를 처리하지 않고 대신에 호출코드에서 예외를 처리한다는걸 의미합니다

}
