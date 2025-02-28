<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ include file="../include/header.jsp" %>
<div class="container">
<div class="row">
<div class="col-md-12">
<h1 class="my-5">list</h1>
<table>  
<thead>  
<tr>  
<td>제목</td>  
<td>카테고리</td>  
<td>가격</td>  
</tr>  
</thead>  
<tbody>  
<c:forEach var="row" items="${data}">  
<tr>  
<td>  
<a href="/detail?rndId=${row.rnd_id}">  
${row.title}  
</a>  
</td>  
<td>${row.category}</td>  
<td><fmt:formatNumber type="number" maxFractionDigits="3" value="${row.price}" /></td>  
</tr>  
</c:forEach>  
</tbody>  
</table>  
<p>  
<a href="/create">생성</a>  
</p>  

</div>
</div>
</div>
<%@ include file="../include/footer.jsp" %>