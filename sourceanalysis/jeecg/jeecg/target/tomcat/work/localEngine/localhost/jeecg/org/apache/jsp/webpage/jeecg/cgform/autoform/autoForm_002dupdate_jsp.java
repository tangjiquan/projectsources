package org.apache.jsp.webpage.jeecg.cgform.autoform;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class autoForm_002dupdate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fformvalid_0026_005ftiptype_005flayout_005fformid_005fdialog_005fcallback_005fbtnsub_005fbeforeSubmit_005faction;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005ftiptype_005flayout_005fformid_005fdialog_005fcallback_005fbtnsub_005fbeforeSubmit_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005ftiptype_005flayout_005fformid_005fdialog_005fcallback_005fbtnsub_005fbeforeSubmit_005faction.release();
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
      out.write(" <head>\n");
      out.write("  <title>表单设计器</title>\n");
      out.write("  ");
      if (_jspx_meth_t_005fbase_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"plug-in/ztree/css/zTreeStyle.css\">\n");
      out.write("  <script type=\"text/javascript\" src=\"plug-in/ztree/js/jquery.ztree.core-3.5.min.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"plug-in/ztree/js/jquery.ztree.excheck-3.5.min.js\"></script>\n");
      out.write("  <script src = \"webpage/jeecg/cgform/autoform/autoForm.js\"></script>\t\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("\t  \n");
      out.write("\t  var setting = {\n");
      out.write("\t\t\t  check: {\n");
      out.write("\t\t\t\t\tenable: true,\n");
      out.write("\t\t\t\t\t//update-begin--Author: huangzq  Date:20151209 for：【自定义表单】选择数据源生成模板，限制只能选择一个\n");
      out.write("\t\t\t\t\tchkStyle: \"radio\",\n");
      out.write("\t\t\t\t\tradioType: \"level\"\n");
      out.write("\t\t\t\t\t//update-end--Author: huangzq  Date:20151209 for：【自定义表单】选择数据源生成模板，限制只能选择一个\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\tdata: {\n");
      out.write("\t\t\t\t\tsimpleData: {\n");
      out.write("\t\t\t\t\t\tenable: true\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t};\n");
      out.write("\t  \n");
      out.write("\t  var stylesetting = {\n");
      out.write("\t\t\tcheck: {\n");
      out.write("\t\t\t\tenable: true,\n");
      out.write("\t\t\t\tchkStyle: \"radio\",\n");
      out.write("\t\t\t\tradioType: \"level\"\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tdata: {\n");
      out.write("\t\t\t\tsimpleData: {\n");
      out.write("\t\t\t\t\tenable: true\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t};\n");
      out.write("\t  \n");
      out.write("\t  function showIconForTree(treeId, treeNode) {\n");
      out.write("\t\treturn !treeNode.isParent;\n");
      out.write("\t  }\n");
      out.write("\t  //初始化主数据源\n");
      out.write("\t  function initMainTableSourceSelect(){\n");
      out.write("\t\t  var ztree = $.fn.zTree.getZTreeObj(\"dbSelect\");\n");
      out.write("\t\t  var node = ztree.getNodesByParam(\"pid\", 0, null);\n");
      out.write("\t\t//update-begin--Author: jg_renjie  Date:20151210 for：【自定义表单】表单主数据源不允许录入，只允许选择\n");
      out.write("\t\t  var options = \"<option value=''>请选择主数据源</option>\";\n");
      out.write("\t\t  $.each(node,function(i,f){\n");
      out.write("\t\t\t  options += \"<option value='\"+f.dbCode+\"'>\"+f.name+\"</option>\";\n");
      out.write("\t\t  })\n");
      out.write("\t\t  $(\"#mainTableSource\").html(options);\n");
      out.write("\t\t  $(\"#mainTableSource\").val(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${autoFormPage.mainTableSource}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\");\n");
      out.write("\t\t//update-end--Author: jg_renjie  Date:20151210 for：【自定义表单】表单主数据源不允许录入，只允许选择\n");
      out.write("\t  }\n");
      out.write("\t $(function(){\n");
      out.write("\t\t var dbDate = eval('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dbDate}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("');\n");
      out.write("\t\t $.fn.zTree.init($(\"#dbSelect\"), setting, dbDate);\n");
      out.write("\t\t var styleDate = eval('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${styleSelect}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("');\n");
      out.write("\t\t//update-begin--Author: jg_huangxg  Date:20151102 for：树菜单ICON图标自定义实现\n");
      out.write("\t\t var iconPath = \"plug-in/ztree/css/img/diy/2.png\";\n");
      out.write("\t\t $(styleDate).each(function(i){\n");
      out.write("\t\t\tthis.icon = iconPath;\n");
      out.write("\t\t });\n");
      out.write("\t\t//update-end--Author: jg_huangxg  Date:20151102 for：树菜单ICON图标自定义实现\n");
      out.write("\t\t $.fn.zTree.init($(\"#styleSelect\"), stylesetting, styleDate);\n");
      out.write("\t\t initMainTableSourceSelect();\n");
      out.write("\t\t//自定义easyui表单验证规则\n");
      out.write("\t\t/* var flag;\n");
      out.write("\t\t $.extend($.fn.validatebox.defaults.rules, {\n");
      out.write("\t\t\t uniqueNm: {\n");
      out.write("\t\t          validator: function (value,param){\n");
      out.write("\t\t        \t$.post(\n");
      out.write("\t\t        \t\t'autoFormController.do?checkFormNm',\n");
      out.write("\t\t        \t\t{formName:value},\n");
      out.write("\t\t        \t\tfunction(data){\n");
      out.write("\t\t        \t\t\tvar d = $.parseJSON(data);\n");
      out.write("\t\t        \t\t\tif(d.msg == '0' || d.msg == '1'){\n");
      out.write("\t\t        \t\t\t\t$(\"#formName\").removeClass(); \n");
      out.write("\t\t        \t\t\t} else{\n");
      out.write("\t\t        \t\t\t\treturn false;\n");
      out.write("\t\t        \t\t\t}\n");
      out.write("\t\t        \t\t}\n");
      out.write("\t\t            );\n");
      out.write("\t\t          },\n");
      out.write("\t\t          message: '表单名称重复，请重新输入'\n");
      out.write("\t\t        }\n");
      out.write("\t\t }); */\n");
      out.write("\t\t \n");
      out.write("\t\t//添加生成按钮的onclick事件\n");
      out.write("\t\t $(\"#createCode\").click(function(){\n");
      out.write("\t\t\t var formdbId = getNodeId();\n");
      out.write("\t\t\t if(formdbId == ''){\n");
      out.write("\t\t\t\t tip('请选择表单数据源');\n");
      out.write("\t\t\t }\n");
      out.write("\t\t\t \n");
      out.write("\t\t\t var styleId = getStyleId();\n");
      out.write("\t\t\t if(styleId == ''){\n");
      out.write("\t\t\t\t tip('请选择自定义表单模板');\n");
      out.write("\t\t\t }\n");
      out.write("\t\t\t \n");
      out.write("\t\t\t $.post(\n");
      out.write("\t\t\t    'autoFormController.do?docreateCode',\n");
      out.write("\t\t\t\t{formdbId:formdbId,styleId:styleId},\n");
      out.write("\t\t\t\tfunction(data) {\n");
      out.write("\t\t\t\t\tvar d = $.parseJSON(data);\n");
      out.write("\t\t\t\t\tif (d.success) {\n");
      out.write("\t\t\t\t\t\tvar editor = UE.getEditor('content');\n");
      out.write("\t\t\t\t\t\teditor.ready(\n");
      out.write("\t\t\t\t\t\tfunction(){\n");
      out.write("\t\t\t\t\t\t\tsetContent();\n");
      out.write("\t\t\t\t\t\t\t//editor.setContent($(\"#formContent\").val()+d.msg.replace(new RegExp(/(&quot;)/g),\"'\"));\n");
      out.write("\t\t\t\t\t\t\teditor.execCommand('inserthtml', d.msg.replace(new RegExp(/(&quot;)/g),\"'\"));\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t });\n");
      out.write("\t });\n");
      out.write("\t \n");
      out.write("\t \n");
      out.write("\t function doAdd(){\n");
      out.write("\t\t var addurl = \"autoFormDbController.do?goAdd&autoFormId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${autoFormPage.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\n");
      out.write("\t\t $.dialog({\n");
      out.write("\t\t\tcontent: 'url:'+addurl,\n");
      out.write("\t\t\tlock : true,\n");
      out.write("\t\t\t//zIndex:1990,\n");
      out.write("\t\t\twidth: '100%',\n");
      out.write("\t\t\theight: '100%',\n");
      out.write("\t\t\ttitle: \"");
      if (_jspx_meth_t_005fmutiLang_005f0(_jspx_page_context))
        return;
      out.write("\",\n");
      out.write("\t\t\topacity : 0.3,\n");
      out.write("\t\t\tcache:false,\n");
      out.write("\t\t\tokVal: '");
      if (_jspx_meth_t_005fmutiLang_005f1(_jspx_page_context))
        return;
      out.write("',\n");
      out.write("\t\t    ok: function(){\n");
      out.write("\t\t    \tvar iframe = this.iframe.contentWindow;\n");
      out.write("\t\t    \tiframe.$('#formobj').form('submit', {\n");
      out.write("\t\t    \t\turl : 'autoFormDbController.do?doAdd',\n");
      out.write("\t\t    \t\tonSubmit : function() {\n");
      out.write("\t\t\t\t\t\tiframe.setDataSourceVal();\n");
      out.write("\t\t\t\t\t\treturn ( iframe.$(\"#formobj\").Validform({tiptype:3}).check());\n");
      out.write("\t\t    \t\t},\n");
      out.write("\t\t    \t\tsuccess : function(data) {\n");
      out.write("\t\t    \t\t\tiframe.windowapi.close();\n");
      out.write("\t\t    \t\t\tvar d = $.parseJSON(data);\n");
      out.write("\t\t\t\t\t\tif (d.success) {\n");
      out.write("\t\t\t\t\t\t\ttip(d.msg);\n");
      out.write("\t\t\t\t\t\t\tdoReload();\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t    \t\t}\n");
      out.write("\t\t    \t});\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t    },\n");
      out.write("\t\t    cancelVal: '");
      if (_jspx_meth_t_005fmutiLang_005f2(_jspx_page_context))
        return;
      out.write("',\n");
      out.write("\t\t    cancel: true /*为true等价于function(){}*/\n");
      out.write("\t\t}).max().zindex();\n");
      out.write("\t }\n");
      out.write("\t function doUpdate(){\n");
      out.write("\t\t //获取选中的父节点\n");
      out.write("\t\t var id = getNodeId();\n");
      out.write("\t\t if(id == null || id == ''){\n");
      out.write("\t\t\t alert('请选择需要编辑的表单数据源');\n");
      out.write("\t\t\t return false;\n");
      out.write("\t\t }\n");
      out.write("\t\t var addurl = \"autoFormDbController.do?goUpdate&id=\"+id;\n");
      out.write("\t\t  $.dialog({\n");
      out.write("\t\t\tcontent: 'url:'+addurl,\n");
      out.write("\t\t\tlock : true,\n");
      out.write("\t\t\t//zIndex:1990,\n");
      out.write("\t\t\twidth: 700,\n");
      out.write("\t\t\theight: 400,\n");
      out.write("\t\t\ttitle: \"");
      if (_jspx_meth_t_005fmutiLang_005f3(_jspx_page_context))
        return;
      out.write("\",\n");
      out.write("\t\t\topacity : 0.3,\n");
      out.write("\t\t\tcache:false,\n");
      out.write("\t\t\tokVal: '");
      if (_jspx_meth_t_005fmutiLang_005f4(_jspx_page_context))
        return;
      out.write("',\n");
      out.write("\t\t    ok: function(){\n");
      out.write("\t\t    \tvar iframe = this.iframe.contentWindow;\n");
      out.write("\t\t    \tiframe.$('#formobj').form('submit', {\n");
      out.write("\t\t    \t\turl : 'autoFormDbController.do?doUpdate',\n");
      out.write("\t\t    \t\tonSubmit : function() {\n");
      out.write("\t\t\t\t\t\tiframe.setDataSourceVal();\n");
      out.write("\t\t\t\t\t\treturn ( iframe.$(\"#formobj\").Validform({tiptype:3}).check(false));\n");
      out.write("\t\t    \t\t},\n");
      out.write("\t\t    \t\tsuccess : function(data) {\n");
      out.write("\t\t    \t\t\tiframe.windowapi.close();\n");
      out.write("\t\t    \t\t\tvar d = $.parseJSON(data);\n");
      out.write("\t\t\t\t\t\tif (d.success) {\n");
      out.write("\t\t\t\t\t\t\ttip(d.msg);\n");
      out.write("\t\t\t\t\t\t\tdoReload();\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t    \t\t}\n");
      out.write("\t\t    \t});\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t    },\n");
      out.write("\t\t    cancelVal: '");
      if (_jspx_meth_t_005fmutiLang_005f5(_jspx_page_context))
        return;
      out.write("',\n");
      out.write("\t\t    cancel: true /*为true等价于function(){}*/\n");
      out.write("\t\t}).max().zindex();\n");
      out.write("\t }\n");
      out.write("\t function doDelete(){\n");
      out.write("\t\t var id = getNodeId();\n");
      out.write("\t\t if(id == null || id == ''){\n");
      out.write("\t\t\t alert('请选择需要删除的表单数据源');\n");
      out.write("\t\t\t return false;\n");
      out.write("\t\t }\n");
      out.write("\t\t \n");
      out.write("\t\t $.dialog.confirm('你确定永久删除该数据吗?', function(){\n");
      out.write("\t\t\t $.post(\n");
      out.write("\t\t\t\t'autoFormDbController.do?doBatchDel',\n");
      out.write("\t\t\t\t{ids : id},\n");
      out.write("\t\t\t\tfunction(data) {\n");
      out.write("\t\t\t\t\tvar d = $.parseJSON(data);\n");
      out.write("\t\t\t\t\tif (d.success) {\n");
      out.write("\t\t\t\t\t\tdoReload();\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t  });\n");
      out.write("\t }\n");
      out.write("\t \n");
      out.write("\t function doReload(){\n");
      out.write("\t\t $.post(\n");
      out.write("\t\t 'autoFormController.do?treeReload',\n");
      out.write("\t\t {autoFormId: $(\"#id\").val()},\n");
      out.write("\t\t function(data){\n");
      out.write("\t\t    var d = $.parseJSON(data);\n");
      out.write("\t\t\tif (d.success) {\n");
      out.write("\t\t\t\t var dbDate = eval(d.msg);\n");
      out.write("\t\t\t\t $.fn.zTree.init($(\"#dbSelect\"), setting, dbDate);\n");
      out.write("\t\t\t\tinitMainTableSourceSelect();\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t });\n");
      out.write("\t }\n");
      out.write("\t \n");
      out.write("\t//改成多选时取得多个ID根据\",\"分割\n");
      out.write("\t   function getNodeId(){\n");
      out.write("\t\t\t var treeObj = $.fn.zTree.getZTreeObj(\"dbSelect\");\n");
      out.write("\t\t\t var nodes = treeObj.getCheckedNodes(true);\n");
      out.write("\t\t\t if(nodes.length == 0){\n");
      out.write("\t\t\t\t return \"\";\n");
      out.write("\t\t\t }\n");
      out.write("\t\t\t var ids = [];\n");
      out.write("\t\t\t for(var i=0;i<nodes.length;i++){\n");
      out.write("\t\t\t\t if(nodes[i].pid == '0'){\n");
      out.write("\t\t\t\t\t ids.push(nodes[i].id);\n");
      out.write("\t\t\t\t }\n");
      out.write("\t\t\t }\n");
      out.write("\t\t\t return ids.join(',');\n");
      out.write("\t\t } \n");
      out.write("\t\t \n");
      out.write("\t   function getStyleId(){\n");
      out.write("\t\t\t var treeObj = $.fn.zTree.getZTreeObj(\"styleSelect\");\n");
      out.write("\t\t\t var nodes = treeObj.getCheckedNodes(true);\n");
      out.write("\t\t\t if(nodes.length == 0){\n");
      out.write("\t\t\t\t return \"\";\n");
      out.write("\t\t\t }\n");
      out.write("\t\t\t var id = \"\";\n");
      out.write("\t\t\t for(var i=0;i<nodes.length;i++){\n");
      out.write("\t\t\t\t id = nodes[i].id;\n");
      out.write("\t\t\t\t break;\n");
      out.write("\t\t\t }\n");
      out.write("\t\t\t return id;\n");
      out.write("\t\t }\n");
      out.write("\t \n");
      out.write("   \n");
      out.write("   function doExit() {\n");
      out.write("\t \t//document.location=\"autoFormController.do?autoForm\";\n");
      out.write("\t   var cur = window.top.$('#maintabs').tabs('getSelected');\n");
      out.write("\t   var index = window.top.$('#maintabs').tabs('getTabIndex',cur);\n");
      out.write("\t   window.top.$('#maintabs').tabs('close',index);\n");
      out.write("\t}\n");
      out.write("   \n");
      out.write("   function doSubmit(){\n");
      out.write("\t   \n");
      out.write("\t\t $('#formobj').form('submit', {\n");
      out.write("  \t\turl : 'autoFormController.do?doUpdate',\n");
      out.write("  \t\tonSubmit : function() {  \t\t\t\n");
      out.write("  \t\t\tif(leipiEditor.queryCommandState( 'source' ))\n");
      out.write("\t            leipiEditor.execCommand('source');\n");
      out.write("  \t\t\t\n");
      out.write("\t        if(leipiEditor.hasContents()){\n");
      out.write("\t            leipiEditor.sync();       \n");
      out.write("\t         \t\n");
      out.write("\t           var parse_form = leipiFormDesign.parse_form(leipiEditor.getContent());\n");
      out.write("\t           $(\"#formContent\").val(parse_form);\n");
      out.write("\t        } else {\n");
      out.write("\t    \t   $(\"#formContent\").val('');\n");
      out.write("    \t    }\n");
      out.write("  \t\t\t if(!$(\"#formobj\").form('validate')){\n");
      out.write("\t\t\t\t tip(\"请输入必须字段！\");\n");
      out.write("\t\t\t\t return false;\n");
      out.write("\t\t\t }else{\n");
      out.write("\t\t\t\t return true;\n");
      out.write("\t\t\t }\n");
      out.write("  \t\t},\n");
      out.write("  \t\tsuccess : function(data) {\n");
      out.write("  \t\t\tvar d = $.parseJSON(data);\n");
      out.write("\t\t\t\tif (d.success) {\n");
      out.write("\t\t\t\t\ttip(d.msg);\n");
      out.write("\t\t\t\t}else{\n");
      out.write("\t\t\t\t\ttip(d.msg);\n");
      out.write("\t\t\t\t}\n");
      out.write("  \t\t}\n");
      out.write("\t    });\n");
      out.write(" }\n");
      out.write("  </script>\n");
      out.write("  <style>\n");
      out.write("  \t\t.menu{list-style:none;width:100%}\n");
      out.write("  \t\t.menu li{float:left;}\n");
      out.write("  </style>\n");
      out.write(" </head>\n");
      out.write(" <body>\n");
      out.write("\n");
      out.write(" \t<div id=\"cc\" class=\"easyui-layout\" fit=\"true\">\n");
      out.write("\t  \t<div data-options=\"region:'north',split:false,border:false\" >\n");
      out.write("\t  \t<!--author: xugj-start-date:20160331 for:#1028 【页面优化】按钮优化，参考发邮件  -->\n");
      out.write("\t  \t\t<div class=\"panel-header\" align=\"left\">\n");
      out.write("\t  \t\t\t<a href=\"#\" class=\"easyui-linkbutton l-btn\"  plain=\"true\" iconcls=\"icon-save\" onclick=\"javascript:doSubmit();\">保存</a>\t\t\t\n");
      out.write("\t  \t\t\t<a href=\"#\" class=\"easyui-linkbutton l-btn\"  plain=\"true\" iconcls=\"icon-cancel\" onclick=\"javascript:doExit();\">关闭</a>\n");
      out.write("\t  \t\t</div>\n");
      out.write("\t  \t<!--author: xugj-end-date:20160331 for:#1028 【页面优化】按钮优化，参考发邮件  -->\n");
      out.write("\t  \t</div>   \n");
      out.write("\t  \t<div data-options=\"region:'west',title:'表单数据源',split:true\" style=\"width:200px;\">\n");
      out.write("\t       <div region=\"north\" border=\"false\" style=\"overflow: hidden;\" fit=\"true\">\n");
      out.write("\t\t\t\t<div style=\"width:99.5%;height:300px;overflow-y:auto;\">\n");
      out.write("\t\t\t\t\t<ul class=\"menu\" style=\"width:187px\">\n");
      out.write("\t\t  \t\t\t\t<li style=\"width:15%;\"><a href=\"#\" onclick=\"javascript:doAdd();\"><img src=\"plug-in/easyui/themes/icons/edit_add.png\"/></a></li>\n");
      out.write("\t\t  \t\t\t\t<li style=\"width:15%;\"><a href=\"#\" onclick=\"javascript:doUpdate();\"><img src=\"plug-in/easyui/themes/icons/pencil.png\"/></a></li>\n");
      out.write("\t\t  \t\t\t\t<li style=\"width:15%;\"><a href=\"#\" onclick=\"javascript:doDelete();\"><img src=\"plug-in/easyui/themes/icons/cancel.png\"/></a></li>\n");
      out.write("\t\t  \t\t\t\t<li style=\"width:15%;\"><a href=\"#\" onclick=\"javascript:doReload();\"><img src=\"plug-in/easyui/themes/icons/reload.png\"/></a></li>\n");
      out.write("\t\t  \t\t\t\t<li><a href=\"#\" class=\"easyui-linkbutton c1\" id=\"createCode\">&nbsp;生 成&nbsp; </a></li>\n");
      out.write("\t\t  \t\t\t</ul>\n");
      out.write("\t\t\t       \t<ul id=\"dbSelect\" class=\"ztree\" style=\"margin-top:30px;\"></ul>\n");
      out.write("\t\t\t    </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div region=\"south\" border=\"false\" style=\"overflow: hidden;\">\n");
      out.write("\t\t\t\t<div style=\"width:99.5%;overflow-y:auto;\">\n");
      out.write("\t\t       \t\t<div class=\"panel-header\">\n");
      out.write("\t\t\t       \t\t<div class=\"panel-title\">选择默认模板样式</div>\n");
      out.write("\t\t\t       \t\t<!-- <div class=\"panel-tool\">\n");
      out.write("\t\t\t       \t\t\t<a href=\"javascript:void(0)\" class=\"layout-button-up\"></a>\n");
      out.write("\t\t\t       \t\t</div> -->\n");
      out.write("\t\t       \t\t</div>\n");
      out.write("\t\t       \t    <ul id=\"styleSelect\" class=\"ztree\"></ul>\n");
      out.write("\t\t       </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t  \t</div>  \n");
      out.write("\t    <div data-options=\"region:'center',title:'表单内容'\" style=\"padding:5px;background:#eee;\">\n");
      out.write("\t    \t ");
      if (_jspx_meth_t_005fformvalid_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t    </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write(" </body>\n");
      out.write(" <script>UEDITOR_HOME_URL='");
      out.print(path);
      out.write("\n");
      out.write("\t/plug-in/Formdesign/js/ueditor/';\n");
      out.write("</script>\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\" src=\"plug-in/Formdesign/js/ueditor/ueditor.config.js?2023\"></script>\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\" src=\"plug-in/Formdesign/js/ueditor/ueditor.all.js?2023\"> </script>\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\" src=\"plug-in/Formdesign/js/ueditor/lang/zh-cn/zh-cn.js?2023\"></script>\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\" src=\"plug-in/Formdesign/js/ueditor/formdesign/leipi.formdesign.v4.js?2023\"></script>\n");
      out.write("<!--  <script type=\"text/javascript\" charset=\"utf-8\" src=\"plug-in/Formdesign/js/ueditor/formdesign/weixinplugs.js\"></script>  -->\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("var leipiEditor = UE.getEditor('content',{\n");
      out.write("    //allowDivTransToP: false,//阻止转换div 为p\n");
      out.write("    toolleipi:true,//是否显示，设计器的 toolbars\n");
      out.write("    textarea: 'design_content',   \n");
      out.write("    //这里可以选择自己需要的工具按钮名称,此处仅选择如下五个            /*\n");
      out.write("    toolbars: [[\n");
      out.write("    'fullscreen', 'source', '|', 'undo', 'redo', '|',//'date', 'time',\n");
      out.write("    'fontfamily', 'fontsize', '|', 'indent', '|',\n");
      out.write("    //'bold', 'italic', 'underline', 'fontborder', 'strikethrough', 'superscript', 'subscript', 'removeformat', 'formatmatch', 'autotypeset', 'blockquote', 'pasteplain', '|', 'forecolor', 'backcolor', 'insertorderedlist', 'insertunorderedlist', 'selectall', 'cleardoc', '|',\n");
      out.write("    //'rowspacingtop', 'rowspacingbottom', 'lineheight', '|',\n");
      out.write("    //'customstyle', 'paragraph', 'fontfamily', 'fontsize', '|',\n");
      out.write("    //'directionalityltr', 'directionalityrtl', 'indent', '|',\n");
      out.write("    'justifyleft', 'justifycenter', 'justifyright', 'justifyjustify', '|', //'touppercase', 'tolowercase', '|',\n");
      out.write("    //'link', 'unlink', 'anchor', '|', 'imagenone', 'imageleft', 'imageright', 'imagecenter', '|',\n");
      out.write("    //'simpleupload', 'insertimage', 'emotion', 'scrawl', 'insertvideo', 'music', 'attachment', 'map',  'insertframe', 'insertcode', 'webapp', 'pagebreak', 'template', 'background', '|',\n");
      out.write("    //'horizontal',  'spechars', 'snapscreen', 'wordimage', '|',\n");
      out.write("    'inserttable', 'deletetable', 'insertparagraphbeforetable', 'insertrow', 'deleterow', '|',\n");
      out.write("    //'insertcol', 'deletecol', 'mergecells', 'mergeright', 'mergedown', 'splittocells', 'splittorows', 'splittocols', '|',//'charts', '|',\n");
      out.write("    //'print', 'preview', 'searchreplace', 'help', 'drafts'\n");
      out.write("    ]],\n");
      out.write("    wordCount:false,\n");
      out.write("    elementPathEnabled:false,\n");
      out.write("    initialFrameHeight:400\n");
      out.write("});\n");
      out.write("\n");
      out.write("/* 1.传入函数,命令里执行该函数得到参数表,添加到已有参数表里 */\n");
      out.write("leipiEditor.ready(function() {\n");
      out.write("\tleipiEditor.execCommand('serverparam', 'id', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${autoFormPage.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("');\n");
      out.write("});\n");
      out.write("\n");
      out.write("/**\n");
      out.write(" leipiEditor.ready(function() {\n");
      out.write(" \tconsole.debug(leipiEditor.queryCommandValue('serverparam')); //返回参数值键值对的对象\n");
      out.write(" });\n");
      out.write(" */\n");
      out.write("\n");
      out.write("var leipiFormDesign = {\n");
      out.write("\t   exec : function (method) {\n");
      out.write("\t        leipiEditor.execCommand(method);\n");
      out.write("\t    },\n");
      out.write("\t   parse_form:function(template,fields)\n");
      out.write("\t    {\n");
      out.write("\t\t   //正则  radios|checkboxs|select 匹配的边界 |--|  因为当使用 {} 时js报错 (plugins|fieldname|fieldflow)\n");
      out.write("\t        var preg =  /(\\|-<span(((?!<span).)*plugins=\\\"(radios|checkboxs|select)\\\".*?)>(.*?)<\\/span>-\\||<(img|input|textarea|select).*?(<\\/select>|<\\/textarea>|\\/>))/gi,preg_attr =/(\\w+)=\\\"(.?|.+?)\\\"/gi,preg_group =/<input.*?\\/>/gi;\n");
      out.write("\t        if(!fields) fields = 0;\n");
      out.write("\n");
      out.write("\t        var template_parse = template,template_data = new Array(),add_fields=new Object(),checkboxs=0;\n");
      out.write("\n");
      out.write("\t        var pno = 0;\n");
      out.write("\t        template.replace(preg, function(plugin,p1,p2,p3,p4,p5,p6){\n");
      out.write("\t            var parse_attr = new Array(),attr_arr_all = new Object(),name = '', select_dot = '' , is_new=false;\n");
      out.write("\t            var p0 = plugin;\n");
      out.write("\t            var tag = p6 ? p6 : p4;\n");
      out.write("\t            //alert(tag + \" \\n- t1 - \"+p1 +\" \\n-2- \" +p2+\" \\n-3- \" +p3+\" \\n-4- \" +p4+\" \\n-5- \" +p5+\" \\n-6- \" +p6);\n");
      out.write("\n");
      out.write("\t            if(tag == 'radios' || tag == 'checkboxs')\n");
      out.write("\t            {\n");
      out.write("\t                plugin = p2;\n");
      out.write("\t            }else if(tag == 'select')\n");
      out.write("\t            {\n");
      out.write("\t                plugin = plugin.replace('|-','');\n");
      out.write("\t                plugin = plugin.replace('-|','');\n");
      out.write("\t            }\n");
      out.write("\t            plugin.replace(preg_attr, function(str0,attr,val) {\n");
      out.write("\t                if(attr=='name')\n");
      out.write("\t                {\n");
      out.write("\t                    if(val=='NEWFIELD')\n");
      out.write("\t                    {\n");
      out.write("\t                        is_new=true;\n");
      out.write("\t                        fields++;\n");
      out.write("\t                        val = 'data_'+fields;\n");
      out.write("\t                    }\n");
      out.write("\t                    name = val;\n");
      out.write("\t                }\n");
      out.write("\n");
      out.write("\t                if(tag=='select' && attr=='value')\n");
      out.write("\t                {\n");
      out.write("\t                    if(!attr_arr_all[attr]) attr_arr_all[attr] = '';\n");
      out.write("\t                    attr_arr_all[attr] += select_dot + val;\n");
      out.write("\t                    select_dot = ',';\n");
      out.write("\t                }else\n");
      out.write("\t                {\n");
      out.write("\t                    attr_arr_all[attr] = val;\n");
      out.write("\t                }\n");
      out.write("\t                var oField = new Object();\n");
      out.write("\t                oField[attr] = val;\n");
      out.write("\t                parse_attr.push(oField);\n");
      out.write("\t            })\n");
      out.write("\t            /*alert(JSON.stringify(parse_attr));return;*/\n");
      out.write("\t            if(tag =='checkboxs') /*复选组  多个字段 */\n");
      out.write("\t            {\n");
      out.write("\t                plugin = p0;\n");
      out.write("\t                plugin = plugin.replace('|-','');\n");
      out.write("\t                plugin = plugin.replace('-|','');\n");
      out.write("\t                var name = 'checkboxs_'+checkboxs;\n");
      out.write("\t                attr_arr_all['parse_name'] = name;\n");
      out.write("\t                attr_arr_all['name'] = '';\n");
      out.write("\t                attr_arr_all['value'] = '';\n");
      out.write("\t                attr_arr_all['content'] = '<span leipiplugins=\"checkboxs\"  selector=\"'+attr_arr_all['selector']+'\"   autofield=\"'+attr_arr_all['autofield']+'\" title=\"'+attr_arr_all['title']+'\">';\n");
      out.write("\t                var dot_name ='', dot_value = '';\n");
      out.write("\t                p5.replace(preg_group, function(parse_group) {\n");
      out.write("\t                    var is_new=false,option = new Object();\n");
      out.write("\t                    parse_group.replace(preg_attr, function(str0,k,val) {\n");
      out.write("\t                        if(k=='name')\n");
      out.write("\t                        {\n");
      out.write("\t                        \tif(val=='NEWFIELD')\n");
      out.write("\t                            {\n");
      out.write("\t                                is_new=true;\n");
      out.write("\t                                fields++;\n");
      out.write("\t                                val = 'data_'+fields;\n");
      out.write("\t                            }\n");
      out.write("\n");
      out.write("\t                            attr_arr_all['name'] += dot_name + val;\n");
      out.write("\t                            dot_name = ',';\n");
      out.write("\n");
      out.write("\t                        }\n");
      out.write("\t                        else if(k=='value')\n");
      out.write("\t                        {\n");
      out.write("\t                            attr_arr_all['value'] += dot_value + val;\n");
      out.write("\t                            dot_value = ',';\n");
      out.write("\n");
      out.write("\t                        }\n");
      out.write("\t                        option[k] = val;\n");
      out.write("\t                    });\n");
      out.write("\t                    if(!attr_arr_all['options']) attr_arr_all['options'] = new Array();\n");
      out.write("\t                    attr_arr_all['options'].push(option);\n");
      out.write("\t                    if(!option['checked']) option['checked'] = '';\n");
      out.write("\t                    var checked = option['checked'] ? 'checked=\"checked\"' : '';\n");
      out.write("\t\t\t\t\t\tvar checkedtext=option['checkedtext'] ? option['checkedtext'] :option['value'];\n");
      out.write("\t                    attr_arr_all['content'] +='<input type=\"checkbox\" name=\"'+option['name']+'\" checkedtext=\"'+checkedtext+'\"  selector=\"'+attr_arr_all['selector']+'\"   value=\"'+option['value']+'\" fieldname=\"' + attr_arr_all['fieldname'] + option['fieldname'] + '\" fieldflow=\"' + attr_arr_all['fieldflow'] + '\" '+checked+'/>'+checkedtext+'&nbsp;';\n");
      out.write("\n");
      out.write("\t                    if(is_new)\n");
      out.write("\t                    {\n");
      out.write("\t                        var arr = new Object();\n");
      out.write("\t                        arr['name'] = option['name'];\n");
      out.write("\t                        arr['plugins'] = attr_arr_all['plugins'];\n");
      out.write("\t                        arr['fieldname'] = attr_arr_all['fieldname'] + option['fieldname'];\n");
      out.write("\t                        arr['fieldflow'] = attr_arr_all['fieldflow'];\n");
      out.write("\t                        add_fields[option['name']] = arr;\n");
      out.write("\t                    }\n");
      out.write("\n");
      out.write("\t                });\n");
      out.write("\t                attr_arr_all['content'] += '</span>';\n");
      out.write("\n");
      out.write("\t                //parse\n");
      out.write("\t                template = template.replace(plugin,attr_arr_all['content']);\n");
      out.write("\t                template_parse = template_parse.replace(plugin,'{'+name+'}');\n");
      out.write("\t                template_parse = template_parse.replace('{|-','');\n");
      out.write("\t                template_parse = template_parse.replace('-|}','');\n");
      out.write("\t                template_data[pno] = attr_arr_all;\n");
      out.write("\t                checkboxs++;\n");
      out.write("\n");
      out.write("\t            }else if(name)\n");
      out.write("\t            {\n");
      out.write("\t                if(tag =='radios') /*单选组  一个字段*/\n");
      out.write("\t                {\n");
      out.write("\t                    plugin = p0;\n");
      out.write("\t                    plugin = plugin.replace('|-','');\n");
      out.write("\t                    plugin = plugin.replace('-|','');\n");
      out.write("\t                    attr_arr_all['value'] = '';\n");
      out.write("\t                    attr_arr_all['content'] = '<span leipiplugins=\"radios\" name=\"'+attr_arr_all['name']+'\"  selector=\"'+attr_arr_all['selector']+'\"  autofield=\"'+attr_arr_all['autofield']+'\" title=\"'+attr_arr_all['title']+'\">';\n");
      out.write("\t                    var dot='';\n");
      out.write("\t                    p5.replace(preg_group, function(parse_group) {\n");
      out.write("\t                        var option = new Object();\n");
      out.write("\t                        parse_group.replace(preg_attr, function(str0,k,val) {\n");
      out.write("\t                            if(k=='value')\n");
      out.write("\t                            {\n");
      out.write("\t                                attr_arr_all['value'] += dot + val;\n");
      out.write("\t                                dot = ',';\n");
      out.write("\t                            }\n");
      out.write("\t                            option[k] = val;\n");
      out.write("\t                        });\n");
      out.write("\t                        option['name'] = attr_arr_all['name'];\n");
      out.write("\t                        if(!attr_arr_all['options']) attr_arr_all['options'] = new Array();\n");
      out.write("\t                        attr_arr_all['options'].push(option);\n");
      out.write("\t                        if(!option['checked']) option['checked'] = '';\n");
      out.write("\t                        var checked = option['checked'] ? 'checked=\"checked\"' : '';\n");
      out.write("\t\t\t\t\t\t\tvar checkedtext=option['checkedtext'] ? option['checkedtext'] :option['value'];\n");
      out.write("\t                        attr_arr_all['content'] +='<input type=\"radio\" name=\"'+attr_arr_all['name']+'\" checkedtext=\"'+checkedtext+'\" value=\"'+option['value']+'\"  '+checked+'/>'+checkedtext+'&nbsp;';\n");
      out.write("\n");
      out.write("\t                    });\n");
      out.write("\t                    attr_arr_all['content'] += '</span>';\n");
      out.write("\n");
      out.write("\t                }else\n");
      out.write("\t                {\n");
      out.write("\t                    attr_arr_all['content'] = is_new ? plugin.replace(/NEWFIELD/,name) : plugin;\n");
      out.write("\t                }\n");
      out.write("\t                //attr_arr_all['itemid'] = fields;\n");
      out.write("\t                //attr_arr_all['tag'] = tag;\n");
      out.write("\t                template = template.replace(plugin,attr_arr_all['content']);\n");
      out.write("\t                template_parse = template_parse.replace(plugin,'{'+name+'}');\n");
      out.write("\t                template_parse = template_parse.replace('{|-','');\n");
      out.write("\t                template_parse = template_parse.replace('-|}','');\n");
      out.write("\t                if(is_new)\n");
      out.write("\t                {\n");
      out.write("\t                    var arr = new Object();\n");
      out.write("\t                    arr['name'] = name;\n");
      out.write("\t                    arr['plugins'] = attr_arr_all['plugins'];\n");
      out.write("\t                    arr['title'] = attr_arr_all['title'];\n");
      out.write("\t                    arr['orgtype'] = attr_arr_all['orgtype'];\n");
      out.write("\t                    arr['fieldname'] = attr_arr_all['fieldname'];\n");
      out.write("\t                    arr['fieldflow'] = attr_arr_all['fieldflow'];\n");
      out.write("\t                    add_fields[arr['name']] = arr;\n");
      out.write("\t                }\n");
      out.write("\t                template_data[pno] = attr_arr_all;\n");
      out.write("\n");
      out.write("\n");
      out.write("\t            }\n");
      out.write("\t            pno++;\n");
      out.write("\t        })\n");
      out.write("\t        var view = template.replace(/{\\|-/g,'');\n");
      out.write("\t        view = view.replace(/-\\|}/g,'');\n");
      out.write("\t        var parse_form = new Object({\n");
      out.write("\t            'fields':fields,//总字段数\n");
      out.write("\t            'template':template,//完整html\n");
      out.write("\t            'parse':view,\n");
      out.write("\t            'data':template_data,//控件属性\n");
      out.write("\t            'add_fields':add_fields//新增控件\n");
      out.write("\t        });\n");
      out.write("\t        return JSON.stringify(parse_form);\n");
      out.write("\t    },\n");
      out.write("\t    /*type  =  save 保存设计 versions 保存版本  close关闭 */\n");
      out.write("\t    fnCheckForm : function ( type ) {\n");
      out.write("\t        if(formEditor.queryCommandState( 'source' ))\n");
      out.write("\t            formEditor.execCommand('source');//切换到编辑模式才提交，否则有bug\n");
      out.write("\n");
      out.write("\t        if(formEditor.hasContents()){\n");
      out.write("\t            formEditor.sync();/*同步内容*/\n");
      out.write("\n");
      out.write("\t            //--------------以下仅参考-----------------------------------------------------------------------------------------------------\n");
      out.write("\t            var type_value='',formid=0,fields=$(\"#fields\").val(),formeditor='';\n");
      out.write("\n");
      out.write("\t            if( typeof type!=='undefined' ){\n");
      out.write("\t                type_value = type;\n");
      out.write("\t            }\n");
      out.write("\t            //获取表单设计器里的内容\n");
      out.write("\t            formeditor=formEditor.getContent();\n");
      out.write("\t            //解析表单设计器控件\n");
      out.write("\t            var parse_form = this.parse_form(formeditor,fields);\n");
      out.write("\t            //alert(parse_form);\n");
      out.write("\t            //异步提交数据\n");
      out.write("\t            $.ajax({\n");
      out.write("\t                type: 'POST',\n");
      out.write("\t                url : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/config/form/processor',\n");
      out.write("\t                //dataType : 'json',\n");
      out.write("\t                data : {'type' : type_value,'formid':'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("','parse_form':parse_form},\n");
      out.write("\t                success : function(data){\n");
      out.write("\t\t\t\t\t\tif(data == true) {\n");
      out.write("\t\t\t\t\t\t\talert('表单保存成功');\n");
      out.write("\t\t\t\t\t\t\twindow.location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/config/form';\n");
      out.write("\t\t\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\t\talert('表单保存失败');\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t                }\n");
      out.write("\t            });\n");
      out.write("\n");
      out.write("\t        } else {\n");
      out.write("\t            alert('表单内容不能为空！')\n");
      out.write("\t            $('#submitbtn').button('reset');\n");
      out.write("\t            return false;\n");
      out.write("\t        }\n");
      out.write("\t    } ,\n");
      out.write("\t   // 预览表单\n");
      out.write("\t    fnReview : function (){\n");
      out.write("\t        if(leipiEditor.queryCommandState( 'source' ))\n");
      out.write("\t            leipiEditor.execCommand('source');\n");
      out.write("\t            \n");
      out.write("\t        if(leipiEditor.hasContents()){\n");
      out.write("\t            leipiEditor.sync();       \n");
      out.write("\t         \t\n");
      out.write("\t           var parse_form = this.parse_form(leipiEditor.getContent());\n");
      out.write("\t           $(\"#formContent\").val(parse_form);\n");
      out.write("\t            document.formobj.target=\"mywin\";\n");
      out.write("\t            window.open('','mywin',\"menubar=0,toolbar=0,status=0,resizable=1,left=0,top=0,scrollbars=1,width=\" +(screen.availWidth-10) + \",height=\" + (screen.availHeight-50) + \"\\\"\");\n");
      out.write("\n");
      out.write("\t            document.formobj.action=\"autoFormController.do?review\";\n");
      out.write("\t            document.formobj.submit(); //提交表单\n");
      out.write("\t           \n");
      out.write("\t        } else {\n");
      out.write("\t            alert('表单内容不能为空！');\n");
      out.write("\t            return false;\n");
      out.write("\t        }\n");
      out.write("\t    }\n");
      out.write("\t};\n");
      out.write("\tfunction setContent(){\n");
      out.write("\t    if(leipiEditor.queryCommandState( 'source' ))\n");
      out.write("\t            leipiEditor.execCommand('source');//切换到编辑模式才提交，否则有bug\n");
      out.write("\t            \n");
      out.write("\t    if(leipiEditor.hasContents()){\n");
      out.write("\t        leipiEditor.sync();\n");
      out.write("\t\t    $(\"#formContent\").val(leipiEditor.getContent());\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("</script>\t\t");
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
    // /webpage/jeecg/cgform/autoform/autoForm-update.jsp(7,2) name = type type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fbase_005f0.setType("jquery,easyui,tools");
    int _jspx_eval_t_005fbase_005f0 = _jspx_th_t_005fbase_005f0.doStartTag();
    if (_jspx_th_t_005fbase_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
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
    // /webpage/jeecg/cgform/autoform/autoForm-update.jsp(131,11) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f0.setLangKey("common.add");
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
    // /webpage/jeecg/cgform/autoform/autoForm-update.jsp(134,11) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f1.setLangKey("common.confirm");
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
    // /webpage/jeecg/cgform/autoform/autoForm-update.jsp(154,18) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f2.setLangKey("common.cancel");
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
    // /webpage/jeecg/cgform/autoform/autoForm-update.jsp(172,11) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f3.setLangKey("common.edit");
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
    // /webpage/jeecg/cgform/autoform/autoForm-update.jsp(175,11) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f4.setLangKey("common.confirm");
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
    // /webpage/jeecg/cgform/autoform/autoForm-update.jsp(195,18) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f5.setLangKey("common.cancel");
    int _jspx_eval_t_005fmutiLang_005f5 = _jspx_th_t_005fmutiLang_005f5.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f5);
    return false;
  }

  private boolean _jspx_meth_t_005fformvalid_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:formvalid
    org.jeecgframework.tag.core.easyui.FormValidationTag _jspx_th_t_005fformvalid_005f0 = (org.jeecgframework.tag.core.easyui.FormValidationTag) _005fjspx_005ftagPool_005ft_005fformvalid_0026_005ftiptype_005flayout_005fformid_005fdialog_005fcallback_005fbtnsub_005fbeforeSubmit_005faction.get(org.jeecgframework.tag.core.easyui.FormValidationTag.class);
    _jspx_th_t_005fformvalid_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fformvalid_005f0.setParent(null);
    // /webpage/jeecg/cgform/autoform/autoForm-update.jsp(348,7) name = formid type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setFormid("formobj");
    // /webpage/jeecg/cgform/autoform/autoForm-update.jsp(348,7) name = dialog type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setDialog(false);
    // /webpage/jeecg/cgform/autoform/autoForm-update.jsp(348,7) name = beforeSubmit type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setBeforeSubmit("setContent()");
    // /webpage/jeecg/cgform/autoform/autoForm-update.jsp(348,7) name = btnsub type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setBtnsub("btn");
    // /webpage/jeecg/cgform/autoform/autoForm-update.jsp(348,7) name = callback type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setCallback("test");
    // /webpage/jeecg/cgform/autoform/autoForm-update.jsp(348,7) name = layout type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setLayout("table");
    // /webpage/jeecg/cgform/autoform/autoForm-update.jsp(348,7) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setAction("autoFormController.do?doUpdate");
    // /webpage/jeecg/cgform/autoform/autoForm-update.jsp(348,7) name = tiptype type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setTiptype("1");
    int _jspx_eval_t_005fformvalid_005f0 = _jspx_th_t_005fformvalid_005f0.doStartTag();
    if (_jspx_eval_t_005fformvalid_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t<input id=\"id\" name=\"id\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${autoFormPage.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t\t\t\t<input id=\"createName\" name=\"createName\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${autoFormPage.createName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t\t\t\t<input id=\"createBy\" name=\"createBy\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${autoFormPage.createBy }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t\t\t\t<input id=\"createDate\" name=\"createDate\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${autoFormPage.createDate }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t\t\t\t<input id=\"updateName\" name=\"updateName\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${autoFormPage.updateName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t\t\t\t<input id=\"updateBy\" name=\"updateBy\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${autoFormPage.updateBy }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t\t\t\t<input id=\"updateDate\" name=\"updateDate\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${autoFormPage.updateDate }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t\t\t\t<input id=\"sysOrgCode\" name=\"sysOrgCode\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${autoFormPage.sysOrgCode }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t\t\t\t<input id=\"sysCompanyCode\" name=\"sysCompanyCode\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${autoFormPage.sysCompanyCode }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t\t\t\t<input id=\"formStyleId\" name=\"formStyleId\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${autoFormPage.formStyleId }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t\t\t\t<table style=\"width: 100%;\" cellpadding=\"0\" cellspacing=\"1\" class=\"formtable\">\n");
        out.write("\t\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t\t<td align=\"right\" style=\"width: 8%;\"><label class=\"Validform_label\"> 表单编码: </label></td>\n");
        out.write("\t\t\t\t\t\t<td class=\"value\" style=\"width: 20%;\"><input id=\"formName\" name=\"formName\" type=\"text\" style=\"width: 75%;\" class=\"easyui-validatebox\" required=\"true\" missingMessage=\"表单名称必须填写\" errorMsg=\"不能为中文\" datatype=\"/^[A-Za-z\\d-._]+$/\"  ajaxurl=\"autoFormController.do?checkTbCode&cVal=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${autoFormPage.formName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"  value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${autoFormPage.formName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("'\"> <span class=\"Validform_checktip\"></span> <label class=\"Validform_label\" style=\"display: none;\">表单编码</label></td>\n");
        out.write("\t\t\t\t\t\t<td align=\"right\" style=\"width: 8%;\"><label class=\"Validform_label\"> 表单名: </label></td>\n");
        out.write("\t\t\t\t\t\t<td class=\"value\" style=\"width: 20%;\"><input id=\"formDesc\" name=\"formDesc\" type=\"text\" style=\"width: 75%;\" class=\"easyui-validatebox\" required=\"true\" value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${autoFormPage.formDesc}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("'> <span class=\"Validform_checktip\"></span> <label class=\"Validform_label\" style=\"display: none;\">表单名</label></td>\n");
        out.write("\t\t\t\t\t\t<td align=\"right\" style=\"width: 8%;\"><label class=\"Validform_label\"> 主数据源: </label></td>\n");
        out.write("\t\t\t\t\t\t<td class=\"value\" style=\"width: 20%;\"><select id=\"mainTableSource\" name=\"mainTableSource\" required=\"true\"></select> <span class=\"Validform_checktip\"></span> <label class=\"Validform_label\" style=\"display: none;\">表单名</label></td>\n");
        out.write("\t\t\t\t\t</tr>\n");
        out.write("\t\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t\t<td class=\"value\" colspan=6><input id=\"formContent\" name=\"formContent\" type=\"hidden\"> <script id=\"content\" type=\"text/plain\" style=\"width:99%;\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${autoFormPage.formContent == NULL || autoFormPage.formContent == '' ? '' : autoFormPage.formContent}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</script></td>\n");
        out.write("\t\t\t\t\t</tr>\n");
        out.write("\t\t\t\t</table>\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_t_005fformvalid_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_005fformvalid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fformvalid_0026_005ftiptype_005flayout_005fformid_005fdialog_005fcallback_005fbtnsub_005fbeforeSubmit_005faction.reuse(_jspx_th_t_005fformvalid_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005ftiptype_005flayout_005fformid_005fdialog_005fcallback_005fbtnsub_005fbeforeSubmit_005faction.reuse(_jspx_th_t_005fformvalid_005f0);
    return false;
  }
}
