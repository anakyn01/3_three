<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="../include/header.jsp" %>

<div class="container">
<div class="row">
<div class="col-md-12 text-white">

<h1>디렉티브 태그</h1>
<p class="text-white">Today is <%=new Date() %></p>
<pre>
<c:out value="jstl core태그 라이브러리" />
<h1>forEach</h1>
<c:forEach var="k" begin="1" end="10" step="1">
<c:out value="${k}"/>
</c:forEach>

<c:forEach var="t" begin="1" end="15" step="1">
<c:out value="${t }"/>
</c:forEach>

- page : jsp페이지에 대한 정보를 설정한다
language[현재 jsp페이지가 사용할 프로그래밍 언어를 설정{java}],
contentType[현재 jsp페이지가 생성할 문서의 콘텐츠 유형을 설정한다{text/html}],
pageEncoding[현재 jsp페이지 문자 인코딩을 설정{ISO-8859-1}],
import[현재 jsp페이지가 사용할 자바클래스를 설정한다 ],
session[현재 jsp페이지가 세션 사용 여부를 설정한다] 기본값이 true 
isThreadSafe [멀티 스레드 처리를 위한 true설정] false로 설정할 경우 순차적으로 실행

- include : jsp페이지의 특정 영역에 다른 문서를 포함한다(예를 들어 헤더와 푸터)
jsp 어는 페이지에서든 선언할수 있다

- taglib : jsp페이지에서 사용할 태그 라이브러리를 설정한다
jsp standard tag lib..









</pre>
</div>
</div>
</div>
<%@ include file="../include/footer.jsp" %>