<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../include/header.jsp" />

<div class="container-fluid">
	<div class="row">
		<div class="col-md-3">
<jsp:include page="../include/aside.jsp" />		
		</div>
		<div class="col-md-9">
<h1 class="my-5">장바구니</h1>		
<ul class="list-group list-group-flush">
<li class="list-group-item">
<!-- 모두선택 -->
<div class="allCheck">
	<div class="d-flex">
		<input type="checkbox" name="allCheck" id="allCheck" class="form-check"/>
		<label for="allCheck" class="form-label mx-2">모두 선택</label>
	</div>
</div>
<script>
$("#allCheck").click(function(){
	let chk = $("#allCheck").prop("checked");
	if(chk){
		$(".chBox").prop("checked", true);
	}else{
		$(".chBox").prop("checked", false);
	}
});
</script>
</li>
</ul>

<div class="">
<button 
type="button" 
class="selectDelete_btn btn btn-outline-danger btn-lg"
>
선택삭제
</button>
<script>
$(".selectDelete_btn").click(function(){
	let confirm_val = confirm("정말 삭제하시겠습니까?");
	if(confirm_val){
		let checkArr = new Array();
		//체크된 체크박스의 갯수만큼 반복
		$("input[class='chBox']:checked").each(function(){
	checkArr.push($(this).attr("data-cartNum"));		
		});
	}
});
</script>
</div>


		</div>
	</div>
</div>

<jsp:include page="../include/footer.jsp" />