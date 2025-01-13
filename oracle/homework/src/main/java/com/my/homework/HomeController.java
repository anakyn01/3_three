package com.my.homework.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.my.homework.servcie.HomeService;

@Controller
public class HomeController {
	

	@Autowired
	HomeService homeService;
	
	@GetMapping(value = "/")
	public String home() {		
		return "home";
	}
	
	//
	@GetMapping(value="/create")
	public String getCreate() {
		return "create";
	}
	
	//create ���옣硫붿꽌�뱶
	@PostMapping(value="/create")
	public String postCreate(@RequestParam Map<String, Object> map) {
		//@RequestParam(�슂泥��뿉 紐⑤뱺 荑쇰━ 留ㅺ컻蹂��닔 �삉�뒗 �뼇�떇 留ㅺ컻蹂��닔瑜� 諛붿씤�뵫) Map<String, Object> map
		//Map<String(�궎), Object(媛�)> �씠瑜� 媛곴컖�쓣 媛쒕퀎�쟻�쑝濡� 吏��젙�븯吏� �븡怨� 留ㅺ컻蹂��닔瑜� �닔�떊�븯�뒗�뜲 �쑀�슜�빀�땲�떎
		int blogContSeq = this.homeService.create(map);//�닽�옄 
		//create留ㅼ꽌�뱶瑜� �샇異쒗븯怨� 留ㅺ컻蹂��닔瑜� �룷�븿�븯�뒗 homeService瑜� �쟾�떖�빀�땲�떎 �씠留ㅼ꽌�뱶�뒗 寃뚯떆臾쇱쓣 留뚮뱾怨� �뜲�씠�꽣踰좎씠�뒪 ���옣�븯怨� �깉濡� 留뚮뱺 寃뚯떆臾쇱쓽 �떆���뒪 id瑜� 諛섑솚�븯�뒗 �뿭�솢�쓣 �빀�땲�떎
		return "redirect:/read/" + String.valueOf(blogContSeq);
	}
	
	

	
	
	
	
	
	
	
	
}
