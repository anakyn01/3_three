<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="../../include/header.jsp" />

<div class="container-fluid">
	<div class="row">
		<div class="col-md-3">
<jsp:include page="../include/lnb.jsp" />	
		</div>
		<div class="col-md-9">
<ul class="list-group bg-white">
<c:forEach items="${reply}" var="reply">
<li class="replyInfo list-group-item">
<pre>
<span class="fw-bold">작성자</span>${reply.userName}(${reply.userId})
<span class="fw-bold">댓글을 작성한 제품</span><a href="/shop/view?n=${reply.gdsNum}">바로가기</a>

<div class="replyContent">
${reply.repCon}
</div>
</pre>
<form role="form" method="post">
<input type="hidden" name="repNum" value="${reply.repNum}"/>
<div class="d-flex justify-content-end my-2">
<button type="submit" class="delete_${reply.repNum}_btn btn-outline-danger">삭제</button>
</div>
</form>
</li>
</c:forEach>
</ul>










		</div>
	</div>
</div>

<jsp:include page="../../include/footer.jsp" />