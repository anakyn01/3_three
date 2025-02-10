<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../../include/header.jsp"/>

<div class="container-fluid bg-gradient-primary">
<div class="row">
<div class="col-md-12">
<div class="d-flex">
<div class="w-10">
<div class="mt-1"></div>
<jsp:include page="../include/lnb.jsp"/>
</div>
<div class="w-90">
<h2 class="my-3 text-white">상품등록</h2>
<form method="post" enctype="multipart/form-data"><!-- 이미지나 다른 파일을 등록할때  -->
<div class="input-group">
<label class="form-label text-white">1차 분류</label>
<div class="w-5"></div>
<select class="form-select category1">
<option value="">
전체
</option>
</select>
<div class="w-5"></div>
<label class="form-label text-white">2차 분류</label>
<select class="form-select category2" name="cateCode">
<option value="">
전체
</option>
</select>
</div>

<div class="input-group mt-5">
<label class="form-label text-white w-10">상품명</label>
<input type="text" id="gdsName" name="gdsName" class="form-control w-90" required/>
</div>

<div class="input-group mt-5">
<label class="form-label text-white w-10">상품가격</label>
<input type="text" id="gdsPrice" name="gdsPrice" class="form-control w-90" required/>
</div>

<div class="input-group mt-5"><!-- 실패하는 경우 수량에는 숫자가 아닌 문자열을 사용할수 없게 만듬 10 11많음 -->
<label class="form-label text-white w-10">상품수량</label>
<input type="text" id="gdsStock" name="gdsStock" class="form-control w-90" required/>
</div>

<div class="input-group mt-5">
<label class="form-label text-white w-10">상품소개</label>
<textarea rows="5" id="gdsDes" name="gdsDes" class="form-control w-90" required>내용을 적어주세요</textarea>
<script>
//버전을 탄다 상위버전을 쓰려면 거기에 맞는 설정을 찾아야 함
var ckeditor_config = {
resize_enaleb : false,
enterMode : CKEDITOR.ENTER_BR,
shiftEnterMode : CKEDITOR.ENTER_P,
filebrowserUploadUrl : "/admin/goods/ckUpload"
}
CKEDITOR.replace("gdsDes", ckeditor_config);
</script>
</div>

<div class="input-group mt-5"><!-- 실제 파일을 올리는곳 -->
<label class="form-label text-white w-10">이미지</label>
<input type="file" id="gdsImg" name="file" class="form-control w-90"/>
</div>

<!-- 아래는 올린 이미지를 확인 -->
<div class="select_img my-3">
<img src="" style="width:100px;"/>
</div>
<div class="d-flex">
<div class="text-white">원본 이미지</div>
<img src="${goods.gdsImg}" style="width:100px;"/>
<div class="text-white">썸네일</div>
<img src="${goods.gdsThumbImg}" style="width:50px;"/>
</div>
<script>
$('#gdsImg').change(function(){//이미지 미리보기 처리html요소에 이벤트 리스너를 연결
//사용자가 이입력을 사용하여 이미지를 선택하면 change이벤트가 트리거 된다
	if(this.files && this.files[0]){//배열이 채워졌는지(사용자가 파일을 선택했는지 확인)
//files[0]선택된 첫번째 파일에 엑세스 파일입력은 여러 파일을 선택할수 있기 때문에 
var reader = new FileReader;//선택된 파일을 읽기위한 객체를 생성
reader.onload = function(data){//이미지를 읽을때 트리거되는 이벤트 핸들러
$(".select_img img").attr("src", data.target.result).width(100);
//class select_img 하위에 있는 img태그에 가로 100에 너비로 설정된다
//이미지의 데이터 URL을 보관한다
}	
reader.readAsDataURL(this.files[0]);//첫번째 선택된 파일을 데이터 URL로 읽습니다
	}
});

//수량에서 숫자외에 사용하지 않기를 강제적용
var regExp = /[^0-9]/gi;//숫자가 아닌 모든 것과 일치하는 정규표현식
//g flag를 지정하면 전역으로 적용됩니다
//i flag를 사용하면 대소문자를 구분하지 않는다
$("#gdsPrice").keyup(function(){numCheck($(this));});
$("#gdsStock").keyup(function(){numCheck($(this));});

function numCheck(selector){
	var tempVal = selector.val();//입력필드 현재값을 검색
	selector.val(tempVal.replace(regExp, ""));
	//숫자(0-9)가 아닌 모든 문자를 제거합니다
}
</script>
<div class="text-white"><%=request.getRealPath("/") %></div>
<button type="submit" id="register_Btn" class="btn btn-outline-warning btn-block">
등록
</button>
</form>
<script><!--2개의 드롭다운으로 카테고리를 선택할때 json으로 오라클에db 카테고리를 선택-->
//컨트롤러에서 데이터 받기
var jsonData = JSON.parse('${category}');
//서버에서 전달된 데이터를 JSON형식으로 파싱하여 jsonData변수에 저장합니다
var cate1Arr = new Array();
var cate1Obj = new Object();
//배열과 객체를 초기화

//1차 분류 셀렉트 박스에 삽입할 데이터 준비
for(var i = 0; i < jsonData.length; i++){
//jsonData배열을 순회하면서 level이 "1"인 항목을 찾아 
//cate1Obj에 cateCode와 catename을 저장하고 이를 cate1arr 배열에 추가합니다
	if(jsonData[i].level == "1"){
		cate1Obj = new Object(); //초기화
		cate1Obj.cateCode = jsonData[i].cateCode;
		cate1Obj.cateName = jsonData[i].cateName;
		cate1Arr.push(cate1Obj);
	}
}
//1차 분류 셀렉트 박스에 데이터를 삽입
var cate1Select = $("select.category1")//선택된 카테고리 예를 들어 100

for (var i=0; i < cate1Arr.length; i++){//만약 100,200,300,400
cate1Select.append("<option value='"+ cate1Arr[i].cateCode +"'>" + cate1Arr[i].cateName + "</option>");
}
//비어져있는 optiontag에 밸류를 넣어줌
/*
<option value="100">New</option>
그렇지만 컴퓨터가 내가 어떤 카테고릴 선택할지는 chat gpt도 모른다
이 이후에 부모 카데코리를 선택하는 이벤트가 발생
 */
$(document).on("change", "select.category1", function(){
	//select.category1이 변경되었다면 실행되는 함수
	var cate2Arr = new Array();
	var cate2Obj = new Object();
	
	
	//2차 분류 셀렉트 박스에 삽입할 데이터 준비
	for(var i =0; i < jsonData.length; i++){
	if(jsonData[i].level == "2"){
		cate2Obj = new Object(); //초기화
		cate2Obj.cateCode = jsonData[i].cateCode;
		cate2Obj.cateName = jsonData[i].cateName;
		cate2Obj.cateCodeRef = jsonData[i].cateCodeRef;
		cate2Arr.push(cate2Obj);
		}	
	}
	var cate2Select = $("select.category2");
	cate2Select.children().remove();
	
	$("option:selected", this).each(function(){
		var selectVal = $(this).val();
		cate2Select.append("<option value='" + selectVal+ "'>전체</option>");
		
		for(var i=0; i < cate2Arr.length; i++){
			if(selectVal == cate2Arr[i].cateCodeRef){
cate2Select.append("<option value='"+ cate2Arr[i].cateCode +"'>" + cate2Arr[i].cateCode + "</option>");
			}
		}
	});
});
</script>
</div>
</div>
</div>
</div>
</div>


<jsp:include page="../../include/footer.jsp"/>