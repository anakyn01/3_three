<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% session.invalidate(); %><!-- 세션 종료 -->
<script>
alert('로그아웃 되었습니다');
location.href='/community/main.jsp'; //메인으로 이동
</script>
<!-- 자바스크립트나 jquery는 항상 linking 으로 -->