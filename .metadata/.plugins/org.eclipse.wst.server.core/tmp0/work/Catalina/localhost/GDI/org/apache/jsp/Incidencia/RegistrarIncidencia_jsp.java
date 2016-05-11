/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.68
 * Generated at: 2016-05-11 22:34:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Incidencia;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistrarIncidencia_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$('#file-es').fileinput({\n");
      out.write("\t\tlanguage : 'es',\n");
      out.write("\t\tuploadUrl : '#',\n");
      out.write("\t\tallowedFileExtensions : [ 'jpg', 'png', 'gif' ],\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t$(document).ready(function() {\n");
      out.write("\t\t$(\"#input-2\").fileinput({\n");
      out.write("\t        showUpload: false,\n");
      out.write("\t        maxFileCount: 10,\n");
      out.write("\t        mainClass: \"input-group-lg\"\n");
      out.write("\t    });\n");
      out.write("\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://rawgit.com/enyo/dropzone/master/dist/dropzone.css\">\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("\t<h1 class=\"text-center\">Registrar Incidencia</h1>\n");
      out.write("\t<br>\n");
      out.write("\t<div class=\"panel-primary\">\n");
      out.write("\t\t<div class=\"panel-heading\">\n");
      out.write("\t\t\t<i class=\"fa fa-user fa-1x\"></i>&nbsp;Registrar Incidencia\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t<form action=\"\" id=\"formRegistroIncidencia\" enctype=\"multipart/form-data\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-6 col-lg-6\">\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"tipoIncidencia\">Tipo Incidencia</label> <select\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" name=\"incidencia.TipoIncidencia\"\n");
      out.write("\t\t\t\t\t\t\t\tid=\"tipoIncidencia\">\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"1\">Hardware</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"2\">Software</option>\n");
      out.write("\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"descripcion\">Descripción</label>\n");
      out.write("\t\t\t\t\t\t\t<textarea type=\"text\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\t\t\tname=\"usuario.apellido\" id=\"descripcion\" rows=\"8\" cols=\"9\"></textarea>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-6 col-lg-6\">\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"archivo\"><i class=\"fa fa-file-image-o fa-1x\"></i>&nbsp;Agregar\n");
      out.write("\t\t\t\t\t\t\t\tFotografía</label>\n");
      out.write("\t\t\t\t\t\t\t<hr>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<input id=\"input-2\" name=\"input2[]\" type=\"file\" class=\"file\" multiple data-show-upload=\"false\" data-show-caption=\"true\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<br />\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-12 col-sm-offset-0 col-md-2 col-md-offset-5\">\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-danger\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-user fa-1x\"></i>&nbsp;Grabar Incidencia\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>");
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
}
