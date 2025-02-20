package com.my.shop.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.my.shop.persistence.ShopDAO;
import com.my.shop.vo.GoodsViewVO;

@Service//실제 비즈니스 로직이 흐르는곳
public class ShopServiceImpl implements ShopService {

	@Inject
	private ShopDAO dao;
	
	
	@Override//받은 데이터를 기준으로 분류
	public List<GoodsViewVO> list(int cateCode, int level) throws Exception {
int cateCodeRef = 0;//카테고리 참조 코드
/*1차 분류와 2차분류 를 만약 이라면*/	
if(level == 1) {//1차 분류
	cateCodeRef = cateCode;
	return dao.list(cateCode, cateCodeRef);
}else {//2차 분류
	return dao.list(cateCode);
}

	}


	@Override//상품조회
	public GoodsViewVO goodsView(int gdsNum) throws Exception {
		return dao.goodsView(gdsNum);
	}
	
	
	
	
	
	
	
	
	
	
	

}
