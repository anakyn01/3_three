<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="../../include/header.jsp" flush="false"/>
<div class="container-fluid">
<div class="row">
<div class="col-md-12">
<div class="d-flex">
<aside class="w-25">
<jsp:include page="../include/lnb.jsp" flush="false"/>
</aside>
<main class="w-75 p-5">
<h1 class="my-5">view</h1>
<form role="form" method="post" autocomplete="off">
<input type="hidden" name="n" value="${goods.gdsNum}"/>

<div class="input-group">
<label class="form-label fw-bold">1차 분류</label>
<span class="ml-2"></span>
<label class="form-label fw-bold ml-2">2차 분류</label>
<span class="ml-2">${goods.cateCode}</span>
</div>

<div class="input-group mt-3">
<label class="form-label w-25 fw-bold">메인이미지</label>
<img src="${goods.gdsImg}" class="w-50"/>
</div>

<div class="input-group mt-3">
<label class="form-label w-25 fw-bold">상품명</label>
<span class="w-75">${goods.gdsName}</span>
</div>

<div class="input-group mt-3">
<label class="form-label w-25 fw-bold">상품가격</label>
<span class="w-75"><fmt:formatNumber value="${goods.gdsPrice}" pattern="###,###,###"/></span>
</div>

<div class="input-group mt-3">
<label class="form-label w-25 fw-bold">상품수량</label>
<span class="w-75">${goods.gdsStock}</span>
</div>

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
							<button type="button" class="addCart_btn">카트에 담기</button>
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
											
											if(result == 1) {
												alert("카트 담기 성공");
												$(".numBox").val("1");
											} else {
												alert("회원만 사용할 수 있습니다.")
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
						<c:if test="${view.gdsStock == 0}">
							<p>상품 수량이 부족합니다.</p>						
						</c:if>

<div class="input-group mt-3">
<label class="form-label w-25 fw-bold">상품소개</label>
<span class="w-75">${goods.gdsDes}</span>
</div>

<div class="d-flex justify-content-end my-5">
	<div class="btn-group">
		<button id="modify_Btn" class="btn btn-warning">수정</button>
		<button id="delete_Btn" class="btn btn-danger">삭제</button>
	</div>
</div>

<script>
var formObj = $("form[role='form']");

$("#modify_Btn").click(function(){
	formObj.attr("action","/admin/goods/modify");
	formObj.attr("method","get")
	formObj.submit();
});
$("#delete_Btn").click(function(){
	
	var con = confirm("정말로 삭제 하시겠습니까?")
	
	if(con){
		formObj.attr("action","/admin/goods/delete");
		formObj.submit();
	}

});
</script>

</form>
</main>
</div>
</div>
</div>
</div>


<jsp:include page="../../include/footer.jsp" flush="false"/>