package com.money.rnd.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.money.rnd.dao.RndDAO;



@Service//鍮꾩��땲�뒪 濡쒖쭅�쓣 泥섎━�븯�뒗 怨꾩링
public class RndServiceImpl implements RndService{
	
	@Autowired
	RndDAO rndDAO;
	//�꽌鍮꾩뒪 �겢�옒�뒪�뒗 鍮꾩��땲�뒪 �겢�옒�뒪媛� �쐞移섑븯�뒗 怨� �뒪�봽留� MVC 援ъ“�뿉�꽌 �꽌鍮꾩뒪 �겢�옒�뒪�뒗 而⑦듃濡ㅻ윭�� DAO瑜� �뿰寃고븯�뒗 �뿭�솢�쓣 �븳�떎
	
	@Override //硫붿냼�뱶瑜� �궗�슜�븯�뿬 �뜲�씠�꽣踰좎씠�뒪�뿉 �깉 �젅肄붾뱶瑜� 留뚮뱶�뒗 硫붿냼�뱶
	public String create(Map<String, Object> map) {//�뜲�씠�꽣踰좎씠�뒪�뿉 �궫�엯�맂 �뜲�씠�꽣 �궎, 媛� �뙇�쑝濡� �룷�븿�븷 寃껋쓣 �쓽誘�
		int affectRowCount = this.rndDAO.insert(map);
		//�뜲�씠�꽣踰좎씠�뒪�뿉 媛믪쓣 this.rndDAO.insert(map) �궫�엯�옉�뾽�쓣 �닔�뻾�븯怨� �옉�뾽�쓽 �쁺�뼢�쓣 諛쏅뒗 �뻾 �닔瑜� 由ы꽩
		//洹� 寃곌낵�뒗 affectRowCount 蹂��닔�뿉 ���옣�맂�떎
		if(affectRowCount == 1) {//�븯�굹�쓽 �뻾�씠 �뜲�씠�꽣踰좎씠�뒪�뿉 �뱾�뼱媛붾뒗吏� �솗�씤 (�꽦怨듯븳 寃쎌슦)
			return map.get("rnd_id").toString(); //insert 媛� �꽦怨듯븯硫� �뿰愿��맂 媛믪쓣 由ы꽩
		}
		//�떎�뙣�븷 寃쎌슦
		return null;
	}
	
}
