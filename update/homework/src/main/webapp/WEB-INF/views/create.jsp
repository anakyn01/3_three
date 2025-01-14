<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page= "include/header.jsp"/>

<div class="container.fluid">
<div class="row">
<div class="col-md-12">
<h1 class="my-5">create</h1>
<form method="post">
	<div class="input-group">
		<label class="form-label w-25">
		컨텐츠 제목 :
		</label>
		<input type="text" name="title" class="form-control w-75" placeholder="theme"/>
	</div>
	<div class="input-group">
		<label class="form-label w-25">
		내용 :
		</label>
		<textarea rows="10" class="form-control w-75" name="content_body">내용을 적어주세요</textarea>
	</div>
	<div class="d-flex justify-content-end">
	<input type="submit" value="전송" />
	</div>
</form>
</div>
</div>
</div>

<jsp:include page= "include/footer.jsp"/>
