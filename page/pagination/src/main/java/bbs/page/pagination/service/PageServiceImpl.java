package bbs.page.pagination.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import bbs.page.pagination.dao.PageDAO;
import bbs.page.pagination.domain.BoardVO;

@Service
public class PageServiceImpl implements PageService {

	@Inject //차이점은 autowired(스프링 프레임워크에서 제공하는 어노테이션) java EE및 CDI
	private PageDAO dao;
	
	@Override
	public List<BoardVO> list() throws Exception {
		return dao.list();
	}

}
