package com.my.shop.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my.shop.service.ShopService;
import com.my.shop.vo.CartListVO;
import com.my.shop.vo.CartVO;
import com.my.shop.vo.GoodsViewVO;
import com.my.shop.vo.MemberVO;
import com.my.shop.vo.ReplyListVO;
import com.my.shop.vo.ReplyVO;

@Controller
@RequestMapping("/shop/*")
public class ShopController {
	
	private static final Logger logger = LoggerFactory.getLogger(ShopController.class);
	
	@Inject
	ShopService service;


	
	//移댄뀒怨좊━蹂� �긽�뭹由ъ뒪�듃
	@GetMapping("/list")
	public void getList(@RequestParam("c") int cateCode, @RequestParam("l") int level, Model model)throws Exception{
		logger.info("�냼鍮꾩옄 �럹�씠吏� 吏꾩엯");
		List<GoodsViewVO> list = null;
		list = service.list(cateCode, level);
		model.addAttribute("list",list);
	}
	
	//�긽�뭹議고쉶
	@GetMapping("/view")
	public void getView(@RequestParam("n") int gdsNum, Model model) throws Exception{
		logger.info("get view");
		
		GoodsViewVO view = service.goodsView(gdsNum);
		model.addAttribute("view",view);
	}
	
	//�뙎湲��벐湲�
	//酉곕�� �넻�빐 �젋�뜑留� �릺吏� �븡怨� �겢�씪�씠�뼵�듃�뿉寃� 吏곸젒�쟾�떖
	@ResponseBody
	@PostMapping(value="/view/registReply")
	public void registReply(ReplyVO reply, HttpSession session)throws Exception{
		logger.info("regist reply");
		//濡쒓렇�씤 �꽭�뀡(�쎒�뿉�꽌 �궗�슜�옄媛� 媛�吏��뒗 uri)
		MemberVO member = (MemberVO)session.getAttribute("member");
		reply.setUserId(member.getUserId());
		//�꽌鍮꾩뒪 濡쒖쭅
		//public void registReply(ReplyVO reply)throws Exception;
		service.registReply(reply);//湲곗궗�궛�뾽湲곗궗�뿉 �젙�쓽�븯�뒗 愿��젏�뿉�꽌�뒗 �겢�옒�뒪�� �겢�옒�뒪�궗�씠瑜� �뿰寃고븯�뒗 媛�援� �뿭�븷�쓣 �븯�뒗寃�
		//�옄諛붾쭔�뿉 愿��젏�쑝濡쒕뒗 諛붾뵒媛� �뾾�뒗 援ы쁽泥�  �몢�쓬踰뺤튃 �떒�쐞�뀒�뒪�듃 �넻�빀 �떆�씤
	}
//�뙎湲�由ъ뒪�듃 濡쒖쭅�뿉�꽌 由ы꽩�쓣 �궗�슜�븯�뒗 3紐� (list,read, 0=�삤瑜�, 1=�꽦怨�, -1=�꽕�듃�썙�겕 �삤瑜�(�겕由ъ뿉�씠�듃�� �뵜由ы듃)
	@ResponseBody
	@GetMapping(value="/view/replyList")
public List<ReplyListVO> getReplyList(@RequestParam("n") int gdsNum) throws Exception{
		logger.info("由ы뵆 由ъ뒪�듃 吏꾩엯");
List<ReplyListVO> reply = service.replyList(gdsNum);
return reply;
	}
	
	//�뙎湲��궘�젣 濡쒓렇�씤�븳 �븘�씠�뵒�� �냼媛먯쓣 �옉�꽦�븳 �븘�씠�뵒 鍮꾧탳 �몮�떎�씪移섑븯硫� �궘�젣 洹몃젃吏� �븡�쑝硫� �떎�뙣
	@ResponseBody
	@PostMapping(value="/view/deleteReply")
public int getReplyList(ReplyVO reply, HttpSession session) throws Exception{
//�젙�긽�옉�룞 �뿬遺�瑜� �솗�씤�븯湲� �쐞�븳 蹂��닔
int result = 0; 

MemberVO member = (MemberVO)session.getAttribute("member");
//�뙎湲��쓣 �옉�꽦�븳 �궗�슜�옄�쓽 �븘�씠�뵒瑜� 媛��졇�샂
String userId = service.idCheck(reply.getRepNum()); //�쁽�옱�젒�냽�븳 id vs �뙎湲��쓣 �벖 �븘�씠�뵒

//�븘�씠�뵒 鍮꾧탳
if(member.getUserId().equals(userId)) {//濡쒓렇�씤�븳 �븘�씠�뵒媛� �옉�꽦�븳 �븘�씠�뵒�� 媛숇떎硫�
	
	reply.setUserId(member.getUserId());//reply�뿉 userId���옣
	service.deleteReply(reply);//�꽌鍮꾩뒪�쓽 硫붿꽌�뱶 �떎�뻾
	
	result = 1;//�꽦怨�
}
//�븯�굹留� oneway ,option
return result; //�븘�씠�뵒媛� �씪移섑븯硫� �궘�젣 洹몃젃吏� �븡�쑝硫� �븞�궘�젣
	}
	
	//�븘�씠�뵒 泥댄겕
//�뙎湲��닔�젙
	@ResponseBody
	@PostMapping(value="/view/modifyReply")	
public int modifyReply(ReplyVO reply, HttpSession session)throws Exception{

int result = 0;
MemberVO member = (MemberVO)session.getAttribute("member");
String userId = service.idCheck(reply.getRepNum());

if(member.getUserId().equals(userId)) {//濡쒓렇�씤�븳 �븘�씠�뵒媛� �옉�꽦�븳 �븘�씠�뵒�� 媛숇떎硫�
	
	reply.setUserId(member.getUserId());//reply�뿉 userId���옣
	service.modifyReply(reply);//�꽌鍮꾩뒪�쓽 硫붿꽌�뱶 �떎�뻾	
	result = 1;//�꽦怨�
}
return result;		
	}
	
	//移댄듃�떞湲� RDBMS ORM
	@ResponseBody
	@PostMapping("/view/addCart")
	public void addCart(CartVO cart, HttpSession session)throws Exception{
		MemberVO member = (MemberVO)session.getAttribute("member");
		cart.setUserId(member.getUserId());
		
		service.addCart(cart);
	}
	
	//移댄듃紐⑸줉
	@GetMapping("/cartList")
public void getCartList(HttpSession session, Model model) throws Exception {
		
		MemberVO member = (MemberVO)session.getAttribute("member");
		String userId = member.getUserId();
		
		List<CartListVO> cartList = service.cartList(userId);
		model.addAttribute("cartList", cartList);
		
	}
	
	
	// 카트 삭제
	@ResponseBody
	@PostMapping(value = "/deleteCart")
	public int deleteCart(HttpSession session, @RequestParam(value = "chbox[]") List<String> chArr, CartVO cart) throws Exception {
		logger.info("delete cart");
		
		MemberVO member = (MemberVO)session.getAttribute("member");
		String userId = member.getUserId();
		
		int result = 0;
		int cartNum = 0;		
		
		// 로그인 여부 구분
		if(member != null) {
			cart.setUserId(userId);
			
			for(String i : chArr) {  // 에이젝스에서 받은 chArr의 갯수만큼 반복
				cartNum = Integer.parseInt(i);  // i번째 데이터를 cartNum에 저장
				cart.setCartNum(cartNum);
				service.deleteCart(cart);
			}			
			result = 1;
		}		
		return result;		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
