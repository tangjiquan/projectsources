/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.54
 * Generated at: 2016-05-09 16:16:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.webpage.jeecg.demo.base.report;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reportDemo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/tld/easyui.tld", Long.valueOf(1462721646514L));
    _jspx_dependants.put("/context/mytags.jsp", Long.valueOf(1462721497509L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdatagrid_0026_005ftitle_005fname_005fidField_005ffit_005factionUrl;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005ffield_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005ffield_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdatagrid_0026_005ftitle_005fname_005fidField_005ffit_005factionUrl = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005ffield_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005ffield_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fdatagrid_0026_005ftitle_005fname_005fidField_005ffit_005factionUrl.release();
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005ffield_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005ffield_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("<!-- context path -->\n");
      if (_jspx_meth_t_005fbase_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/Highcharts-2.2.5/js/highcharts.src.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/Highcharts-2.2.5/js/modules/exporting.src.js\"></script>\n");
      out.write("\n");
      if (_jspx_meth_c_005fset_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(function() {\n");
      out.write("\t\t$(document).ready(function() {\n");
      out.write("\t\t\tvar chart;\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\ttype : \"POST\",\n");
      out.write("\t\t\t\turl : \"reportDemoController.do?studentCount&reportType=line\",\n");
      out.write("\t\t\t\tsuccess : function(jsondata) {\n");
      out.write("\t\t\t\t\tdata = eval(jsondata);\n");
      out.write("\t\t\t\t\tchart = new Highcharts.Chart({\n");
      out.write("\t\t\t\t\t\tchart : {\n");
      out.write("\t\t\t\t\t\t\trenderTo : 'containerline',\n");
      out.write("\t\t\t\t\t\t\tplotBackgroundColor : null,\n");
      out.write("\t\t\t\t\t\t\tplotBorderWidth : null,\n");
      out.write("\t\t\t\t\t\t\tplotShadow : false\n");
      out.write("\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\ttitle : {\n");
      out.write("\t\t\t\t\t\t\ttext : '班级学生人数比例分析-<b>折线图</b>'\n");
      out.write("\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\txAxis : {\n");
      out.write("\t\t\t\t\t\t\tcategories : [ '1班', '2班', '3班', '4班', '5班']\n");
      out.write("\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\ttooltip : {\n");
      out.write("\t\t\t\t\t\t\tshadow: false,\n");
      out.write("\t\t\t\t\t\t\tpercentageDecimals : 1,\n");
      out.write("\t\t\t\t\t\t\tformatter: function() {\n");
      out.write("            \t\t\t\t\treturn  '<b>'+this.point.name + '</b>:' +  Highcharts.numberFormat(this.percentage, 1) +'%';\n");
      out.write("         \t\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\texporting:{  \n");
      out.write("\t\t\t                filename:'pie',  \n");
      out.write("\t\t\t                 url:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctxPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/reportDemoController.do?export'  \n");
      out.write("\t\t\t            },  \n");
      out.write("\t\t\t\t\t\tplotOptions : {\n");
      out.write("\t\t\t\t\t\t\tpie : {\n");
      out.write("\t\t\t\t\t\t\t\tallowPointSelect : true,\n");
      out.write("\t\t\t\t\t\t\t\tcursor : 'pointer',\n");
      out.write("\t\t\t\t\t\t\t\tshowInLegend : true,\n");
      out.write("\t\t\t\t\t\t\t\tdataLabels : {\n");
      out.write("\t\t\t\t\t\t\t\t\tenabled : true,\n");
      out.write("\t\t\t\t\t\t\t\t\tcolor : '#000000',\n");
      out.write("\t\t\t\t\t\t\t\t\tconnectorColor : '#000000',\n");
      out.write("\t\t\t\t\t\t\t\t\tformatter : function() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\treturn '<b>' + this.point.name + '</b>: ' + Highcharts.numberFormat(this.percentage, 1)+\"%\";\n");
      out.write("\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\tseries : data\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(function() {\n");
      out.write("\t\t$(document).ready(function() {\n");
      out.write("\t\t\tvar chart;\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\ttype : \"POST\",\n");
      out.write("\t\t\t\turl : \"reportDemoController.do?studentCount&reportType=column\",\n");
      out.write("\t\t\t\tsuccess : function(jsondata) {\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\tdata = eval(jsondata);\n");
      out.write("\t\t\t\t\tconsole.log(data);\n");
      out.write("\t\t\t\t\tchart = new Highcharts.Chart({\n");
      out.write("\t\t\t\t\t\tchart : {\n");
      out.write("\t\t\t\t\t\t\trenderTo : 'containerCol',\n");
      out.write("\t\t\t\t\t\t\tplotBackgroundColor : null,\n");
      out.write("\t\t\t\t\t\t\tplotBorderWidth : null,\n");
      out.write("\t\t\t\t\t\t\tplotShadow : false\n");
      out.write("\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\ttitle : {\n");
      out.write("\t\t\t\t\t\t\ttext : '班级学生人数比例分析-<b>柱状图</b>'\n");
      out.write("\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\txAxis : {\n");
      out.write("\t\t\t\t\t\t\tcategories : [ '1班', '2班', '3班', '4班', '5班']\n");
      out.write("\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\ttooltip : {\n");
      out.write("\t\t\t\t\t\t\t percentageDecimals : 1,\n");
      out.write("\t\t\t\t\t\t\t formatter: function() {\n");
      out.write("            \t\t\t\t\treturn  '<b>'+this.point.name + '</b>:' +  Highcharts.numberFormat(this.percentage, 1) +'%';\n");
      out.write("         \t\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\texporting:{ \n");
      out.write("\t\t\t                filename:'column',  \n");
      out.write("\t\t\t                url:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctxPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/reportDemoController.do?export'//\n");
      out.write("\t\t\t            },\n");
      out.write("\t\t\t\t\t\tplotOptions : {\n");
      out.write("\t\t\t\t\t\t\tcolumn : {\n");
      out.write("\t\t\t\t\t\t\t\tallowPointSelect : true,\n");
      out.write("\t\t\t\t\t\t\t\tcursor : 'pointer',\n");
      out.write("\t\t\t\t\t\t\t\tshowInLegend : true,\n");
      out.write("\t\t\t\t\t\t\t\tdataLabels : {\n");
      out.write("\t\t\t\t\t\t\t\t\tenabled : true,\n");
      out.write("\t\t\t\t\t\t\t\t\tcolor : '#000000',\n");
      out.write("\t\t\t\t\t\t\t\t\tconnectorColor : '#000000',\n");
      out.write("\t\t\t\t\t\t\t\t\tformatter : function() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\treturn '<b>' + this.point.name + '</b>: ' +Highcharts.numberFormat(this.percentage, 1)+\"%\";\n");
      out.write("\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\tseries : data\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(function() {\n");
      out.write("\t\t$(document).ready(function() {\n");
      out.write("\t\t\tvar chart;\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\ttype : \"POST\",\n");
      out.write("\t\t\t\turl : \"reportDemoController.do?studentCount&reportType=pie\",\n");
      out.write("\t\t\t\tsuccess : function(jsondata) {\n");
      out.write("\t\t\t\t\tdata = eval(jsondata);\n");
      out.write("\t\t\t\t\tchart = new Highcharts.Chart({\n");
      out.write("\t\t\t\t\t\tchart : {\n");
      out.write("\t\t\t\t\t\t\trenderTo : 'containerPie',\n");
      out.write("\t\t\t\t\t\t\tplotBackgroundColor : null,\n");
      out.write("\t\t\t\t\t\t\tplotBorderWidth : null,\n");
      out.write("\t\t\t\t\t\t\tplotShadow : false\n");
      out.write("\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\ttitle : {\n");
      out.write("\t\t\t\t\t\t\ttext : '班级学生人数比例分析-<b>饼状图</b>'\n");
      out.write("\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\txAxis : {\n");
      out.write("\t\t\t\t\t\t\tcategories : [ '1班', '2班', '3班', '4班', '5班']\n");
      out.write("\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\ttooltip : {\n");
      out.write("\t\t\t\t\t\t\tshadow: false,\n");
      out.write("\t\t\t\t\t\t\tpercentageDecimals : 1,\n");
      out.write("\t\t\t\t\t\t\tformatter: function() {\n");
      out.write("            \t\t\t\t\treturn  '<b>'+this.point.name + '</b>:' +  Highcharts.numberFormat(this.percentage, 1) +'%';\n");
      out.write("         \t\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\texporting:{  \n");
      out.write("\t\t\t                filename:'pie',  \n");
      out.write("\t\t\t                 url:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctxPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/reportDemoController.do?export'  \n");
      out.write("\t\t\t            },  \n");
      out.write("\t\t\t\t\t\tplotOptions : {\n");
      out.write("\t\t\t\t\t\t\tpie : {\n");
      out.write("\t\t\t\t\t\t\t\tallowPointSelect : true,\n");
      out.write("\t\t\t\t\t\t\t\tcursor : 'pointer',\n");
      out.write("\t\t\t\t\t\t\t\tshowInLegend : true,\n");
      out.write("\t\t\t\t\t\t\t\tdataLabels : {\n");
      out.write("\t\t\t\t\t\t\t\t\tenabled : true,\n");
      out.write("\t\t\t\t\t\t\t\t\tcolor : '#000000',\n");
      out.write("\t\t\t\t\t\t\t\t\tconnectorColor : '#000000',\n");
      out.write("\t\t\t\t\t\t\t\t\tformatter : function() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\treturn '<b>' + this.point.name + '</b>: ' + Highcharts.numberFormat(this.percentage, 1)+\"%\";\n");
      out.write("\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\tseries : data\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("<span id=\"containerline\" style=\"float: left; width: 30%; height: 60%\"></span>\n");
      out.write("<span id=\"containerCol\" style=\"float: left; width: 38%; height: 60%\"></span>\n");
      out.write("<span id=\"containerPie\" style=\"width: 30%; height: 60%\"></span>\n");
      out.write("\n");
      out.write("<div style=\"width: 98%; height: 280px\">");
      if (_jspx_meth_t_005fdatagrid_005f0(_jspx_page_context))
        return;
      out.write("</div>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_t_005fbase_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  t:base
    org.jeecgframework.tag.core.easyui.BaseTag _jspx_th_t_005fbase_005f0 = (org.jeecgframework.tag.core.easyui.BaseTag) _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.get(org.jeecgframework.tag.core.easyui.BaseTag.class);
    _jspx_th_t_005fbase_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fbase_005f0.setParent(null);
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(4,0) name = type type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fbase_005f0.setType("jquery,easyui");
    int _jspx_eval_t_005fbase_005f0 = _jspx_th_t_005fbase_005f0.doStartTag();
    if (_jspx_th_t_005fbase_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f1.setParent(null);
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(8,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setVar("ctxPath");
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(8,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setValue(new org.apache.jasper.el.JspValueExpression("/webpage/jeecg/demo/base/report/reportDemo.jsp(8,0) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
    if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
    return false;
  }

  private boolean _jspx_meth_t_005fdatagrid_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  t:datagrid
    org.jeecgframework.tag.core.easyui.DataGridTag _jspx_th_t_005fdatagrid_005f0 = (org.jeecgframework.tag.core.easyui.DataGridTag) _005fjspx_005ftagPool_005ft_005fdatagrid_0026_005ftitle_005fname_005fidField_005ffit_005factionUrl.get(org.jeecgframework.tag.core.easyui.DataGridTag.class);
    _jspx_th_t_005fdatagrid_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdatagrid_005f0.setParent(null);
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(186,39) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdatagrid_005f0.setName("studentStatisticList");
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(186,39) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdatagrid_005f0.setTitle("班级学生人数统计");
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(186,39) name = actionUrl type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdatagrid_005f0.setActionUrl("reportDemoController.do?listAllStatisticByJdbc");
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(186,39) name = idField type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdatagrid_005f0.setIdField("id");
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(186,39) name = fit type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdatagrid_005f0.setFit(true);
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
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005fdgCol_005f3(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        int evalDoAfterBody = _jspx_th_t_005fdatagrid_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_005fdatagrid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdatagrid_0026_005ftitle_005fname_005fidField_005ffit_005factionUrl.reuse(_jspx_th_t_005fdatagrid_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdatagrid_0026_005ftitle_005fname_005fidField_005ffit_005factionUrl.reuse(_jspx_th_t_005fdatagrid_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f0 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(187,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f0.setTitle("编号");
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(187,1) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f0.setField("id");
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(187,1) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f0.setHidden(false);
    int _jspx_eval_t_005fdgCol_005f0 = _jspx_th_t_005fdgCol_005f0.doStartTag();
    if (_jspx_th_t_005fdgCol_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f1 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f1.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(188,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f1.setTitle("班级");
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(188,1) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f1.setField("classname");
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(188,1) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f1.setWidth(new java.lang.Integer(130));
    int _jspx_eval_t_005fdgCol_005f1 = _jspx_th_t_005fdgCol_005f1.doStartTag();
    if (_jspx_th_t_005fdgCol_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f1);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f2 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f2.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(189,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f2.setTitle("人数");
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(189,1) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f2.setField("personcount");
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(189,1) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f2.setWidth(new java.lang.Integer(130));
    int _jspx_eval_t_005fdgCol_005f2 = _jspx_th_t_005fdgCol_005f2.doStartTag();
    if (_jspx_th_t_005fdgCol_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f2);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f3 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f3.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(190,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f3.setTitle("比例");
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(190,1) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f3.setField("rate");
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(190,1) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f3.setWidth(new java.lang.Integer(130));
    int _jspx_eval_t_005fdgCol_005f3 = _jspx_th_t_005fdgCol_005f3.doStartTag();
    if (_jspx_th_t_005fdgCol_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f3);
    return false;
  }
}
