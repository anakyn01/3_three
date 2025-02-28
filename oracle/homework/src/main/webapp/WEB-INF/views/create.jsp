<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="include/header.jsp"/>

<div class="container">
<div class="row">
<div class="col-md-12">
<form method="post"><!-- 쓰기 수정 삭제에서는 필요합니다 -->
	<div class="input-group">
		<label class="form-label w-25">컨텐츠 제목</label>
		<input type="text" name="title" class="form-control" />
	</div>
	<div class="input-group">
		<label class="form-label w-25">본문</label>
<textarea rows="5" name="content_body" class="form-control"></textarea>
	</div>
	<div class="d-flex justify-content-end my-5">
	<input type="submit" value="쓰기" class="btn btn-outline-primary"/>
	</div>
</form>
</div>
</div>
</div>

<jsp:include page="include/footer.jsp"/>