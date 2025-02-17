<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp" %>

<div class="container pt100">
<div class="card o-hidden border-0 shadow-lg my-5">
<div class="card-body p-0">
<div class="row">
<div class="col-lg-5 d-none d-lg-block bg-register-image"></div><!-- 이미지 -->
<div class="col-lg-7">
<div class="p-5">
<div class="text-center">Create an Account!</div>
<form method="post" action="joinAction.jsp" class="user">


<div class="form-group row my-3">
	
	<input 
	type="text" 
	class="form-control form-control-user" 
	placeholder="enter your id" 
	name="userID" 

	/>
</div>

<div class="form-group row my-3">

	<input
	type="password"
	class="form-control form-control-user"
	name="userPassword"
	placeholder="enter your password"

	/>
</div>

<div class="form-group row my-3">

	<input
	type="text"
	class="form-control form-control-user"
	placeholder="enter your name"
	name="userName"
	
	/>
</div>



<div class="form-group row my-3">

	<input
	type="email"
	class="form-control form-control-user"
	placeholder="enter your email"
	name="userEmail"
	/>
</div>

<div class="form-group row my-3">

	<div class="btn-group "><!--btn-group 버튼끼리 그룹화 할때 쓰는 클래스  -->
		<label class="btn btn-outline-light">
			<input type="radio" name="userGender" value="남자" checked/>
			<span class="ml-2">남자</span>
		</label>
		<label class="btn btn-outline-light">
			<input type="radio" name="userGender" value="여자"/>
			<span class="ml-2">여자</span>
		</label>	
	</div>
</div>
<!-- 
- input에서 name을 쓰는 이유 -
웹페이지에서 사용자가 입력한 테이터를 서버로 전송하면
입력필드에 이름과 값이 함께 전송된다
서버는 이러한 이름 값을 쌍으로 처리하기 때문에 필요하다
 -->
<div class="d-flex justify-content-end my-2">
<input type="submit" 
value="회원가입" 
class="btn btn-outline-primary btn-user btn-block"
/>
</div>
<hr/>
<a href="" class="btn btn-google btn-user btn-block mt-2">
<i class="fab fa-google fa-fw text-white"></i><!--이미지를 사용하는데 로고나 기타유용한 아이콘 글씨로 만듬-->
Register with Google
</a>
<a href="" class="btn btn-facebook btn-user btn-block mt-2">
<i class="fab fa-facebook-f fa-fw text-white"></i>
Register with Facebook
</a>
<div class="text-center">
	<a class="small" href="forgot.jsp">Forgot Password?</a>
</div>
<div class="text-center">
	<a class="small" href="login.jsp">Already have an account? Login!</a>
</div>

</form>



</div>
</div>
</div>
</div>
</div>
</div>

<%@ include file="../include/footer.jsp" %>