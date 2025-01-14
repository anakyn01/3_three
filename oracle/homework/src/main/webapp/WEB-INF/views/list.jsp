<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% pageContext.setAttribute("CRLF", "\r\n"); %><!-- 줄바꿈 적용 -->
<jsp:include page="include/header.jsp"/>

<div class="container">
<div class="row">
<div class="col-md-12">
<form class="mt-5 mb-5"><!-- 검색창 -->
<div class="input-group">
<input
class="form-control"
placeholder="Search"
value="${homeListRequestVO.search}"
/>
<input
type="submit"
name="search_button"
value="검색"
class="btn btn-outline-success"
/>
<!-- input 타입이 버튼일때 (jquery[ajax]로 콘트롤할 확률이 높다 
이프로젝트 전체에서 댓글을 ajax로 사용할건데..
그건 나중에
-->
</div>
</form>


<h1 class="my-5">list</h1>
<table class="table">
<colgroup>
<col width="10%"/>
<col width="70%"/>
<col width="20%"/>
</colgroup>
<thead>
<tr>
<th class="text-center">글번호</th><th class="text-center">제목</th><th class="text-center">입력일</th>
</tr>
</thead>
<tbody>
<c:forEach var="homeListResponseVO" items="${homeListResponseVOList}">
<tr>
<td class="text-center">
${homeListResponseVO.blgContSeq}
</td>
<td>
<a href="/read/${homeListResponseVO.blgContSeq}">
${homeListResponseVO.title}
</a>
</td>
<td class="text-center">
${homeListResponseVO.insertDtFormat}
</td>
</tr>
</c:forEach>
</tbody>
</table>
	<div class="d-flex justify-content-end my-5">
	<a href="${contextPath}/create" class="btn btn-outline-success">
	create
	</a>
	</div>
	
	<c:if test="${empty homeListResponseVOList}">
	<strong class="text-secondary">검색 결과가 없습니다</strong>
	</c:if>
</div>
</div>
</div>


<jsp:include page="include/footer.jsp"/>