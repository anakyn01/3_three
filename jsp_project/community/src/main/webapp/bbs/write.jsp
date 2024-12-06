<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp" %>

<div class="container pt100">
<div class="row">
<div class="col-md-12">
<!-- 글을 쓰거나 삭제하거나 수정할때는 form -->
<form method="post" action="writeAction.jsp">
<h1 class="my-5 text-white">
글쓰기
</h1>
<table class="table table-bordered">
<colgroup>
<col style="width:10%"/>
<col style="width:90%"/>
</colgroup>
<tr>
<th>제목</th>
<td>
	<input
	type="text"
	class="form-control"
	placeholder="글 제목"
	name="bbsTitle"
	/>
</td>
</tr>
<tr>
<th>내용</th>
<td>
<textarea class="form-control" placeholder="글내용" name="bbsContent" rows="18"></textarea>
</td>
</tr>

</table>

<div class="d-flex justify-content-end my-5">
<div class="btn-group">
<input type="submit" class="btn btn-warning" value="write"/>
<a class="btn btn-secondary" href="bbs.jsp">list</a>
</div>
</div>












</form>

</div>
</div>
</div>

<%@ include file="../include/footer.jsp" %>