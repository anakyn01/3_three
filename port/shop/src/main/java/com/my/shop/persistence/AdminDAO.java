package com.my.shop.persistence;

import java.util.List;

import com.my.shop.vo.CategoryVO;
import com.my.shop.vo.GoodsVO;
import com.my.shop.vo.GoodsViewVO;

//매퍼의 쿼리문을 호출하는 dao
public interface AdminDAO {
	
	//카테고리
	public List<CategoryVO> category() throws Exception;
	
	//상품등록
	public void register(GoodsVO vo) throws Exception;
	
	//상품리스트
	public List<GoodsViewVO> goodslist() throws Exception;
	
	//상품view
	public GoodsViewVO goodsView(int gdsNum) throws Exception;
	
	//상품수정
	public void goodsModify(GoodsVO vo)throws Exception;
	
	//상품삭제
	public void goodsDelete(int gdsNum) throws Exception;
	
	
	
	
	

}
