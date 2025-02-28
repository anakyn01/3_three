<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="../include/header.jsp" flush="false"/>

<div class="container">
<div class="row">
<div class="col-md-12">
<h1 class="my-5">상세</h1>
<p>제목 : ${data.title }</p>
<p>카테고리 : ${data.category }</p>
<p>가격 : <fmt:formatNumber type="number" maxFractionDigits="3" value="${data.price}"/></p>
<p>입력일 : <fmt:formatDate value="${data.insert_date}" pattern="yyyy.MM.dd HH:mm:ss"/></p>
<!-- 영상에서 3초 300 웹에서 3초 3000 -->
<form method="POST" action="/delete">
<div class="d-flex justify-content-end my-5">
<div class="btn-group">
<a href="${contextPath}/update?bookId=${bookId}" class="btn btn-outline-success">수정</a>

<input type="hidden" name="bookId" value="${bookId}"/>
<!-- 사용자에게 보이지 않는 숨겨진 입력 필드 렌더링을 해도 보이지 않음 -->
<input type="submit" value="삭제" class="btn btn-outline-danger"/>

<a href="${contextPath}/list" class="btn btn-outline-secondary">목록으로</a>
</div>
</form>
</div>


<%-- EL(Expression Language)는 Jsp 스크립트 태그 익스프레션을 대신하여 ${}로 좀더 편하게 하기 위한 언어--%>
<%--<% String Hello ="헬로월드"; --%>
<%--<%= Hello %>--%>

</div>
</div>
</div>

<jsp:include page="../include/footer.jsp" flush="false"/>


