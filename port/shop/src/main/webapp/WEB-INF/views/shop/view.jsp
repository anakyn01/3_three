<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:include page="../include/header.jsp" />

<div class="container-fluid">
	<div class="row">
		<div class="col-md-3">
<jsp:include page="../include/aside.jsp" />		
		</div>
<div class="col-md-9">

<div class="mt-5 pt-5">
<jsp:include page="../include/breadcrumbs.jsp"/>
</div>
<form role="form">
<input type="hidden" name="gdsNum" value="${view.gdsNum}"/>
<!-- 익스프레션 자바 표현식 el 익스프레션 랭귀지 -->

<div class="my-3">
<img src="${view.gdsImg}" class="img-thumbnail"/>
</div>

<div class="my-3">
	<label class="form-label">상품명</label>
	<span class="mx-3">${view.gdsName}</span>
</div>

<div class="my-3">
	<label class="form-label">카테고리</label>
	<span class="mx-3">${view.cateName}</span>
</div>

<div class="my-3">
<label class="form-label">가격</label>
<span class="mx-3"><fmt:formatNumber pattern="###,###,###" value="${view.gdsPrice}"/>원</span>
</div>

<div class="my-3">
<label class="form-label">상품수량</label>
<span class="mx-3"><fmt:formatNumber pattern="###,###,###" value="${view.gdsStock}"/>EA</span>
</div>

<c:if test="${view.gdsStock != 0 }">
<span>구입 수량</span>
<div class="d-flex w-25">
<button type="button" class="plus btn btn-light">+</button>
<input type="number" class="numBox form-control text-center" min="1" max="${view.gdsStock}" value="1" readonly="readonly"/>
 <button type="button" class="minus btn btn-light">-</button>
</div>
<input type="hidden" value="${view.gdsStock }"/>
<script src="/resources/js/stockBtn.js"></script>
</c:if>

<!-- 장바구니에 담기 -->
<div class="my-3">
<button type="button" class="addCart_btn btn btn-outline-success">
카트에 담기
</button>
<script src="/resources/js/cart.js">

</script>
</div>







</form>		
		</div>
	</div>
</div>

<jsp:include page="../include/footer.jsp" />