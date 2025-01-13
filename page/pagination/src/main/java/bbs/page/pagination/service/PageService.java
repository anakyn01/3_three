package bbs.page.pagination.service;

import java.util.List;

import bbs.page.pagination.domain.BoardVO;

public interface PageService {

	//list
	public List<BoardVO> list() throws Exception;
}
