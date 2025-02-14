<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<jsp:include page="../../include/header.jsp"/>

<div class="container-fluid bg-gradient-primary">
<div class="row">
<div class="col-md-12">
<div class="d-flex">
<div class="w-25">
<div class="mt-1"></div>
<jsp:include page="../include/lnb.jsp"/>
</div>
<div class="w-75">
<form role="form" method="post" enctype="multipart/form-data">
<input type="hidden" name="gdsNum" value="${goods.gdsNum}"/>

<!-- 카테고리 -->
<div class="input-group">
<label class="form-label fw-bold">1차 분류류
    <select name="" id="" class="form-select category1">
        <option value="">전체</option>
    </select>
</label>
</div>

<div class="input-group">
    <label class="form-label fw-bold">2차 분류
        <select name="cateCode" id="" class="form-select category2">
            <option value="">전체</option>
        </select>
    </label>
</div>
<!--수정할때 쓰기와 다른점 기존에 썼던 내용을 받아와야 해서 input에 밸류가 el로 들어감-->
<div class="input-group">
    <label class="form-label fw-bold w-25">상품명</label>
    <input type="text" id="gdsName" name="gdsName" value="${goods.gdsName}" class="form-control">
</div>

<div class="input-group">
    <label class="form-label fw-bold w-25">상품가격</label>
    <input type="text" id="gdsPrice" name="gdsPrice" value="${goods.gdsPrice}" class="form-control">
</div>

<div class="input-group">
    <label class="form-label fw-bold w-25">상품수량</label>
    <input type="text" id="gdsStock" name="gdsStock" value="${goods.gdsStock}" class="form-control">
</div>

<div class="input-group">
    <label class="form-label w-25 fw-bold">상품소개</label>
    <textarea name="gdsDes" id="gdsDes" rows="5">${goods.gdsDes}</textarea>
<script src="${contextPath}/resources/js/ckeditorConfig.js">
</script>
</div>

<!--이미지 추가-->
<div class="input-group mt-3">
    <label class="form-label fw-bold w-25">이미지</label>
    <input type="file" id="gdsImg" name="file" class="form-control"/>
    <div class="select_img">
        <img src="${goods.gdsImg}" alt="이미지 이므니다">
        <input type="hidden" name="gdsImg" value="${goods.gdsImg}"/>
        <input type="hidden" name="gdsThumbImg" value="${goods.gdsThumbImg}"/>
    </div>
    <script>
        //해당 셀렉터 값이 변경될경우 변화를 캐치하는 이벤트
$('#gdsImg').change(function(){
    if(this.files && this.files[0]){
        var reader = new FileReader();
        reader.onload=function(data){
            $(".select_img img").attr("src", data.target.result).width(300);
        }
        reader.readAsDataURL(this.files[0]);
    }
})        
    </script>
<div class=""><%=request.getRealPath("/")%></div>

</div>

<!--버튼 세트-->
<div class="d-flex justify-content-end my-5">
    <div class="btn-group">
<button type="submit" id="update_Btn" class="btn btn-primary">완료</button>
<button type="submit" id="back_Btn" class="btn btn-secondary">취소</button>
    </div>
</div>
<script>
$('#back_Btn').click(function(){
    location.href="/admin/goods/view?n"+${goods.gdsNum};
    //history.back();
})
</script>
<script src=""></script>


</form>














</div>
</div>
</div>
</div>
</div>


<jsp:include page="../../include/footer.jsp"/>