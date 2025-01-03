<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
import="user.UserDAO, java.io.PrintWriter" %>
<!-- 한글쓰기 캐릭터셋을 강제로 설정 -->
<% request.setCharacterEncoding("UTF-8"); %>
<!-- 공통 컴포넌트 설정 -->
<jsp:useBean id="user" class="user.User" scope="page"/>
<jsp:setProperty property="userID" name="user"/>
<jsp:setProperty property="userPassword" name="user"/>
<jsp:setProperty property="userName" name="user"/>
<jsp:setProperty property="userGender" name="user"/>
<jsp:setProperty property="userEmail" name="user"/>

<!-- && and || or-->

<%
//현재 세션상태를 체크한다
String userID = null;
if(session.getAttribute("userID") != null){
	userID = (String)session.getAttribute("userID");
}
//이미 회원가입을 했으므로 다시 회원가입을 할수 없게 만든다
if(userID != null){
	PrintWriter script = response.getWriter();
    script.println("<script>");
    script.println("alert('이미 회원가입이 되어 있습니다')");
    script.println("location.href='/main.jsp'");
    script.println("</script>");
}

if(user.getUserID() == null || user.getUserPassword() == null || user.getUserName()== null || user.getUserGender() == null || user.getUserEmail() == null){//가정법 만약에 입력사항중에 하나라도 값이 없다면
	PrintWriter script = response.getWriter();
    script.println("<script>");
    script.println("alert('입력이 안된 사항이 있습니다')");
    script.println("history.back()");
    script.println("</script>");
}else{//그렇지 않으면 제대로 다 써져 있다면
	UserDAO userDAO = new UserDAO();
    int result = userDAO.join(user);
	
	//사용하는 유저에 변수까지 예측 동일 아이디 x
	if(result == -1){//중복 아이디
		PrintWriter script = response.getWriter();
	    script.println("<script>");
	    script.println("alert('이미 존재하는 아이디 입니다')");
	    script.println("history.back()");
	    script.println("</script>");
	}else{//중복 아이디가 아니라면
		PrintWriter script = response.getWriter();
	    script.println("<script>");
	    script.println("alert('회원가입 성공')");
	    script.println("window.location.href='main.jsp'");
	    script.println("</script>");
	}
}












%>