<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="user.*, java.io.PrintWriter"%>
<!-- user.* 데이터베이스에 접속할 허용된 필드 확인
java.io.PrintWriter 아이디가 없을경우, 패스워드가 틀릴경우를
alert창으로 말해줌
 -->
<!-- jsp모델1에 컴포넌트로 설정해야됩니다 모둘 아이디와 패스워드를 언제든 접속 하려고 할때 
어떠한 정해진 법칙으로 할건지 공통적인 모듈을 설정 userID, userPassword
-->
<jsp:useBean class="user.User" scope="page" id="user"/>
<jsp:setProperty property="userID" name="user"/>
<jsp:setProperty property="userPassword" name="user"/>
<!-- 로그인을 할때 정해진 법칙(데이터를 확인 user.User 데이터에 엑세스 하기위해서 user.UserDAO (접속하고 확인하고)보내기위해서  
세팅하는 속성을 사용할때 jsp모델1과 모델2 둘다 접근제어자에 있는 필드를 가지고 온다
이를 제어하기 위해서 id가 필요한데 :useBean에 id="user"
-->

<% //데이타엑세스 오브젝트에 접속하여 확인 모듈에서 입력한 아이디 패스워드로 로그인을 할때 발생하는 이벤트를 표현
/*
- 세션 -
현재 접속한 한명의 회원에게 할당되는 고유한 id입니다
웹서버는 한명의 회원을 세션ID로 구분할수 있습니다.
로그인을 하면 세션이 부여되어서 로그인을 하지 않았을때와 
했을때 각각 다른 화면을 보여줍니다

로그인 전 로그인
로그인 로그아웃
*/
//현재 세션상태를 체크한다
String userID = null;
if(session.getAttribute("userID") != null){
	userID = (String)session.getAttribute("userID");
}
//이미 로그인을 했으면 다시 로그인 할수 없게 설정한다
if(userID != null){
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('이미 로그인이 되어있습니다')");
	script.println(" location.href='main.jsp' ");
	script.println("</script>");
}



UserDAO userDAO = new UserDAO();//1)로그인하기위해 입력한 아이디 패스워드를 담아서 확인
int result = userDAO.login(user.getUserID(), user.getUserPassword());

if (result == 1) {//로그인 성공 request요청 response응답
//add
session.setAttribute("userID", user.getUserID());
PrintWriter script = response.getWriter();
//PrintWriter클래스로 아이디와 패스워드로 로그인할때 발생하는 이벤트에 관련하여
//msg를 출력하고 맞는 페이지로 이동
script.println("<script>");
script.println("alert('로그인 성공')");
script.println("location.href='main.jsp'");
script.println("</script>");
}else if(result == 0){//비밀번호가 틀릴때
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('비밀번호가 틀립니다')");
	script.println("history.back()");//패스워드가 틀려서 입력창으로 리턴
	script.println("</script>");	
}else if(result == -1){//존재하지 않는 아이디일때
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('존재하지 않는 아이디 입니다')");
	script.println("history.back()");//뒤로 돌림 로그인창에 회원가입 url을 만들어 놓음
	script.println("</script>");
}else if(result == -2){//데이터베이스 오류
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('데이터베이스 오류 입니다')");
	script.println("history.back()");//작동이 되질 않더라도 뒤로 돌림
	script.println("</script>");
}












%><!-- 스크립 틀릿 html과 jsp에 자바를 써주는걸  -->