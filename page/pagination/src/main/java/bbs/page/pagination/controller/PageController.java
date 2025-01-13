package bbs.page.pagination.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import bbs.page.pagination.domain.BoardVO;
import bbs.page.pagination.service.PageService;

@Controller
public class PageController {
	
	@Inject
	PageService service;
	

	@GetMapping("/")
	public String getList(Model model) throws Exception{
		List<BoardVO> list = null;
		list = service.list();
		
		return "index";
	}
}
