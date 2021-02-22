<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@page import="Clases.PersonajesFamosos"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html lang="es">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Inicio</title>
  
  <link rel="stylesheet" type="text/css" href="estilos.css">
  <script src="inicialJS.js"></script>

</head>
<body> 
    
    <ul id="menu">
        <li><a href="inicial.jsp">Inicio</a></li>
        <li><a href="listar.jsp">Lista</a></li> 
    </ul>
    
    <br/>
    <br/>
    <br/>
    
    <div id="textInicio">
        <h1>Trabajo realizado: </h1>

        <h2>
            <span class="txt-rotate" data-period="1000" data-rotate='[ "Alejandro González de la Rosa", "Practica JSP", "HLC-P04" ]'></span>
        </h2>
    </div>
        <%
            
            Map<String, PersonajesFamosos> personas = new HashMap<String, PersonajesFamosos>();
            personas.put("Fernando", new PersonajesFamosos("Alonso", new GregorianCalendar(1981, (Calendar.JULY), 29), "Piloto"));
            personas.put("Michael", new PersonajesFamosos("Jordan", new GregorianCalendar(1963, (Calendar.FEBRUARY), 17), "Jugador de baloncesto"));
            personas.put("Nicolas", new PersonajesFamosos("Cage", new GregorianCalendar(1964, (Calendar.JANUARY), 7), "Actor"));
            personas.put("Jason", new PersonajesFamosos("Derulo", new GregorianCalendar(1989, (Calendar.SEPTEMBER), 21), "Cantante"));
            personas.put("Jeff", new PersonajesFamosos("Bezos", new GregorianCalendar(1964, (Calendar.JANUARY), 12), "Empresario"));
            personas.put("Koke", new PersonajesFamosos("Jurado", new GregorianCalendar(2001, (Calendar.DECEMBER), 19), "Rey Mono Carried"));

            // put the hashmap as application attribute
            application.setAttribute("map", personas);
           
        %>
</body>
</html>