<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 아래 페이지 디렉티브 인클루드 -->
<%@ include file="../include/header.jsp" %>

<div class="container">
	<div class="row justify-content-center">
		<div class="col-lg-12">
			<div class="card o-hidden border-0 shadow-lg my-5">
				<div class="card-body p-0">
					<div class="row">
<!-- 배경이미지 부트스트랩에 규칙 칸은 도합 12-->
<div class="col-lg-5 d-none d-lg-block bg-register-image">
</div>
<!-- join -->	
<div class="col-lg-7">
	<div class="p-5">
		<div class="text-center">
<h1 class="">
회원가입
</h1>
<form method="post">
<div class="">
<input
type="text"
placeholder="id"
name="userId"
/>
</div>

<div class="">
<input
type="password"
placeholder="pw"
name="userPass"
/>
</div>

<div class="">
<input
type="password"
placeholder="pwre"
name="userPassRe"
/>
</div>

<div class="">
<input
type="text"
placeholder="name"
name="userName"
/>
</div>

<div class="">
<input
type="text"
placeholder="email"
name="userEmail"
/>
</div>

<div class="">
<input
type="text"
placeholder="hp"
name="userPhone"
/>
</div>

<div class="">
<label class="form-label">주소</label>
<input
type="text"
placeholder="주소를 검색하세요"
name="userAddr1"
readonly="readonly"
/>
<a class="" onclick="go_daum_address()">주소찾기</a>
</div>

<div class="">
<input
type="text"
placeholder=""
name="userAddr2"
readonly="readonly"
/>
</div>

<div class="">
<input
type="text"
placeholder=""
name="userAddr3"
readonly="readonly"
/>
</div>

<div class="">
	<div class="btn-group">
		<label>
			<input type="radio" name="userGender" value="남자" autocomplete="off" checked>남자
		</label>
		<label>
			<input type="radio" name="userGender" value="여자" autocomplete="off">여자
		</label>
	</div>
</div>

<div class="my-3">
<input
type="submit"
class="btn btn-primary btn-user btn-block "
value="회원가입"
/>
</div>

<div class="mb-3">
<a class="small" href="/member/forgot.jsp">Forgot Password?</a>
</div>

<div class="mb-3">
<a class="small" href="/member/login.jsp">Already have an account? login!</a>
</div>

</form>		
		</div>
	</div>
</div>				
					</div>				
				</div>
			</div>
		</div>	
	</div>
</div>

<jsp:include page="../include/footer.jsp" flush="false"/>