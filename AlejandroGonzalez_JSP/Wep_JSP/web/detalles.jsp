<%@page contentType="text/html"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Clases.PersonajesFamosos"%>

<html>
    <jsp:useBean id="calculo" class="Clases.CalculosConFecha" />
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detalles</title>
        <link rel="stylesheet" type="text/css" href="estilos.css">
    </head>
    <body>
        
        <ul id="menu">
            <li><a href="inicial.jsp">Inicio</a></li>
            <li><a href="listar.jsp">Lista</a></li>
        </ul>
        
   
        <%
            String nombre = request.getParameter("dato1");
            String apellido = request.getParameter("dato2");
            String fechaEntera = request.getParameter("dato3");
            String profesion = request.getParameter("dato4");
            String dia = request.getParameter("dato5");
            String mes = request.getParameter("dato6");
            String anio = request.getParameter("dato7");
        %>
        <br/>
        <br/>
        <table id="tablaDetalles">
            <tr id="tituloDetalles">
                <th colspan="2"><h1>Detalles</h1></th>
            </tr>
            <tr>
                <td><p>Nombre</p></td>
                <td id="derechaTD"><p> <%=nombre%> </p></td>
            </tr>
            <tr>
                <td><p>Apellido</p></td>
                <td id="derechaTD"><p> <%=apellido%> </p></td>
            </tr>
            <tr>
                <td><p>Edad</p></td>
                <td id="derechaTD"><p> <%=calculo.CalcularEdad(dia, mes, anio)%> </p></td>
            </tr>
            <tr>
                <td><p>Fecha de nacimiento</p></td>
                <td id="derechaTD"><p> <%=fechaEntera%> </p></td>
            </tr>
            <tr>
                <td><p>Profesion</p></td>
                <td id="derechaTD"><p> <%=profesion%> </p></td>
            </tr>
            <tr>
                <td><p>Signo del Zodiaco</p></td>
                <td id="derechaTD"><p> <%=calculo.CalcularSigno(dia, mes)%></p></td>
            </tr>
        </table>
    </body>
</html>