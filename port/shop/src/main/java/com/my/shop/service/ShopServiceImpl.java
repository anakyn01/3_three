package com.my.shop.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.my.shop.persistence.ShopDAO;
import com.my.shop.vo.CartListVO;
import com.my.shop.vo.CartVO;
import com.my.shop.vo.GoodsViewVO;
import com.my.shop.vo.ReplyListVO;
import com.my.shop.vo.ReplyVO;

@Service//실제 비즈니스 로직이 흐르는곳
public class ShopServiceImpl implements ShopService {

	@Inject//
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


	@Override//댓글쓰기
	public void registReply(ReplyVO reply) throws Exception {
		dao.registReply(reply);		
	}


	@Override//댓글리스트
	public List<ReplyListVO> replyList(int gdsNum) throws Exception {
		return dao.replyList(gdsNum);
	}


	@Override//댓글삭제
	public void deleteReply(ReplyVO reply) throws Exception {
		dao.deleteReply(reply);		
	}


	@Override//아이디 체크
	public String idCheck(int repNum) throws Exception {
		return dao.idCheck(repNum);
	}


	@Override//댓글수정
	public void modifyReply(ReplyVO reply) throws Exception {
		dao.modifyReply(reply);		
	}


	@Override
	public void addCart(CartVO cart) throws Exception {
		dao.addCart(cart);
		
	}


	@Override//카트 리스트
	public List<CartListVO> cartList(String userId) throws Exception {
		return dao.cartList(userId);
	}
	

	
	
	
	
	
	
	
	
	
	

}
