package bbs.page.pagination.dao;

import java.util.List;

import bbs.page.pagination.domain.BoardVO;

public interface PageDAO {
	
	public List<BoardVO> list() throws Exception;
	/*
	 throws => 메소드 선언부에 사용되며, 해당 메소드가 호출될때 발생할수 있는 예외를 명시
	 Exception => 자바에서 예외를 처리하는 클래스의 최상위 클래스 
	 Exception을 throws뒤에 명시하면 그메소드에서 발생할수 있는 예외가 Exception또는
	 그 하위 클래스임을 나타냅니다 자바에서 모든 체크예외는 Exception클래스를 상속하므모
	 throws Exception을 사용하면 모든 체크예외를 처리할수 있다는 의미이다
	 */

}
