<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../include/header.jsp" flush="false"/>

<div class="container-fluid bg-gradient-primary2">
    <div class="row justify-content-center">
        <div class="col-xl-10 col-lg-12 col-md-9">
            <div class="card o-hidden border-0 shadow-lg my-5">
                <div class="card-body p-0">
                    <div class="row">
                        <div class="col-lg-6 d-none d-lg-block bg-login-image">
                        </div>
                        <div class="col-lg-6">
                            <div class="p-5">
                                <div class="text-center">
                                    <h1 class="h4 text-gray-900 mb-4">Welcome Back!</h1>
                                </div>
                                <form method="post">
                                    <div class="">
                                        <input
                                        type="text"
                                        class="form-control-user" 
                                        placeholder="아이디를 입력하세요"
                                        name="userId"
                                        />
                                    </div>
                                    <div class="">
                                        <input
                                        type="password"
                                        class="form-control-user" 
                                        placeholder="비밀번호를 입력하세요"
                                        name="userPass"
                                        />
                                    </div>
                                    <p class="mb-3">
                                        <input 
                                        type="submit" 
                                        class="btn btn-primary btn-user btn-block"
                                        value="로그인"
                                        id="signin_btn"
                                        name="signin_btn"
                                        />
                                    </p>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>                            
    </div>
</div>

<jsp:include page="../include/footer.jsp" flush="false"/>
