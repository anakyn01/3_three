package com.my.shop.persistence;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.my.shop.vo.GoodsViewVO;
import com.my.shop.vo.ReplyListVO;
import com.my.shop.vo.ReplyVO;

@Repository
public class ShopDAOImpl implements ShopDAO {
	
	@Inject
	private SqlSession sql;//sql명령문 준것을 담아야 해서 
	
	//매핑해줘야 되는 마이바티스명을 표기
	private static String namespace ="com.my.shop.mappers.shopMapper";

	@Override//군으로 분류하기 위해서 해시맵 사용
	public List<GoodsViewVO> list(int cateCode, int cateCodeRef) throws Exception {
		
		HashMap<String, Object> map = new HashMap<>();
		//어레이 리스트 추가할때는 해시맵은 put
		map.put("cateCode", cateCode);//map.put(null, map)
		map.put("cateCodeRef", cateCodeRef);//map.put(null, map)
		
		return sql.selectList(namespace + ".list_1", map);
	}
	
	@Override
	public List<GoodsViewVO> list(int cateCode) throws Exception {
		return sql.selectList(namespace + ".list_2", cateCode);
	}

	@Override//상품 view page 한개의행이 있는지 검사하는 셀렉트원(하나이상 일때 투매니 익셉션을 발생)
	public GoodsViewVO goodsView(int gdsNum) throws Exception {
		return sql.selectOne("com.my.shop.mappers.adminMapper"+".goodsView",gdsNum);
	}
	//댓글쓰기
	@Override
	public void registReply(ReplyVO reply) throws Exception {
sql.insert(namespace + ".registReply", reply);		
	}
	//댓글리스트
	@Override
	public List<ReplyListVO> replyList(int gdsNum) throws Exception {
		return sql.selectList(namespace + ".replyList", gdsNum);
	}
	//댓글삭제
	@Override
	public void deleteReply(ReplyVO reply) throws Exception {
sql.delete(namespace + ".deleteReply", reply);	
	}
	//아이디 체크
	@Override
	public String idCheck(int repNum) throws Exception {
		return sql.selectOne(namespace + ".replyUserIdCheck", repNum);
	}
	//댓글수정
	@Override
	public void modifyReply(ReplyVO reply) throws Exception {
		sql.update(namespace + ".modifyReply", reply);		
	}
	//sql과 같은 layer dao[인터페이스], daoImpl[확장]
	
	
	
	
	
	
	

}
