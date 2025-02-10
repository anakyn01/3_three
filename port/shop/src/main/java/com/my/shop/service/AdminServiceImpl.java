package com.my.shop.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.my.shop.persistence.AdminDAO;
import com.my.shop.vo.CategoryVO;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Inject
	private AdminDAO dao;

	@Override
	public List<CategoryVO> category() throws Exception {
		return dao.category();
	}

}
