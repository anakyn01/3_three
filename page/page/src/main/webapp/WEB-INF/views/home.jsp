<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="include/header.jsp" flush="false"/><!-- jsp include -->
<%@ include file="include/footer.jsp" %><!-- 페이지디렉티브 인쿨르드 -->

<!-- 
jsp include는 다른파일을 현재 jsp에서 삽입하여 재사용하거나 동적으로 콘텐츠를 포함하는 방식
동적 인클루드
요청이 들어올때 마다 파일이 포함됩니다. 서버가 크라이언트의 요청을 처리하는 동안에 실행됩니다
- 요청처리시점 동적포함
- 처리방식 : 요청시점에 동적으로 포함됨
- 요청마다 포함된 파일을 실향하므로 성능에 영향을 미칠수 있다
- 동적 콘텐츠 포함 조건에 따라 달라지는 내용 포함

페이지 디렉티브 인클루드 정적인클루드 jsp페이지가 컴파일 될때 포함됩니다 실행성능에 영향을 미치지 않음
주요 용도는 재사용 가능한 코드나 라이브러리 공통된 페이지 요소등을 포함할때 유용
-성능에 미치는 영향이 적다
-페이지가 컴파일 될때 포함
-포함시점 컴파일(정적포함)
 -->