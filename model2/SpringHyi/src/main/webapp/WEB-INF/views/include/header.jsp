<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- jstl로 절대경로 -->
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<p class="p-3">
<a href="${contextPath}/" class="a-link">
<svg width="24" height="24" xmlns="http://www.w3.org/2000/svg" fill-rule="evenodd" clip-rule="evenodd"><path d="M22 11.414v12.586h-20v-12.586l-1.293 1.293-.707-.707 12-12 12 12-.707.707-1.293-1.293zm-6 11.586h5v-12.586l-9-9-9 9v12.586h5v-9h8v9zm-1-7.889h-6v7.778h6v-7.778z"/></svg>
</a>
<button class="btn btn-warning" data-bs-toggle="offcanvas" data-bs-target="#demo">
메뉴
</button>
</p>

<div id="demo" class="offcanvas offcanvas-start text-bg-dark">
	<div class="offcanvas-header">
		<h1 class="offcanvas-title">CRUD</h1>	
		<button class="btn-close btn-close-white" data-bs-dismiss="offcanvas"></button>
	</div>
	<div class="offcanvas-body">
	<a href="${contextPath}/create" class="a-link text-white">쓰기</a><br>
	<a href="${contextPath}/list" class="a-link text-white">리스트</a><br>
	</div>
</div>













