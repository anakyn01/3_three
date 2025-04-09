package com.next.page.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;//네임스페이스
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.next.page.domain.BoardVO;
import com.next.page.service.BoardService;

@Controller
//공통되는 sub폴더명이 들어갈때는 리퀘스트맵핑을 사용한다
@RequestMapping("/page/*")
public class PageController {
	
	@Autowired
	BoardService service;
	
	//@RequestMapping(value="/list", method=RequestMethod.GET)
	@GetMapping("/list")//
	public void getList(Model model) throws Exception{
		List<BoardVO> list = null;
		list = service.list();
		
		model.addAttribute("list", list);
	}


}
