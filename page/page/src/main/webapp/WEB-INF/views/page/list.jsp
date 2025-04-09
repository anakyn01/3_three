<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../include/header.jsp" flush="false"/>

<div class="container">
<div class="row">
<div class="col-lg-12">
<h1 class="my-5">list</h1>
<table class="table">
<colgroup>
<col style="width:5%"/>
<col style="width:70%"/>
<col style="width:10%"/>
<col style="width:10%"/>
<col style="width:5%"/>
</colgroup>
<thead>
<tr>
<th>번호</th><th class="text-center">제목</th><th>작성일</th><th>작성자</th><th>조회수</th>
</tr>
</thead>
<tbody>
<c:forEach items="${list}" var="list">
<tr>
<td>${list.bno}</td>
<td>${list.title}</td>
<td>${list.regDate}</td>
<td>${list.writer}</td>
<td>${list.viewCnt}</td>
</tr>
</c:forEach>
</tbody>
</table>
</div>
</div>
</div>

<jsp:include page="../include/footer.jsp" flush="false"/>