package com.my.shop.persistence;

import java.util.List;

import com.my.shop.vo.GoodsViewVO;

public interface ShopDAO {
	
	//상품리스트
	public List<GoodsViewVO> list(int cateCode, int cateCodeRef) throws Exception;

	List<GoodsViewVO> list(int cateCode) throws Exception;

}
