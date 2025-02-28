<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp" %>

<div class="container">
<div class="row">
<div class="col-md-12">
<%! int count =3;
String makeItLower(String data){
	return data.toLowerCase();
}
%><!-- 자바변수나 메소드를 정의하는데 사용 -->
<% 
for (int i=1; i<= count; i++){
	out.println("java.." + i + "<br>");
}

%><!-- 자바 로직 코드를 작성하는데 사용 -->
<%=makeItLower("헬로월드") %><!-- 변수 계산식 메소드 호출 결과를 문자열 형태로 출력 -->
<h1>웹과 JSP프로그래밍</h1>
<pre>
- 웹은 기본적으로 클라이언트(웹브라우저) / 서버 방식으로 동작합니다
- 클라이언트가 특정 페이지를 웹서버에 요청하면 (request) 이를 처리한후에
그결과를 클라이어트에게 보내서 응답(response)를 하는것입니다
요기에 주변에 치킨집 검색 request(파닭과 보리차) 라이더가가져오고 돈을 받음으로써 
배달품으로 응답(response)
- 가장 널리쓰이는 웹서버는 아파치 톰켓(자바 서블릿 과 java server page)
- html, php는 서버가 큰 특징이 없다 그냥업로드만 하면 바로 사용가능
- 호스팅이 따로 존재 react, vue (jsp 호스팅 [톰켓을 설치해야함])
- 정적(static[컴퓨터에 저장된 텍스트 파일을 그대로 보는것]) 웹페이지[HTML]와 
동적(dynamic[웹페이지에 저장된 내용을 다른 변수로 가공 처리하여 보는것]) 웹페이지[php, asp, jsp]
- 초반에는 정적[추가 수정 삭제 를 모두 수동으로 ]으로 사용을 하다가 
사용자에 기호에 맞게 능동적으로 변화하는 웹페이지가 필요해서 서버언어
- 현재보는 대부분의 웹은 동적 웹페이지라 할수 있습니다

서블릿 예시 (spring controller)
웹프로그래밍 언어는 클라이언트 측 실행언어와 서버 측 실행 언어로 구분되는데
자바를 기반으로 하는 서블릿(원래는 선마이크로시스템스(오라클에 합병됨))을 먼저 개발함

서블릿 개발 방식이 그렇게 쉽지 않아서 html에 코드를 직접 삽입할수 있도록 개발된 jsp
jsp 서버측 웹 프로그래밍 언어 입니다

파이썬을 사용하는것이 쉽지않아서 개발한게 django html에 파이썬코드를 사용함

서블릿과 JSP생명주기
서블릿에는 Servlet 인터페이스의 init(초기화), 
service(실행[doGet() doPost()]), 
destroy(소멸)가 있다 => 서블릿 클래스가 더이상 사용하지 않으면 제거


서블릿의 생성 부터 소멸까지의 과정을 수행한다

hello.jsp => 기계어로 번역(jsp소스 파일을 자바코드(서블릿))=> 컴파일 => 로딩및 초기화(jspinit) => 실행 (_jsp서비스) => 소멸(jspDestroy()









</pre>
</div>
</div>
</div>

<%@ include file="../include/footer.jsp" %>