package com.my.shop.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my.shop.service.AdminService;
import com.my.shop.vo.CategoryVO;

import net.sf.json.JSONArray;

@Controller
@RequestMapping("/admin/*")
public class AdminController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Inject
	AdminService adminService;
	
	//관리자 메인
	@GetMapping("/index")//admin/index
	public void getIndex() throws Exception{
		logger.info("관리자 화면 진입");
	}
	
	//상품등록
	@GetMapping("/goods/register")
	public void getGoodsRegister(Model model) throws Exception{
		logger.info("상품등록 페이지 진입");
		
		//처음에 비워져 있어야 함 초기화
		List<CategoryVO> category = null;
		category = adminService.category();
		model.addAttribute("category", JSONArray.fromObject(category));
	}
	
	
	
	
	

}
