package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cad.ProductoCad;
import cad.CategoriaCad;
import JavaBeans.*;
import java.util.ArrayList;
import cad.MarcaCad;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 ArrayList<Categoria> lista= CategoriaCad.listar(); 
                                                    
                                                    int codigo = 0;
                                                    
                                                    
 ArrayList<Producto> datos;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(6);
    _jspx_dependants.add("/WEB-INF/css.jsp");
    _jspx_dependants.add("/WEB-INF/header.jsp");
    _jspx_dependants.add("/WEB-INF/slider.jsp");
    _jspx_dependants.add("/WEB-INF/confianza.jsp");
    _jspx_dependants.add("/WEB-INF/lista.jsp");
    _jspx_dependants.add("/WEB-INF/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <title>Inicio |  Crea e-Commerce JAVA EE con pagos Online Paypal y Payu</title>\n");
      out.write("    ");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/animate.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/main.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/responsive.css\" rel=\"stylesheet\">\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("    <script src=\"js/html5shiv.js\"></script>\n");
      out.write("    <script src=\"js/respond.min.js\"></script>\n");
      out.write("    <![endif]-->       \n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/icono.png\">\n");
      out.write("    <link rel=\"icon\" href=\"images/icono.png\" type=\"image/x-icon\">\n");
      out.write("            \n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"images/ico/apple-touch-icon-144-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"images/ico/apple-touch-icon-114-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"images/ico/apple-touch-icon-72-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" href=\"images/ico/apple-touch-icon-57-precomposed.png\">");
      out.write("  \n");
      out.write("</head><!--/head-->\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    ");
      out.write("<header id=\"header\"><!--header-->\n");
      out.write("\t\t<div class=\"header_top\"><!--header_top-->\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t\t\t\t\t<div class=\"contactinfo\">\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-pills\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-phone\"></i> +2 95 01 88 821</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-envelope\"></i> info@e-shopper.com</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t\t\t\t\t<div class=\"social-icons pull-right\">\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-dribbble\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div><!--/header_top-->\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"header-middle\"><!--header-middle-->\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t<div class=\"logo pull-left\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"index.html\"><img src=\"images/home/logo.png\" alt=\"\" /></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"btn-group pull-right\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"btn-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default dropdown-toggle usa\" data-toggle=\"dropdown\">\n");
      out.write("                                                                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.nom_moneda}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write('(');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.moneda}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(")\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"caret\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"CambiarMoneda?moneda=MXN\">Pesos Mexicanos (MXN)</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"CambiarMoneda?moneda=COP\">Pesos Colombianos (COP)</a></li>\n");
      out.write("                                                                        \n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"CambiarMoneda?moneda=USD\">Dolar(USA) (USD)</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"CambiarMoneda?moneda=PEN\">Sol Peruano (PEN)</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-8\">\n");
      out.write("\t\t\t\t\t\t<div class=\"shop-menu pull-right\">\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-user\"></i> Mi cuenta</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Cart\"><i class=\"fa fa-shopping-cart\"></i> Ver carrito</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Checkout\"><i class=\"fa fa-crosshairs\"></i> Finalizar compra</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-lock\"></i> Acceder</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div><!--/header-middle-->\n");
      out.write("\t\n");
      out.write("\t\t<div class=\"header-bottom\"><!--header-bottom-->\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-9\">\n");
      out.write("\t\t\t\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"sr-only\">Navegación</span>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                            \n");
      out.write("\t\t\t\t\t\t<div class=\"mainmenu pull-left\">\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav navbar-nav collapse navbar-collapse\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Home\" class=\"active\">Inicio</a></li>\n");
      out.write("                                                                <li><a href=\"#\">Todos los Productos</a></li>\n");
      out.write("                                                                <li><a href=\"#\">Ropa para Niños</a></li> \n");
      out.write("                                                                <li><a href=\"#\">Blog</a></li>\n");
      out.write("                                                                <li class=\"dropdown\"><a href=\"#\">Mi Compra<i class=\"fa fa-angle-down\"></i></a>\n");
      out.write("                                                                    <ul role=\"menu\" class=\"sub-menu\">\n");
      out.write("                                                                        <li><a href=\"#\">Finalizar compra</a></li> \n");
      out.write("                                                                        <li><a href=\"#\">Ver carrito</a></li> \n");
      out.write("                                                                        <li><a href=\"#\">Iniciar sesión</a></li> \n");
      out.write("                                                                    </ul>\n");
      out.write("                                                                </li>\n");
      out.write("                                                                <li><a href=\"#\">Contacto</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                            \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                    <div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t<div class=\"search_box pull-right\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Buscar...\"/>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("            \t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div><!--/header-bottom-->\n");
      out.write("\t</header><!--/header-->");
      out.write("\n");
      out.write("    \n");
      out.write("    ");
      out.write("<section id=\"slider\"><!--slider-->\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-sm-12\">\n");
      out.write("\t\t\t\t\t<div id=\"slider-carousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("\t\t\t\t\t\t<ol class=\"carousel-indicators\">\n");
      out.write("\t\t\t\t\t\t\t<li data-target=\"#slider-carousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("\t\t\t\t\t\t\t<li data-target=\"#slider-carousel\" data-slide-to=\"1\"></li>\n");
      out.write("\t\t\t\t\t\t\t<li data-target=\"#slider-carousel\" data-slide-to=\"2\"></li>\n");
      out.write("\t\t\t\t\t\t</ol>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-inner\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"item active\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h1><span>E</span>-SHOPPER</h1>\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>Crea e-Commerce JAVA EE, JSP con pagos Online Paypal y Payu</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Aprende a crear una tienda virtual con carrito de compras y pagos en línea con JSP, JAVA EE, AJAX, JavaScript y MySQL. </p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default get\">Comprar ahora</button>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/home/girl1.jpg\" class=\"girl img-responsive\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/home/pricing.png\"  class=\"pricing\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"item\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h1><span>E</span>-SHOPPER</h1>\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>10% de descuento en ropa para niños</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Visita nuestras sucursales y accede a los descuentos especiales en ropa para niños y niñas antes que se termine el stock. </p>\n");
      out.write("                                                                        <a href=\"shop.html\" class=\"btn btn-default get\">Ver todos los productos</a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/home/girl2.jpg\" class=\"girl img-responsive\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/home/pricing.png\"  class=\"pricing\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"item\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h1><span>E</span>-SHOPPER</h1>\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>Paga Online sin moverte de casa</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Aprovecha las ofertas, los precios bajos de compras y paga en línea desde el e-Commerce JEE. </p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default get\">Ver catálogo</button>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/home/girl3.jpg\" class=\"girl img-responsive\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/home/pricing.png\" class=\"pricing\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<a href=\"#slider-carousel\" class=\"left control-carousel hidden-xs\" data-slide=\"prev\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-angle-left\"></i>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#slider-carousel\" class=\"right control-carousel hidden-xs\" data-slide=\"next\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-angle-right\"></i>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section><!--/slider-->");
      out.write("\n");
      out.write("    \n");
      out.write("    ");
      out.write("  \n");
      out.write("        <hr/><!--confianza-->\n");
      out.write("\t<p align=\"center\">                                     \n");
      out.write("            <img alt=\"Elementos de Confianza\" src=\"images/home/confianza.png\">\n");
      out.write("            <img alt=\"Elementos de Confianza\" src=\"images/home/confianza2.png\">\n");
      out.write("            <img alt=\"Elementos de Confianza\" src=\"images/home/confianza3.png\">\n");
      out.write("            <img alt=\"Elementos de Confianza\" src=\"images/home/confianza4.png\">\n");
      out.write("        </p><!--/confianza-->\n");
      out.write("        <hr/>");
      out.write("\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("      \n");
      out.write("\t\n");
      out.write("        <section>\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("<div class=\"left-sidebar\">\n");
      out.write("\t\t\t\t\t\t<h2>Categorías</h2>\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-group category-products\" id=\"accordian\"><!--category-productsr-->\n");
      out.write("                                                    ");
      out.write("\t\n");
      out.write("                                                    ");
 for(int i=0;i<lista.size();i++){ 
                                                    
                                                    codigo= lista.get(i).getCodigo();
                                                    
                                                    
      out.write("\n");
      out.write("\n");
      out.write("                                                    <div class=\"panel panel-default\">\n");
      out.write("                                                        \n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"panel-heading\"> \n");
      out.write("\t\t\t\t\t\t\t\t\t<h4 class=\"panel-title\">\n");
      out.write("                                                                            <a ");
 if (CategoriaCad.esSuperior(codigo)){ 
      out.write(" data-toggle=\"collapse\" data-parent=\"#accordian\" ");
 } 
      out.write("href=\"#");
      out.print( codigo );
      out.write("\">\n");
      out.write("                                                                                ");
 if (CategoriaCad.esSuperior(codigo)){ 
      out.write("<span class=\"badge pull-right\"><i class=\"fa fa-plus\"></i></span>");
 } 
      out.write("\n");
      out.write("                                                                                        <a href=\"?category=");
      out.print(codigo);
      out.write('"');
      out.write('>');
      out.print( lista.get(i).getNombre() );
      out.write("</a>\n");
      out.write("                                                                            </a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                                \n");
      out.write("                                                                                \n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"");
      out.print( codigo );
      out.write("\" class=\"panel-collapse collapse\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("                                                                            <ul>\n");
      out.write("                                                                            ");
 ArrayList<Categoria> listaSub= CategoriaCad.listarSubCategorias(codigo); 
      out.write("\n");
      out.write("                                                                             ");
 for(int isub=0;listaSub.size() > isub;isub++){ 
                                                    
                                                                                codigo= listaSub .get(isub).getCodigo();
                                                   
                                                                             
      out.write("\n");
      out.write("                                                                            \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                                                                    <li><a href=\"?category=");
      out.print(codigo);
      out.write('"');
      out.write('>');
      out.print( listaSub.get(isub).getNombre() );
      out.write(" </a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                                                             ");
 } 
      out.write("\n");
      out.write("                                                                             </ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                                    ");
 } 
      out.write("\n");
      out.write("                                                 \n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div><!--/category-products-->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"brands_products\"><!--brands_products-->\n");
      out.write("\t\t\t\t\t\t\t<h2>Marcas</h2>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"brands-name\">\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("                                                                    ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setVar("m");
      _jspx_th_c_forEach_0.setItems( MarcaCad.listarTodoDeMarca() );
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                                                                        ");
            if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("\n");
            out.write("                                                                        ");
 int cod=Integer.parseInt(pageContext.getAttribute("cod").toString()); 
            out.write("\n");
            out.write("                                                                        <li><a href=\"?marca=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${m.codigo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"> <span class=\"pull-right\">(");
            out.print( MarcaCad.contarMarca(cod) );
            out.write(")</span>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${m.nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</a></li>\n");
            out.write("                                                                     ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("   \n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div><!--/brands_products-->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"shipping text-center\"><!--shipping-->\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/home/shipping.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t</div><!--/shipping-->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"col-sm-9 padding-right\">\n");
      out.write("\t\t\t\t\t<div class=\"features_items\"><!--features_items-->\n");
      out.write("\t\t\t\t\t\t<h2 class=\"title text-center\">Productos destacados</h2>\n");
      out.write("                                               ");
      out.write(" \n");
      out.write("                                               ");

                                               if(Integer.parseInt(session.getAttribute("category").toString()) > 0)
                                               {
                                                   datos=ProductoCad.listarProductoPorCategoria(session.getAttribute("moneda").toString(), Integer.parseInt(session.getAttribute("category").toString()));
                                               }else if(Integer.parseInt(session.getAttribute("marca").toString()) > 0)
                                               {
                                                   datos=ProductoCad.listarProductoPorMarca(session.getAttribute("moneda").toString(), Integer.parseInt(session.getAttribute("marca").toString()));
                                               }else
                                               {
                                                   datos=ProductoCad.listarProductoRecomendados(session.getAttribute("moneda").toString());
                                               }
                                               
      out.write("\n");
      out.write("                                                ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_1.setParent(null);
      _jspx_th_c_forEach_1.setVar("p");
      _jspx_th_c_forEach_1.setItems( datos );
      int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
        if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                                                <div class=\"col-sm-4\">\n");
            out.write("\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
            out.write("\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
            out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"foto/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" alt=\"\" />\n");
            out.write("                                                                                        <h2 ");
            if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
              return;
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.moneda}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write(' ');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.precio}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</h2>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t<p>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</p>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"btn btn-default add-to-cart ");
            if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
              return;
            out.write("\"><i class=\"fa fa-shopping-cart\"></i>Agregar al carrito</span>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"product-overlay ");
            if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
              return;
            out.write("\">\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"overlay-content\">\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.moneda}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write(' ');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.precio}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</h2>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</p>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"Cart?id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.webid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("&action=order\" class=\"btn btn-default add-to-cart ");
            if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
              return;
            out.write("\"><i class=\"fa fa-shopping-cart\"></i>Agregar al carrito</a>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
            out.write("                                                                ");
            if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
              return;
            out.write("\n");
            out.write("                                                                </div>\n");
            out.write("\t\t\t\t\t\t\t\t<div class=\"choose\">\n");
            out.write("\t\t\t\t\t\t\t\t\t<ul class=\"nav nav-pills nav-justified\">\n");
            out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"\"><i class=\"fa fa-star\"></i><i class=\"fa fa-star\"></i><i class=\"fa fa-star\"></i><i class=\"fa fa-star\"></i></a></li>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\" ");
            if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
              return;
            out.write(">\n");
            out.write("                                                                                    ");
            if (_jspx_meth_c_choose_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
              return;
            out.write("\n");
            out.write("                                                                                </a> </li>\n");
            out.write("                                                                                    \n");
            out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
            out.write("\t\t\t\t\t\t\t\t</div>\n");
            out.write("\t\t\t\t\t\t\t</div>\n");
            out.write("\t\t\t\t\t\t</div>\n");
            out.write("                                                    ");
            int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_1.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
      }
      out.write("\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div><!--features_items-->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"category-tab\"><!--category-tab-->\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-12\">\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-tabs\">\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"active\"><a href=\"#tshirt\" data-toggle=\"tab\">Camisetas</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#blazers\" data-toggle=\"tab\">Chaquetas</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#sunglass\" data-toggle=\"tab\">Lentes de sol</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#kids\" data-toggle=\"tab\">Niños</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#poloshirt\" data-toggle=\"tab\">Polo</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"tab-content\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tab-pane fade active in\" id=\"tshirt\" >\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery1.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Agregar al carrito</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery2.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Agregar al carrito</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery3.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Agregar al carrito</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery4.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Agregar al carrito</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tab-pane fade\" id=\"blazers\" >\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery4.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Agregar al carrito</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery3.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Agregar al carrito</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery2.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Agregar al carrito</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery1.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Agregar al carrito</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tab-pane fade\" id=\"sunglass\" >\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery3.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Agregar al carrito</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery4.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Agregar al carrito</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery1.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Agregar al carrito</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery2.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Agregar al carrito</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tab-pane fade\" id=\"kids\" >\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery1.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Agregar al carrito</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery2.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Agregar al carrito</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery3.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Agregar al carrito</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery4.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Agregar al carrito</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tab-pane fade\" id=\"poloshirt\" >\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery2.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Agregar al carrito</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery4.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Agregar al carrito</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery3.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Agregar al carrito</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/gallery1.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Agregar al carrito</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div><!--/category-tab-->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"recommended_items\"><!--recommended_items-->\n");
      out.write("\t\t\t\t\t\t<h2 class=\"title text-center\">Artículos recomendados</h2>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div id=\"recommended-item-carousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"carousel-inner\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"item active\">\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/recommend1.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Agregar al carrito</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/recommend2.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Agregar al carrito</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/recommend3.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Agregar al carrito</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"item\">\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/recommend1.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Agregar al carrito</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/recommend2.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Agregar al carrito</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/recommend3.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h2>$56</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<p>Easy Polo Black Edition</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Agregar al carrito</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t <a class=\"left recommended-item-control\" href=\"#recommended-item-carousel\" data-slide=\"prev\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-angle-left\"></i>\n");
      out.write("\t\t\t\t\t\t\t  </a>\n");
      out.write("\t\t\t\t\t\t\t  <a class=\"right recommended-item-control\" href=\"#recommended-item-carousel\" data-slide=\"next\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-angle-right\"></i>\n");
      out.write("\t\t\t\t\t\t\t  </a>\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div><!--/recommended_items-->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t\n");
      out.write("        ");
      out.write("<footer id=\"footer\"><!--Footer-->\n");
      out.write("\t\t<div class=\"footer-top\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-2\">\n");
      out.write("\t\t\t\t\t\t<div class=\"companyinfo\">\n");
      out.write("\t\t\t\t\t\t\t<h2><span>e</span>-shopper</h2>\n");
      out.write("\t\t\t\t\t\t\t<p>Aprende a crear una tienda virtual con carrito de compras y pagos en línea con JSP, JAVA EE, AJAX, JavaScript y MySQL.</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-7\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"video-gallery text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"iframe-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/iframe1.png\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"overlay-icon\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-play-circle-o\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Marcas caseras</p>\n");
      out.write("\t\t\t\t\t\t\t\t<h2>24 DIC 2019</h2>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"video-gallery text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"iframe-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/iframe2.png\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"overlay-icon\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-play-circle-o\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Mujeres elegantes</p>\n");
      out.write("\t\t\t\t\t\t\t\t<h2>24 DIC 2019</h2>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"video-gallery text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"iframe-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/iframe3.png\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"overlay-icon\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-play-circle-o\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Ropa ejecutiva</p>\n");
      out.write("\t\t\t\t\t\t\t\t<h2>24 DIC 2018</h2>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"video-gallery text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"iframe-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"images/home/iframe4.png\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"overlay-icon\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-play-circle-o\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Promociones</p>\n");
      out.write("\t\t\t\t\t\t\t\t<h2>24 MAR 2018</h2>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t<div class=\"address\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/home/map.png\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t<p>Con un e-Commerce nuestra ubicación es el mundo.</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"footer-widget\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-2\">\n");
      out.write("\t\t\t\t\t\t<div class=\"single-widget\">\n");
      out.write("\t\t\t\t\t\t\t<h2>Servicios</h2>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Ayuda en línea</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Contacto</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Estado de mi orden</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">FAQ?s</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-2\">\n");
      out.write("\t\t\t\t\t\t<div class=\"single-widget\">\n");
      out.write("\t\t\t\t\t\t\t<h2>Compra rápida</h2>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Camisetas</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Hombre</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Mujeres</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Tarjetas de Regalo</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Calzado</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-2\">\n");
      out.write("\t\t\t\t\t\t<div class=\"single-widget\">\n");
      out.write("\t\t\t\t\t\t\t<h2>Politicas</h2>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Condiciones de uso</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Política de privacidad</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Política de reembolso</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Sistema de facturación</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Sistema de tickets</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-2\">\n");
      out.write("\t\t\t\t\t\t<div class=\"single-widget\">\n");
      out.write("\t\t\t\t\t\t\t<h2>E-SHOPPER</h2>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Información de la empresa</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Trayectoria</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Ubicación de la tienda</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Programa de Afiliación</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3 col-sm-offset-1\">\n");
      out.write("\t\t\t\t\t\t<div class=\"single-widget\">\n");
      out.write("\t\t\t\t\t\t\t<h2>Suscripción</h2>\n");
      out.write("\t\t\t\t\t\t\t<form action=\"#\" class=\"searchform\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Ingrese su correo\" />\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-default\"><i class=\"fa fa-arrow-circle-o-right\"></i></button>\n");
      out.write("\t\t\t \t\t\t\t\t<p>Obtenga las actualizaciones más recientes de nuestro sitio y productos en promoción.</p>\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"footer-bottom\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<p class=\"pull-left\">Copyright © 2019 . Todos los derechos reservados.</p>\n");
      out.write("\t\t\t\t\t<p class=\"pull-right\">Curso diseñado por <span><a target=\"_blank\" href=\"https://www.udemy.com/user/christian-gamez-2\">Christian Camilo Gámez</a></span></p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t</footer><!--/Footer-->\n");
      out.write("\t\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.scrollUp.min.js\"></script>\n");
      out.write("\t\n");
      out.write("    <script src=\"js/jquery.prettyPhoto.js\"></script>\n");
      out.write("    <script src=\"js/main.js\"></script>");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_0.setVar("cod");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${m.codigo}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.stock == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" class=\"gris\"");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.stock == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.stock == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" grisfondo");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.stock == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" disabled");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.nuevo}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                    <img src=\"images/home/new.png\" class=\"new\" alt=\"producto nuevo\">\n");
        out.write("                                                                ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.stock == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" class=\"gris\"");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_choose_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                                        ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\n");
        out.write("                                                                                            ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\n");
        out.write("                                                                                        ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.stock>0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                                            <i class=\"fa fa-check-circle\"></i>(");
        if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write(") Disponible\n");
        out.write("                                                                                        ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.stock}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                                                <i class=\"fa fa-lock\"></i>(");
        if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_0, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write(") Agotado\n");
        out.write("                                                                                            ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.stock}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }
}
