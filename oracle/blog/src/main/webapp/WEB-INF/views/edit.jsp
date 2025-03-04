<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="include/header.jsp" />

<div class="container-fluid">
<div class="row">
<div class="col-md-12">
<h1 class="my-5">Edit</h1>
<form method="post">
<input type="hidden" name="_method" value="put"/>
	<div class="input-group">
		<label class="form-label w-25">
		글번호 :
		</label>
		<div>
		${blogCont.BLG_CONT_SEQ}
		</div>
	</div>
	<div class="input-group">
		<label class="form-label w-25">
		컨텐츠 제목 :
		</label>
		<input type="text" name="title" class="form-control w-75" value="${blogCont.TITLE}"/>
	</div>
	<div class="input-group">
		<label class="form-label w-25">
		내용 :
		</label>
<textarea rows="10" class="form-control w-75" name="contBdy">${blogCont.CONT_BDY}</textarea>
	</div>
		<div class="input-group">
		<label class="form-label w-25">
		입력일 :
		</label>
		<div>
		<fmt:formatDate value="${blogCont.INSERT_DT }" pattern="yyyy.MM.dd HH:mm:ss" />
		</div>
		</div>
	<div class="d-flex justify-content-end">
	<input type="submit" name="create" value="수정"/>
	</div>
</form>
</div>
</div>
</div>

<jsp:include page="include/footer.jsp" />