<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="../include/header.jsp" flush="false" />

<div class="container-fluid">
<div class="row">
<div class="col-md-3">
<jsp:include page="../include/aside.jsp" flush="false" />

</div>
<div class="col-md-9">
<p>
<img src="${view.gdsImg}"/>
</p>
<p class="gdsName"><span>상품명</span>${view.gdsName}</p>
						
						<p class="cateName"><span>카테고리</span>${view.cateName}</p>
						
						<p class="gdsPrice">
							<span>가격 </span><fmt:formatNumber pattern="###,###,###" value="${view.gdsPrice}" /> 원
						</p>
						
						<p class="gdsStock">
							<span>재고 </span><fmt:formatNumber pattern="###,###,###" value="${view.gdsStock}" /> EA
						</p>
						
						<c:if test="${view.gdsStock != 0}">
						
						<p class="cartStock">
							<span>구입 수량</span>
							<button type="button" class="plus btn btn-light">+</button>
							<input type="number" class="numBox" min="1" max="${view.gdsStock}" value="1" readonly="readonly"/>
							<button type="button" class="minus btn btn-light">-</button>
							
							<input type="hidden" value="${view.gdsStock}" class="gdsStock_hidden" />
							
							<script src="/resources/js/stockBtn.js"></script>
													
							
						</p>
<p class="addToCart">
 <button type="button" class="addCart_btn btn btn-outline-primary btn-lg">카트에 담기</button>
 
 <script>
 $(".addCart_btn").click(function(){
	   var gdsNum = $("#gdsNum").val();
	   var cartStock = $(".numBox").val();
	      
	   var data = {
	     gdsNum : gdsNum,
	     cartStock : cartStock
	   };
	   
	   $.ajax({
	    url : "/shop/view/addCart",
	    type : "post",
	    data : data,
	    success : function(result){
	     if (result.success) {  // 서버에서 결과값을 확인하고 성공 여부에 따라 처리
	       alert("카트 담기 성공");
	       $(".numBox").val("1");
	     } else {
	       alert("회원만 사용할 수 있습니다.");
	       $(".numBox").val("1");
	     }
	    },
	    error : function(){
	     alert("카트 담기 실패");
	    }
	   });
	});
 </script>
</p>
</c:if>
<c:if test="${view.gdsStock == 0 }">
<p>상품 수량이 부족합니</p>
</c:if>
<!-- add -->
<div id="reply">
<section class="replyForm">
<c:if test="${member == null }">
	<p>소감을 남기시려면 <a href="/member/signin">로그인</a>해주세요</p>
</c:if>
<c:if test="${member != null }">
<form role="form" method="post" autocomplete="off">
<input type="hidden" name="gdsNum" value="${view.gdsNum}"/>
<!-- 화면에 보이지 않지만 데이터를 가지고 있는 인풋박스 -->
<textarea name="repCon" id="repCon" class="form-control" rows="5"></textarea>
<div class="d-flex justify-content-end my-3">
<button type="submit" id="reply_btn" class="btn btn-outline-secondary">소감 남기기</button>
<script type="text/javascript">
$("#reply_btn").click(function(){
	var fromObj = $(".replyForm form[role='form']")
	var gdsNum = $("#gdsNum").val();
	var repCon = $("#repCon").val()
	var data = {
		gdsNum:gdsNum,
		repCon:repCon
	};
	$.ajax({
		url:"/shop/view/registReply", type : "post", data:data, success:function(){
			replyList();
			$("#repCon").val("");
		}
	});
});
</script>
</div>
</form>
</section>
</c:if>
<section class="replyList">
	<ol class="list-group list-group-flush">
	<%-- 첨부파일이 있는페이지로 메모리 소요가 심함 그래서 jquery ajax로 대신한다
		<c:forEach items="${reply}" var="reply">
			<li class="list-group-item">
			<div class="userInfo">
				<span class="userName">${reply.userName}</span>	
				<span class="date">
				<fmt:formatDate value="${reply.repDate}" pattern="yyyy-MM-dd"/>
				</span>
				<div class="replyContent">
				${reply.repCon}
				</div>		
			</div>
			</li>
		</c:forEach>--%>
<script>
replyList();

$(document).on("click", ".delete", function(){
	  var deletConfirm = confirm("정말로 삭제하시겠습니까?");  // 문구 수정 및 변수 이름 통일
	  if(deletConfirm){  // 변수 이름 일관성 있게 수정
	    var data = {repNum : $(this).attr("data-repNum")};
	    
	    $.ajax({
	      url : "/shop/view/deleteReply",
	      type : "post",
	      data : data,
	      success : function(result){
	        if(result == 1) {
	          replyList();  // 성공 시 댓글 목록 갱신
	        } else {
	          alert("작성자 본인만 할 수 있습니다.");  // 삭제 권한 오류 처리
	        }
	      },
	      error : function(){
	        alert("로그인하셔야 합니다.");  // 에러 발생 시 알림
	      }
	    });
	  }
	});
</script>
	</ol>
</section>



</div>
<!-- add end -->

</div>
</div>
</div>

<div class="replyModal">

 <div class="modalContent">
  
  <div>
   <textarea class="modal_repCon form-control" name="modal_repCon"></textarea>
  </div>
  
  <div class="d-flex justify-content-end">
    <div class="btn-group">
   <button type="button" class="modal_modify_btn btn btn-outline-success">수정</button>
   <script>
   $(document).on("click", ".modify", function(){
	   //$(".replyModal").attr("style", "display:block;");
	   $(".replyModal").fadeIn(200);
	   
	   var repNum = $(this).attr("data-repNum");
	   var repCon = $(this).parent().parent().children(".replyContent").text();
	   
	   $(".modal_repCon").val(repCon);
	   $(".modal_modify_btn").attr("data-repNum", repNum);
	   
	  });
   </script>
   <button type="button" class="modal_cancel btn btn-outline-secondary">취소</button>
  </div>
  </div>

  
 </div>

 <div class="modalBackground"></div>
<script>
$(".modal_cancel").click(function(){
 $(".replyModal").attr("style", "display:none;");
});

$(".modal_modify_btn").click(function(){
	 var modifyConfirm = confirm("정말로 수정하시겠습니까?");
	 
	 if(modifyConfirm) {
	  var data = {
	     repNum : $(this).attr("data-repNum"),
	     repCon : $(".modal_repCon").val()
	    };  // ReplyVO 형태로 데이터 생성
	  
	  $.ajax({
	   url : "/shop/view/modifyReply",
	   type : "post",
	   data : data,
	   success : function(result){
	    
	    if(result == 1) {
	     replyList();
	     $(".replyModal").fadeOut(200);
	    } else {
	     alert("작성자 본인만 할 수 있습니다.");       
	    }
	   },
	   error : function(){
	    alert("로그인하셔야합니다.")
	   }
	  });
	 }
	 
	});
</script>
 
</div>

<style>
 div.replyModal { position:relative; z-index:1; }
 div.modalBackground { position:fixed; top:0; left:0; width:100%; height:100%; background:rgba(0, 0, 0, 0.8); z-index:-1; }
 div.modalContent { position:fixed; top:20%; left:calc(50% - 250px); width:520px; height:300px; padding:20px 10px; background:#fff; border:2px solid #666; }
 div.modalContent textarea { font-size:16px; font-family:'맑은 고딕', verdana; padding:10px; width:500px; height:200px; }
 div.modalContent button { font-size:20px; padding:5px 10px; margin:10px 0; background:#fff; border:1px solid #ccc; }
 div.modalContent button.modal_cancel { margin-left:20px; }
</style>


<jsp:include page="../include/footer.jsp" flush="false" />