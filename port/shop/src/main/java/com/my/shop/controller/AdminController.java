package com.my.shop.controller;

//import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//import com.my.shop.service.AdminService;

@Controller
@RequestMapping("/admin/*")
public class AdminController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	/*@Inject
	AdminService adminService;*/
	
	//관리자 메인
	@GetMapping("/index")//admin/index
	public void getIndex() throws Exception{
		logger.info("관리자 화면 진입");
	}
	
	
	
	
	
	

}
