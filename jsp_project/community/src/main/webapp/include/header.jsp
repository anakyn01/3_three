<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- JSP Standard Tag Library jstl
java코드를 사용하지 않고 HTML태그 형태로 직관적인 코딩을 지원하는 라이브러리
 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!-- 콘텍스트 패스는 로컬호스트와 이하 프로젝트명 까지 포함한다 그래서 타이핑을 줄여줌 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="${contextPath}/css/custom.css"/>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
<script src="${contextPath}/js/custom.js"></script>
<title>BBS</title>
</head>
<body class="bg-gradient-primary">

<%
//로그인이 되어있는지 아닌지 체크 세션에 값이 담겨있는지 체크
String userID = null; //문자 변수 userID = 값을 0을 대입 => 초기화
//만약 누군가 접속[로그인]을 한다면
if(session.getAttribute("userID") != null){
	userID = (String)session.getAttribute("userID");
}
/*
유저아이디 없음 (평상시)
접속한 유저아이디가 있다면
그 아이디는 세션을 부여 받는다
*/
%>

<nav class="navbar navbar-expand-sm bg-white fixed-top">
	<div class="container-fluid">

<a class="navbar-brand" href="${contextPath}/">HYI</a><!-- 로고 -->

<!-- 햄버거메뉴 아디다스 -->
<button class="navbar-toggler" data-bs-toggle="collapse" data-bs-target="#mynavbar">
<span class="navbar-toggler-icon"></span>
</button>

<!-- 링크 메뉴 -->
<div class="collapse navbar-collapse" id="mynavbar">

<ul class="navbar-nav me-auto"><!-- me-auto 두항목을 오른쪽으로 밀기 -->
	<!--  <li class="nav-item">
		<a class="nav-link" href="">회원가입</a>
	</li>
	
	<li class="nav-item">
		<a class="nav-link" href="">로그인</a>
	</li>-->
	
	<li class="nav-item">
		<a class="nav-link" href="${contextPath}/bbs/bbs.jsp">게시판</a>
	</li>

<%
//로그인 하지 않았을때 보여지는 화면
if(userID == null){
%>	
<li class="nav-item dropdown"><!-- 온클릭이벤트로 누를때 메뉴가 하나이상 나올때 그메류를 드롭다운이라고 함 -->

<a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown">접속하기</a>	<!-- 제어 -->


<ul class="dropdown-menu">
<li><a class="dropdown-item" href="${contextPath}/member/login.jsp">로그인</a></li>
<li><a class="dropdown-item" href="${contextPath}/member/member.jsp">회원가입</a></li>
</ul>
<%} else {%><!-- 세션이 존재한다면 -->
<li class="nav-item dropdown">
	<a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown">회원관리</a>
	<ul class="dropdown-menu">
		<li><a class="dropdown-item" href="logoutAction.jsp" onclick="logOut()">로그아웃</a></li>
	</ul>
</li>
<%} %>
	</li>
	
	
	
	<!-- 회사소개 company/company.jsp 회사소개 -->
</ul>

<!-- 검색창 -->
<form class="d-flex">
	<input class="form-control" type="text" placeholder="Search">
	<button class="btn btn-primary" type="button">Search</button>
</form>

</div>










	
	</div>
</nav>













