<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<% pageContext.setAttribute("CRLF", "\r\n"); %><!-- 줄바꿈 적용 -->
<jsp:include page="include/header.jsp"></jsp:include>

<div class="container">
<div class="row">
<div class="col-md-12">
<h1 class="my-5">read</h1>
<table class="table">
<colgroup>
<col width="25%"/>
<col width="75%"/>
</colgroup>
	<tr>
		<th>번호</th>
		<td>${blogCont.BLG_CONT_SEQ}</td>
	</tr>
	
	<tr>
		<th>제목</th>
		<td>${blogCont.TITLE}</td>
	</tr>
	
	<tr>
		<th>본문</th>
		<td>
		${fn:replace(blogCont.CONT_BDY, CRLF, '<br/>')}
		</td>
	</tr>
	
	<tr>
		<th>입력일</th>
		<td>
		<fmt:formatDate value="${blogCont.INSERT_DT}" pattern="yyyy.MM.dd HH:mm:ss"/>
		</td>
	</tr>	
</table>
<form method="post" action="/delete">
<input type="hidden" name="blogContSeq" value="${blogCont.BLG_CONT_SEQ}"/>
<div class="btn-group">
<a href="/list" class="btn btn-outline-primary">list</a>
<a href="/edit/${blogCont.BLG_CONT_SEQ}" class="btn btn-outline-primary">수정</a>
<input type="submit" value="삭제" class="btn btn-outline-danger"/>
</div>
</form>

</div>
</div>
</div>






<jsp:include page="include/footer.jsp"></jsp:include>