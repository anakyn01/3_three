package com.my.shop.controller;

import java.io.File;
import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.my.shop.service.AdminService;
import com.my.shop.utils.UploadFileUtils;
import com.my.shop.vo.CategoryVO;
import com.my.shop.vo.GoodsVO;
import com.my.shop.vo.GoodsViewVO;

import net.sf.json.JSONArray;

@Controller
@RequestMapping("/admin/*")
public class AdminController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Inject
	AdminService adminService;
	
	@Resource(name="uploadPath")//업로드 패스 정의
	private String uploadPath;
	
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
List<CategoryVO> category = null; //CategoryVO형태의 list형 변수 category선언
category = adminService.category();
//DB에 저장된 카테고리를 가져와서 category에 저장
model.addAttribute("category", JSONArray.fromObject(category));
//변수 카테고리를 제이슨 타입으로 변환하여 카테고리 세션에 부여
	}
		
	//상품등록 post
	@PostMapping("/goods/register")
	public String postGoodsRegister(GoodsVO vo, MultipartFile file) throws Exception{
//멀티파일을 사용할 경우
//이미지를 업로드할 폴더를 설정 = 
String imgUploadPath = uploadPath + File.separator + "imgUpload";
String ymdPath = UploadFileUtils.calcPath(imgUploadPath);//위의 폴더를 기준으로 연원일 폴더를 생성
String fileName = null;

//첨부파일이 없이 올리는 것도 고려를 해야합니다
if(file.getOriginalFilename() != null && file.getOriginalFilename() != "") {
	fileName = UploadFileUtils.fileUpload(imgUploadPath, file.getOriginalFilename(), file.getBytes(), ymdPath);
	//원본파일경로 + 파일명 저장
	vo.setGdsImg(File.separator + "imgUpload" + ymdPath + File.separator + fileName);
	//썸네일
vo.setGdsThumbImg(File.separator + "imgUpload" + ymdPath + File.separator +"s"+File.separator+"s_" +fileName);	
}else {//첨부된 파일이 없으면 
//미리 업로드 시켜놓은 none.png파일을 대신 출력
	fileName = File.separator + "images" + File.separator + "none.png";
	vo.setGdsImg(fileName);
	vo.setGdsThumbImg(fileName);
}


		adminService.register(vo);
		
		return "redirect:/admin/index";
	}
	
	//상품 목록
	@GetMapping(value="/goods/list")
	public void getGoodsList(Model model) throws Exception{
logger.info("상품 리스트 출력");
List<GoodsViewVO>list = adminService.goodslist();// GoodsVO형태의 List형 변수 list 선언
model.addAttribute("list",list);
	}
	
//상품조회 1)리스트에서 리스트 글들중에 제목을 선택하는데 그제목에 해당글에 순번이 랩핑 2)랩핑된걸로 요청 3)순번에 맞는 read page 보여줌
	@GetMapping(value="/goods/view")
	public void getGoodsview(@RequestParam("n") int gdsNum, Model model)throws Exception{
logger.info("상세페이지");
//리턴시킬 변수 정의
GoodsViewVO goods = adminService.goodsView(gdsNum);
model.addAttribute("goods", goods);

	}
	
	
	
	
	
	

}
