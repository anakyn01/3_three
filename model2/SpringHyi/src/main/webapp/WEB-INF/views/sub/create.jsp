<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="../include/header.jsp" flush="false"/>

<div class="container">
<div class="row">
<div class="col-md-12">
<h1 class="my-5">create</h1>
<form method="post"><!-- 폼에서 데이터베이스를 전송할때는 버튼이 아니라 -->
<p><label class="form-label w-25">제목 :</label> 
<input type="text" name="title" class="form-control w-75"/></p>
<p><label class="form-label w-25">카테고리 :</label> 
<input type="text" name="category" class="form-control w-75"/></p>
<p><label class="form-label w-25">가격 : </label>
<input type="text" name="price" class="form-control w-75"/></p>
<div class="d-flex justify-content-end my-5">
<input type="submit" value="저장" class="btn btn-outline-primary"/>
</div>

</form>
</div>
</div>
</div>

<jsp:include page="../include/footer.jsp" flush="false"/>


