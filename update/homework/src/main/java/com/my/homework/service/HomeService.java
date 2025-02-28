package com.my.homework.service;

import java.util.List;
import java.util.Map;

import com.my.homework.dto.HomeEditRequestVO;
import com.my.homework.dto.HomeListRequestVO;
import com.my.homework.dto.HomeListResponseVO;

public interface HomeService {
	//create(insert) Method Signature
	int create(Map<String, Object> map);
	//read(select) Method Signature
	Map<String,Object> read(int blogContSeq);
	//edit(update) Method Signature
	boolean edit(HomeEditRequestVO homeEditRequestVO);
	//delete Method Signature
	boolean delete(int blgContSeq);
	//list Method Signature
	List<HomeListResponseVO> list(HomeListRequestVO homeListRequestVO);

	

}
