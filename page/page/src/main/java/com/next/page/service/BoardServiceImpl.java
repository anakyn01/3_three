package com.next.page.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.next.page.dao.BoardDAO;
import com.next.page.domain.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired//데이터를 담아서 콘트롤러에 전달하기 위해
    private BoardDAO dao;
	
	@Override
	public List<BoardVO> list() throws Exception {
		return dao.list();
	}

}
