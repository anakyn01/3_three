<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="../../include/header.jsp" />

<div class="container-fluid">
	<div class="row">
		<div class="col-md-3">
<jsp:include page="../include/lnb.jsp" />	
		</div>
		<div class="col-md-9">
<h1 class="my-5">회원목록</h1>
<table class="table table-hover">
<colgroup>
<col style="width:8.33%"/>
<col style="width:8.33%"/>
<col style="width:8.33%"/>
<col style="width:8.33%"/>
<col style="width:8.33%"/>
<col style="width:8.33%"/>
<col style="width:8.33%"/>
<col style="width:8.33%"/>
<col style="width:8.33%"/>
<col style="width:8.33%"/>
<col style="width:8.33%"/>
<col style="width:8.33%"/>
</colgroup>
<thead>
<tr>
<th>유저아이디</th>
<th>패스워드</th>
<th>패스워드확인</th>
<th>이름</th>
<th>유저이메일</th>
<th>전번</th>
<th>주소1</th>
<th>주소2</th>
<th>주소3</th>
<th>가입일</th>
<th>회원등급</th>
</tr>
</thead>
<tbody>
<c:forEach items="" var="">
<tr>
<td></td><td></td><td></td><td></td><td></td><td></td>
<td></td><td></td><td></td><td></td><td></td><td></td>
</tr>
</c:forEach>
</tbody>










</table>
		</div>
	</div>
</div>

<jsp:include page="../../include/footer.jsp" />