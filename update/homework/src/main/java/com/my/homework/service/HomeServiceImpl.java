package com.my.homework.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.homework.dao.HomeDAO;
import com.my.homework.dto.HomeEditRequestVO;
import com.my.homework.dto.HomeListRequestVO;
import com.my.homework.dto.HomeListResponseVO;
import com.my.homework.mapper.HomeMapper;

@Service
public class HomeServiceImpl implements HomeService {

	private HomeDAO homeDAO;
	private HomeMapper homeMapper;
	@Autowired
	public HomeServiceImpl(HomeDAO homeDAO,HomeMapper homeMapper) {
		this.homeDAO = homeDAO;
		this.homeMapper = homeMapper;
	}
	
	//create
	@Override
	public int create(Map<String,Object>map) {
		int seq = this.homeDAO.insert(map);
		return seq;
	}
	//read
	@Override
	public Map<String, Object> read(int blogContSeq) {
		Map<String, Object> blogCont = this.homeDAO.selectOne(blogContSeq);
		return blogCont;
	}
	//edit
	@Override
	public boolean edit(HomeEditRequestVO homeEditRequestVO) {
		int affectRowsCount = this.homeDAO.update(homeEditRequestVO);//dao를 통한 업뎃
		return affectRowsCount > 0; //0보다 큰경우 하나의 행이 서공적으로 업데이트되었음을 나타냄.
	}
	//delete
	@Override
	public boolean delete(int blgContSeq) {
		return this.homeMapper.delete(blgContSeq) > 0;
	}
	//list
	@Override
	public List<HomeListResponseVO> list(HomeListRequestVO homeListRequestVO){
		List<HomeListResponseVO> result = this.homeMapper.selectList(homeListRequestVO);
		return result;
	}
}
