package org.apache.jsp.webpage.jeecg.onlinedoc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class onlineDoc_002dupdate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005ftiptype_005flayout_005fformid_005fdialog_005faction;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005ftiptype_005flayout_005fformid_005fdialog_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005ftiptype_005flayout_005fformid_005fdialog_005faction.release();
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
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>文档目录</title>\n");
      out.write("\t\t");
      if (_jspx_meth_t_005fbase_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t<script src=\"webpage/jeecg/onlinedoc/ajaxfileupload.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t \t$(function(){\n");
      out.write("\t\t\n");
      out.write("\t\t \t\t//触发click方法\n");
      out.write("\t\t \t\t$('#uploadLink').on('click',function(){\n");
      out.write("\t\t \t\t\t$('#fileInput').click();\n");
      out.write("\t\t \t\t});\n");
      out.write("\t\t \t\t\n");
      out.write("\t\t \t\t$('#onlineDocSortTree').combotree({\n");
      out.write("\t\t\t\t\turl : 'onlineDocSortController.do?tree',\n");
      out.write("\t\t\t\t\tpanelHeight : 200,\n");
      out.write("\t\t\t\t\twidth : 157,\n");
      out.write("\t\t\t\t\tvalue : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${onlineDocPage.treeNode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("',\n");
      out.write("\t\t\t\t\tonClick : function(node) {\n");
      out.write("\t\t\t\t\t\t$(\"#treeNode\").val(node.id);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t \t\t\n");
      out.write("\t\t \t\t//触发click方法\n");
      out.write("\t\t \t\t$('#redoLink').on('click',function(){\n");
      out.write("\t\t \t\t\t$(\"#fileNameInput\").val(\"\");\n");
      out.write("\t\t \t\t\t$(\"#path\").val(\"\");\n");
      out.write("\t\t\t\t\t$(\"#oldName\").val(\"\");\n");
      out.write("\t\t\t\t\t$(\"#newName\").val(\"\");\n");
      out.write("\t\t \t\t});\n");
      out.write("\t\t \t\t\n");
      out.write("\t\t \t\t$(\"#fileNameInput\").css(\"color\",\"green\");\n");
      out.write("\t \t\t\t$(\"#fileNameInput\").val(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${onlineDocPage.oldName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\");\n");
      out.write("\t\t \t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tfunction uploadHead(){\n");
      out.write("\t\t\t\t$.ajaxFileUpload({\n");
      out.write("\t\t\t\t\turl:\"onlineDocController.do?ajaxUpload\",//需要链接到服务器地址 \n");
      out.write("\t\t\t\t\tsecureuri:false,\n");
      out.write("\t\t\t\t\tfileElementId:\"fileInput\",//文件选择框的id属性\n");
      out.write("\t\t\t\t\tdataType: 'json',   //json\n");
      out.write("\t\t\t\t\tsuccess: function (data) {\n");
      out.write("\t\t\t\t\t\tvar path = jQuery.parseJSON(data).path;\n");
      out.write("\t\t\t\t\t\tvar oldName = jQuery.parseJSON(data).oldName;\n");
      out.write("\t\t\t\t\t\tvar newName = jQuery.parseJSON(data).newName;\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t$(\"#path\").val(path);\n");
      out.write("\t\t\t\t\t\t$(\"#oldName\").val(oldName);\n");
      out.write("\t\t\t\t\t\t$(\"#newName\").val(newName);\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t$(\"#fileNameInput\").val(oldName);\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\terror:function(XMLHttpRequest, textStatus, errorThrown){\n");
      out.write("\t\t\t\t\t\talert('上传失败！');\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t};\n");
      out.write("\t\t</script>\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t");
      if (_jspx_meth_t_005fformvalid_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t</body>\n");
      out.write("<script src = \"webpage/jeecg/onlinedoc/onlineDoc.js\"></script>");
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
    // /webpage/jeecg/onlinedoc/onlineDoc-update.jsp(7,2) name = type type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fbase_005f0.setType("jquery,easyui,tools,DatePicker");
    int _jspx_eval_t_005fbase_005f0 = _jspx_th_t_005fbase_005f0.doStartTag();
    if (_jspx_th_t_005fbase_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fformvalid_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:formvalid
    org.jeecgframework.tag.core.easyui.FormValidationTag _jspx_th_t_005fformvalid_005f0 = (org.jeecgframework.tag.core.easyui.FormValidationTag) _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005ftiptype_005flayout_005fformid_005fdialog_005faction.get(org.jeecgframework.tag.core.easyui.FormValidationTag.class);
    _jspx_th_t_005fformvalid_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fformvalid_005f0.setParent(null);
    // /webpage/jeecg/onlinedoc/onlineDoc-update.jsp(64,2) name = formid type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setFormid("formobj");
    // /webpage/jeecg/onlinedoc/onlineDoc-update.jsp(64,2) name = dialog type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setDialog(true);
    // /webpage/jeecg/onlinedoc/onlineDoc-update.jsp(64,2) name = usePlugin type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setUsePlugin("password");
    // /webpage/jeecg/onlinedoc/onlineDoc-update.jsp(64,2) name = layout type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setLayout("table");
    // /webpage/jeecg/onlinedoc/onlineDoc-update.jsp(64,2) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setAction("onlineDocController.do?doUpdate");
    // /webpage/jeecg/onlinedoc/onlineDoc-update.jsp(64,2) name = tiptype type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setTiptype("1");
    int _jspx_eval_t_005fformvalid_005f0 = _jspx_th_t_005fformvalid_005f0.doStartTag();
    if (_jspx_eval_t_005fformvalid_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t<input id=\"id\" name=\"id\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${onlineDocPage.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t\t\t<input id=\"createName\" name=\"createName\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${onlineDocPage.createName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t\t\t<input id=\"createBy\" name=\"createBy\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${onlineDocPage.createBy }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t\t\t<input id=\"createDate\" name=\"createDate\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${onlineDocPage.createDate }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t\t\t<input id=\"updateName\" name=\"updateName\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${onlineDocPage.updateName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t\t\t<input id=\"updateBy\" name=\"updateBy\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${onlineDocPage.updateBy }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t\t\t<input id=\"updateDate\" name=\"updateDate\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${onlineDocPage.updateDate }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t\t\t<input id=\"sysOrgCode\" name=\"sysOrgCode\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${onlineDocPage.sysOrgCode }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t\t\t<input id=\"sysCompanyCode\" name=\"sysCompanyCode\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${onlineDocPage.sysCompanyCode }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t\t\t<input id=\"bpmStatus\" name=\"bpmStatus\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${onlineDocPage.bpmStatus }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t\t\t<input id=\"oldName\" name=\"oldName\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${onlineDocPage.oldName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t\t\t<input id=\"newName\" name=\"newName\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${onlineDocPage.newName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t\t\t<input id=\"path\" name=\"path\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${onlineDocPage.path }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t\t\t<table style=\"width: 600px;\" cellpadding=\"0\" cellspacing=\"1\" class=\"formtable\">\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t文件:\n");
        out.write("\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t\t<input type=\"text\" width=\"120\" disabled=\"disabled\" style=\"background:#cccccc\" id=\"fileNameInput\"/>\n");
        out.write("\t\t\t\t\t\t<img alt=\"文件上载\" src=\"webpage/jeecg/onlinedoc/add.gif\" id=\"uploadLink\"/>\n");
        out.write("\t\t\t\t\t\t<img alt=\"取消上载\" src=\"webpage/jeecg/onlinedoc/redo.png\" id=\"redoLink\"/>\n");
        out.write("\t\t\t\t\t\t\n");
        out.write("\t\t\t\t\t\t<input type=\"file\" onchange=\"uploadHead();\" id=\"fileInput\" style=\"display:none;\" name=\"fileInput\" />\n");
        out.write("\t\t\t\t\t\t\n");
        out.write("\t\t\t\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\" style=\"display: none;\">文件</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t文档目录:\n");
        out.write("\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t\t<input id=\"onlineDocSortTree\" />\n");
        out.write("\t\t\t\t\t\t<input id=\"treeNode\" name=\"treeNode\" style=\"display: none;\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${onlineDocPage.treeNode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t\t\t\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\" style=\"display: none;\">文档目录</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t描述:\n");
        out.write("\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t\t<textarea rows=\"10\" cols=\"50\" id=\"description\" name=\"description\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${onlineDocPage.description }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</textarea>\n");
        out.write("\t\t\t\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\" style=\"display: none;\">描述</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t</table>\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_t_005fformvalid_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_005fformvalid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005ftiptype_005flayout_005fformid_005fdialog_005faction.reuse(_jspx_th_t_005fformvalid_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005ftiptype_005flayout_005fformid_005fdialog_005faction.reuse(_jspx_th_t_005fformvalid_005f0);
    return false;
  }
}
