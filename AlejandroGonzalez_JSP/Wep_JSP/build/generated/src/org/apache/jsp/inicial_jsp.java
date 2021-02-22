package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.GregorianCalendar;
import java.util.Calendar;
import Clases.PersonajesFamosos;
import java.util.HashMap;
import java.util.Map;

public final class inicial_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("<head>\r\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("  <title>Inicio</title>\r\n");
      out.write("  \r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"estilos.css\">\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Raleway:200,100,400\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("   <script src=\"inicialJS.js\"></script>\r\n");
      out.write("  \r\n");
      out.write("</head>\r\n");
      out.write("<body> \r\n");
      out.write("    \r\n");
      out.write("    <ul id=\"menu\">\r\n");
      out.write("        <li><a href=\"inicial.jsp\">Inicio</a></li>\r\n");
      out.write("        <li><a href=\"listar.jsp\">Lista</a></li> \r\n");
      out.write("    </ul>\r\n");
      out.write("    \r\n");
      out.write("    <br/>\r\n");
      out.write("    <br/>\r\n");
      out.write("    <br/>\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"textInicio\">\r\n");
      out.write("        <h1>Trabajo realizado: </h1>\r\n");
      out.write("\r\n");
      out.write("        <h2>\r\n");
      out.write("            <span class=\"txt-rotate\" data-period=\"1000\" data-rotate='[ \"Alejandro González de la Rosa\", \"Practica JSP\", \"HLC-P04\" ]'></span>\r\n");
      out.write("        </h2>\r\n");
      out.write("    </div>\r\n");
      out.write("        ");

            
            Map<String, PersonajesFamosos> personas = new HashMap<String, PersonajesFamosos>();
            personas.put("Fernando", new PersonajesFamosos("Alonso", new GregorianCalendar(1981, (Calendar.JULY), 29), "Piloto"));
            personas.put("Michael", new PersonajesFamosos("Jordan", new GregorianCalendar(1963, (Calendar.FEBRUARY), 17), "Jugador de baloncesto"));
            personas.put("Nicolas", new PersonajesFamosos("Cage", new GregorianCalendar(1964, (Calendar.JANUARY), 7), "Actor"));
            personas.put("Jason", new PersonajesFamosos("Derulo", new GregorianCalendar(1989, (Calendar.SEPTEMBER), 21), "Cantante"));
            personas.put("Jeff", new PersonajesFamosos("Bezos", new GregorianCalendar(1964, (Calendar.JANUARY), 12), "Empresario"));

            // put the hashmap as application attribute
            application.setAttribute("map", personas);
           
        
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
}
