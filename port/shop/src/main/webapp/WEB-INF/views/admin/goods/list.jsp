<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<jsp:include page="../../include/header.jsp" flush="false"/>

<div class="container-fluid bg-gradient-primary">
<div class="row">
<div class="col-md-12">
<div class="d-flex">
<div class="w-10">
<div class="mt-1"></div>
<jsp:include page="../include/lnb.jsp"/>
</div>
<div class="w-90">
<!-- 내용 -->
<h2 class="my-3 text-white">상품목록</h2>
<table class="table table-hover">
<colgroup>
<col width="10%"/>
<col width="10%"/>
<col width="40%"/>
<col width="10%"/>
<col width="5%"/>
<col width="5%"/>
<col width="15%"/>
</colgroup>
<thead>
<tr>
<th>번호</th><th>상품이미지</th><th>상품제목</th><th>카테고리</th><th>가격</th><th>수량</th><th>등록날짜</th>
</tr>
</thead>

<tbody>
<c:forEach items="${list}" var="list">
<tr>
<td>${list.gdsNum}</td>
<td><img src="${list.gdsThumbImg}"/></td>
<td>
<a href="/admin/goods/view?n=${list.gdsNum}">
<!-- 제목을 클릭할때 맞는 순번 상품순서로 view page-->
${list.gdsName}<!-- 제목 -->
</a>
</td>
<td>${list.cateCode}</td>
<td>${list.gdsPrice}</td>
<td>${list.gdsStock}</td>
<td>${list.gdsDate}</td>
</tr>
</c:forEach>
</tbody>
</table>











</div>
</div>
</div>
</div>
</div>


<jsp:include page="../../include/footer.jsp"/>