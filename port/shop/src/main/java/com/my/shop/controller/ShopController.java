package com.my.shop.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.my.shop.service.ShopService;
import com.my.shop.vo.GoodsViewVO;

@Controller
@RequestMapping("/shop/*")
public class ShopController {
	
	private static final Logger logger = LoggerFactory.getLogger(ShopController.class);
	
	@Inject
	ShopService service;


	
	//카테고리별 상품리스트
	@GetMapping("/list")
	public void getList(@RequestParam("c") int cateCode, @RequestParam("l") int level, Model model)throws Exception{
		logger.info("소비자 페이지 진입");
		List<GoodsViewVO> list = null;
		list = service.list(cateCode, level);
		model.addAttribute("list",list);
	}
	
	//상품조회
	@GetMapping("/view")
	public void getView(@RequestParam("n") int gdsNum, Model model) throws Exception{
		logger.info("get view");
		
		GoodsViewVO view = service.goodsView(gdsNum);
		model.addAttribute("view",view);
	}
	
	
	
	
	
	
	
	
	
	
}
