<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
import="java.io.PrintWriter, bbs.BbsDAO, bbs.Bbs, java.util.ArrayList"%>
<%@ include file="../include/header.jsp" %>

<div class="container pt100">
<div class="row">
<div class="col-md-12">
<h1 class="my-3 text-white fw-bold">BBS</h1>
<div class="table-responsive-sm"><!-- 반응형 테이블 래핑 -->
<table class="table table-bordered">
<colgroup>
<col style="width:5%"/>
<col style="width:70%"/>
<col style="width:10%"/>
<col style="width:15%"/>
</colgroup>
<thead>
<tr>
<th class="text-center">번호</th>
<th class="text-center">제목</th>
<th class="text-center">작성자</th>
<th class="text-center">작성일</th>
</tr>
</thead>
<tbody>
<%
BbsDAO bbsDAO = new BbsDAO(); //실제 사용할 객체인 인스턴스를 생성
ArrayList<Bbs> list = bbsDAO.getList();
for (int i=0; i < list.size(); i++){
%>
<tr><!-- 익스프레션 자바표현식 -->
<td><%=list.get(i).getBbsID() %></td><!-- 순번 -->
<td><%=list.get(i).getBbsTitle() %></td><!-- 제목 -->
<td><%=list.get(i).getUserID() %></td><!-- 글쓴이 -->
<td><%=list.get(i).getBbsDate()%></td><!-- 시간 -->
</tr>
<%
}
%>
</tbody>
<tfoot>
<tr>
<th class="text-center">번호</th>
<th class="text-center">제목</th>
<th class="text-center">작성자</th>
<th class="text-center">작성일</th>
</tr>
</tfoot>
</table>
</div>

<div class="d-flex justify-content-end">
<a class="btn btn-warning btn-lg" href="write.jsp">write</a>
</div>

<!-- 페이징 한페이지당 글이 10개씩 보여지는걸  -->
<a href="" class="btn btn-outline-warning">이전</a>
<a href="" class="btn btn-outline-warning">다음</a>
</div>
</div>
</div>


<%@ include file="../include/footer.jsp" %>