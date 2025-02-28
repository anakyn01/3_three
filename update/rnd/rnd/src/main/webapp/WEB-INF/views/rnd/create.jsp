<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp" %>
<div class="container">
<div class="row">
<div class="col-md-12">
<h1 class="my-5">create</h1>
<form method="POST">
<div class="form-group mt-3">
	<label class="form-laber w-25">
제목 : 
	</label>
	<input type="text" name="title" class="form-control w-75"/>
</div>
<div class="form-group mt-3">
	<label class="form-laber w-25">
카테고리 : 
	</label>
	<input type="text" name="category" class="form-control w-75"/>
</div>
<div class="form-group mt-3">
	<label class="form-laber w-25">
가격 : 
	</label>
	<input type="text" name="price" class="form-control w-75"/>
</div>
<div class="d-flex justify-content-end my-5">
<input type="submit" value="글쓰기" class="btn btn-outline-primary btn-Lg"/>
</div>
</form>
</div>
</div>
</div>
<%@ include file="../include/footer.jsp" %>