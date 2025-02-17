<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>

<div class="container pt100">
<div class="row justify-content-center">
<div class="col-xl-10 col-lg-12 col-md-9"><!-- 해상도 별로 가로폭을 다르게 설정 -->

<!-- 로그인 창이 들어감 -->
<div class="card o-hidden border-0 shadow-lg my-5">

<div class="card-body p-0">

<div class="row">

<!-- 백그라운드 이미지 -->
<div class="col-lg-6 d-none d-lg-block bg-login-image">
</div>

<!-- 로그인 창 -->
<div class="col-lg-6">
<div class="p-5">
<div class="text-center">
<h1 class="h4 text-grey-900 mb-4">
Welcome Back!
</h1>
<form class="user" method="post" id="join_form" action="loginAction.jsp">
<!-- 중간매개체 역활을 하는 loginAction을 만들어야 합니다 -->
<div class="form-group mb-3"><!-- 3 16px * 3 3rem -->
<input
type="text"
class="form-control form-control-user"
placeholder="enter your id"
name="userID"
id="userID"
required="required"
/>
</div>

<div class="form-group mb-3">
<input
type="password"
class="form-control form-control-user"
placeholder="enter your pw"
name="userPassword"
id="userPassword"
required="required"
/>
</div>

<!-- 체크박스 -->
<div class="form-group">
<input type="checkbox" class="custom-control-input"/>
<label class="custom-control-label">Remember Me</label>
</div>

<!-- 폼에서 내용을 전송할때는 input type="submit" -->
<p class="my-2">
<input
type="submit"
value="로그인"
class="btn btn-outline-primary btn-user btn-block"
/>
</p>

<!-- 버튼추가 -->
<hr/>
<a href="" class="btn btn-google btn-user btn-block mt-2">
<i class="fab fa-google fa-fw text-white">
</i>Login with Google
</a>

<a href="" class="btn btn-facebook btn-user btn-block my-2">
<i class="fab fa-facebook-f fa-fw text-white">
</i>Login with Facebook
</a>

</form>
<hr/>
<div class="text-center">
	<a class="small" href="forgot.jsp">Forgot Password?</a>
</div>
<div class="text-center">
	<a class="small" href="join.jsp">Create an Account!</a>
</div>
</div>
</div>
</div>

</div>

</div>

</div>


</div>
</div>
</div>

<%@ include file="../include/footer.jsp"%>