$(function(){//문서가 실행전에 로드하는것을 방지
	$(".addCart_btn").click(function(){
		
var gdsNum = $("#gdsNum").val();
var cartStock = $(".numBox").val();

var data = {gdsNum : gdsNum, cartStock:cartStock};

$.ajax({
url:"/shop/view/addCart", type:"post", data:data, success:function(result){
	if(result == 1) {
		alert("카트담기 성공");$(".numBox").val("1");
	}else{
		alert("회원만 사용할수 있습니다");$(".numBox").val("1");
	}
},error:function(){alert("카트 담기 실패");}		
	});
});
});