<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>

<meta charset="UTF-8">
<title>=== SHOP ===</title>
</head>
<body>
<nav class="navbar navbar-expand-sm bg-light">
<div class="container-fluid">
<a class="navbar-brand" href="/">Shop</a>
<!-- 토글버튼  -->
<button class="navbar-toggler" data-bs-toggle="collapse" data-bs-target="#mynavbar">
<span class="navbar-toggler-icon"></span>
</button>

<!-- 로그인 회원가입 변수 로그인 했을때와 하지 않았을때-->
<div class="collapse navbar-collapse" id="mynavbar">
<ul class="navbar-nav me-auto align-items-center">
	
	<c:if test = "${member == null }"><!-- 로그인을 하지 않으면 -->
		<li class="nav-item">
			<a class="nav-link" href="${contextPath}/member/signin">login</a>
		</li>
		<li class="nav-item">
			<a class="nav-link" href="${contextPath}/member/signup">join</a>
		</li>
	</c:if>
	<!-- 로그인을 했을때 -->
	<c:if test="${member != null }">
		<!-- 로그인을 했는데 관리자라면 -->
		<c:if test="${member.verify == 9 }">
			<a class="nav-link" href="${contextPath}/admin/index">관리자 화면</a>
		</c:if>
		
		<li class="nav-item">
			<span class="fw-bold">
			${member.userName}&nbsp;님 환영합니다
			</span>
		</li>
		<li class="nav-item">
			<a class="nav-link" href="${contextPath}/shop/list?c=1&1=1">category</a>
		</li>
		<li class="nav-item">
			<a class="nav-link" href="${contextPath}/shop/cartList">카트리스트</a>
		</li>
		<li class="nav-item">
			<a class="nav-link" href="${contextPath}/shop/orderList">주문리스트</a>
		</li>
		<li class="nav-item">
			<a class="nav-link" href="${contextPath}/member/signout">logout</a>
		</li>
	</c:if>
</ul>
<form class="d-flex btn-group">
<input class="form-control" type="text" placeholder="Search"/>
<button class="btn btn-primary" type="button">Search</button>
</form>






</div>

</div>
</nav>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="${contextPath}/resources/js/daum.js"></script>











