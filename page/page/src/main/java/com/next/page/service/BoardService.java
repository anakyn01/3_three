package com.next.page.service;

import java.util.List;

import com.next.page.domain.BoardVO;

public interface BoardService {
	
	public List<BoardVO> list() throws Exception;

}
