package org.apache.jsp.webpage.jeecg.cgform.config;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cgFormHeadList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/context/mytags.jsp");
    _jspx_dependants.add("/WEB-INF/tld/easyui.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdatagrid_0026_005ftitle_005fsortOrder_005fsortName_005fqueryMode_005fname_005fidField_005ffitColumns_005ffit_005fcheckbox_005factionUrl;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005ffield_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005freplace_005fquery_005ffield_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fquery_005ffield_005fautocomplete_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005ffield_005fdictionary_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005ffield_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005freplace_005fhidden_005ffield_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fstyle_005freplace_005fquery_005ffield_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005fformatter_005ffield_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdgFunOpt_0026_005ftitle_005ffunname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdgFunOpt_0026_005ftitle_005ffunname_005fexp_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005fwidth_005furl_005ftitle_005ficon_005fheight_005ffunname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005furl_005ftitle_005ficon_005ffunname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdatagrid_0026_005ftitle_005fsortOrder_005fsortName_005fqueryMode_005fname_005fidField_005ffitColumns_005ffit_005fcheckbox_005factionUrl = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005ffield_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005freplace_005fquery_005ffield_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fquery_005ffield_005fautocomplete_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005ffield_005fdictionary_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005ffield_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005freplace_005fhidden_005ffield_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fstyle_005freplace_005fquery_005ffield_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005fformatter_005ffield_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdgFunOpt_0026_005ftitle_005ffunname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdgFunOpt_0026_005ftitle_005ffunname_005fexp_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005fwidth_005furl_005ftitle_005ficon_005fheight_005ffunname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005furl_005ftitle_005ficon_005ffunname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fdatagrid_0026_005ftitle_005fsortOrder_005fsortName_005fqueryMode_005fname_005fidField_005ffitColumns_005ffit_005fcheckbox_005factionUrl.release();
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005ffield_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005freplace_005fquery_005ffield_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fquery_005ffield_005fautocomplete_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005ffield_005fdictionary_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005ffield_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005freplace_005fhidden_005ffield_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fstyle_005freplace_005fquery_005ffield_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005fformatter_005ffield_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fdgFunOpt_0026_005ftitle_005ffunname_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fdgFunOpt_0026_005ftitle_005ffunname_005fexp_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005fwidth_005furl_005ftitle_005ficon_005fheight_005ffunname_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005furl_005ftitle_005ficon_005ffunname_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.release();
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
      out.write('\n');
      if (_jspx_meth_t_005fbase_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<!--add-start--Author:luobaoli  Date:20150607 for：增加表单树型列表-->\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(function() {\n");
      out.write("\t\t$('#formtree').tree({\n");
      out.write("\t\t\tanimate : true,\n");
      out.write("\t\t\turl : 'systemController.do?formTree&typegroupCode=bdfl',\n");
      out.write("\t\t\tonClick : function(node) {\n");
      out.write("\t\t\t\tif ($('#formtree').tree('isLeaf', node.target)) {\n");
      out.write("\t\t\t\t\tloadFormByType(node.id);\n");
      out.write("\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t$('#formtree').tree('expand', node.target);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\tfunction loadFormByType(jformCategory){\n");
      out.write("\t\tvar url = 'cgFormHeadController.do?datagrid';\n");
      out.write("\t\t$(\"#tablePropertyList\").datagrid('reload',{jformCategory:jformCategory});\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("<!--add-end--Author:luobaoli  Date:20150607 for：增加表单树型列表-->\n");
      out.write("<div class=\"easyui-layout\" fit=\"true\">\n");
      out.write("<!--update-start--Author:luobaoli  Date:20150609 for：panel调整为默认关闭-->\n");
      out.write("<div region=\"west\" style=\"width: 150px;\" title=\"表单分类\" split=\"true\" collapsed=\"true\">\n");
      out.write("<!--update-end--Author:luobaoli  Date:20150609 for：panel调整为默认关闭-->\n");
      out.write("<div class=\"easyui-panel\" style=\"padding:0px;border:0px\" fit=\"true\" border=\"false\">\n");
      out.write("<ul id=\"formtree\">\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<div region=\"center\" style=\"padding:0px;border:0px\">\n");
      if (_jspx_meth_t_005fdatagrid_005f0(_jspx_page_context))
        return;
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tfunction addbytab(id,content) {\n");
      out.write("\t\taddOneTab('");
      if (_jspx_meth_t_005fmutiLang_005f0(_jspx_page_context))
        return;
      out.write("['+content+']' , \"cgformFtlController.do?cgformFtl2&formid=\"+id);\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t//数据库表生成表单\n");
      out.write("\tfunction addToData(title,url,id,a,b){\n");
      out.write("  \t\t$.dialog({\n");
      out.write("\t\t\tcontent: \"url:\"+url,\n");
      out.write("\t\t\tlock : true,\n");
      out.write("\t\t\ttitle: title,\n");
      out.write("\t\t\topacity : 0.3,\n");
      out.write("\t\t\twidth:400,\n");
      out.write("\t\t\theight:500,\n");
      out.write("\t\t\tcache:false,\n");
      out.write("\t\t    cancelVal: '");
      if (_jspx_meth_t_005fmutiLang_005f1(_jspx_page_context))
        return;
      out.write("',\n");
      out.write("\t\t    cancel: true,\n");
      out.write("            drag:false,max:false,min:false\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\tfunction delCgForm(id,name){\n");
      out.write("\t\t$.dialog.confirm('");
      if (_jspx_meth_t_005fmutiLang_005f2(_jspx_page_context))
        return;
      out.write("', function(){\n");
      out.write("\t\t\tcheckIsExit(id,name);\n");
      out.write("\t\t}, function(){\n");
      out.write("\t\t}).zindex();\n");
      out.write("\t}\n");
      out.write("\t//检查这个表是否已经存在了\n");
      out.write("\tfunction checkIsExit(id,name){\n");
      out.write("\t\t$.post(\"cgFormHeadController.do?checkIsExit&&name=\"+name,function(data){\n");
      out.write("\t\t\tvar d = $.parseJSON(data);\n");
      out.write("\t\t\tif (d.success) {\n");
      out.write("\t\t\t\t$.dialog.confirm('");
      if (_jspx_meth_t_005fmutiLang_005f3(_jspx_page_context))
        return;
      out.write("', function(){\n");
      out.write("\t\t\t\t\tdelThis(id);\n");
      out.write("\t\t\t\t}, function(){\n");
      out.write("\t\t\t\t}).zindex();\n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\t\tdelThis(id);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\t//删除这个配置\n");
      out.write("\tfunction delThis(id){\n");
      out.write("\t\tdoSubmit(\"cgFormHeadController.do?del&id=\"+id,\"tablePropertyList\");\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction remCgForm(id){\n");
      out.write("\t\t$.dialog.confirm('");
      if (_jspx_meth_t_005fmutiLang_005f4(_jspx_page_context))
        return;
      out.write("', function(){\n");
      out.write("\t\t\tremoveThis(id);\n");
      out.write("\t\t}, function(){\n");
      out.write("\t\t}).zindex();\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction removeThis(id){\n");
      out.write("\t\tdoSubmit(\"cgFormHeadController.do?rem&id=\"+id,\"tablePropertyList\");\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction addlisttab(tableName,content){\n");
      out.write("\t\taddOneTab( '");
      if (_jspx_meth_t_005fmutiLang_005f5(_jspx_page_context))
        return;
      out.write("' + \"[\"+content+\"]\", \"cgAutoListController.do?list&id=\"+tableName);\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction addForm(title,url,id){\n");
      out.write("\t\tgridname=id;\n");
      out.write("\t\tcreatewindow(title,url,900,520);\n");
      out.write("\t}\n");
      out.write("\tfunction updateForm(title,url,id){\n");
      out.write("\t\tgridname=id;\n");
      out.write("\t\tvar rowsData = $('#'+id).datagrid('getSelections');\n");
      out.write("\t\tif (!rowsData || rowsData.length==0) {\n");
      out.write("\t\t\ttip('");
      if (_jspx_meth_t_005fmutiLang_005f6(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\tif (rowsData.length>1) {\n");
      out.write("\t\t\ttip('");
      if (_jspx_meth_t_005fmutiLang_005f7(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\tcreatewindow(title,url + '&id='+rowsData[0].id,900,520);\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\tfunction jsPlugin(title,url,id){\n");
      out.write("\t\tvar rowsData = $('#'+id).datagrid('getSelections');\n");
      out.write("\t\tif (!rowsData || rowsData.length==0) {\n");
      out.write("\t\t\ttip('");
      if (_jspx_meth_t_005fmutiLang_005f8(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\tif (rowsData.length>1) {\n");
      out.write("\t\t\ttip('");
      if (_jspx_meth_t_005fmutiLang_005f9(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\turl += '&id='+rowsData[0].id;\n");
      out.write("  \t\t$.dialog({\n");
      out.write("\t\t\tcontent: \"url:\"+url,\n");
      out.write("\t\t\tlock : true,\n");
      out.write("\t\t\ttitle:'");
      if (_jspx_meth_t_005fmutiLang_005f10(_jspx_page_context))
        return;
      out.write("' + \"[\"+rowData.content+\"]\",\n");
      out.write("\t\t\topacity : 0.3,\n");
      out.write("\t\t\twidth:900,\n");
      out.write("\t\t\theight:500,\n");
      out.write("\t\t\tcache:false,\n");
      out.write("\t\t    ok: function(){\n");
      out.write("\t\t    \tiframe = this.iframe.contentWindow;\n");
      out.write("\t\t    \tiframe.goForm();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t    },\n");
      out.write("\t\t    cancelVal: '");
      if (_jspx_meth_t_005fmutiLang_005f11(_jspx_page_context))
        return;
      out.write("',\n");
      out.write("\t\t    cancel: true /*为true等价于function(){}*/\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t/**\n");
      out.write("\t*\t弹出菜单链接\n");
      out.write("\t*/\n");
      out.write("\tfunction popMenuLink(tableName,content){\n");
      out.write("        $.dialog({\n");
      out.write("        \t//update-begin--Author:luobaoli  Date:20150705 for：修改\"配置地址\"生成的URL为REST风格\n");
      out.write("        \t//update-begin--Author: jg_huangxg  Date:20150806 for：修改\"配置地址\"生成的URL为 .do风格\n");
      out.write("\t\t\tcontent: \"url:cgFormHeadController.do?popmenulink&url=cgAutoListController.do?list&title=\"+tableName,\n");
      out.write("\t\t\t//update-end--Author: jg_huangxg  Date:20150806 for：修改\"配置地址\"生成的URL为 .do风格\n");
      out.write("\t\t\t//update-end--Author:luobaoli  Date:20150705 for：修改\"配置地址\"生成的URL为REST风格\n");
      out.write("\t\t\tdrag :false,\n");
      out.write("\t\t\tlock : true,\n");
      out.write("\t\t\ttitle:'");
      if (_jspx_meth_t_005fmutiLang_005f12(_jspx_page_context))
        return;
      out.write("' + '['+content+']',\n");
      out.write("\t\t\topacity : 0.3,\n");
      out.write("\t\t\twidth:400,\n");
      out.write("\t\t\theight:80,drag:false,min:false,max:false\n");
      out.write("\t\t}).zindex();\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t//自定义按钮\n");
      out.write("\tfunction cgFormButton(title,url,id){\n");
      out.write("\t\tvar rowsData = $('#'+id).datagrid('getSelections');\n");
      out.write("\t\tif (!rowsData || rowsData.length==0) {\n");
      out.write("\t\t\ttip('");
      if (_jspx_meth_t_005fmutiLang_005f13(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\tif (rowsData.length>1) {\n");
      out.write("\t\t\ttip('");
      if (_jspx_meth_t_005fmutiLang_005f14(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\turl += '&formId='+rowsData[0].id+\"&tableName=\"+rowsData[0].tableName;\n");
      out.write("\t\taddOneTab('");
      if (_jspx_meth_t_005fmutiLang_005f15(_jspx_page_context))
        return;
      out.write("', url);\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t//sql增强\n");
      out.write("\tfunction cgFormButtonSql(title,url,id){\n");
      out.write("\t\tvar rowsData = $('#'+id).datagrid('getSelections');\n");
      out.write("\t\tif (!rowsData || rowsData.length==0) {\n");
      out.write("\t\t\ttip('");
      if (_jspx_meth_t_005fmutiLang_005f16(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\tif (rowsData.length>1) {\n");
      out.write("\t\t\ttip('");
      if (_jspx_meth_t_005fmutiLang_005f17(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\turl += '&formId='+rowsData[0].id+\"&tableName=\"+rowsData[0].tableName;\n");
      out.write("\t\t//addOneTab(\"按钮sql增强\", url);\n");
      out.write("\t\t$.dialog({\n");
      out.write("\t\t\tcontent: \"url:\"+url,\n");
      out.write("\t\t\tlock : true,\n");
      out.write("\t\t\ttitle: '");
      if (_jspx_meth_t_005fmutiLang_005f18(_jspx_page_context))
        return;
      out.write("' + \"[\"+rowsData[0].content+\"]\",\n");
      out.write("\t\t\topacity : 0.3,\n");
      out.write("\t\t\twidth:900,\n");
      out.write("\t\t\theight:500,\n");
      out.write("\t\t\tcache:false,\n");
      out.write("\t\t    ok: function(){\n");
      out.write("\t\t\t\tiframe = this.iframe.contentWindow;\n");
      out.write("\t\t\t\tsaveObj();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t    },\n");
      out.write("\t\t    cancelVal: '");
      if (_jspx_meth_t_005fmutiLang_005f19(_jspx_page_context))
        return;
      out.write("',\n");
      out.write("\t\t    cancel: true /*为true等价于function(){}*/\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t//js增强\n");
      out.write("\tfunction enhanceJs(title,url,id){\n");
      out.write("\t\tvar rowsData = $('#'+id).datagrid('getSelections');\n");
      out.write("\t\tif (!rowsData || rowsData.length==0) {\n");
      out.write("\t\t\ttip('");
      if (_jspx_meth_t_005fmutiLang_005f20(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\tif (rowsData.length>1) {\n");
      out.write("\t\t\ttip('");
      if (_jspx_meth_t_005fmutiLang_005f21(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\turl += '&formId='+rowsData[0].id+\"&tableName=\"+rowsData[0].tableName;\n");
      out.write("\t\t$.dialog({\n");
      out.write("\t\t\tcontent: \"url:\"+url,\n");
      out.write("\t\t\tlock : true,\n");
      out.write("\t\t\ttitle: '");
      if (_jspx_meth_t_005fmutiLang_005f22(_jspx_page_context))
        return;
      out.write("' + \"[\"+rowsData[0].content+\"]\",\n");
      out.write("\t\t\topacity : 0.3,\n");
      out.write("\t\t\twidth:900,\n");
      out.write("\t\t\theight:500,\n");
      out.write("\t\t\tcache:false,\n");
      out.write("\t\t    ok: function(){\n");
      out.write("\t\t\t\tiframe = this.iframe.contentWindow;\n");
      out.write("\t\t\t\tsaveObj();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t    },\n");
      out.write("\t\t    cancelVal: '");
      if (_jspx_meth_t_005fmutiLang_005f23(_jspx_page_context))
        return;
      out.write("',\n");
      out.write("\t\t    cancel: true /*为true等价于function(){}*/\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t//add-begin--Author:luobaoli  Date:20150630 for：新增java增强按钮处理逻辑\n");
      out.write("\t//java增强\n");
      out.write("\tfunction javaEnhance(title,url,id){\n");
      out.write("\t\tvar rowsData = $('#'+id).datagrid('getSelections');\n");
      out.write("\t\tif (!rowsData || rowsData.length==0) {\n");
      out.write("\t\t\ttip('");
      if (_jspx_meth_t_005fmutiLang_005f24(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\tif (rowsData.length>1) {\n");
      out.write("\t\t\ttip('");
      if (_jspx_meth_t_005fmutiLang_005f25(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\turl += '&formId='+rowsData[0].id+\"&tableName=\"+rowsData[0].tableName;\n");
      out.write("\t\t$.dialog({\n");
      out.write("\t\t\tcontent: \"url:\"+url,\n");
      out.write("\t\t\tlock : true,\n");
      out.write("\t\t\ttitle: '");
      if (_jspx_meth_t_005fmutiLang_005f26(_jspx_page_context))
        return;
      out.write("' + \"[\"+rowsData[0].content+\"]\",\n");
      out.write("\t\t\topacity : 0.3,\n");
      out.write("\t\t\twidth:500,\n");
      out.write("\t\t\theight:300,\n");
      out.write("\t\t\tcache:false,\n");
      out.write("\t\t    ok: function(){\n");
      out.write("\t\t\t\tiframe = this.iframe.contentWindow;\n");
      out.write("\t\t\t\tsaveObj();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t    },\n");
      out.write("\t\t    cancelVal: '");
      if (_jspx_meth_t_005fmutiLang_005f27(_jspx_page_context))
        return;
      out.write("',\n");
      out.write("\t\t    cancel: true /*为true等价于function(){}*/\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\t//add-end--Author:luobaoli  Date:20150630 for：新增java增强按钮处理逻辑\n");
      out.write("\n");
      out.write("\t//表单 sql导出\n");
      out.write("\tfunction doMigrateOut(title,url,id){\n");
      out.write("\t\tvar rowData = $('#'+id).datagrid('getSelected');\n");
      out.write("\t\tif (!rowData) {\n");
      out.write("\t\t\ttip('");
      if (_jspx_meth_t_005fmutiLang_005f28(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\turl += '&ids='+ getListSelections();\n");
      out.write("\t\twindow.location.href= url;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t//表单  sql导入\n");
      out.write("\tfunction toCgformMigrate(){\n");
      out.write("\t\topenuploadwin('");
      if (_jspx_meth_t_005fmutiLang_005f29(_jspx_page_context))
        return;
      out.write("', 'cgformSqlController.do?toCgformMigrate', \"tablePropertyList\");\n");
      out.write("\t}\n");
      out.write("    ");
      out.write("\t\n");
      out.write("\t//代码生成\n");
      out.write("\tfunction generate(title,url,id){\n");
      out.write("\t\tvar rowsData = $('#'+id).datagrid('getSelections');\n");
      out.write("\t\tif (!rowsData || rowsData.length==0) {\n");
      out.write("\t\t\ttip('");
      if (_jspx_meth_t_005fmutiLang_005f30(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\tif (rowsData.length>1) {\n");
      out.write("\t\t\ttip('");
      if (_jspx_meth_t_005fmutiLang_005f31(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\t//附表不能生成代码\n");
      out.write("\t\tif(\"3\" == rowsData[0].jformType){\n");
      out.write("\t\t\ttip('");
      if (_jspx_meth_t_005fmutiLang_005f32(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t//未激活的表，不允许生成代码\n");
      out.write("\t\tif(\"N\" == rowsData[0].isDbSynch){\n");
      out.write("\t\t\ttip('");
      if (_jspx_meth_t_005fmutiLang_005f33(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\n");
      out.write("\t\turl += '&id='+rowsData[0].id;\n");
      out.write("\t\t$.dialog({\n");
      out.write("\t\t\tcontent: \"url:\"+url,\n");
      out.write("\t\t\tlock : true,\n");
      out.write("\t\t\ttitle: '");
      if (_jspx_meth_t_005fmutiLang_005f34(_jspx_page_context))
        return;
      out.write("' + \" [\"+rowsData[0].content+\"]\",\n");
      out.write("\t\t\topacity : 0.3,\n");
      out.write("\t\t\twidth:1100,\n");
      out.write("\t\t\theight:500,\n");
      out.write("\t\t\tcache:false,\n");
      out.write("\t\t    ok: function(){\n");
      out.write("\t\t\t\tiframe = this.iframe.contentWindow;\n");
      out.write("\t\t\t\tsaveObj();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t    },\n");
      out.write("\t\t    cancelVal: '");
      if (_jspx_meth_t_005fmutiLang_005f35(_jspx_page_context))
        return;
      out.write("',\n");
      out.write("\t\t    cancel: true /*为true等价于function(){}*/\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t/**\n");
      out.write("\t * 获取列表中选中行的数据（多行）\n");
      out.write("\t * @param field 数据中字段名-不传此参数则获取全部数据\n");
      out.write("\t * @return 选中行的给定字段值，以逗号分隔\n");
      out.write("\t */\n");
      out.write("\tfunction getListSelections(){\n");
      out.write("\t\tvar ids = '';\n");
      out.write("\t\tvar rows = $(\"#tablePropertyList\").datagrid(\"getSelections\");\n");
      out.write("\t\tfor(var i=0;i<rows.length;i++){\n");
      out.write("\t\t\tids+=rows[i].id;\n");
      out.write("\t\t\tids+=',';\n");
      out.write("\t\t}\n");
      out.write("\t\tids = ids.substring(0,ids.length-1);\n");
      out.write("\t\treturn ids;\n");
      out.write("\t}\t\n");
      out.write("\t\n");
      out.write("\t/**\n");
      out.write("\t * 以多种方式同步数据库\n");
      out.write("\t * @param id 表单id\n");
      out.write("\t */\n");
      out.write("\tfunction doDbsynch(id,content){\n");
      out.write("\t\tvar url = \"url:cgFormHeadController.do?goCgFormSynChoice\";\n");
      out.write("\t\t$.dialog({\n");
      out.write("\t\t\tcontent: url,\n");
      out.write("\t\t\tdrag :false,\n");
      out.write("\t\t\tlock : true,\n");
      out.write("\t\t\ttitle: '");
      if (_jspx_meth_t_005fmutiLang_005f36(_jspx_page_context))
        return;
      out.write("' + '['+content+']',\n");
      out.write("\t\t\topacity : 0.3,\n");
      out.write("\t\t\twidth:400,\n");
      out.write("\t\t\theight:100,\n");
      out.write("\t\t\tcache:false,\n");
      out.write("\t\t    cancelVal: '");
      if (_jspx_meth_t_005fmutiLang_005f37(_jspx_page_context))
        return;
      out.write("',\n");
      out.write("\t\t    cancel: function(){},\n");
      out.write("\t\t    button : [{\n");
      out.write("\t\t    \tid : \"okBtn\",\n");
      out.write("\t\t    \tname : '");
      if (_jspx_meth_t_005fmutiLang_005f38(_jspx_page_context))
        return;
      out.write("',\n");
      out.write("\t\t    \tcallback : function () {\n");
      out.write("\t\t    \t\tiframe = this.iframe.contentWindow;\n");
      out.write("\t\t    \t\tvar synchoice = iframe.getSynChoice();\n");
      out.write("\t\t    \t\tif(synchoice){\n");
      out.write("\t\t\t\t\t\tvar submitUrl = 'cgFormHeadController.do?doDbSynch&id='+id+'&synMethod='+synchoice;\n");
      out.write("\t\t\t\t\t\tdoSubmit(submitUrl,'tablePropertyList');\n");
      out.write("\t\t\t\t    }else{\n");
      out.write("\t\t\t\t\t\talert('");
      if (_jspx_meth_t_005fmutiLang_005f39(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t    \t}\n");
      out.write("\t\t    }]\n");
      out.write("\t\t}).zindex();\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t//$(function(){\n");
      out.write("\t\t//if($.cookie(\"JEECGINDEXSTYLE\") == \"ace\"){\n");
      out.write("\t\t\t//$(\"#tablePropertyListtb\").css(\"height\",\"125\");\n");
      out.write("\t\t//}\n");
      out.write("\t//})\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\tfunction importFields(id,content) {\n");
      out.write("\t\topenuploadwin('【'+content+'】Excel导入Online字段', 'cgFormHeadController.do?upload&id='+id, \"tablePropertyList\");\n");
      out.write("\t}\n");
      out.write("</script>\n");
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

  private boolean _jspx_meth_t_005fbase_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:base
    org.jeecgframework.tag.core.easyui.BaseTag _jspx_th_t_005fbase_005f0 = (org.jeecgframework.tag.core.easyui.BaseTag) _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.get(org.jeecgframework.tag.core.easyui.BaseTag.class);
    _jspx_th_t_005fbase_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fbase_005f0.setParent(null);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(3,0) name = type type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fbase_005f0.setType("jquery,easyui,tools,autocomplete");
    int _jspx_eval_t_005fbase_005f0 = _jspx_th_t_005fbase_005f0.doStartTag();
    if (_jspx_th_t_005fbase_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fdatagrid_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:datagrid
    org.jeecgframework.tag.core.easyui.DataGridTag _jspx_th_t_005fdatagrid_005f0 = (org.jeecgframework.tag.core.easyui.DataGridTag) _005fjspx_005ftagPool_005ft_005fdatagrid_0026_005ftitle_005fsortOrder_005fsortName_005fqueryMode_005fname_005fidField_005ffitColumns_005ffit_005fcheckbox_005factionUrl.get(org.jeecgframework.tag.core.easyui.DataGridTag.class);
    _jspx_th_t_005fdatagrid_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdatagrid_005f0.setParent(null);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(37,0) name = sortName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdatagrid_005f0.setSortName("createDate");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(37,0) name = sortOrder type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdatagrid_005f0.setSortOrder("desc");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(37,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdatagrid_005f0.setName("tablePropertyList");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(37,0) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdatagrid_005f0.setTitle("smart.form.config");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(37,0) name = fitColumns type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdatagrid_005f0.setFitColumns(false);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(37,0) name = actionUrl type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdatagrid_005f0.setActionUrl("cgFormHeadController.do?datagrid");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(37,0) name = idField type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdatagrid_005f0.setIdField("id");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(37,0) name = fit type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdatagrid_005f0.setFit(true);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(37,0) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdatagrid_005f0.setQueryMode("group");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(37,0) name = checkbox type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdatagrid_005f0.setCheckbox(true);
    int _jspx_eval_t_005fdatagrid_005f0 = _jspx_th_t_005fdatagrid_005f0.doStartTag();
    if (_jspx_eval_t_005fdatagrid_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005fdgCol_005f0(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005fdgCol_005f1(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005fdgCol_005f2(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t<!--add-start--Author:luobaoli  Date:20150607 for：增加表单分类展现-->\n");
        out.write("\t");
        if (_jspx_meth_t_005fdgCol_005f3(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t<!--add-end--Author:luobaoli  Date:20150607 for：增加表单分类展现-->\n");
        out.write("\t");
        if (_jspx_meth_t_005fdgCol_005f4(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005fdgCol_005f5(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005fdgCol_005f6(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005fdgCol_005f7(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005fdgCol_005f8(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005fdgCol_005f9(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005fdgCol_005f10(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005fdgCol_005f11(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005fdgCol_005f12(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005fdgCol_005f13(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005fdgCol_005f14(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005fdgCol_005f15(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005fdgFunOpt_005f0(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005fdgFunOpt_005f1(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005fdgFunOpt_005f2(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005fdgFunOpt_005f3(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005fdgFunOpt_005f4(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005fdgFunOpt_005f5(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005fdgFunOpt_005f6(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005fdgToolBar_005f0(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005fdgToolBar_005f1(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005fdgToolBar_005f2(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005fdgToolBar_005f3(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005fdgToolBar_005f4(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t<!--add-begin--Author:luobaoli  Date:20150630 for：新增java增强按钮 -->\n");
        out.write("\t");
        if (_jspx_meth_t_005fdgToolBar_005f5(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t<!--add-end--Author:luobaoli  Date:20150630 for：新增java增强按钮 -->\n");
        out.write("\t");
        if (_jspx_meth_t_005fdgToolBar_005f6(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005fdgToolBar_005f7(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005fdgToolBar_005f8(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005fdgToolBar_005f9(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        int evalDoAfterBody = _jspx_th_t_005fdatagrid_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_005fdatagrid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdatagrid_0026_005ftitle_005fsortOrder_005fsortName_005fqueryMode_005fname_005fidField_005ffitColumns_005ffit_005fcheckbox_005factionUrl.reuse(_jspx_th_t_005fdatagrid_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdatagrid_0026_005ftitle_005fsortOrder_005fsortName_005fqueryMode_005fname_005fidField_005ffitColumns_005ffit_005fcheckbox_005factionUrl.reuse(_jspx_th_t_005fdatagrid_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f0 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(40,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f0.setTitle("common.id");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(40,1) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f0.setField("id");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(40,1) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f0.setHidden(true);
    int _jspx_eval_t_005fdgCol_005f0 = _jspx_th_t_005fdgCol_005f0.doStartTag();
    if (_jspx_th_t_005fdgCol_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f1 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005freplace_005fquery_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f1.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(41,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f1.setTitle("table.type");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(41,1) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f1.setField("jformType");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(41,1) name = replace type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f1.setReplace("single.table_1,master.table_2,slave.table_3");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(41,1) name = query type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f1.setQuery(true);
    int _jspx_eval_t_005fdgCol_005f1 = _jspx_th_t_005fdgCol_005f1.doStartTag();
    if (_jspx_th_t_005fdgCol_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005freplace_005fquery_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005freplace_005fquery_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f1);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f2 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fquery_005ffield_005fautocomplete_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f2.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(42,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f2.setTitle("table.name");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(42,1) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f2.setField("tableName");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(42,1) name = query type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f2.setQuery(true);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(42,1) name = autocomplete type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f2.setAutocomplete(true);
    int _jspx_eval_t_005fdgCol_005f2 = _jspx_th_t_005fdgCol_005f2.doStartTag();
    if (_jspx_th_t_005fdgCol_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fquery_005ffield_005fautocomplete_005fnobody.reuse(_jspx_th_t_005fdgCol_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fquery_005ffield_005fautocomplete_005fnobody.reuse(_jspx_th_t_005fdgCol_005f2);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f3 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005ffield_005fdictionary_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f3.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(44,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f3.setTitle("form.category");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(44,1) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f3.setField("jformCategory");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(44,1) name = dictionary type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f3.setDictionary("bdfl");
    int _jspx_eval_t_005fdgCol_005f3 = _jspx_th_t_005fdgCol_005f3.doStartTag();
    if (_jspx_th_t_005fdgCol_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005ffield_005fdictionary_005fnobody.reuse(_jspx_th_t_005fdgCol_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005ffield_005fdictionary_005fnobody.reuse(_jspx_th_t_005fdgCol_005f3);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f4 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f4.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(46,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f4.setTitle("table.description");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(46,1) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f4.setField("content");
    int _jspx_eval_t_005fdgCol_005f4 = _jspx_th_t_005fdgCol_005f4.doStartTag();
    if (_jspx_th_t_005fdgCol_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f4);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f5 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f5.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(47,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f5.setTitle("common.version");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(47,1) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f5.setField("jformVersion");
    int _jspx_eval_t_005fdgCol_005f5 = _jspx_th_t_005fdgCol_005f5.doStartTag();
    if (_jspx_th_t_005fdgCol_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f5);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f6 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005freplace_005fhidden_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f6.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(48,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f6.setTitle("is.tree");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(48,1) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f6.setField("isTree");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(48,1) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f6.setHidden(true);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(48,1) name = replace type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f6.setReplace("common.yes_Y,common.no_N");
    int _jspx_eval_t_005fdgCol_005f6 = _jspx_th_t_005fdgCol_005f6.doStartTag();
    if (_jspx_th_t_005fdgCol_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005freplace_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005freplace_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f6);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f7 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005freplace_005fhidden_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f7.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(49,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f7.setTitle("is.page");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(49,1) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f7.setField("isPagination");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(49,1) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f7.setHidden(true);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(49,1) name = replace type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f7.setReplace("common.yes_Y,common.no_N");
    int _jspx_eval_t_005fdgCol_005f7 = _jspx_th_t_005fdgCol_005f7.doStartTag();
    if (_jspx_th_t_005fdgCol_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005freplace_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005freplace_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f7);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f8 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fstyle_005freplace_005fquery_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f8.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(50,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f8.setTitle("sync.db");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(50,1) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f8.setField("isDbSynch");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(50,1) name = replace type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f8.setReplace("has.sync_Y,have.nosync_N");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(50,1) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f8.setStyle("background:red;_N");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(50,1) name = query type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f8.setQuery(true);
    int _jspx_eval_t_005fdgCol_005f8 = _jspx_th_t_005fdgCol_005f8.doStartTag();
    if (_jspx_th_t_005fdgCol_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fstyle_005freplace_005fquery_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fstyle_005freplace_005fquery_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f8);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f9 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005freplace_005fhidden_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f9.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(51,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f9.setTitle("show.checkbox");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(51,1) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f9.setField("isCheckbox");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(51,1) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f9.setHidden(true);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(51,1) name = replace type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f9.setReplace("common.yes_Y,common.no_N");
    int _jspx_eval_t_005fdgCol_005f9 = _jspx_th_t_005fdgCol_005f9.doStartTag();
    if (_jspx_th_t_005fdgCol_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005freplace_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005freplace_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f9);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f10 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f10.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(52,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f10.setTitle("common.query.module");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(52,1) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f10.setField("querymode");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(52,1) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f10.setHidden(true);
    int _jspx_eval_t_005fdgCol_005f10 = _jspx_th_t_005fdgCol_005f10.doStartTag();
    if (_jspx_th_t_005fdgCol_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f10);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f11 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f11.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(53,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f11.setTitle("common.createby");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(53,1) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f11.setField("createBy");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(53,1) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f11.setHidden(true);
    int _jspx_eval_t_005fdgCol_005f11 = _jspx_th_t_005fdgCol_005f11.doStartTag();
    if (_jspx_th_t_005fdgCol_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f11);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f12 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005fformatter_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f12.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(54,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f12.setTitle("common.createtime");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(54,1) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f12.setField("createDate");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(54,1) name = formatter type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f12.setFormatter("yyyy/MM/dd");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(54,1) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f12.setHidden(true);
    int _jspx_eval_t_005fdgCol_005f12 = _jspx_th_t_005fdgCol_005f12.doStartTag();
    if (_jspx_th_t_005fdgCol_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005fformatter_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005fformatter_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f12);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f13 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f13.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(55,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f13.setTitle("common.updateby");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(55,1) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f13.setField("updateBy");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(55,1) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f13.setHidden(true);
    int _jspx_eval_t_005fdgCol_005f13 = _jspx_th_t_005fdgCol_005f13.doStartTag();
    if (_jspx_th_t_005fdgCol_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f13);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f14 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005fformatter_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f14.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(56,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f14.setTitle("common.updatetime");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(56,1) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f14.setField("updateDate");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(56,1) name = formatter type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f14.setFormatter("yyyy/MM/dd");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(56,1) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f14.setHidden(true);
    int _jspx_eval_t_005fdgCol_005f14 = _jspx_th_t_005fdgCol_005f14.doStartTag();
    if (_jspx_th_t_005fdgCol_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005fformatter_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005fformatter_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f14);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f15 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f15.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(57,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f15.setTitle("common.operation");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(57,1) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f15.setField("opt");
    int _jspx_eval_t_005fdgCol_005f15 = _jspx_th_t_005fdgCol_005f15.doStartTag();
    if (_jspx_th_t_005fdgCol_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f15);
    return false;
  }

  private boolean _jspx_meth_t_005fdgFunOpt_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgFunOpt
    org.jeecgframework.tag.core.easyui.DataGridFunOptTag _jspx_th_t_005fdgFunOpt_005f0 = (org.jeecgframework.tag.core.easyui.DataGridFunOptTag) _005fjspx_005ftagPool_005ft_005fdgFunOpt_0026_005ftitle_005ffunname_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridFunOptTag.class);
    _jspx_th_t_005fdgFunOpt_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgFunOpt_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(58,1) name = funname type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgFunOpt_005f0.setFunname("delCgForm(id,tableName)");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(58,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgFunOpt_005f0.setTitle("common.delete");
    int _jspx_eval_t_005fdgFunOpt_005f0 = _jspx_th_t_005fdgFunOpt_005f0.doStartTag();
    if (_jspx_th_t_005fdgFunOpt_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgFunOpt_0026_005ftitle_005ffunname_005fnobody.reuse(_jspx_th_t_005fdgFunOpt_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgFunOpt_0026_005ftitle_005ffunname_005fnobody.reuse(_jspx_th_t_005fdgFunOpt_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fdgFunOpt_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgFunOpt
    org.jeecgframework.tag.core.easyui.DataGridFunOptTag _jspx_th_t_005fdgFunOpt_005f1 = (org.jeecgframework.tag.core.easyui.DataGridFunOptTag) _005fjspx_005ftagPool_005ft_005fdgFunOpt_0026_005ftitle_005ffunname_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridFunOptTag.class);
    _jspx_th_t_005fdgFunOpt_005f1.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgFunOpt_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(59,1) name = funname type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgFunOpt_005f1.setFunname("remCgForm(id)");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(59,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgFunOpt_005f1.setTitle("common.remove");
    int _jspx_eval_t_005fdgFunOpt_005f1 = _jspx_th_t_005fdgFunOpt_005f1.doStartTag();
    if (_jspx_th_t_005fdgFunOpt_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgFunOpt_0026_005ftitle_005ffunname_005fnobody.reuse(_jspx_th_t_005fdgFunOpt_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgFunOpt_0026_005ftitle_005ffunname_005fnobody.reuse(_jspx_th_t_005fdgFunOpt_005f1);
    return false;
  }

  private boolean _jspx_meth_t_005fdgFunOpt_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgFunOpt
    org.jeecgframework.tag.core.easyui.DataGridFunOptTag _jspx_th_t_005fdgFunOpt_005f2 = (org.jeecgframework.tag.core.easyui.DataGridFunOptTag) _005fjspx_005ftagPool_005ft_005fdgFunOpt_0026_005ftitle_005ffunname_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridFunOptTag.class);
    _jspx_th_t_005fdgFunOpt_005f2.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgFunOpt_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(60,1) name = funname type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgFunOpt_005f2.setFunname("importFields(id,content)");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(60,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgFunOpt_005f2.setTitle("导入字段");
    int _jspx_eval_t_005fdgFunOpt_005f2 = _jspx_th_t_005fdgFunOpt_005f2.doStartTag();
    if (_jspx_th_t_005fdgFunOpt_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgFunOpt_0026_005ftitle_005ffunname_005fnobody.reuse(_jspx_th_t_005fdgFunOpt_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgFunOpt_0026_005ftitle_005ffunname_005fnobody.reuse(_jspx_th_t_005fdgFunOpt_005f2);
    return false;
  }

  private boolean _jspx_meth_t_005fdgFunOpt_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgFunOpt
    org.jeecgframework.tag.core.easyui.DataGridFunOptTag _jspx_th_t_005fdgFunOpt_005f3 = (org.jeecgframework.tag.core.easyui.DataGridFunOptTag) _005fjspx_005ftagPool_005ft_005fdgFunOpt_0026_005ftitle_005ffunname_005fexp_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridFunOptTag.class);
    _jspx_th_t_005fdgFunOpt_005f3.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgFunOpt_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(61,1) name = exp type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgFunOpt_005f3.setExp("isDbSynch#eq#N");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(61,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgFunOpt_005f3.setTitle("sync.db");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(61,1) name = funname type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgFunOpt_005f3.setFunname("doDbsynch(id,content)");
    int _jspx_eval_t_005fdgFunOpt_005f3 = _jspx_th_t_005fdgFunOpt_005f3.doStartTag();
    if (_jspx_th_t_005fdgFunOpt_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgFunOpt_0026_005ftitle_005ffunname_005fexp_005fnobody.reuse(_jspx_th_t_005fdgFunOpt_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgFunOpt_0026_005ftitle_005ffunname_005fexp_005fnobody.reuse(_jspx_th_t_005fdgFunOpt_005f3);
    return false;
  }

  private boolean _jspx_meth_t_005fdgFunOpt_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgFunOpt
    org.jeecgframework.tag.core.easyui.DataGridFunOptTag _jspx_th_t_005fdgFunOpt_005f4 = (org.jeecgframework.tag.core.easyui.DataGridFunOptTag) _005fjspx_005ftagPool_005ft_005fdgFunOpt_0026_005ftitle_005ffunname_005fexp_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridFunOptTag.class);
    _jspx_th_t_005fdgFunOpt_005f4.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgFunOpt_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(62,1) name = exp type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgFunOpt_005f4.setExp("isDbSynch#eq#Y&&jformType#ne#3");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(62,1) name = funname type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgFunOpt_005f4.setFunname("addbytab(id,content)");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(62,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgFunOpt_005f4.setTitle("form.template");
    int _jspx_eval_t_005fdgFunOpt_005f4 = _jspx_th_t_005fdgFunOpt_005f4.doStartTag();
    if (_jspx_th_t_005fdgFunOpt_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgFunOpt_0026_005ftitle_005ffunname_005fexp_005fnobody.reuse(_jspx_th_t_005fdgFunOpt_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgFunOpt_0026_005ftitle_005ffunname_005fexp_005fnobody.reuse(_jspx_th_t_005fdgFunOpt_005f4);
    return false;
  }

  private boolean _jspx_meth_t_005fdgFunOpt_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgFunOpt
    org.jeecgframework.tag.core.easyui.DataGridFunOptTag _jspx_th_t_005fdgFunOpt_005f5 = (org.jeecgframework.tag.core.easyui.DataGridFunOptTag) _005fjspx_005ftagPool_005ft_005fdgFunOpt_0026_005ftitle_005ffunname_005fexp_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridFunOptTag.class);
    _jspx_th_t_005fdgFunOpt_005f5.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgFunOpt_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(63,1) name = exp type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgFunOpt_005f5.setExp("isDbSynch#eq#Y&&jformType#ne#3");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(63,1) name = funname type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgFunOpt_005f5.setFunname("addlisttab(tableName,content)");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(63,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgFunOpt_005f5.setTitle("function.test");
    int _jspx_eval_t_005fdgFunOpt_005f5 = _jspx_th_t_005fdgFunOpt_005f5.doStartTag();
    if (_jspx_th_t_005fdgFunOpt_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgFunOpt_0026_005ftitle_005ffunname_005fexp_005fnobody.reuse(_jspx_th_t_005fdgFunOpt_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgFunOpt_0026_005ftitle_005ffunname_005fexp_005fnobody.reuse(_jspx_th_t_005fdgFunOpt_005f5);
    return false;
  }

  private boolean _jspx_meth_t_005fdgFunOpt_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgFunOpt
    org.jeecgframework.tag.core.easyui.DataGridFunOptTag _jspx_th_t_005fdgFunOpt_005f6 = (org.jeecgframework.tag.core.easyui.DataGridFunOptTag) _005fjspx_005ftagPool_005ft_005fdgFunOpt_0026_005ftitle_005ffunname_005fexp_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridFunOptTag.class);
    _jspx_th_t_005fdgFunOpt_005f6.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgFunOpt_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(64,1) name = exp type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgFunOpt_005f6.setExp("isDbSynch#eq#Y&&jformType#ne#3");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(64,1) name = funname type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgFunOpt_005f6.setFunname("popMenuLink(tableName,content)");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(64,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgFunOpt_005f6.setTitle("config.place");
    int _jspx_eval_t_005fdgFunOpt_005f6 = _jspx_th_t_005fdgFunOpt_005f6.doStartTag();
    if (_jspx_th_t_005fdgFunOpt_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgFunOpt_0026_005ftitle_005ffunname_005fexp_005fnobody.reuse(_jspx_th_t_005fdgFunOpt_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgFunOpt_0026_005ftitle_005ffunname_005fexp_005fnobody.reuse(_jspx_th_t_005fdgFunOpt_005f6);
    return false;
  }

  private boolean _jspx_meth_t_005fdgToolBar_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgToolBar
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_005fdgToolBar_005f0 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005fwidth_005furl_005ftitle_005ficon_005fheight_005ffunname_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_005fdgToolBar_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgToolBar_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(65,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f0.setTitle("create.form");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(65,1) name = icon type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f0.setIcon("icon-add");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(65,1) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f0.setWidth("900");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(65,1) name = height type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f0.setHeight("600");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(65,1) name = url type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f0.setUrl("cgFormHeadController.do?addorupdate");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(65,1) name = funname type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f0.setFunname("addForm");
    int _jspx_eval_t_005fdgToolBar_005f0 = _jspx_th_t_005fdgToolBar_005f0.doStartTag();
    if (_jspx_th_t_005fdgToolBar_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005fwidth_005furl_005ftitle_005ficon_005fheight_005ffunname_005fnobody.reuse(_jspx_th_t_005fdgToolBar_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005fwidth_005furl_005ftitle_005ficon_005fheight_005ffunname_005fnobody.reuse(_jspx_th_t_005fdgToolBar_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fdgToolBar_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgToolBar
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_005fdgToolBar_005f1 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005fwidth_005furl_005ftitle_005ficon_005fheight_005ffunname_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_005fdgToolBar_005f1.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgToolBar_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(66,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f1.setTitle("edit.form");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(66,1) name = icon type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f1.setIcon("icon-edit");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(66,1) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f1.setWidth("900");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(66,1) name = height type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f1.setHeight("600");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(66,1) name = url type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f1.setUrl("cgFormHeadController.do?addorupdate");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(66,1) name = funname type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f1.setFunname("updateForm");
    int _jspx_eval_t_005fdgToolBar_005f1 = _jspx_th_t_005fdgToolBar_005f1.doStartTag();
    if (_jspx_th_t_005fdgToolBar_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005fwidth_005furl_005ftitle_005ficon_005fheight_005ffunname_005fnobody.reuse(_jspx_th_t_005fdgToolBar_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005fwidth_005furl_005ftitle_005ficon_005fheight_005ffunname_005fnobody.reuse(_jspx_th_t_005fdgToolBar_005f1);
    return false;
  }

  private boolean _jspx_meth_t_005fdgToolBar_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgToolBar
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_005fdgToolBar_005f2 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005furl_005ftitle_005ficon_005ffunname_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_005fdgToolBar_005f2.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgToolBar_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(67,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f2.setTitle("custom.button");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(67,1) name = icon type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f2.setIcon("icon-edit");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(67,1) name = url type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f2.setUrl("cgformButtonController.do?cgformButton");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(67,1) name = funname type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f2.setFunname("cgFormButton");
    int _jspx_eval_t_005fdgToolBar_005f2 = _jspx_th_t_005fdgToolBar_005f2.doStartTag();
    if (_jspx_th_t_005fdgToolBar_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005furl_005ftitle_005ficon_005ffunname_005fnobody.reuse(_jspx_th_t_005fdgToolBar_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005furl_005ftitle_005ficon_005ffunname_005fnobody.reuse(_jspx_th_t_005fdgToolBar_005f2);
    return false;
  }

  private boolean _jspx_meth_t_005fdgToolBar_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgToolBar
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_005fdgToolBar_005f3 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005furl_005ftitle_005ficon_005ffunname_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_005fdgToolBar_005f3.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgToolBar_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(68,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f3.setTitle("js.enhance");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(68,1) name = icon type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f3.setIcon("icon-edit");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(68,1) name = url type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f3.setUrl("cgformEnhanceJsController.do?addorupdate");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(68,1) name = funname type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f3.setFunname("enhanceJs");
    int _jspx_eval_t_005fdgToolBar_005f3 = _jspx_th_t_005fdgToolBar_005f3.doStartTag();
    if (_jspx_th_t_005fdgToolBar_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005furl_005ftitle_005ficon_005ffunname_005fnobody.reuse(_jspx_th_t_005fdgToolBar_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005furl_005ftitle_005ficon_005ffunname_005fnobody.reuse(_jspx_th_t_005fdgToolBar_005f3);
    return false;
  }

  private boolean _jspx_meth_t_005fdgToolBar_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgToolBar
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_005fdgToolBar_005f4 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005furl_005ftitle_005ficon_005ffunname_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_005fdgToolBar_005f4.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgToolBar_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(69,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f4.setTitle("sql.enhance");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(69,1) name = icon type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f4.setIcon("icon-edit");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(69,1) name = url type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f4.setUrl("cgformButtonSqlController.do?addorupdate");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(69,1) name = funname type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f4.setFunname("cgFormButtonSql");
    int _jspx_eval_t_005fdgToolBar_005f4 = _jspx_th_t_005fdgToolBar_005f4.doStartTag();
    if (_jspx_th_t_005fdgToolBar_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005furl_005ftitle_005ficon_005ffunname_005fnobody.reuse(_jspx_th_t_005fdgToolBar_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005furl_005ftitle_005ficon_005ffunname_005fnobody.reuse(_jspx_th_t_005fdgToolBar_005f4);
    return false;
  }

  private boolean _jspx_meth_t_005fdgToolBar_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgToolBar
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_005fdgToolBar_005f5 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005furl_005ftitle_005ficon_005ffunname_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_005fdgToolBar_005f5.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgToolBar_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(71,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f5.setTitle("java.enhance");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(71,1) name = icon type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f5.setIcon("icon-edit");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(71,1) name = url type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f5.setUrl("cgformEnhanceJavaController.do?addorupdate");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(71,1) name = funname type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f5.setFunname("javaEnhance");
    int _jspx_eval_t_005fdgToolBar_005f5 = _jspx_th_t_005fdgToolBar_005f5.doStartTag();
    if (_jspx_th_t_005fdgToolBar_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005furl_005ftitle_005ficon_005ffunname_005fnobody.reuse(_jspx_th_t_005fdgToolBar_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005furl_005ftitle_005ficon_005ffunname_005fnobody.reuse(_jspx_th_t_005fdgToolBar_005f5);
    return false;
  }

  private boolean _jspx_meth_t_005fdgToolBar_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgToolBar
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_005fdgToolBar_005f6 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005furl_005ftitle_005ficon_005ffunname_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_005fdgToolBar_005f6.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgToolBar_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(73,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f6.setTitle("form.export");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(73,1) name = icon type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f6.setIcon("icon-putout");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(73,1) name = url type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f6.setUrl("cgformSqlController.do?doMigrateOut");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(73,1) name = funname type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f6.setFunname("doMigrateOut");
    int _jspx_eval_t_005fdgToolBar_005f6 = _jspx_th_t_005fdgToolBar_005f6.doStartTag();
    if (_jspx_th_t_005fdgToolBar_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005furl_005ftitle_005ficon_005ffunname_005fnobody.reuse(_jspx_th_t_005fdgToolBar_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005furl_005ftitle_005ficon_005ffunname_005fnobody.reuse(_jspx_th_t_005fdgToolBar_005f6);
    return false;
  }

  private boolean _jspx_meth_t_005fdgToolBar_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgToolBar
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_005fdgToolBar_005f7 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005furl_005ftitle_005ficon_005ffunname_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_005fdgToolBar_005f7.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgToolBar_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(74,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f7.setTitle("form.import");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(74,1) name = icon type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f7.setIcon("icon-put");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(74,1) name = url type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f7.setUrl("cgformSqlController.do?inSqlFile");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(74,1) name = funname type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f7.setFunname("toCgformMigrate");
    int _jspx_eval_t_005fdgToolBar_005f7 = _jspx_th_t_005fdgToolBar_005f7.doStartTag();
    if (_jspx_th_t_005fdgToolBar_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005furl_005ftitle_005ficon_005ffunname_005fnobody.reuse(_jspx_th_t_005fdgToolBar_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005furl_005ftitle_005ficon_005ffunname_005fnobody.reuse(_jspx_th_t_005fdgToolBar_005f7);
    return false;
  }

  private boolean _jspx_meth_t_005fdgToolBar_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgToolBar
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_005fdgToolBar_005f8 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005furl_005ftitle_005ficon_005ffunname_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_005fdgToolBar_005f8.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgToolBar_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(75,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f8.setTitle("code.generate");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(75,1) name = icon type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f8.setIcon("icon-add");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(75,1) name = url type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f8.setUrl("generateController.do?gogenerate");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(75,1) name = funname type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f8.setFunname("generate");
    int _jspx_eval_t_005fdgToolBar_005f8 = _jspx_th_t_005fdgToolBar_005f8.doStartTag();
    if (_jspx_th_t_005fdgToolBar_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005furl_005ftitle_005ficon_005ffunname_005fnobody.reuse(_jspx_th_t_005fdgToolBar_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005furl_005ftitle_005ficon_005ffunname_005fnobody.reuse(_jspx_th_t_005fdgToolBar_005f8);
    return false;
  }

  private boolean _jspx_meth_t_005fdgToolBar_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgToolBar
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_005fdgToolBar_005f9 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005furl_005ftitle_005ficon_005ffunname_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_005fdgToolBar_005f9.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgToolBar_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(76,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f9.setTitle("form.generate");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(76,1) name = icon type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f9.setIcon("icon-add");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(76,1) name = url type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f9.setUrl("cgformTransController.do?trans");
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(76,1) name = funname type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgToolBar_005f9.setFunname("addToData");
    int _jspx_eval_t_005fdgToolBar_005f9 = _jspx_th_t_005fdgToolBar_005f9.doStartTag();
    if (_jspx_th_t_005fdgToolBar_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005furl_005ftitle_005ficon_005ffunname_005fnobody.reuse(_jspx_th_t_005fdgToolBar_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgToolBar_0026_005furl_005ftitle_005ficon_005ffunname_005fnobody.reuse(_jspx_th_t_005fdgToolBar_005f9);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f0 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f0.setParent(null);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(82,13) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f0.setLangKey("form.template");
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
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(95,18) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f1.setLangKey("common.close");
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
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(101,20) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f2.setLangKey("confirm.delete.record");
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
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(111,22) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f3.setLangKey("table.exit.in.db.confirm");
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
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(126,20) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f4.setLangKey("confirm.delete.record");
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
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(137,14) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f5.setLangKey("form.datalist");
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
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(148,8) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f6.setLangKey("common.please.select.edit.item");
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
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(152,8) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f7.setLangKey("common.please.select.one.record.to.edit");
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
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(161,8) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f8.setLangKey("common.please.select.edit.item");
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
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(165,8) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f9.setLangKey("common.please.select.one.record.to.edit");
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
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(172,10) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f10.setLangKey("js.enhance");
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
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(182,18) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f11.setLangKey("common.close");
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
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(199,10) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f12.setLangKey("common.menu.link");
    int _jspx_eval_t_005fmutiLang_005f12 = _jspx_th_t_005fmutiLang_005f12.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f12);
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
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(210,8) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f13.setLangKey("common.please.select.edit.item");
    int _jspx_eval_t_005fmutiLang_005f13 = _jspx_th_t_005fmutiLang_005f13.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f13);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f14 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f14.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f14.setParent(null);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(214,8) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f14.setLangKey("common.please.select.one.record.to.edit");
    int _jspx_eval_t_005fmutiLang_005f14 = _jspx_th_t_005fmutiLang_005f14.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f14);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f15 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f15.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f15.setParent(null);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(218,13) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f15.setLangKey("custom.button");
    int _jspx_eval_t_005fmutiLang_005f15 = _jspx_th_t_005fmutiLang_005f15.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f15);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f16 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f16.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f16.setParent(null);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(225,8) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f16.setLangKey("common.please.select.edit.item");
    int _jspx_eval_t_005fmutiLang_005f16 = _jspx_th_t_005fmutiLang_005f16.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f16);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f17 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f17.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f17.setParent(null);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(229,8) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f17.setLangKey("common.please.select.one.record.to.edit");
    int _jspx_eval_t_005fmutiLang_005f17 = _jspx_th_t_005fmutiLang_005f17.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f17);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f18 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f18.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f18.setParent(null);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(237,11) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f18.setLangKey("sql.enhance");
    int _jspx_eval_t_005fmutiLang_005f18 = _jspx_th_t_005fmutiLang_005f18.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f18);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f19 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f19.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f19.setParent(null);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(247,18) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f19.setLangKey("common.close");
    int _jspx_eval_t_005fmutiLang_005f19 = _jspx_th_t_005fmutiLang_005f19.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f19);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f20 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f20.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f20.setParent(null);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(257,8) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f20.setLangKey("common.please.select.edit.item");
    int _jspx_eval_t_005fmutiLang_005f20 = _jspx_th_t_005fmutiLang_005f20.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f20);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f21(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f21 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f21.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f21.setParent(null);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(261,8) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f21.setLangKey("common.please.select.one.record.to.edit");
    int _jspx_eval_t_005fmutiLang_005f21 = _jspx_th_t_005fmutiLang_005f21.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f21);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f22(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f22 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f22.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f22.setParent(null);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(268,11) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f22.setLangKey("js.enhance");
    int _jspx_eval_t_005fmutiLang_005f22 = _jspx_th_t_005fmutiLang_005f22.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f22);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f22);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f23(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f23 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f23.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f23.setParent(null);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(278,18) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f23.setLangKey("common.close");
    int _jspx_eval_t_005fmutiLang_005f23 = _jspx_th_t_005fmutiLang_005f23.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f23);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f23);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f24(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f24 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f24.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f24.setParent(null);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(288,8) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f24.setLangKey("common.please.select.edit.item");
    int _jspx_eval_t_005fmutiLang_005f24 = _jspx_th_t_005fmutiLang_005f24.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f24);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f24);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f25(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f25 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f25.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f25.setParent(null);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(292,8) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f25.setLangKey("common.please.select.one.record.to.edit");
    int _jspx_eval_t_005fmutiLang_005f25 = _jspx_th_t_005fmutiLang_005f25.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f25);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f25);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f26(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f26 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f26.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f26.setParent(null);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(299,11) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f26.setLangKey("java.enhance");
    int _jspx_eval_t_005fmutiLang_005f26 = _jspx_th_t_005fmutiLang_005f26.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f26);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f26);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f27(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f27 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f27.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f27.setParent(null);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(309,18) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f27.setLangKey("common.close");
    int _jspx_eval_t_005fmutiLang_005f27 = _jspx_th_t_005fmutiLang_005f27.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f27);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f27);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f28(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f28 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f28.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f28.setParent(null);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(319,8) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f28.setLangKey("common.please.select.edit.item");
    int _jspx_eval_t_005fmutiLang_005f28 = _jspx_th_t_005fmutiLang_005f28.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f28);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f28);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f29(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f29 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f29.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f29.setParent(null);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(328,17) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f29.setLangKey("form.sqlimport");
    int _jspx_eval_t_005fmutiLang_005f29 = _jspx_th_t_005fmutiLang_005f29.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f29);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f29);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f30(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f30 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f30.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f30.setParent(null);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(335,8) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f30.setLangKey("common.please.select.edit.item");
    int _jspx_eval_t_005fmutiLang_005f30 = _jspx_th_t_005fmutiLang_005f30.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f30);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f30);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f31(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f31 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f31.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f31.setParent(null);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(339,8) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f31.setLangKey("common.please.select.one.record.to.edit");
    int _jspx_eval_t_005fmutiLang_005f31 = _jspx_th_t_005fmutiLang_005f31.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f31);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f31);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f32(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f32 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f32.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f32.setParent(null);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(344,8) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f32.setLangKey("slave.table.can.not.generate.code");
    int _jspx_eval_t_005fmutiLang_005f32 = _jspx_th_t_005fmutiLang_005f32.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f32);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f32);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f33(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f33 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f33.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f33.setParent(null);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(350,8) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f33.setLangKey("please.syncdb");
    int _jspx_eval_t_005fmutiLang_005f33 = _jspx_th_t_005fmutiLang_005f33.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f33);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f33);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f34(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f34 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f34.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f34.setParent(null);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(359,11) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f34.setLangKey("code.generate");
    int _jspx_eval_t_005fmutiLang_005f34 = _jspx_th_t_005fmutiLang_005f34.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f34);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f34);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f35(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f35 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f35.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f35.setParent(null);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(369,18) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f35.setLangKey("common.close");
    int _jspx_eval_t_005fmutiLang_005f35 = _jspx_th_t_005fmutiLang_005f35.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f35);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f35);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f36(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f36 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f36.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f36.setParent(null);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(400,11) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f36.setLangKey("sync.db");
    int _jspx_eval_t_005fmutiLang_005f36 = _jspx_th_t_005fmutiLang_005f36.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f36);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f36);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f37(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f37 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f37.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f37.setParent(null);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(405,18) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f37.setLangKey("common.close");
    int _jspx_eval_t_005fmutiLang_005f37 = _jspx_th_t_005fmutiLang_005f37.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f37);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f37);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f38(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f38 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f38.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f38.setParent(null);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(409,15) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f38.setLangKey("common.confirm");
    int _jspx_eval_t_005fmutiLang_005f38 = _jspx_th_t_005fmutiLang_005f38.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f38);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f38);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f39(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f39 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f39.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f39.setParent(null);
    // /webpage/jeecg/cgform/config/cgFormHeadList.jsp(417,13) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f39.setLangKey("please.select.sync.method");
    int _jspx_eval_t_005fmutiLang_005f39 = _jspx_th_t_005fmutiLang_005f39.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f39);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f39);
    return false;
  }
}
