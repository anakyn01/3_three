<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp" %>

<div class="container">
<div class="row">
<div class="col-md-12 text-white">
<h1>표현문 태그</h1>
<pre>
- 각 행을 세미콜론으로 종료할수 없음
- 기본 테이터 타입은 toString()을 통해서 출력되고
- 자바 객체 타입은 lang.Object클래스의 toString()메소드를 사용하거나 
자체에서 선언한 toString()을 사용하여 출력됩니다
</pre>
<p>
Today's date : <%=new java.util.Date() %>
</p>
<%
int q = 10; int w = 20; int e=30;
%>
<%=q + w + e %>
<h1 class="my-5">스크립트 태그</h1>
<%
for (int i=0; i <= 10; i++){
	if (i % 2==0)
		out.println(i + "<br>");
}
%>
<pre>
- jsp태그의 종류 -
스크립트태그 : html코드에 자바 코드를 넣어 프로그램을 수행하는 기능
선언문(자바변수나 메소드를 정의하는데 사용), 스크립틀릿(자바 로직코드), 표현문(변수, 계산식, 메소드 호출 결과물)등을 문자열 형태로 출력하는데 사용합니다

디렉티브태그 : 디렉티브 태그는 jsp를 어떻게 처리할것인지 설정
액션태그 : 클라이언트 /서버에 어떤 작동을 행하도록 명령을 지시하는 XML형태의 태그
</pre>
<h1>선언문</h1>
<pre>
- 변수뿐만 아니라 메소드도 선언할수 있다
- 서블릿 프로그램으로 변환될때 _jspService()메소드 외부에 배치된다
</pre>
<%!
int sum(int a, int b){
	return a + b;
}
%>
<% out.println(sum(2, 3)); %>
<h1>스크립 틀릿</h1>
<pre>
- 자바 코드로 이루어진 로직부분을 표현
- 메소드 없이 변수만 선언할수 있다
- 서블릿 프로그램으로 변환될때 _jspService()메소드 내부에 배치된다
</pre>
<%
int a = 2;
int b = 3;
int sum = a + b;
out.println("2 + 3" + " 결과값은 " + sum + " 입니다");
%>

</div>
</div>
</div>



<%@ include file="../include/footer.jsp" %>