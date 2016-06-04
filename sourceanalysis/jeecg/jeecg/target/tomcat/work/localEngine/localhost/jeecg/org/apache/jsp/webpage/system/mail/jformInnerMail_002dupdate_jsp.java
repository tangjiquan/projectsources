package org.apache.jsp.webpage.system.mail;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import org.jeecgframework.core.util.SysThemesUtil;
import org.jeecgframework.core.enums.SysThemesEnum;

public final class jformInnerMail_002dupdate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005ftiptype_005flayout_005fformid_005fdialog_005fcallback_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fchoose_0026_005fwidth_005furl_005ftitle_005ftextname_005fname_005fisclear_005fisInit_005ficon_005fhiddenid_005fhiddenName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fupload_0026_005fuploader_005fonUploadSuccess_005fname_005fid_005fformId_005fextend_005fbuttonText_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005ftiptype_005flayout_005fformid_005fdialog_005fcallback_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fchoose_0026_005fwidth_005furl_005ftitle_005ftextname_005fname_005fisclear_005fisInit_005ficon_005fhiddenid_005fhiddenName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fupload_0026_005fuploader_005fonUploadSuccess_005fname_005fid_005fformId_005fextend_005fbuttonText_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005ftiptype_005flayout_005fformid_005fdialog_005fcallback_005faction.release();
    _005fjspx_005ftagPool_005ft_005fchoose_0026_005fwidth_005furl_005ftitle_005ftextname_005fname_005fisclear_005fisInit_005ficon_005fhiddenid_005fhiddenName_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005ft_005fupload_0026_005fuploader_005fonUploadSuccess_005fname_005fid_005fformId_005fextend_005fbuttonText_005fnobody.release();
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
      out.write(' ');
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

SysThemesEnum sysTheme = SysThemesUtil.getSysTheme(request);
String style = sysTheme.getStyle();

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write(" <head>\n");
      out.write("  <title>内部邮件</title>\n");
      out.write("  ");
      if (_jspx_meth_t_005fbase_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("  <script type=\"text/javascript\" src=\"plug-in/ckeditor_new/ckeditor.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"plug-in/ckfinder/ckfinder.js\"></script>\n");
      out.write("  <script>UEDITOR_HOME_URL='");
      out.print(path);
      out.write("/plug-in/Formdesign/js/ueditor/';</script>\n");
      out.write("  <script type=\"text/javascript\" charset=\"utf-8\" src=\"plug-in/Formdesign/js/ueditor/ueditor.config.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" charset=\"utf-8\" src=\"plug-in/Formdesign/js/ueditor/ueditor.all.js\"> </script>\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("  $(function() {  \n");
      out.write("\t  if('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jformInnerMailPage.status }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("'=='01'){\n");
      out.write("\t\t // alertTip(\"本邮件已经发送,请刷新草稿箱\",\"提示\");\n");
      out.write("\t\t  $.dialog({\n");
      out.write("\t\t\t\ttitle:\"提示\",\n");
      out.write("\t\t\t\ticon:'tips.gif',\n");
      out.write("\t\t\t\tlock:true,\n");
      out.write("\t\t\t\tcontent: \"本邮件已经发送,请刷新草稿箱\",\n");
      out.write("\t\t\t\tok: function(){\n");
      out.write("\t\t\t\t\twindow.top.$('#maintabs').tabs('close',\"写信\");\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}).zindex();\n");
      out.write("\t\t \n");
      out.write("\n");
      out.write("\t\t  /*$.dialog.confirm('本邮件已经发送不可再次编辑,查看邮件?',\n");
      out.write("\t\t\t\t\tfunction(r) {\n");
      out.write("\t            \t\tcreatedetailwindow(\"写信\",\"jformInnerMailController.do?goDetail&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jformInnerMailPage.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\") ;\n");
      out.write("\t\t\t\t\t\twindow.top.$('#maintabs').tabs('close',\"写信\");},\n");
      out.write("\t\t\t  \t\tfunction(r){\n");
      out.write("\t\t\t\t\t\twindow.top.$('#maintabs').tabs('close',\"写信\");\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t);*/\n");
      out.write("\t  }\n");
      out.write("\t  init();\n");
      out.write("   }); \n");
      out.write("  //页面初始化\n");
      out.write("  function init(){\n");
      out.write("  \t$(\"#realName\").val('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jformInnerMailPage.receiverNames}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("')\n");
      out.write("  \t$(\"#pageReceiverIds\").val('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jformInnerMailPage.receiverIds}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("')\n");
      out.write("  \t\n");
      out.write("  \teditor.addListener(\"ready\",function(){\n");
      out.write("  \t\teditor.setContent('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jformInnerMailPage.content}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("', false);\n");
      out.write("  \t\t});//防止在按钮按下的时候，编辑器还没初始化\n");
      out.write("  }\n");
      out.write("  //编写自定义JS代码\n");
      out.write("  //初始化：\n");
      out.write("  //receiverName pageReceiverIds\n");
      out.write("   //编写自定义JS代码\n");
      out.write("   function setContent(){\n");
      out.write("\t    $(\"#receiverIds\").val($(\"#pageReceiverIds\").val());\n");
      out.write("\t    if(editor.queryCommandState( 'source' ))\n");
      out.write("\t    \teditor.execCommand('source');//切换到编辑模式才提交，否则有bug\n");
      out.write("\t            \n");
      out.write("\t    if(editor.hasContents()){\n");
      out.write("\t    \teditor.sync();\n");
      out.write("\t\t    $(\"#content\").val(editor.getContent());\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("   //发送\n");
      out.write("    function save(status){\n");
      out.write("    \t$(\"#status\").val(status);\n");
      out.write("    \tsetContent();\n");
      out.write("    \t//当状态是发送时，要验证   收件人不可为空、主题不可为空\n");
      out.write("    \tif(status=='01'){\n");
      out.write("    \t\tif(!$(\"#receiverIds\").val()){\n");
      out.write("    \t\t\ttip(\"收件人不可为空\");\n");
      out.write("    \t\t\treturn ;\n");
      out.write("    \t\t}\n");
      out.write("    \t\tif(!$(\"#title\").val()){\n");
      out.write("    \t\t\ttip(\"主题不可为空\");\n");
      out.write("    \t\t\treturn ;\n");
      out.write("    \t\t}\n");
      out.write("    \t}\n");
      out.write("    \t\n");
      out.write("    \t$('#btn_sub').click();\n");
      out.write("    \t/*\n");
      out.write("    \t$.ajax({\n");
      out.write("\t\t\turl : 'jformInnerMailController.do?doSave',\n");
      out.write("\t\t\ttype : 'post',\n");
      out.write("\t\t\tdata:{\n");
      out.write("\t\t\t\tid:$(\"#id\").val(),\n");
      out.write("\t\t\t\treceiverIds:$(\"#receiverIds\").val(),\n");
      out.write("\t\t\t\treceiverNames:$(\"#realName\").val(),\n");
      out.write("\t\t\t\tattachment:$(\"#attachment\").val(),\n");
      out.write("\t\t\t\tcreateName:$(\"#createName\").val(),\n");
      out.write("\t\t\t\ttitle:$(\"#title\").val(),\n");
      out.write("\t\t\t\tcontent:$(\"#content\").val(),\n");
      out.write("\t\t\t\tstatus:status\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tcache : false,\n");
      out.write("\t\t\tsuccess : function(data) {\n");
      out.write("\t\t\t\tvar d = $.parseJSON(data);\n");
      out.write("\t\t\t\ttip(d.msg)\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});*/\n");
      out.write("    }\n");
      out.write("   \n");
      out.write("\tfunction uploadFile(data){\n");
      out.write("  \t\t$(\"#mailId\").val(data.obj.id);\n");
      out.write("  \t\tif($(\".uploadify-queue-item\").length>0){\n");
      out.write("  \t\t\tupload();\n");
      out.write("  \t\t}\n");
      out.write("  \t\telse{\n");
      out.write("  \t\t\tonUploadSuccess();\n");
      out.write("  \t\t}\n");
      out.write("  \t}\n");
      out.write("\tfunction onUploadSuccess(data){\n");
      out.write("\t\t$.dialog.confirm('再写一封?',\n");
      out.write("\t\t\t\tfunction(r) {\n");
      out.write("\t\t  \t\t\tself.location=\"jformInnerMailController.do?goAddOrUpdate\";},\n");
      out.write("\t\t  \t\tfunction(r){\n");
      out.write("\t\t  \t\t\tvar style=\"");
      out.print(style);
      out.write("\";\t\n");
      out.write("\t\t  \t\t\tif(style==\"ace\"||style==\"acele\"){\n");
      out.write("\t\t  \t\t\t\ttry{\n");
      out.write("\t\t  \t\t\t\t\twindow.top.closeTab(\"tab_");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${clickFunctionId }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\");\n");
      out.write("\t\t  \t\t\t\t}catch(e){\n");
      out.write("\t\t  \t\t\t\t}\n");
      out.write("\t\t  \t\t\t}else{\n");
      out.write("\t\t  \t\t\t\ttry{\n");
      out.write("\t\t  \t\t\t\t\twindow.top.$('#maintabs').tabs('close',\"写信\");\n");
      out.write("\t\t  \t\t\t\t}catch(e){\n");
      out.write("\t\t  \t\t\t\t}\n");
      out.write("\t\t  \t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t);\n");
      out.write("\t}\n");
      out.write("  </script>\n");
      out.write(" </head>\n");
      out.write(" <body>\n");
      out.write("  ");
      if (_jspx_meth_t_005fformvalid_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t<form id=\"uploadForm\">\n");
      out.write("\t\t  <input id=\"mailId\" name=\"mailId\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jformInnerMailPage.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\n");
      out.write("\t\t</form>\n");
      out.write(" </body>\n");
      out.write(" <script type=\"text/javascript\">\n");
      out.write("\t$.dialog.setting.zIndex =1990;\n");
      out.write("\tfunction del(url,obj){\n");
      out.write("\t\t$.dialog.confirm(\"确认删除该条记录?\", function(){\n");
      out.write("\t\t  \t$.ajax({\n");
      out.write("\t\t\t\tasync : false,\n");
      out.write("\t\t\t\tcache : false,\n");
      out.write("\t\t\t\ttype : 'POST',\n");
      out.write("\t\t\t\turl : url,// 请求的action路径\n");
      out.write("\t\t\t\terror : function() {// 请求失败处理函数\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\tsuccess : function(data) {\n");
      out.write("\t\t\t\t\tvar d = $.parseJSON(data);\n");
      out.write("\t\t\t\t\tif (d.success) {\n");
      out.write("\t\t\t\t\t\tvar msg = d.msg;\n");
      out.write("\t\t\t\t\t\ttip(msg);\n");
      out.write("\t\t\t\t\t\t$(obj).closest(\"td\").hide(\"slow\");\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});  \n");
      out.write("\t\t}, function(){\n");
      out.write("\t\t});\n");
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
    // /webpage/system/mail/jformInnerMail-update.jsp(12,2) name = type type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    org.jeecgframework.tag.core.easyui.FormValidationTag _jspx_th_t_005fformvalid_005f0 = (org.jeecgframework.tag.core.easyui.FormValidationTag) _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005ftiptype_005flayout_005fformid_005fdialog_005fcallback_005faction.get(org.jeecgframework.tag.core.easyui.FormValidationTag.class);
    _jspx_th_t_005fformvalid_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fformvalid_005f0.setParent(null);
    // /webpage/system/mail/jformInnerMail-update.jsp(138,2) name = formid type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setFormid("formobj");
    // /webpage/system/mail/jformInnerMail-update.jsp(138,2) name = dialog type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setDialog(true);
    // /webpage/system/mail/jformInnerMail-update.jsp(138,2) name = usePlugin type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setUsePlugin("password");
    // /webpage/system/mail/jformInnerMail-update.jsp(138,2) name = layout type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setLayout("table");
    // /webpage/system/mail/jformInnerMail-update.jsp(138,2) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setAction("jformInnerMailController.do?doSave");
    // /webpage/system/mail/jformInnerMail-update.jsp(138,2) name = callback type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setCallback("@Override uploadFile");
    // /webpage/system/mail/jformInnerMail-update.jsp(138,2) name = tiptype type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setTiptype("1");
    int _jspx_eval_t_005fformvalid_005f0 = _jspx_th_t_005fformvalid_005f0.doStartTag();
    if (_jspx_eval_t_005fformvalid_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t<input id=\"id\" name=\"id\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jformInnerMailPage.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t\t\t\t\t<input id=\"createName\" name=\"createName\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jformInnerMailPage.createName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t\t\t\t\t<input id=\"createBy\" name=\"createBy\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jformInnerMailPage.createBy }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t\t\t\t\t<input id=\"createDate\" name=\"createDate\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jformInnerMailPage.createDate }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t\t\t\t\t<input id=\"status\" name=\"status\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jformInnerMailPage.status }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t\t\t\t\t<input id=\"receiverIds\" name=\"receiverIds\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jformInnerMailPage.receiverIds }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t\t<table style=\"width: 100%;\" cellpadding=\"0\" cellspacing=\"1\" class=\"formtable\">\n");
        out.write("\t\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t\t<td height=\"50px\" align=\"left\" colspan=\"2\">\n");
        out.write("\t\t\t\t\t\t\t<a style=\"margin-left:80px\" href=\"#\" class=\"easyui-linkbutton l-btn\"  plain=\"true\" iconcls=\"icon-save\" onclick=\"save('00')\" id=\"\">存草稿</a>\n");
        out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"easyui-linkbutton l-btn\"  plain=\"true\" iconcls=\"icon-redo\" onclick=\"save('01')\" id=\"\">发送</a>\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t</tr>\n");
        out.write("\t\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t\t<td align=\"right\" width=\"80px\">\n");
        out.write("\t\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t\t收件人:\n");
        out.write("\t\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t\t\t\t <input name=\"pageReceiverIds\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" id=\"pageReceiverIds\">\n");
        out.write("\t\t\t\t\t\t     \t <input name=\"receiverNames\" class=\"inputxt\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${realName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" id=\"realName\" readonly=\"readonly\" datatype=\"*\" />\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_t_005fchoose_005f0(_jspx_th_t_005fformvalid_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\n");
        out.write("\t\t\t\t\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t\t\t\t\t<label class=\"Validform_label\" style=\"display: none;\">收件人列表</label>\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t</tr>\n");
        out.write("\t\t\t\t\n");
        out.write("\t\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t\t主题:\n");
        out.write("\t\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t\t     \t <input id=\"title\" name=\"title\" type=\"text\" style=\"width: 150px\" class=\"inputxt\"  value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jformInnerMailPage.title}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("'>\n");
        out.write("\t\t\t\t\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t\t\t\t\t<label class=\"Validform_label\" style=\"display: none;\">主题</label>\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t</tr>\n");
        out.write("\t\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t\t\t\t<label class=\"Validform_label\"> 附件\n");
        out.write("\t\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\t<td>\n");
        out.write("\t\t\t\t\t\t\t<table>\n");
        out.write("\t\t\t\t\t\t\t    <tr style=\"height: 34px;\">\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fforEach_005f0(_jspx_th_t_005fformvalid_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t</tr>\n");
        out.write("\t\t\t\t\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t\t\t\t \t<td colspan=\"3\">\n");
        out.write("\t\t\t\t\t\t\t\t \t<div class=\"form\" id=\"filediv\"></div>\n");
        out.write("\t\t\t\t\t\t\t\t\t<div class=\"form jeecgDetail\">\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_t_005fupload_005f0(_jspx_th_t_005fformvalid_005f0, _jspx_page_context))
          return true;
        out.write("</div></td></tr>\n");
        out.write("\t\t\t\t\t        </table>\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t</tr>\n");
        out.write("\t\t\t\t\t\n");
        out.write("\t\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t\t内容:\n");
        out.write("\t\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t    \t\t <input id=\"content\" name=\"content\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jformInnerMailPage.content }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" type=\"hidden\">\n");
        out.write("\t\t\t\t\t\t\t  \t <script id=\"mailcontent\" type=\"text/plain\" style=\"width:100%;\" ></script>\n");
        out.write("\t\t\t\t\t\t\t  \t <script type=\"text/javascript\">\n");
        out.write("\t\t\t\t\t\t\t        \tvar editor = UE.getEditor('mailcontent',{\n");
        out.write("\t\t\t\t\t\t\t        \t    toolleipi:true,//是否显示，设计器的 toolbars\n");
        out.write("\t\t\t\t\t\t\t        \t    textarea: 'design_content',   \n");
        out.write("\t\t\t\t\t\t\t        \t    //这里可以选择自己需要的工具按钮名称,此处仅选择如下五个/*\n");
        out.write("\t\t\t\t\t\t\t        \t    wordCount:false,\n");
        out.write("\t\t\t\t\t\t\t        \t    elementPathEnabled:false,\n");
        out.write("\t\t\t\t\t\t\t        \t    initialFrameHeight:300\n");
        out.write("\t\t\t\t\t\t\t        \t});\n");
        out.write("\t\t\t\t\t\t\t\t </script>\n");
        out.write("\t\t\t\t\t\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t\t\t\t\t\t<label class=\"Validform_label\" style=\"display: none;\">邮件内容</label>\n");
        out.write("\t\t\t\t\t    </td>\n");
        out.write("\t\t\t\t\t</tr>\n");
        out.write("\t\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t\t<td height=\"50px\" align=\"left\" colspan=\"2\">\n");
        out.write("\t\t\t\t\t\t\t<a style=\"margin-left:80px\" href=\"#\" class=\"easyui-linkbutton l-btn\"  plain=\"true\" iconcls=\"icon-save\" onclick=\"save('00')\" id=\"\">存草稿</a>\n");
        out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"easyui-linkbutton l-btn\"  plain=\"true\" iconcls=\"icon-redo\" onclick=\"save('01')\" id=\"\">发送</a>\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t</tr>\n");
        out.write("\t\t\t</table>\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_t_005fformvalid_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_005fformvalid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005ftiptype_005flayout_005fformid_005fdialog_005fcallback_005faction.reuse(_jspx_th_t_005fformvalid_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005ftiptype_005flayout_005fformid_005fdialog_005fcallback_005faction.reuse(_jspx_th_t_005fformvalid_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fchoose_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fformvalid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:choose
    org.jeecgframework.tag.core.easyui.ChooseTag _jspx_th_t_005fchoose_005f0 = (org.jeecgframework.tag.core.easyui.ChooseTag) _005fjspx_005ftagPool_005ft_005fchoose_0026_005fwidth_005furl_005ftitle_005ftextname_005fname_005fisclear_005fisInit_005ficon_005fhiddenid_005fhiddenName_005fnobody.get(org.jeecgframework.tag.core.easyui.ChooseTag.class);
    _jspx_th_t_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fformvalid_005f0);
    // /webpage/system/mail/jformInnerMail-update.jsp(161,7) name = hiddenName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fchoose_005f0.setHiddenName("pageReceiverIds");
    // /webpage/system/mail/jformInnerMail-update.jsp(161,7) name = hiddenid type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fchoose_005f0.setHiddenid("id");
    // /webpage/system/mail/jformInnerMail-update.jsp(161,7) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fchoose_005f0.setUrl("jformInnerMailController.do?receivers");
    // /webpage/system/mail/jformInnerMail-update.jsp(161,7) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fchoose_005f0.setName("userList");
    // /webpage/system/mail/jformInnerMail-update.jsp(161,7) name = icon type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fchoose_005f0.setIcon("icon-search");
    // /webpage/system/mail/jformInnerMail-update.jsp(161,7) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fchoose_005f0.setTitle("选择收件人");
    // /webpage/system/mail/jformInnerMail-update.jsp(161,7) name = textname type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fchoose_005f0.setTextname("realName");
    // /webpage/system/mail/jformInnerMail-update.jsp(161,7) name = isclear type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fchoose_005f0.setIsclear(new Boolean(true));
    // /webpage/system/mail/jformInnerMail-update.jsp(161,7) name = isInit type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fchoose_005f0.setIsInit(new Boolean(true));
    // /webpage/system/mail/jformInnerMail-update.jsp(161,7) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fchoose_005f0.setWidth("800px");
    int _jspx_eval_t_005fchoose_005f0 = _jspx_th_t_005fchoose_005f0.doStartTag();
    if (_jspx_th_t_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fchoose_0026_005fwidth_005furl_005ftitle_005ftextname_005fname_005fisclear_005fisInit_005ficon_005fhiddenid_005fhiddenName_005fnobody.reuse(_jspx_th_t_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fchoose_0026_005fwidth_005furl_005ftitle_005ftextname_005fname_005fisclear_005fisInit_005ficon_005fhiddenid_005fhiddenName_005fnobody.reuse(_jspx_th_t_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fformvalid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fformvalid_005f0);
    // /webpage/system/mail/jformInnerMail-update.jsp(189,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/webpage/system/mail/jformInnerMail-update.jsp(189,8) '${documents}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${documents}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /webpage/system/mail/jformInnerMail-update.jsp(189,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("vdocument");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<td><a href=\"commonController.do?viewFile&fileid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vdocument.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("&subclassname=org.jeecgframework.web.system.pojo.base.JformInnerMailAttach\" title=\"下载\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vdocument.attachmenttitle}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('.');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vdocument.extend}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a>(<a href=\"javascript:void(0)\" class=\"jeecgDetail\" onclick=\"del('jformInnerMailController.do?delFile&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vdocument.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("',this)\">删除</a>)</td>\n");
          out.write("\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_t_005fupload_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fformvalid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:upload
    org.jeecgframework.tag.core.easyui.UploadTag _jspx_th_t_005fupload_005f0 = (org.jeecgframework.tag.core.easyui.UploadTag) _005fjspx_005ftagPool_005ft_005fupload_0026_005fuploader_005fonUploadSuccess_005fname_005fid_005fformId_005fextend_005fbuttonText_005fnobody.get(org.jeecgframework.tag.core.easyui.UploadTag.class);
    _jspx_th_t_005fupload_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fupload_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fformvalid_005f0);
    // /webpage/system/mail/jformInnerMail-update.jsp(197,9) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fupload_005f0.setName("fiels");
    // /webpage/system/mail/jformInnerMail-update.jsp(197,9) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fupload_005f0.setId("file_upload");
    // /webpage/system/mail/jformInnerMail-update.jsp(197,9) name = extend type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fupload_005f0.setExtend("*.doc;*.docx;*.txt;*.ppt;*.xls;*.xlsx;*.html;*.htm;*.pdf;");
    // /webpage/system/mail/jformInnerMail-update.jsp(197,9) name = buttonText type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fupload_005f0.setButtonText("添加文件");
    // /webpage/system/mail/jformInnerMail-update.jsp(197,9) name = formId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fupload_005f0.setFormId("uploadForm");
    // /webpage/system/mail/jformInnerMail-update.jsp(197,9) name = onUploadSuccess type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fupload_005f0.setOnUploadSuccess("onUploadSuccess");
    // /webpage/system/mail/jformInnerMail-update.jsp(197,9) name = uploader type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fupload_005f0.setUploader("jformInnerMailController.do?saveFile");
    int _jspx_eval_t_005fupload_005f0 = _jspx_th_t_005fupload_005f0.doStartTag();
    if (_jspx_th_t_005fupload_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fupload_0026_005fuploader_005fonUploadSuccess_005fname_005fid_005fformId_005fextend_005fbuttonText_005fnobody.reuse(_jspx_th_t_005fupload_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fupload_0026_005fuploader_005fonUploadSuccess_005fname_005fid_005fformId_005fextend_005fbuttonText_005fnobody.reuse(_jspx_th_t_005fupload_005f0);
    return false;
  }
}
