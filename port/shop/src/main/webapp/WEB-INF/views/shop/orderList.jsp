<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="../include/header.jsp" />

<div class="container-fluid">
	<div class="row">
		<div class="col-md-3">
<jsp:include page="../include/aside.jsp" />		
		</div>
		<div class="col-md-9">
<ul class="list-group list-group-flush">
<c:forEach items="${orderList}" var="orderList">
<li class="list-group-item">
<pre>
<span class="fw-bold">주문번호</span><a href="" class="">${orderList.orderId}</a>
<span class="fw-bold">수령인</span>${orderList.orderRec}
<span class="fw-bold">주소</span>(${orderList.userAddr1}) ${orderList.userAddr2} ${orderList.userAddr3}
<span class="fw-bold">가격</span><fmt:formatNumber pattern="###,###,###" value="${orderList.amount}"/> 원
<span class="fw-bold">상태</span>${orderList.delivery}
</pre>
</li>
</c:forEach>
</ul>		
		</div>
	</div>
</div>

<jsp:include page="../include/footer.jsp" />