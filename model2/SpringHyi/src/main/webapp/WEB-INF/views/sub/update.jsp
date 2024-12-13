<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="../include/header.jsp" flush="false"/>

<div class="container">
<div class="row">
<div class="col-md-12">
<h1 class="my-5">수정하기</h1>
<form method="post"><!-- 폼에서 데이터베이스를 전송할때는 버튼이 아니라 -->
<p><label class="form-label">제목 : </label>
<input type="text" name="title" value="${data.title }" class="form-control"/></p>
<p><label class="form-label">카테고리 : </label>
<input type="text" name="category" value="${data.category}" class="form-control"/></p>
<p><label class="form-label">가격 : </label>
<input type="text" name="price" value="${data.price}" class="form-control"/></p>
<div class="d-flex justify-content-end my-5">
<input type="submit" value="수정하기" class="btn btn-outline-success"/>
</div>
</form>

</div>
</div>
</div>

<jsp:include page="../include/footer.jsp" flush="false"/>


