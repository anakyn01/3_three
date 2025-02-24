package com.my.shop.persistence;

import java.util.List;

import com.my.shop.vo.GoodsViewVO;
import com.my.shop.vo.ReplyListVO;
import com.my.shop.vo.ReplyVO;

public interface ShopDAO {
	
	//상품리스트
	public List<GoodsViewVO> list(int cateCode, int cateCodeRef) throws Exception;

	List<GoodsViewVO> list(int cateCode) throws Exception;
	
	//상품 view page
	public GoodsViewVO goodsView(int gdsNum)throws Exception;
	
	//댓글쓰기
	public void registReply(ReplyVO reply)throws Exception;	
	//댓글리스트
	public List<ReplyListVO> replyList(int gdsNum)throws Exception;
	//댓글삭제
	public void deleteReply(ReplyVO reply)throws Exception;	
	//아이디 체크
	public String idCheck(int repNum) throws Exception;	
	//댓글수정
	public void modifyReply(ReplyVO reply)throws Exception;
	
	
	
	
	

}
