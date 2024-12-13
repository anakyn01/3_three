<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세페이지</title>
</head>
<body>
<h1>상세</h1>
<p>제목 : ${data.title }</p>
<p>카테고리 : ${data.category }</p>
<p>가격 : <fmt:formatNumber type="number" maxFractionDigits="3" value="${data.price}"/></p>
<p>입력일 : <fmt:formatDate value="${data.insert_date}" pattern="yyyy.MM.dd HH:mm:ss"/></p>
<!-- 영상에서 3초 300 웹에서 3초 3000 -->

<p>
<a href="/update?bookId=${bookId}">수정</a>
</p>

<form method="POST" action="/delete">
<input type="hidden" name="bookId" value="${bookId}"/>
<!-- 사용자에게 보이지 않는 숨겨진 입력 필드 렌더링을 해도 보이지 않음 -->
<input type="submit" value="삭제"/>
</form>

<p>
<a href="/list">목록으로</a>
</p>

<%-- EL(Expression Language)는 Jsp 스크립트 태그 익스프레션을 대신하여 ${}로 좀더 편하게 하기 위한 언어--%>
<%--<% String Hello ="헬로월드"; --%>
<%--<%= Hello %>--%>
</body>
</html>