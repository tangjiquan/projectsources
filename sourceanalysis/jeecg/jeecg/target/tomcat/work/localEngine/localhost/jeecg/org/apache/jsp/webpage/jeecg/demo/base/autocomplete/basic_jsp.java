package org.apache.jsp.webpage.jeecg.demo.base.autocomplete;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class basic_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/context/mytags.jsp");
    _jspx_dependants.add("/WEB-INF/tld/easyui.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fformvalid_0026_005flayout_005fformid_005fdialog_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fautocomplete_0026_005fvalueField_005fsearchField_005fresult_005fparse_005fnullmsg_005fname_005fminLength_005fmaxRows_005flabelField_005fformatItem_005ferrormsg_005fentityName_005fdatatype_005fdataSource_005fclosefun_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005flayout_005fformid_005fdialog_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fautocomplete_0026_005fvalueField_005fsearchField_005fresult_005fparse_005fnullmsg_005fname_005fminLength_005fmaxRows_005flabelField_005fformatItem_005ferrormsg_005fentityName_005fdatatype_005fdataSource_005fclosefun_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005flayout_005fformid_005fdialog_005faction.release();
    _005fjspx_005ftagPool_005ft_005fautocomplete_0026_005fvalueField_005fsearchField_005fresult_005fparse_005fnullmsg_005fname_005fminLength_005fmaxRows_005flabelField_005fformatItem_005ferrormsg_005fentityName_005fdatatype_005fdataSource_005fclosefun_005fnobody.release();
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
      out.write("<script src=\"plug-in/jquery/jquery-autocomplete/jquery.autocomplete.js\" type=\"text/javascript\"></script>\n");
      out.write("<link href=\"plug-in/jquery/jquery-autocomplete/jquery.autocomplete.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<style>\n");
      out.write("<!--\n");
      out.write(".ac_over {\n");
      out.write("\tbackground: #E0ECFF;\n");
      out.write("\tcursor: pointer;\n");
      out.write("\tcolor: #416AA3;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".ac_results {\n");
      out.write("\tborder: 1px solid rgb(172, 216, 236);\n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("<SCRIPT type=\"text/javascript\">\n");
      out.write("        function parse(data){\n");
      out.write("            \tvar parsed = [];\n");
      out.write("\t\t        \t$.each(data.rows,function(index,row){\n");
      out.write("\t\t        \t\tparsed.push({data:row,result:row,value:row.id});\n");
      out.write("\t\t        \t});\n");
      out.write("        \t\t\t\treturn parsed;\n");
      out.write("        }\n");
      out.write("        /**\n");
      out.write("         * 选择后回调 \n");
      out.write("         * \n");
      out.write("         * @param {Object} data\n");
      out.write("         */\n");
      out.write("        function callBack(data) {\n");
      out.write("        \t$(\"#user\").val(data.userName);\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("         /**\n");
      out.write("          * 每一个选择项显示的信息\n");
      out.write("          * \n");
      out.write("          * @param {Object} data\n");
      out.write("          */\n");
      out.write("        function formatItem(data) {\n");
      out.write("        \treturn data.userName + \"-->\" + \" \" + data.realName;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("  </SCRIPT>\n");
      if (_jspx_meth_t_005fformvalid_005f0(_jspx_page_context))
        return;
      out.write('\n');
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

  private boolean _jspx_meth_t_005fformvalid_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:formvalid
    org.jeecgframework.tag.core.easyui.FormValidationTag _jspx_th_t_005fformvalid_005f0 = (org.jeecgframework.tag.core.easyui.FormValidationTag) _005fjspx_005ftagPool_005ft_005fformvalid_0026_005flayout_005fformid_005fdialog_005faction.get(org.jeecgframework.tag.core.easyui.FormValidationTag.class);
    _jspx_th_t_005fformvalid_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fformvalid_005f0.setParent(null);
    // /webpage/jeecg/demo/base/autocomplete/basic.jsp(45,0) name = formid type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setFormid("formobj");
    // /webpage/jeecg/demo/base/autocomplete/basic.jsp(45,0) name = dialog type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setDialog(false);
    // /webpage/jeecg/demo/base/autocomplete/basic.jsp(45,0) name = layout type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setLayout("div");
    // /webpage/jeecg/demo/base/autocomplete/basic.jsp(45,0) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setAction("demoController.do?saveDemo");
    int _jspx_eval_t_005fformvalid_005f0 = _jspx_th_t_005fformvalid_005f0.doStartTag();
    if (_jspx_eval_t_005fformvalid_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t<fieldset class=\"step\">\n");
        out.write("\t<div class=\"form\"><label class=\"form\"> 自动补全： </label> ");
        if (_jspx_meth_t_005fautocomplete_005f0(_jspx_th_t_005fformvalid_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t</fieldset>\n");
        int evalDoAfterBody = _jspx_th_t_005fformvalid_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_005fformvalid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fformvalid_0026_005flayout_005fformid_005fdialog_005faction.reuse(_jspx_th_t_005fformvalid_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005flayout_005fformid_005fdialog_005faction.reuse(_jspx_th_t_005fformvalid_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fautocomplete_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fformvalid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:autocomplete
    org.jeecgframework.tag.core.easyui.AutocompleteTag _jspx_th_t_005fautocomplete_005f0 = (org.jeecgframework.tag.core.easyui.AutocompleteTag) _005fjspx_005ftagPool_005ft_005fautocomplete_0026_005fvalueField_005fsearchField_005fresult_005fparse_005fnullmsg_005fname_005fminLength_005fmaxRows_005flabelField_005fformatItem_005ferrormsg_005fentityName_005fdatatype_005fdataSource_005fclosefun_005fnobody.get(org.jeecgframework.tag.core.easyui.AutocompleteTag.class);
    _jspx_th_t_005fautocomplete_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fautocomplete_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fformvalid_005f0);
    // /webpage/jeecg/demo/base/autocomplete/basic.jsp(47,55) name = minLength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fautocomplete_005f0.setMinLength(new Integer(1));
    // /webpage/jeecg/demo/base/autocomplete/basic.jsp(47,55) name = dataSource type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fautocomplete_005f0.setDataSource("commonController.do?getAutoList");
    // /webpage/jeecg/demo/base/autocomplete/basic.jsp(47,55) name = closefun type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fautocomplete_005f0.setClosefun("close");
    // /webpage/jeecg/demo/base/autocomplete/basic.jsp(47,55) name = valueField type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fautocomplete_005f0.setValueField("id");
    // /webpage/jeecg/demo/base/autocomplete/basic.jsp(47,55) name = searchField type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fautocomplete_005f0.setSearchField("userName,realName");
    // /webpage/jeecg/demo/base/autocomplete/basic.jsp(47,55) name = labelField type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fautocomplete_005f0.setLabelField("userName,realName");
    // /webpage/jeecg/demo/base/autocomplete/basic.jsp(47,55) name = parse type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fautocomplete_005f0.setParse("parse");
    // /webpage/jeecg/demo/base/autocomplete/basic.jsp(47,55) name = formatItem type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fautocomplete_005f0.setFormatItem("formatItem");
    // /webpage/jeecg/demo/base/autocomplete/basic.jsp(47,55) name = result type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fautocomplete_005f0.setResult("callBack");
    // /webpage/jeecg/demo/base/autocomplete/basic.jsp(47,55) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fautocomplete_005f0.setName("user");
    // /webpage/jeecg/demo/base/autocomplete/basic.jsp(47,55) name = entityName type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fautocomplete_005f0.setEntityName("TSUser");
    // /webpage/jeecg/demo/base/autocomplete/basic.jsp(47,55) name = datatype type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fautocomplete_005f0.setDatatype("*");
    // /webpage/jeecg/demo/base/autocomplete/basic.jsp(47,55) name = maxRows type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fautocomplete_005f0.setMaxRows(new Integer(10));
    // /webpage/jeecg/demo/base/autocomplete/basic.jsp(47,55) name = nullmsg type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fautocomplete_005f0.setNullmsg("请输入关键字");
    // /webpage/jeecg/demo/base/autocomplete/basic.jsp(47,55) name = errormsg type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fautocomplete_005f0.setErrormsg("数据不存在,请重新输入");
    int _jspx_eval_t_005fautocomplete_005f0 = _jspx_th_t_005fautocomplete_005f0.doStartTag();
    if (_jspx_th_t_005fautocomplete_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fautocomplete_0026_005fvalueField_005fsearchField_005fresult_005fparse_005fnullmsg_005fname_005fminLength_005fmaxRows_005flabelField_005fformatItem_005ferrormsg_005fentityName_005fdatatype_005fdataSource_005fclosefun_005fnobody.reuse(_jspx_th_t_005fautocomplete_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fautocomplete_0026_005fvalueField_005fsearchField_005fresult_005fparse_005fnullmsg_005fname_005fminLength_005fmaxRows_005flabelField_005fformatItem_005ferrormsg_005fentityName_005fdatatype_005fdataSource_005fclosefun_005fnobody.reuse(_jspx_th_t_005fautocomplete_005f0);
    return false;
  }
}
