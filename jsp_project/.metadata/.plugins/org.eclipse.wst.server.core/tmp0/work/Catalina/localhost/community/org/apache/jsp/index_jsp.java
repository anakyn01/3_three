/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.69
 * Generated at: 2024-12-02 00:27:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1732239688034L));
    _jspx_dependants.put("/include/footer.jsp", Long.valueOf(1732672408937L));
    _jspx_dependants.put("jar:file:/E:/dev/workspace/jsp_project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/community/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("/include/slide.jsp", Long.valueOf(1732157939172L));
    _jspx_dependants.put("/include/header.jsp", Long.valueOf(1732761791663L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!-- JSP Standard Tag Library jstl\r\n");
      out.write("java코드를 사용하지 않고 HTML태그 형태로 직관적인 코딩을 지원하는 라이브러리\r\n");
      out.write(" -->\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!-- 콘텍스트 패스는 로컬호스트와 이하 프로젝트명 까지 포함한다 그래서 타이핑을 줄여줌 -->\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/custom.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/custom.js\"></script>\r\n");
      out.write("<title>BBS</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"bg-gradient-primary\">\r\n");
      out.write("\r\n");

//로그인이 되어있는지 아닌지 체크 세션에 값이 담겨있는지 체크
String userID = null; //문자 변수 userID = 값을 0을 대입 => 초기화
//만약 누군가 접속[로그인]을 한다면
if(session.getAttribute("userID") != null){
	userID = (String)session.getAttribute("userID");
}
/*
유저아이디 없음 (평상시)
접속한 유저아이디가 있다면
그 아이디는 세션을 부여 받는다
*/

      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-sm bg-white fixed-top\">\r\n");
      out.write("	<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("<a class=\"navbar-brand\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/\">HYI</a><!-- 로고 -->\r\n");
      out.write("\r\n");
      out.write("<!-- 햄버거메뉴 아디다스 -->\r\n");
      out.write("<button class=\"navbar-toggler\" data-bs-toggle=\"collapse\" data-bs-target=\"#mynavbar\">\r\n");
      out.write("<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("</button>\r\n");
      out.write("\r\n");
      out.write("<!-- 링크 메뉴 -->\r\n");
      out.write("<div class=\"collapse navbar-collapse\" id=\"mynavbar\">\r\n");
      out.write("\r\n");
      out.write("<ul class=\"navbar-nav me-auto\"><!-- me-auto 두항목을 오른쪽으로 밀기 -->\r\n");
      out.write("	<!--  <li class=\"nav-item\">\r\n");
      out.write("		<a class=\"nav-link\" href=\"\">회원가입</a>\r\n");
      out.write("	</li>\r\n");
      out.write("	\r\n");
      out.write("	<li class=\"nav-item\">\r\n");
      out.write("		<a class=\"nav-link\" href=\"\">로그인</a>\r\n");
      out.write("	</li>-->\r\n");
      out.write("	\r\n");
      out.write("	<li class=\"nav-item\">\r\n");
      out.write("		<a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/bbs/bbs.jsp\">게시판</a>\r\n");
      out.write("	</li>\r\n");
      out.write("\r\n");

//로그인 하지 않았을때 보여지는 화면
if(userID == null){

      out.write("	\r\n");
      out.write("<li class=\"nav-item dropdown\"><!-- 온클릭이벤트로 누를때 메뉴가 하나이상 나올때 그메류를 드롭다운이라고 함 -->\r\n");
      out.write("\r\n");
      out.write("<a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\">접속하기</a>	<!-- 제어 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<ul class=\"dropdown-menu\">\r\n");
      out.write("<li><a class=\"dropdown-item\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/login.jsp\">로그인</a></li>\r\n");
      out.write("<li><a class=\"dropdown-item\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/member.jsp\">회원가입</a></li>\r\n");
      out.write("</ul>\r\n");
} else {
      out.write("<!-- 세션이 존재한다면 -->\r\n");
      out.write("<li class=\"nav-item dropdown\">\r\n");
      out.write("	<a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\">회원관리</a>\r\n");
      out.write("	<ul class=\"dropdown-menu\">\r\n");
      out.write("		<li><a class=\"dropdown-item\" href=\"logoutAction.jsp\" onclick=\"logOut()\">로그아웃</a></li>\r\n");
      out.write("	</ul>\r\n");
      out.write("</li>\r\n");
} 
      out.write("\r\n");
      out.write("	</li>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<!-- 회사소개 company/company.jsp 회사소개 -->\r\n");
      out.write("</ul>\r\n");
      out.write("\r\n");
      out.write("<!-- 검색창 -->\r\n");
      out.write("<form class=\"d-flex\">\r\n");
      out.write("	<input class=\"form-control\" type=\"text\" placeholder=\"Search\">\r\n");
      out.write("	<button class=\"btn btn-primary\" type=\"button\">Search</button>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	</div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"demo\" class=\"carousel slide\" data-bs-ride=\"carousel\">\r\n");
      out.write("\r\n");
      out.write("<!-- 이미지를 움직일때 클릭하는 점 -->\r\n");
      out.write("<div class=\"carousel-indicators\">\r\n");
      out.write("	<button data-bs-target=\"#demo\" data-bs-slide-to=\"0\" class=\"active\"></button>\r\n");
      out.write("	<button data-bs-target=\"#demo\" data-bs-slide-to=\"1\"></button>\r\n");
      out.write("	<button data-bs-target=\"#demo\" data-bs-slide-to=\"2\"></button>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- 변동하는 이미지 -->\r\n");
      out.write("<div class=\"carousel-inner\">\r\n");
      out.write("	<div class=\"carousel-item active\">\r\n");
      out.write("		<img src=\"images/la.jpg\" alt=\"Los Angeles\" class=\"w-100\">\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"carousel-item\">\r\n");
      out.write("		<img src=\"images/chicago.jpg\" alt=\"chicago\" class=\"w-100\">\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"carousel-item\">\r\n");
      out.write("		<img src=\"images/ny.jpg\" alt=\"New York\" class=\"w-100\">\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 왼쪽 오른쪽 화살표 -->\r\n");
      out.write("<button class=\"carousel-control-prev\" data-bs-target=\"#demo\" data-bs-slide=\"prev\">\r\n");
      out.write("<span class=\"carousel-control-prev-icon\"></span>\r\n");
      out.write("</button>\r\n");
      out.write("<button class=\"carousel-control-next\" data-bs-target=\"#demo\" data-bs-slide=\"next\">\r\n");
      out.write("<span class=\"carousel-control-next-icon\"></span>\r\n");
      out.write("</button>\r\n");
      out.write("\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<footer class=\"bg-light fixed-bottom\">\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("<div class=\"d-flex align-items-center justify-content-center py-2\">\r\n");
      out.write("Copyright &copy; all right reserved.\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</footer>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /include/header.jsp(7,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("contextPath");
      // /include/header.jsp(7,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/include/header.jsp(7,0) '${pageContext.request.contextPath}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }
}
