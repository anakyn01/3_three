package com.simple.blog.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple.blog.dao.BlogDAO;
import com.simple.blog.dto.BlogEditRequestVO;
import com.simple.blog.dto.BlogListRequestVO;
import com.simple.blog.dto.BlogListResponseVO;
import com.simple.blog.mapper.BlogMapper;

@Service
public class BlogServiceImpl implements BlogService {
	
	private BlogDAO blogDAO;
	private BlogMapper blogMapper;
	/*생성자 주입
	생성자를 통해 의존성을 주입하는 것을 생성자 주입이라고 합니다
	생성자의 매개변수로 빈으로 관리되는 클래스를 정의하면
	스프링이 빈 인스턴스를 생성하고 클래스를 생성할때 생성자의 매개변수로 전달을 해줍니다
	*/
	@Autowired//싱글톤 = 인스턴스를 하나만 생성해서 여러번 활용
	public BlogServiceImpl(BlogDAO blogDAO, BlogMapper blogMapper) {
		this.blogDAO = blogDAO;
		this.blogMapper = blogMapper;
	}
	
	@Override
	public int create(Map<String, Object> map) {
		int seq = this.blogDAO.insert(map);
		return seq;
	}

	@Override//read
	public Map<String, Object> read(int blogContSeq) {
		Map<String, Object> blogCont = this.blogDAO.selectOne(blogContSeq);
		return blogCont;
	}
	
	//edit 이메서드는 업데이트 작업의 영향을 받은 행수를 나타내는 정수를 리턴(수정되면 1 아니면 0)
	@Override
	public boolean edit(BlogEditRequestVO blogEditRequestVO) {
		int affectRowsCount = this.blogDAO.update(blogEditRequestVO);
		return affectRowsCount > 0;
	}
	
	//delete
	@Override //게시물 삭제를 위한 boolean(삭제가 성공했는지에 여부) int blogContSeq(식별자)
	public boolean delete(int blogContSeq) {
		return this.blogMapper.delete(blogContSeq) > 0;
		//삭제된 행의 수가 0보다 큰지 확인합니다 삭제가 성공한것임
	}
	
	//list
	@Override
	public List<BlogListResponseVO> list(BlogListRequestVO blogListRequestVO){
		List<BlogListResponseVO> result = this.blogMapper.selectList(blogListRequestVO);
	    return result;
	}
	
	
	

}
