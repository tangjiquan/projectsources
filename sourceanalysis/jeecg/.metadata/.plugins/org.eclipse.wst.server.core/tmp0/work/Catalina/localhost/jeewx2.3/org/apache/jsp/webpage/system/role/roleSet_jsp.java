/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.54
 * Generated at: 2016-05-09 16:17:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.webpage.system.role;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class roleSet_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
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
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(function() {\n");
      out.write("\t\t$('#functionid').tree({\n");
      out.write("\t\t\tcheckbox : true,\n");
      out.write("\t\t\turl : 'roleController.do?setAuthority&roleId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${roleId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("',\n");
      out.write("\t\t\tonLoadSuccess : function(node) {\n");
      out.write("\t\t\t\texpandAll();\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tonClick: function(node){\n");
      out.write("\t\t\t\tvar isRoot =  $('#functionid').tree('getChildren', node.target);\n");
      out.write("\t\t\t\tif(isRoot==''){\n");
      out.write("\t\t\t\t\tvar roleId = $(\"#rid\").val();\n");
      out.write("\t\t\t\t\t$('#operationListpanel').panel(\"refresh\", \"roleController.do?operationListForFunction&functionId=\"+node.id+\"&roleId=\"+roleId);\n");
      out.write("\t\t\t\t}else {\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t\t$(\"#functionListPanel\").panel(\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\ttitle :\"菜单列表\",\n");
      out.write("\t\t\t\t\ttools:[{iconCls:'icon-save',handler:function(){mysubmit();}}]\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t);\n");
      out.write("\t\t$(\"#operationListpanel\").panel(\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\ttitle :\"操作按钮列表\",\n");
      out.write("\t\t\t\t\ttools:[{iconCls:'icon-save',handler:function(){submitOperation();}}]\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t);\n");
      out.write("\t});\n");
      out.write("\tfunction mysubmit() {\n");
      out.write("\t\tvar roleId = $(\"#rid\").val();\n");
      out.write("\t\tvar s = GetNode();\n");
      out.write("\t\tdoSubmit(\"roleController.do?updateAuthority&rolefunctions=\" + s + \"&roleId=\" + roleId);\n");
      out.write("\t}\n");
      out.write("\tfunction GetNode() {\n");
      out.write("\t\tvar node = $('#functionid').tree('getChecked');\n");
      out.write("\t\tvar cnodes = '';\n");
      out.write("\t\tvar pnodes = '';\n");
      out.write("\t\tvar pnode = null; //保存上一步所选父节点\n");
      out.write("\t\tfor ( var i = 0; i < node.length; i++) {\n");
      out.write("\t\t\tif ($('#functionid').tree('isLeaf', node[i].target)) {\n");
      out.write("\t\t\t\tcnodes += node[i].id + ',';\n");
      out.write("\t\t\t\tpnode = $('#functionid').tree('getParent', node[i].target); //获取当前节点的父节点\n");
      out.write("\t\t\t\twhile (pnode!=null) {//添加全部父节点\n");
      out.write("\t\t\t\t\tpnodes += pnode.id + ',';\n");
      out.write("\t\t\t\t\tpnode = $('#functionid').tree('getParent', pnode.target); \n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\tcnodes = cnodes.substring(0, cnodes.length - 1);\n");
      out.write("\t\tpnodes = pnodes.substring(0, pnodes.length - 1);\n");
      out.write("\t\treturn cnodes + \",\" + pnodes;\n");
      out.write("\t};\n");
      out.write("\t\n");
      out.write("\tfunction expandAll() {\n");
      out.write("\t\tvar node = $('#functionid').tree('getSelected');\n");
      out.write("\t\tif (node) {\n");
      out.write("\t\t\t$('#functionid').tree('expandAll', node.target);\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\t$('#functionid').tree('expandAll');\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\tfunction selecrAll() {\n");
      out.write("\t\tvar node = $('#functionid').tree('getRoots');\n");
      out.write("\t\tfor ( var i = 0; i < node.length; i++) {\n");
      out.write("\t\t\tvar childrenNode =  $('#functionid').tree('getChildren',node[i].target);\n");
      out.write("\t\t\tfor ( var j = 0; j < childrenNode.length; j++) {\n");
      out.write("\t\t\t\t$('#functionid').tree(\"check\",childrenNode[j].target);\n");
      out.write("\t\t\t}\n");
      out.write("\t    }\n");
      out.write("\t}\n");
      out.write("\tfunction reset() {\n");
      out.write("\t\t$('#functionid').tree('reload');\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t$('#selecrAllBtn').linkbutton({   \n");
      out.write("\t}); \n");
      out.write("\t$('#resetBtn').linkbutton({   \n");
      out.write("\t});   \n");
      out.write("</script>\n");
      out.write("<div class=\"easyui-layout\" fit=\"true\">\n");
      out.write("<div region=\"center\" style=\"padding: 1px;\">\n");
      out.write("<div class=\"easyui-panel\" style=\"padding: 1px;\" fit=\"true\" border=\"false\" id=\"functionListPanel\"><input type=\"hidden\" name=\"roleId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${roleId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"rid\"> <a id=\"selecrAllBtn\"\n");
      out.write("\tonclick=\"selecrAll();\">全选</a> <a id=\"resetBtn\" onclick=\"reset();\">重置</a>\n");
      out.write("<ul id=\"functionid\"></ul>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<div region=\"east\" style=\"width: 150px; overflow: hidden;\" split=\"true\">\n");
      out.write("<div class=\"easyui-panel\" style=\"padding: 1px;\" fit=\"true\" border=\"false\" id=\"operationListpanel\"></div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
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
}
