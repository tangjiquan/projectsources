package org.apache.jsp.webpage.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ace_005fmain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/context/mytags.jsp");
    _jspx_dependants.add("/WEB-INF/tld/easyui.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fmenu_0026_005fstyle_005fmenuFun_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fmenu_0026_005fstyle_005fmenuFun_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fmenu_0026_005fstyle_005fmenuFun_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;

      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /context/mytags.jsp(9,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("webRoot");
      // /context/mytags.jsp(9,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(basePath);
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"utf-8\" />\n");
      out.write("\t\t<title>");
      if (_jspx_meth_t_005fmutiLang_005f0(_jspx_page_context))
        return;
      out.write("</title>\n");
      out.write("\t\t<meta name=\"keywords\" content=\"");
      if (_jspx_meth_t_005fmutiLang_005f1(_jspx_page_context))
        return;
      out.write("\" />\n");
      out.write("\t\t<meta name=\"description\" content=\"");
      if (_jspx_meth_t_005fmutiLang_005f2(_jspx_page_context))
        return;
      out.write("\" />\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"plug-in/jquery/jquery.contextmenu.css\"/>\n");
      out.write("\t\t<!-- basic styles -->\n");
      out.write("\t\t<link href=\"plug-in/ace/assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"plug-in/ace/assets/css/font-awesome.min.css\" />\n");
      out.write("\n");
      out.write("\t\t<!--[if IE 7]>\n");
      out.write("\t\t  <link rel=\"stylesheet\" href=\"plug-in/ace/assets/css/font-awesome-ie7.min.css\" />\n");
      out.write("\t\t<![endif]-->\n");
      out.write("\n");
      out.write("\t\t<!-- page specific plugin styles -->\n");
      out.write("\n");
      out.write("\t\t<!-- fonts -->\n");
      out.write("\n");
      out.write("\t\t<!--  <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Open+Sans:400,300\" />  -->\n");
      out.write("\n");
      out.write("\t\t<!-- ace styles -->\n");
      out.write("\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"plug-in/ace/assets/css/ace.min.css\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"plug-in/ace/assets/css/ace-rtl.min.css\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"plug-in/ace/assets/css/ace-skins.min.css\" />\n");
      out.write("\n");
      out.write("\t\t<!--[if lte IE 8]>\n");
      out.write("\t\t  <link rel=\"stylesheet\" href=\"plug-in/ace/assets/css/ace-ie.min.css\" />\n");
      out.write("\t\t<![endif]-->\n");
      out.write("\n");
      out.write("\t\t<!-- inline styles related to this page -->\n");
      out.write("\n");
      out.write("\t\t<!-- ace settings handler -->\n");
      out.write("\n");
      out.write("\t\t<script src=\"plug-in/ace/assets/js/ace-extra.min.js\"></script>\n");
      out.write("\n");
      out.write("\t\t<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("\n");
      out.write("\t\t<!--[if lt IE 9]>\n");
      out.write("\t\t<script src=\"plug-in/ace/assets/js/html5shiv.js\"></script>\n");
      out.write("\t\t<script src=\"plug-in/ace/assets/js/respond.min.js\"></script>\n");
      out.write("\t\t<![endif]-->\n");
      out.write("\t</head>\n");
      out.write("\n");
      out.write("\t<body>\n");
      out.write("\t\t<div class=\"navbar navbar-default\" id=\"navbar\">\n");
      out.write("\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\ttry{ace.settings.check('navbar' , 'fixed')}catch(e){}\n");
      out.write("\t\t\t</script>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"navbar-container\" id=\"navbar-container\">\n");
      out.write("\t\t\t\t<div class=\"navbar-header pull-left\">\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"navbar-brand\">\n");
      out.write("\t\t\t\t\t\t<small>\n");
      out.write("\t\t\t\t\t\t\t<i class=\"icon-leaf\"></i>\n");
      out.write("\t\t\t\t\t\t\tJEECG 微云快速开发平台\n");
      out.write("\t\t\t\t\t\t</small>\n");
      out.write("\t\t\t\t\t</a><!-- /.brand -->\n");
      out.write("\t\t\t\t</div><!-- /.navbar-header -->\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"navbar-header pull-right\" role=\"navigation\">\n");
      out.write("\t\t\t\t\t<ul class=\"nav ace-nav\">\n");
      out.write("\t\t\t\t\t\t<li class=\"grey\">\n");
      out.write("\t\t\t\t\t\t\t<a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-tasks\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"badge badge-grey\">4</span>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"pull-right dropdown-navbar dropdown-menu dropdown-caret dropdown-close\">\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"dropdown-header\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"icon-ok\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t还有4个任务完成\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"pull-left\">软件更新</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"pull-right\">65%</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"progress progress-mini \">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div style=\"width:65%\" class=\"progress-bar \"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"pull-left\">硬件更新</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"pull-right\">35%</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"progress progress-mini \">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div style=\"width:35%\" class=\"progress-bar progress-bar-danger\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"pull-left\">单元测试</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"pull-right\">15%</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"progress progress-mini \">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div style=\"width:15%\" class=\"progress-bar progress-bar-warning\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"pull-left\">错误修复</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"pull-right\">90%</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"progress progress-mini progress-striped active\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div style=\"width:90%\" class=\"progress-bar progress-bar-success\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t查看任务详情\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-arrow-right\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<li class=\"purple\">\n");
      out.write("\t\t\t\t\t\t\t<a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-bell-alt icon-animated-bell\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"badge badge-important\" id=\"noticeCount\">0</span>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"pull-right dropdown-navbar navbar-pink dropdown-menu dropdown-caret dropdown-close\">\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"dropdown-header\" id=\"noticeTip\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"icon-warning-sign\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t0条公告\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"dropdown-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu dropdown-navbar navbar-pink\" id=\"noticeContent\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- ajax加载 -->\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" id=\"noticeContent\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"javascript:goAllNotice();\" id=\"noticeFooter\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t查看全部\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-arrow-right\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<li class=\"green\">\n");
      out.write("\t\t\t\t\t\t\t<a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-envelope icon-animated-vertical\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"badge badge-success\" id=\"messageCount\">0</span>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"pull-right dropdown-navbar dropdown-menu dropdown-caret dropdown-close\">\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"dropdown-header\" id=\"messageTip\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"icon-envelope-alt\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t0条消息\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" id=\"messageContent\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"javascript:goAllMessage();\" id=\"messageFooter\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t查看所有消息\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-arrow-right\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<li class=\"light-blue\">\n");
      out.write("\t\t\t\t\t\t\t<a data-toggle=\"dropdown\" href=\"#\" class=\"dropdown-toggle\">\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"nav-user-photo\" src=\"plug-in/ace/avatars/avatar2.png\" alt=\"Jason's Photo\" />\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"user-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<small>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</small>\n");
      out.write("\t\t\t\t                    <span style=\"color: #666633\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${roleName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span>\n");
      out.write("\t\t\t\t\t\t\t\t</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-caret-down\"></i>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close\">\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"javascript:add('");
      if (_jspx_meth_t_005fmutiLang_005f3(_jspx_page_context))
        return;
      out.write("','userController.do?changepassword','',550,200)\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-cog\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t ");
      if (_jspx_meth_t_005fmutiLang_005f4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"javascript:openwindow('");
      if (_jspx_meth_t_005fmutiLang_005f5(_jspx_page_context))
        return;
      out.write("','userController.do?userinfo')\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-user\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t ");
      if (_jspx_meth_t_005fmutiLang_005f6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"javascript:openwindow('");
      if (_jspx_meth_t_005fmutiLang_005f7(_jspx_page_context))
        return;
      out.write("','tSSmsController.do?getSysInfos')\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-cog\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t ");
      if (_jspx_meth_t_005fmutiLang_005f8(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"javascript:add('");
      if (_jspx_meth_t_005fmutiLang_005f9(_jspx_page_context))
        return;
      out.write("','userController.do?changestyle','',550,250)\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-cog\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t ");
      if (_jspx_meth_t_005fmutiLang_005f10(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"javascript:clearLocalstorage()\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-cog\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_005fmutiLang_005f11(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"javascript:logout()\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-off\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t ");
      if (_jspx_meth_t_005fmutiLang_005f12(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul><!-- /.ace-nav -->\n");
      out.write("\t\t\t\t</div><!-- /.navbar-header -->\n");
      out.write("\t\t\t</div><!-- /.container -->\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"main-container\" id=\"main-container\">\n");
      out.write("\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\ttry{ace.settings.check('main-container' , 'fixed')}catch(e){}\n");
      out.write("\t\t\t</script>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"main-container-inner\">\n");
      out.write("\t\t\t\t<a class=\"menu-toggler\" id=\"menu-toggler\" href=\"#\">\n");
      out.write("\t\t\t\t\t<span class=\"menu-text\"></span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"sidebar\" id=\"sidebar\">\n");
      out.write("\t\t\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t\t\ttry{ace.settings.check('sidebar' , 'fixed')}catch(e){}\n");
      out.write("\t\t\t\t\t</script>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"sidebar-shortcuts\" id=\"sidebar-shortcuts\">\n");
      out.write("\t\t\t\t\t\t<div class=\"sidebar-shortcuts-large\" id=\"sidebar-shortcuts-large\">\n");
      out.write("\t\t\t\t\t\t\t<button class=\"btn btn-success\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-signal\"></i>\n");
      out.write("\t\t\t\t\t\t\t</button>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<button class=\"btn btn-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-pencil\"></i>\n");
      out.write("\t\t\t\t\t\t\t</button>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<button class=\"btn btn-warning\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-group\"></i>\n");
      out.write("\t\t\t\t\t\t\t</button>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<button class=\"btn btn-danger\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-cogs\"></i>\n");
      out.write("\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"sidebar-shortcuts-mini\" id=\"sidebar-shortcuts-mini\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"btn btn-success\"></span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<span class=\"btn btn-info\"></span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<span class=\"btn btn-warning\"></span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<span class=\"btn btn-danger\"></span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div><!-- #sidebar-shortcuts -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t<ul class=\"nav nav-list\">\n");
      out.write("\t\t\t\t\t\t<li class=\"active\">\n");
      out.write("\t\t\t\t\t\t\t<a  href=\"javascript:addTabs({id:'home',title:'首页',close: false,url: 'loginController.do?acehome'});\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-dashboard\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"menu-text\"> 首页 </span>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_t_005fmenu_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t</ul><!-- /.nav-list -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"sidebar-collapse\" id=\"sidebar-collapse\">\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-double-angle-left\" data-icon1=\"icon-double-angle-left\" data-icon2=\"icon-double-angle-right\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t\t\ttry{ace.settings.check('sidebar' , 'collapsed')}catch(e){}\n");
      out.write("\t\t\t\t\t</script>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"main-content\">\n");
      out.write("\t\t\t\t\t<div class=\"page-content\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-12\" style=\"width: 99%;padding-left:2px;padding-right: 2px;\" id=\"tabs\">\n");
      out.write("\t                            <ul class=\"nav nav-tabs\" role=\"tablist\">\n");
      out.write("\t                                <!-- <li class=\"active\"><a href=\"#Index\" role=\"tab\" data-toggle=\"tab\">首页</a></li> -->\n");
      out.write("\t                            </ul>\n");
      out.write("\t                            <div class=\"tab-content\">\n");
      out.write("\t                                <div role=\"tabpanel\" class=\"tab-pane active\" id=\"Index\">\n");
      out.write("\t                                </div>\n");
      out.write("\t                            </div>\n");
      out.write("\t                        </div>\n");
      out.write("\t\t\t\t\t\t</div><!-- /.row -->\n");
      out.write("\t\t\t\t\t</div><!-- /.page-content -->\n");
      out.write("\t\t\t\t</div><!-- /.main-content -->\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"ace-settings-container\" id=\"ace-settings-container\">\n");
      out.write("\t\t\t\t\t<div class=\"btn btn-app btn-xs btn-warning ace-settings-btn\" id=\"ace-settings-btn\">\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-cog bigger-150\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"ace-settings-box\" id=\"ace-settings-box\">\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pull-left\">\n");
      out.write("\t\t\t\t\t\t\t\t<select id=\"skin-colorpicker\" class=\"hide\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<option data-skin=\"default\" value=\"#438EB9\">#438EB9</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option data-skin=\"skin-1\" value=\"#222A2D\">#222A2D</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option data-skin=\"skin-2\" value=\"#C6487E\">#C6487E</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option data-skin=\"skin-3\" value=\"#D0D0D0\">#D0D0D0</option>\n");
      out.write("\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<span>&nbsp; 选择皮肤</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" class=\"ace ace-checkbox-2\" id=\"ace-settings-navbar\" />\n");
      out.write("\t\t\t\t\t\t\t<label class=\"lbl\" for=\"ace-settings-navbar\"> 固定导航条</label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" class=\"ace ace-checkbox-2\" id=\"ace-settings-sidebar\" />\n");
      out.write("\t\t\t\t\t\t\t<label class=\"lbl\" for=\"ace-settings-sidebar\"> 固定滑动条</label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" class=\"ace ace-checkbox-2\" id=\"ace-settings-breadcrumbs\" />\n");
      out.write("\t\t\t\t\t\t\t<label class=\"lbl\" for=\"ace-settings-breadcrumbs\">固定面包屑</label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" class=\"ace ace-checkbox-2\" id=\"ace-settings-rtl\" />\n");
      out.write("\t\t\t\t\t\t\t<label class=\"lbl\" for=\"ace-settings-rtl\">切换到左边</label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" class=\"ace ace-checkbox-2\" id=\"ace-settings-add-container\" />\n");
      out.write("\t\t\t\t\t\t\t<label class=\"lbl\" for=\"ace-settings-add-container\">\n");
      out.write("\t\t\t\t\t\t\t\t切换窄屏\n");
      out.write("\t\t\t\t\t\t\t\t<b></b>\n");
      out.write("\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div><!-- /#ace-settings-container -->\n");
      out.write("\t\t\t</div><!-- /.main-container-inner -->\n");
      out.write("\n");
      out.write("\t\t\t<a href=\"#\" id=\"btn-scroll-up\" class=\"btn-scroll-up btn btn-sm btn-inverse\">\n");
      out.write("\t\t\t\t<i class=\"icon-double-angle-up icon-only bigger-110\"></i>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t</div><!-- /.main-container -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"changestylePanel\" style=\"display:none\" >\n");
      out.write("\t<form id=\"formobj\"  action=\"userController.do?savestyle\" name=\"formobj\" method=\"post\">\n");
      out.write("\t<table style=\"width: 550px\" cellpadding=\"0\" cellspacing=\"1\" class=\"formtable\">\n");
      out.write("\t\t<tr><td >风格</td></tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td class=\"value\"><input type=\"radio\" value=\"default\" name=\"indexStyle\" /> <span>经典风格</span></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<!--\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td class=\"value\"><input type=\"radio\" value=\"bootstrap\" name=\"indexStyle\" /> <span>BootStrap风格</span></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t-->\n");
      out.write("\t\t\t<!-- update-start--Author:gaofeng  Date:2014-01-10 for:新增首页风格  -->\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td class=\"value\"><input type=\"radio\" value=\"shortcut\" name=\"indexStyle\" /> <span>ShortCut风格</span></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<!-- update-start--Author:gaofeng  Date:2014-01-24 for:新增首页风格  -->\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td class=\"value\"><input type=\"radio\" value=\"sliding\" name=\"indexStyle\"  /><span>Sliding云桌面</span></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<!-- update-end--Author:longjb  Date:2013-03-15 for:新增首页风格  -->\t\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td class=\"value\"><input type=\"radio\" value=\"ace\" name=\"indexStyle\"  /><span>ACE平面风格</span></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t</table>\n");
      out.write("\t</form>\n");
      out.write("</div>\n");
      out.write("<div id=\"changepassword\" style=\"display:none\">\n");
      out.write("\n");
      out.write("<input id=\"id\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\n");
      out.write("\t<table style=\"width: 550px\" cellpadding=\"0\" cellspacing=\"1\" class=\"formtable\">\n");
      out.write("\t\t<tbody>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td align=\"right\" width=\"20%\"><span class=\"filedzt\">原密码:</span></td>\n");
      out.write("\t\t\t\t<td class=\"value\"><input id=\"password\" type=\"password\" value=\"\" name=\"password\" class=\"inputxt\" datatype=\"*\" errormsg=\"请输入原密码\" /> <span class=\"Validform_checktip\"> 请输入原密码 </span></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td align=\"right\"><span class=\"filedzt\">新密码:</span></td>\n");
      out.write("\t\t\t\t<td class=\"value\"><input  type=\"password\" value=\"\" name=\"newpassword\" class=\"inputxt\" plugin=\"passwordStrength\" datatype=\"*6-18\" errormsg=\"密码至少6个字符,最多18个字符！\" /> <span\n");
      out.write("\t\t\t\t\tclass=\"Validform_checktip\"> 密码至少6个字符,最多18个字符！ </span> <span class=\"passwordStrength\" style=\"display: none;\"> <b>密码强度：</b> <span>弱</span><span>中</span><span class=\"last\">强</span> </span></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td align=\"right\"><span class=\"filedzt\">重复密码:</span></td>\n");
      out.write("\t\t\t\t<td class=\"value\"><input id=\"newpassword\" type=\"password\" recheck=\"newpassword\" datatype=\"*6-18\" errormsg=\"两次输入的密码不一致！\"> <span class=\"Validform_checktip\"></span></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</tbody>\n");
      out.write("\t</table>\n");
      out.write("</div>\n");
      out.write("\t\t<!-- basic scripts -->\n");
      out.write("\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\twindow.jQuery || document.write(\"<script src='plug-in/ace/assets/js/jquery-2.0.3.min.js'>\"+\"<\"+\"script>\");\n");
      out.write("\t\t</script>\n");
      out.write("\n");
      out.write("\t\t<!--[if IE]>\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t window.jQuery || document.write(\"<script src='plug-in/ace/assets/js/jquery-1.10.2.min.js'>\"+\"<\"+\"script>\");\n");
      out.write("\t\t</script>\n");
      out.write("\t\t<![endif]-->\n");
      out.write("\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\tif(\"ontouchend\" in document) document.write(\"<script src='plug-in/ace/assets/js/jquery.mobile.custom.min.js'>\"+\"<\"+\"script>\");\n");
      out.write("\t\t</script>\n");
      out.write("\t\t<script src=\"plug-in/ace/assets/js/bootstrap.min.js\"></script>\n");
      out.write("\t\t<script src=\"plug-in/ace/assets/js/typeahead-bs2.min.js\"></script>\n");
      out.write("\n");
      out.write("\t\t<!-- page specific plugin scripts -->\n");
      out.write("\n");
      out.write("\t\t<!--[if lte IE 8]>\n");
      out.write("\t\t  <script src=\"plug-in/ace/assets/js/excanvas.min.js\"></script>\n");
      out.write("\t\t<![endif]-->\n");
      out.write("\n");
      out.write("\t\t<script src=\"plug-in/ace/assets/js/jquery-ui-1.10.3.custom.min.js\"></script>\n");
      out.write("\t\t<script src=\"plug-in/ace/assets/js/jquery.ui.touch-punch.min.js\"></script>\n");
      out.write("\t\t<script src=\"plug-in/ace/assets/js/jquery.slimscroll.min.js\"></script>\n");
      out.write("\t\t<script src=\"plug-in/ace/assets/js/jquery.easy-pie-chart.min.js\"></script>\n");
      out.write("\t\t<script src=\"plug-in/ace/assets/js/jquery.sparkline.min.js\"></script>\n");
      out.write("\t\t<script src=\"plug-in/ace/assets/js/flot/jquery.flot.min.js\"></script>\n");
      out.write("\t\t<script src=\"plug-in/ace/assets/js/flot/jquery.flot.pie.min.js\"></script>\n");
      out.write("\t\t<script src=\"plug-in/ace/assets/js/flot/jquery.flot.resize.min.js\"></script>\n");
      out.write("\n");
      out.write("\t\t<!-- ace scripts -->\n");
      out.write("\n");
      out.write("\t\t<script src=\"plug-in/ace/assets/js/ace-elements.min.js\"></script>\n");
      out.write("\t\t<script src=\"plug-in/ace/assets/js/ace.min.js\"></script>\n");
      out.write("\t\t\n");
      out.write("\t\t");
      if (_jspx_meth_t_005fbase_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t<script src=\"plug-in/jquery-plugs/storage/jquery.storageapi.min.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"plug-in/ace/assets/js/bootstrap-tab.js\"></script>\n");
      out.write("\t\t<script src=\"plug-in/jquery/jquery.contextmenu.js\"></script>\n");
      out.write("\t\t<script src=\"plug-in/layer/layer.js\"></script>\n");
      out.write("\t    <script src=\"plug-in/ace/js/bootbox.js\"></script>\n");
      out.write("\t\t<!-- inline scripts related to this page -->\n");
      out.write("\t\t<script>\n");
      out.write("\t\tjQuery(function($) {\n");
      out.write("\t\t\t//$( \"#tabs\" ).tabs();\n");
      out.write("\t\t\taddTabs({id:'home',title:'首页',close: false,url: 'loginController.do?acehome'});\n");
      out.write("\t\t\t$('.theme-poptit .close').click(function(){\n");
      out.write("\t    \t\t$('.theme-popover-mask').fadeOut(100);\n");
      out.write("\t    \t\t$('.theme-popover').slideUp(200);\n");
      out.write("\t    \t});\n");
      out.write("\t    \t$('#closeBtn').click(function(){\n");
      out.write("\t    \t\t$('.theme-popover-mask').fadeOut(100);\n");
      out.write("\t    \t\t$('.theme-popover').slideUp(200);\n");
      out.write("\t    \t});\n");
      out.write("\t    \t//$('#ace-settings-sidebar').click();\n");
      out.write("\t    \t//$('#sidebar').addClass('compact');\n");
      out.write("\t\t\t$('#sidebar li').addClass('hover').filter('.open').removeClass('open').find('> .submenu').css('display', 'none');\n");
      out.write("\t\t});\n");
      out.write("\t\t</script>\n");
      out.write("\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\tjQuery(function($) {\n");
      out.write("\t\t\t\t$('.easy-pie-chart.percentage').each(function(){\n");
      out.write("\t\t\t\t\tvar $box = $(this).closest('.infobox');\n");
      out.write("\t\t\t\t\tvar barColor = $(this).data('color') || (!$box.hasClass('infobox-dark') ? $box.css('color') : 'rgba(255,255,255,0.95)');\n");
      out.write("\t\t\t\t\tvar trackColor = barColor == 'rgba(255,255,255,0.95)' ? 'rgba(255,255,255,0.25)' : '#E2E2E2';\n");
      out.write("\t\t\t\t\tvar size = parseInt($(this).data('size')) || 50;\n");
      out.write("\t\t\t\t\t$(this).easyPieChart({\n");
      out.write("\t\t\t\t\t\tbarColor: barColor,\n");
      out.write("\t\t\t\t\t\ttrackColor: trackColor,\n");
      out.write("\t\t\t\t\t\tscaleColor: false,\n");
      out.write("\t\t\t\t\t\tlineCap: 'butt',\n");
      out.write("\t\t\t\t\t\tlineWidth: parseInt(size/10),\n");
      out.write("\t\t\t\t\t\tanimate: /msie\\s*(8|7|6)/.test(navigator.userAgent.toLowerCase()) ? false : 1000,\n");
      out.write("\t\t\t\t\t\tsize: size\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t})\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t$('.sparkline').each(function(){\n");
      out.write("\t\t\t\t\tvar $box = $(this).closest('.infobox');\n");
      out.write("\t\t\t\t\tvar barColor = !$box.hasClass('infobox-dark') ? $box.css('color') : '#FFF';\n");
      out.write("\t\t\t\t\t$(this).sparkline('html', {tagValuesAttribute:'data-values', type: 'bar', barColor: barColor , chartRangeMin:$(this).data('min') || 0} );\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t  var placeholder = $('#piechart-placeholder').css({'width':'90%' , 'min-height':'150px'});\n");
      out.write("\t\t\t  var data = [\n");
      out.write("\t\t\t\t{ label: \"social networks\",  data: 38.7, color: \"#68BC31\"},\n");
      out.write("\t\t\t\t{ label: \"search engines\",  data: 24.5, color: \"#2091CF\"},\n");
      out.write("\t\t\t\t{ label: \"ad campaigns\",  data: 8.2, color: \"#AF4E96\"},\n");
      out.write("\t\t\t\t{ label: \"direct traffic\",  data: 18.6, color: \"#DA5430\"},\n");
      out.write("\t\t\t\t{ label: \"other\",  data: 10, color: \"#FEE074\"}\n");
      out.write("\t\t\t  ]\n");
      out.write("\t\t\t  function drawPieChart(placeholder, data, position) {\n");
      out.write("\t\t\t \t  $.plot(placeholder, data, {\n");
      out.write("\t\t\t\t\tseries: {\n");
      out.write("\t\t\t\t\t\tpie: {\n");
      out.write("\t\t\t\t\t\t\tshow: true,\n");
      out.write("\t\t\t\t\t\t\ttilt:0.8,\n");
      out.write("\t\t\t\t\t\t\thighlight: {\n");
      out.write("\t\t\t\t\t\t\t\topacity: 0.25\n");
      out.write("\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t\tstroke: {\n");
      out.write("\t\t\t\t\t\t\t\tcolor: '#fff',\n");
      out.write("\t\t\t\t\t\t\t\twidth: 2\n");
      out.write("\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t\tstartAngle: 2\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\tlegend: {\n");
      out.write("\t\t\t\t\t\tshow: true,\n");
      out.write("\t\t\t\t\t\tposition: position || \"ne\", \n");
      out.write("\t\t\t\t\t\tlabelBoxBorderColor: null,\n");
      out.write("\t\t\t\t\t\tmargin:[-30,15]\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t,\n");
      out.write("\t\t\t\t\tgrid: {\n");
      out.write("\t\t\t\t\t\thoverable: true,\n");
      out.write("\t\t\t\t\t\tclickable: true\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t })\n");
      out.write("\t\t\t }\n");
      out.write("\t\t\t drawPieChart(placeholder, data);\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t /**\n");
      out.write("\t\t\t we saved the drawing function and the data to redraw with different position later when switching to RTL mode dynamically\n");
      out.write("\t\t\t so that's not needed actually.\n");
      out.write("\t\t\t */\n");
      out.write("\t\t\t placeholder.data('chart', data);\n");
      out.write("\t\t\t placeholder.data('draw', drawPieChart);\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t  var $tooltip = $(\"<div class='tooltip top in'><div class='tooltip-inner'></div></div>\").hide().appendTo('body');\n");
      out.write("\t\t\t  var previousPoint = null;\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t  placeholder.on('plothover', function (event, pos, item) {\n");
      out.write("\t\t\t\tif(item) {\n");
      out.write("\t\t\t\t\tif (previousPoint != item.seriesIndex) {\n");
      out.write("\t\t\t\t\t\tpreviousPoint = item.seriesIndex;\n");
      out.write("\t\t\t\t\t\tvar tip = item.series['label'] + \" : \" + item.series['percent']+'%';\n");
      out.write("\t\t\t\t\t\t$tooltip.show().children(0).text(tip);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t$tooltip.css({top:pos.pageY + 10, left:pos.pageX + 10});\n");
      out.write("\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t$tooltip.hide();\n");
      out.write("\t\t\t\t\tpreviousPoint = null;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t });\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\tvar d1 = [];\n");
      out.write("\t\t\t\tfor (var i = 0; i < Math.PI * 2; i += 0.5) {\n");
      out.write("\t\t\t\t\td1.push([i, Math.sin(i)]);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\tvar d2 = [];\n");
      out.write("\t\t\t\tfor (var i = 0; i < Math.PI * 2; i += 0.5) {\n");
      out.write("\t\t\t\t\td2.push([i, Math.cos(i)]);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\tvar d3 = [];\n");
      out.write("\t\t\t\tfor (var i = 0; i < Math.PI * 2; i += 0.2) {\n");
      out.write("\t\t\t\t\td3.push([i, Math.tan(i)]);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\tvar sales_charts = $('#sales-charts').css({'width':'100%' , 'height':'220px'});\n");
      out.write("\t\t\t\t$.plot(\"#sales-charts\", [\n");
      out.write("\t\t\t\t\t{ label: \"Domains\", data: d1 },\n");
      out.write("\t\t\t\t\t{ label: \"Hosting\", data: d2 },\n");
      out.write("\t\t\t\t\t{ label: \"Services\", data: d3 }\n");
      out.write("\t\t\t\t], {\n");
      out.write("\t\t\t\t\thoverable: true,\n");
      out.write("\t\t\t\t\tshadowSize: 0,\n");
      out.write("\t\t\t\t\tseries: {\n");
      out.write("\t\t\t\t\t\tlines: { show: true },\n");
      out.write("\t\t\t\t\t\tpoints: { show: true }\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\txaxis: {\n");
      out.write("\t\t\t\t\t\ttickLength: 0\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\tyaxis: {\n");
      out.write("\t\t\t\t\t\tticks: 10,\n");
      out.write("\t\t\t\t\t\tmin: -2,\n");
      out.write("\t\t\t\t\t\tmax: 2,\n");
      out.write("\t\t\t\t\t\ttickDecimals: 3\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\tgrid: {\n");
      out.write("\t\t\t\t\t\tbackgroundColor: { colors: [ \"#fff\", \"#fff\" ] },\n");
      out.write("\t\t\t\t\t\tborderWidth: 1,\n");
      out.write("\t\t\t\t\t\tborderColor:'#555'\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t$('#recent-box [data-rel=\"tooltip\"]').tooltip({placement: tooltip_placement});\n");
      out.write("\t\t\t\tfunction tooltip_placement(context, source) {\n");
      out.write("\t\t\t\t\tvar $source = $(source);\n");
      out.write("\t\t\t\t\tvar $parent = $source.closest('.tab-content')\n");
      out.write("\t\t\t\t\tvar off1 = $parent.offset();\n");
      out.write("\t\t\t\t\tvar w1 = $parent.width();\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\tvar off2 = $source.offset();\n");
      out.write("\t\t\t\t\tvar w2 = $source.width();\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\tif( parseInt(off2.left) < parseInt(off1.left) + parseInt(w1 / 2) ) return 'right';\n");
      out.write("\t\t\t\t\treturn 'left';\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t$('.dialogs,.comments').slimScroll({\n");
      out.write("\t\t\t\t\theight: '300px'\n");
      out.write("\t\t\t    });\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t//Android's default browser somehow is confused when tapping on label which will lead to dragging the task\n");
      out.write("\t\t\t\t//so disable dragging when clicking on label\n");
      out.write("\t\t\t\tvar agent = navigator.userAgent.toLowerCase();\n");
      out.write("\t\t\t\tif(\"ontouchstart\" in document && /applewebkit/.test(agent) && /android/.test(agent))\n");
      out.write("\t\t\t\t  $('#tasks').on('touchstart', function(e){\n");
      out.write("\t\t\t\t\tvar li = $(e.target).closest('#tasks li');\n");
      out.write("\t\t\t\t\tif(li.length == 0)return;\n");
      out.write("\t\t\t\t\tvar label = li.find('label.inline').get(0);\n");
      out.write("\t\t\t\t\tif(label == e.target || $.contains(label, e.target)) e.stopImmediatePropagation() ;\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t$('#tasks').sortable({\n");
      out.write("\t\t\t\t\topacity:0.8,\n");
      out.write("\t\t\t\t\trevert:true,\n");
      out.write("\t\t\t\t\tforceHelperSize:true,\n");
      out.write("\t\t\t\t\tplaceholder: 'draggable-placeholder',\n");
      out.write("\t\t\t\t\tforcePlaceholderSize:true,\n");
      out.write("\t\t\t\t\ttolerance:'pointer',\n");
      out.write("\t\t\t\t\tstop: function( event, ui ) {//just for Chrome!!!! so that dropdowns on items don't appear below other items after being moved\n");
      out.write("\t\t\t\t\t\t$(ui.item).css('z-index', 'auto');\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t);\n");
      out.write("\t\t\t\t$('#tasks').disableSelection();\n");
      out.write("\t\t\t\t$('#tasks input:checkbox').removeAttr('checked').on('click', function(){\n");
      out.write("\t\t\t\t\tif(this.checked) $(this).closest('li').addClass('selected');\n");
      out.write("\t\t\t\t\telse $(this).closest('li').removeClass('selected');\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t})\n");
      out.write("\t\t</script>\n");
      out.write("\t\t\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("\t\tfunction loadModule(title,url,target){\n");
      out.write("\t\t\t//TODO addTab(title,url);\n");
      out.write("\t\t\t    $(\"#mainTitle\").text(title);\n");
      out.write("      \t\t\t$(\"#center\").attr(\"src\",url);\n");
      out.write("      \t}\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t  \tfunction logout(){\n");
      out.write("\t  \t\tbootbox.confirm(\"");
      if (_jspx_meth_t_005fmutiLang_005f13(_jspx_page_context))
        return;
      out.write("\", function(result) {\n");
      out.write("\t  \t\t\tif(result)\n");
      out.write("\t\t  \t\t\tlocation.href=\"loginController.do?logout\";\n");
      out.write("\t  \t\t});\n");
      out.write("  \t\t}\n");
      out.write("\t\tfunction opendialog(title,url,target){\n");
      out.write("\t\t\t//$(\"#dialog\").attr(\"src\",url);\n");
      out.write("\t\t\tbootbox.dialog({\n");
      out.write("\t\t\t\tmessage:$(\"#changestylePanel\").html(),\n");
      out.write("\t\t\t\ttitle:title,\n");
      out.write("\t\t\t\tbuttons:{\n");
      out.write("\t\t\t\tOK:{\n");
      out.write("\t\t\t\tlabel: \"OK\", \n");
      out.write("\t\t\t\tcallback:function(){\n");
      out.write("\t\t\t\t\t    var indexStyle = $('input[name=\"indexStyle\"]:checked').val();\n");
      out.write("\t\t\t\t\t    if(indexStyle==undefined||indexStyle==\"\"){\n");
      out.write("\t\t\t\t\t    \tindexStyle = \"ace\";\n");
      out.write("\t\t\t\t\t    }\n");
      out.write("\t\t\t\t\t    var cssTheme = $('input[name=\"cssTheme\"]:checked').val();\n");
      out.write("\t\t\t\t\t    if(cssTheme==undefined){\n");
      out.write("\t\t\t\t\t    \tcssTheme = \"\";\n");
      out.write("\t\t\t\t\t    }\n");
      out.write("\t\t\t\t\t\tvar form = $(\"#formobj\");//取iframe里的form\n");
      out.write("\t\t\t\t\t\t$.ajax({\n");
      out.write("\t\t        \t\t\turl:form.attr('action'),\n");
      out.write("\t\t        \t\t\ttype:form.attr('method'),\n");
      out.write("\t\t        \t\t\tdata:\"indexStyle=\"+indexStyle,//+\"&cssTheme=\"+cssTheme,\n");
      out.write("\t\t        \t\t\tsuccess:function(data){\n");
      out.write("\t\t\t\t\t\t\t\tvar d = $.parseJSON(data);\n");
      out.write("\t\t\t\t\t\t\t\tif (d.success) {\n");
      out.write("\t\t\t\t\t\t\t\t\tvar msg = d.msg;\n");
      out.write("\t\t\t\t\t\t\t\t\tbootbox.alert(msg);\n");
      out.write("\t\t\t\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\t\t\t\tbootbox.alert(d.msg);\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t        \t\t\t},\n");
      out.write("\t\t        \t\t\terror:function(e){\n");
      out.write("\t\t        \t\t\t\tbootbox.alert(\"出错了哦\");\n");
      out.write("\t\t        \t\t\t}\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t},Cancel: {label: \"CLOSE\", \n");
      out.write("\t\t\t\tcallback:function() {\n");
      out.write("\t\t\t\t\t\t//alert('close');//$(\"#dialog\").dialog(\"close\");\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}});\n");
      out.write("  \t\t\t\n");
      out.write("  \t}\n");
      out.write("\t\tfunction changepass(title,url,target){\n");
      out.write("\t\t\t//$(\"#dialog\").attr(\"src\",url);\n");
      out.write("\t\t\tbootbox.dialog({\n");
      out.write("\t\t\t\tmessage:'<form id=\"formobj2\"  action=\"userController.do?savenewpwd\" name=\"formobj2\" method=\"post\">'\n");
      out.write("\t\t\t\t\t+$(\"#changepassword\").html()+'</form>',\n");
      out.write("\t\t\t\ttitle:title,\n");
      out.write("\t\t\t\tbuttons:{\n");
      out.write("\t\t\t\tOK:{\n");
      out.write("\t\t\t\tlabel: \"OK\", \n");
      out.write("\t\t\t\tcallback:function(){\n");
      out.write("\t\t\t\t\t//alert('not implement');\n");
      out.write("\t\t\t\t\t\t$.ajax({\n");
      out.write("\t\t        \t\t\turl:\"userController.do?savenewpwd\",\n");
      out.write("\t\t        \t\t\ttype:\"post\",\n");
      out.write("\t\t        \t\t\tdata:$('#formobj2').serialize(),// 要提交的表单 ,\n");
      out.write("\t\t        \t\t\tsuccess:function(data){\n");
      out.write("\t\t\t\t\t\t\t\tvar d = $.parseJSON(data);\n");
      out.write("\t\t\t\t\t\t\t\tif (d.success) {\n");
      out.write("\t\t\t\t\t\t\t\t\tvar msg = d.msg;\n");
      out.write("\t\t\t\t\t\t\t\t\tbootbox.alert(msg);\n");
      out.write("\t\t\t\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\t\t\t\tbootbox.alert(d.msg);\n");
      out.write("\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t        \t\t\t},\n");
      out.write("\t\t        \t\t\terror:function(e){\n");
      out.write("\t\t        \t\t\t\tbootbox.alert(\"出错了哦\");\n");
      out.write("\t\t        \t\t\t}\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t},Cancel: {label: \"CLOSE\", \n");
      out.write("\t\t\t\tcallback:function() {\n");
      out.write("\t\t\t\t\t\talert('close');//$(\"#dialog\").dialog(\"close\");\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}});\n");
      out.write("  \t\t\t\n");
      out.write("  \t}\n");
      out.write("\t\tfunction profile(title,url,target){\n");
      out.write("\t\t\t//$(\"#dialog\").attr(\"src\",url);\n");
      out.write("\t\t\tbootbox.dialog({\n");
      out.write("\t\t\t\tmessage:'<iframe width=\"100%\" height=\"300px\" src=\"'+url+'\" style=\"border:1px #fff solid; background:#CCC;\"></iframe>',\n");
      out.write("\t\t\t\ttitle:title,\n");
      out.write("\t\t\t\tbuttons:{\n");
      out.write("\t\t\t\tOK:{\n");
      out.write("\t\t\t\tlabel: \"OK\"},Cancel: {label: \"CLOSE\"\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}});\n");
      out.write("  \t\t\t\n");
      out.write("  \t}\n");
      out.write("//update-begin--Author:张忠亮  Date:20150605 for：清除浏览器缓存\n");
      out.write("\t\t\tfunction clearLocalstorage(){\n");
      out.write("\t\t\t\tvar storage=$.localStorage;\n");
      out.write("\t\t\t\tif(!storage)\n");
      out.write("\t\t\t\t\tstorage=$.cookieStorage;\n");
      out.write("\t\t\t\tstorage.removeAll();\n");
      out.write("\t\t\t\t//bootbox.alert( \"浏览器缓存清除成功!\");\n");
      out.write("\t\t\t\talertTipTop(\"浏览器缓存清除成功!\",\"10%\");\n");
      out.write("\t\t\t}\n");
      out.write("//update-end--Author:张忠亮  Date:20150605 for：清除浏览器缓存\n");
      out.write("\n");
      out.write("\n");
      out.write("\t$(document).ready(function(){\n");
      out.write("\t\t//加载公告\n");
      out.write("\t\tvar url = \"noticeController.do?getNoticeList\";\n");
      out.write("\t\tjQuery.ajax({\n");
      out.write("    \t\turl:url,\n");
      out.write("    \t\ttype:\"GET\",\n");
      out.write("    \t\tdataType:\"JSON\",\n");
      out.write("    \t\tasync: false,\n");
      out.write("    \t\tsuccess:function(data){\n");
      out.write("    \t\t\tif(data.success){\n");
      out.write("    \t\t\t\tvar noticeList = data.attributes.noticeList;\n");
      out.write("    \t\t\t\tvar noticeCount = data.obj;\n");
      out.write("    \t\t\t\t//加载公告条数\n");
      out.write("    \t\t\t\tif(noticeCount>99){\n");
      out.write("    \t\t\t\t\t$(\"#noticeCount\").html(\"99+\");\n");
      out.write("    \t\t\t\t}else{\n");
      out.write("    \t\t\t\t\t$(\"#noticeCount\").html(noticeCount);\n");
      out.write("    \t\t\t\t}\n");
      out.write("    \t\t\t\t//加载公告提示\n");
      out.write("    \t\t\t\tvar noticeTip = \"\";\n");
      out.write("    \t\t\t\tnoticeTip += \"<i class='icon-warning-sign'></i>\";\n");
      out.write("    \t\t\t\tnoticeTip += noticeCount+\" \"+data.attributes.tip;\n");
      out.write("    \t\t\t\t$(\"#noticeTip\").html(noticeTip);\n");
      out.write("    \t\t\t\t\n");
      out.write("    \t\t\t\t//加载公告条目\n");
      out.write("    \t\t\t\tvar noticeContent = \"\";\n");
      out.write("    \t\t\t\tif(noticeList.length > 0){\n");
      out.write("    \t\t\t\t\tfor(var i=0;i<noticeList.length;i++){\n");
      out.write("    \t\t\t\t\t\tnoticeContent +=\"<li><a href='javascript:goNotice(&quot;\"+noticeList[i].id+\"&quot;)' \";\n");
      out.write("    \t\t\t\t\t\tnoticeContent +=\"style='word-break:keep-all;white-space:nowrap;overflow:hidden;text-overflow:ellipsis;'>\";\n");
      out.write("    \t\t\t\t\t\tnoticeContent +=\"<i class='btn btn-xs btn-primary fa fa-user'></i>\";\n");
      out.write("    \t\t\t\t\t\tnoticeContent +=\"&nbsp;\"+noticeList[i].noticeTitle + \"</a></li></ul></li>\";\n");
      out.write("        \t\t\t\t}\n");
      out.write("    \t\t\t\t}\n");
      out.write("    \t\t\t\talert(noticeContent);\n");
      out.write("    \t\t\t\t$(\"#noticeContent\").html(noticeContent);\n");
      out.write("    \t\t\t\t\n");
      out.write("    \t\t\t\t//加载公告底部文字\n");
      out.write("    \t\t\t\tvar noticeSeeAll = data.attributes.seeAll +\"<i class='ace-icon fa fa-arrow-right'></i>\";\n");
      out.write("    \t\t\t\t$(\"#noticeFooter\").html(noticeSeeAll);\n");
      out.write("    \t\t\t}\n");
      out.write("    \t\t}\n");
      out.write("    \t});\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t//加载消息\n");
      out.write("\t\tvar url = \"tSSmsController.do?getMessageList\";\n");
      out.write("\t\t$.ajax({\n");
      out.write("    \t\turl:url,\n");
      out.write("    \t\ttype:\"GET\",\n");
      out.write("    \t\tdataType:\"JSON\",\n");
      out.write("    \t\tasync: false,\n");
      out.write("    \t\tsuccess:function(data){\n");
      out.write("    \t\t\tif(data.success){\n");
      out.write("    \t\t\t\tvar messageList = data.attributes.messageList;\n");
      out.write("    \t\t\t\tvar messageCount = data.obj;\n");
      out.write("    \t\t\t\t//加载消息条数\n");
      out.write("    \t\t\t\tif(messageCount>99){\n");
      out.write("    \t\t\t\t\t$(\"#messageCount\").html(\"99+\");\n");
      out.write("    \t\t\t\t}else{\n");
      out.write("    \t\t\t\t\t$(\"#messageCount\").html(messageCount);\n");
      out.write("    \t\t\t\t}\n");
      out.write("    \t\t\t\t//加载消息tip提示\n");
      out.write("    \t\t\t\tvar messageTip = \"\";\n");
      out.write("\t\t\t\t\tmessageTip += \"<i class='ace-icon fa fa-envelope-o'></i>\";\n");
      out.write("\t\t\t\t\tmessageTip += messageCount+\" \"+data.attributes.tip;\n");
      out.write("    \t\t\t\t$(\"#messageTip\").html(messageTip);\n");
      out.write("    \t\t\t\t\n");
      out.write("    \t\t\t\t//加载消息条目（有限）\n");
      out.write("    \t\t\t\tvar messageContent = \"\";\n");
      out.write("    \t\t\t\tif(messageList.length > 0){\n");
      out.write("    \t\t\t\t\tfor(var i=0;i<messageList.length;i++){\n");
      out.write("    \t\t\t\t\t\tmessageContent +=\"<li><a href='javascript:goMessage(&quot;\"+messageList[i].id+\"&quot;)' class='clearfix'>\";\n");
      out.write("    \t\t\t\t\t\tmessageContent +=\"<img src='plug-in/ace/avatars/avatar3.png' class='msg-photo' alt='Alex’s Avatar' />\";\n");
      out.write("    \t\t\t\t\t\tmessageContent +=\"<span class='msg-body'><span class='msg-title'>\";\n");
      out.write("    \t\t\t\t\t\tmessageContent +=\"<span class='blue'>\"+messageList[i].esSender+\":</span>\";\n");
      out.write("    \t\t\t\t\t\tmessageContent += messageList[i].esTitle + \"</span>\";\n");
      out.write("    \t\t\t\t\t\tmessageContent +=\"<span class='msg-time'><i class='ace-icon fa fa-clock-o'></i><span>\"+messageList[i].esSendtimeTxt+\"</span></span>\";\n");
      out.write("    \t\t\t\t\t\tmessageContent +=\"</span></a><input id='\"+messageList[i].id+\"_title' type='hidden' value='\"+messageList[i].esTitle+\"'>\";\n");
      out.write("    \t\t\t\t\t\tmessageContent +=\"<input id='\"+messageList[i].id+\"_status' type='hidden' value='\"+messageList[i].esStatus+\"'>\";\n");
      out.write("    \t\t\t\t\t\tmessageContent +=\"<input id='\"+messageList[i].id+\"_content' type='hidden' value='\"+messageList[i].esContent+\"'></li>\";\n");
      out.write("        \t\t\t\t}\n");
      out.write("    \t\t\t\t}\n");
      out.write("    \t\t\t\t$(\"#messageContent\").html(messageContent);\n");
      out.write("    \t\t\t\t\n");
      out.write("    \t\t\t\t//加载消息底部文字\n");
      out.write("    \t\t\t\tvar messageSeeAll = data.attributes.seeAll +\"<i class='ace-icon fa fa-arrow-right'></i>\";\n");
      out.write("    \t\t\t\t$(\"#messageFooter\").html(messageSeeAll);\n");
      out.write("    \t\t\t}\n");
      out.write("    \t\t}\n");
      out.write("    \t});\n");
      out.write("\t\t\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("    function goAllNotice(){\n");
      out.write("    \tvar addurl = \"noticeController.do?noticeList\";\n");
      out.write("  \t\tcreatedetailwindow(\"公告\", addurl, 800, 400);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function goNotice(id){\n");
      out.write("  \t\tvar addurl = \"noticeController.do?goNotice&id=\"+id;\n");
      out.write("\t\tcreatedetailwindow(\"通知公告详情\", addurl, 750, 600);\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    function goAllMessage(){\n");
      out.write("    \tvar addurl = \"tSSmsController.do?getSysInfos\";\n");
      out.write("  \t\tcreatedetailwindow(\"消息\", addurl, 800, 400);\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    function goMessage(id){\n");
      out.write("    \tvar title = $(\"#\"+id+\"_title\").val();\n");
      out.write("    \tvar content = $(\"#\"+id+\"_content\").val();\n");
      out.write("    \t$(\"#msgId\").val(id);\n");
      out.write("    \t$(\"#msgTitle\").html(title);\n");
      out.write("    \t$(\"#msgContent\").html(content);\n");
      out.write("    \tvar status = $(\"#\"+id+\"_status\").val();\n");
      out.write("    \tif(status==1){\n");
      out.write("    \t\t$(\"#msgStatus\").html(\"未读\");\n");
      out.write("    \t}else{\n");
      out.write("    \t\t$(\"#msgStatus\").html(\"已读\");\n");
      out.write("    \t}\n");
      out.write("\n");
      out.write("    \t$('.theme-popover-mask').fadeIn(100);\n");
      out.write("    \t$('.theme-popover').slideDown(200);\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    function readMessage(){\n");
      out.write("    \tvar msgId = $(\"#msgId\").val();\n");
      out.write("  \t\t  var url = \"tSSmsController.do?readMessage\";\n");
      out.write("  \t\t\t$.ajax({\n");
      out.write("  \t    \t\turl:url,\n");
      out.write("  \t    \t\ttype:\"GET\",\n");
      out.write("  \t    \t\tdataType:\"JSON\",\n");
      out.write("  \t    \t\tdata:{\n");
      out.write("  \t    \t\t\tmessageId:msgId\n");
      out.write("  \t    \t\t},\n");
      out.write("  \t    \t\tsuccess:function(data){\n");
      out.write("  \t    \t\t\tif(data.success){\n");
      out.write("  \t    \t\t\t\t$(\"#msgStatus\").html(\"已读\");\n");
      out.write("  \t    \t\t\t\t$(\"#\"+msgId+\"_status\").val('2');\n");
      out.write("  \t    \t\t\t}\n");
      out.write("  \t    \t\t}\n");
      out.write("  \t    \t});\n");
      out.write("    }\n");
      out.write("\t\t</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_t_005fmutiLang_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f0 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f0.setParent(null);
    // /webpage/main/ace_main.jsp(7,9) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f0.setLangKey("jeect.platform");
    int _jspx_eval_t_005fmutiLang_005f0 = _jspx_th_t_005fmutiLang_005f0.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f1 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f1.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f1.setParent(null);
    // /webpage/main/ace_main.jsp(8,33) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f1.setLangKey("jeect.platform");
    int _jspx_eval_t_005fmutiLang_005f1 = _jspx_th_t_005fmutiLang_005f1.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f1);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f2 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f2.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f2.setParent(null);
    // /webpage/main/ace_main.jsp(9,36) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f2.setLangKey("jeect.platform");
    int _jspx_eval_t_005fmutiLang_005f2 = _jspx_th_t_005fmutiLang_005f2.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f2);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f3 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f3.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f3.setParent(null);
    // /webpage/main/ace_main.jsp(215,34) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f3.setLangKey("common.change.password");
    int _jspx_eval_t_005fmutiLang_005f3 = _jspx_th_t_005fmutiLang_005f3.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f3);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f4 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f4.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f4.setParent(null);
    // /webpage/main/ace_main.jsp(217,11) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f4.setLangKey("common.change.password");
    int _jspx_eval_t_005fmutiLang_005f4 = _jspx_th_t_005fmutiLang_005f4.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f4);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f5 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f5.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f5.setParent(null);
    // /webpage/main/ace_main.jsp(222,41) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f5.setLangKey("common.profile");
    int _jspx_eval_t_005fmutiLang_005f5 = _jspx_th_t_005fmutiLang_005f5.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f5);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f6 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f6.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f6.setParent(null);
    // /webpage/main/ace_main.jsp(224,11) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f6.setLangKey("common.profile");
    int _jspx_eval_t_005fmutiLang_005f6 = _jspx_th_t_005fmutiLang_005f6.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f6);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f7 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f7.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f7.setParent(null);
    // /webpage/main/ace_main.jsp(228,41) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f7.setLangKey("common.ssms.getSysInfos");
    int _jspx_eval_t_005fmutiLang_005f7 = _jspx_th_t_005fmutiLang_005f7.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f7);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f8 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f8.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f8.setParent(null);
    // /webpage/main/ace_main.jsp(230,11) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f8.setLangKey("common.ssms.getSysInfos");
    int _jspx_eval_t_005fmutiLang_005f8 = _jspx_th_t_005fmutiLang_005f8.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f8);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f9 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f9.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f9.setParent(null);
    // /webpage/main/ace_main.jsp(234,34) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f9.setLangKey("common.change.style");
    int _jspx_eval_t_005fmutiLang_005f9 = _jspx_th_t_005fmutiLang_005f9.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f9);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f10 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f10.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f10.setParent(null);
    // /webpage/main/ace_main.jsp(236,11) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f10.setLangKey("common.my.style");
    int _jspx_eval_t_005fmutiLang_005f10 = _jspx_th_t_005fmutiLang_005f10.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f10);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f11 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f11.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f11.setParent(null);
    // /webpage/main/ace_main.jsp(243,10) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f11.setLangKey("common.clear.localstorage");
    int _jspx_eval_t_005fmutiLang_005f11 = _jspx_th_t_005fmutiLang_005f11.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f11);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f12 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f12.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f12.setParent(null);
    // /webpage/main/ace_main.jsp(252,11) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f12.setLangKey("common.logout");
    int _jspx_eval_t_005fmutiLang_005f12 = _jspx_th_t_005fmutiLang_005f12.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f12);
    return false;
  }

  private boolean _jspx_meth_t_005fmenu_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:menu
    org.jeecgframework.tag.core.easyui.MenuTag _jspx_th_t_005fmenu_005f0 = (org.jeecgframework.tag.core.easyui.MenuTag) _005fjspx_005ftagPool_005ft_005fmenu_0026_005fstyle_005fmenuFun_005fnobody.get(org.jeecgframework.tag.core.easyui.MenuTag.class);
    _jspx_th_t_005fmenu_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmenu_005f0.setParent(null);
    // /webpage/main/ace_main.jsp(314,6) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmenu_005f0.setStyle("ace");
    // /webpage/main/ace_main.jsp(314,6) name = menuFun type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmenu_005f0.setMenuFun((java.util.Map) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${menuMap}", java.util.Map.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_t_005fmenu_005f0 = _jspx_th_t_005fmenu_005f0.doStartTag();
    if (_jspx_th_t_005fmenu_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmenu_0026_005fstyle_005fmenuFun_005fnobody.reuse(_jspx_th_t_005fmenu_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmenu_0026_005fstyle_005fmenuFun_005fnobody.reuse(_jspx_th_t_005fmenu_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fbase_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:base
    org.jeecgframework.tag.core.easyui.BaseTag _jspx_th_t_005fbase_005f0 = (org.jeecgframework.tag.core.easyui.BaseTag) _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.get(org.jeecgframework.tag.core.easyui.BaseTag.class);
    _jspx_th_t_005fbase_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fbase_005f0.setParent(null);
    // /webpage/main/ace_main.jsp(483,2) name = type type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fbase_005f0.setType("tools");
    int _jspx_eval_t_005fbase_005f0 = _jspx_th_t_005fbase_005f0.doStartTag();
    if (_jspx_th_t_005fbase_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f13 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f13.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f13.setParent(null);
    // /webpage/main/ace_main.jsp(714,22) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f13.setLangKey("common.exit.confirm");
    int _jspx_eval_t_005fmutiLang_005f13 = _jspx_th_t_005fmutiLang_005f13.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f13);
    return false;
  }
}
