<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../include/header.jsp" flush="false"/>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="container">
<div class="row">
<div class="col-sm-12">
<h1 class="my-5">목록</h1>
<table class="table table-hover table-striped table-bordered">
<colgroup>
<col style="width:50%"/>
<col style="width:30%"/>
<col style="width:20%"/>
</colgroup>
<thead>
<tr class="text-center">
<th>제목</th><th>카테고리</th><th>가격</th>
</tr>
</thead>

<tbody>
<c:forEach var="row" items="${data}">
<tr>
<td>
<a href="/detail?bookId=${row.book_id}">
${row.title}
</a>
</td>
<td>${row.category}</td>
<td><fmt:formatNumber type="number" maxFractionDigits="3" value="${row.price}"/></td>
</tr>
</c:forEach>
</tbody>
</table>

<p class="my-3">
<form>
<div class="d-flex">
<input 
type="text" 
placeholder="검색" 
name="keyword" 
value="${keyword}"
class="form-control"
/>
<input 
type="submit"
value="검색"
class="btn btn-primary"
/>
</div>
</form>
</p>

<div class="d-flex justify-content-end my-5">
<a href="/create" class="btn btn-outline-primary">글쓰기</a>
</div>

</div>
</div>
</div>

<%@ include file="../include/footer.jsp" %>