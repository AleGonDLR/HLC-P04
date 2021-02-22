<%@page contentType="text/html"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado</title>
        
        <link rel="stylesheet" type="text/css" href="estilos.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    </head>
    <body>
        <ul id="menu">
            <li><a href="inicial.jsp">Inicio</a></li>
            <li><a href="listar.jsp">Lista</a></li>
        </ul>
        
        <br/>
        <br/>
        
        <table id="tablaLista">
            
            <c:forEach var="entry" items="${applicationScope.map}">         
                  <tr>
                    <td>
                        <article>
                             <a href="detalles.jsp?dato1=${entry.key}&dato2=${entry.value.getApellido()}&dato3=${entry.value.getFechaNacimientoString()}&dato4=${entry.value.getProfesion()}&dato5=${entry.value.getDiaFecha()}&dato6=${entry.value.getMesFecha()}&dato7=${entry.value.getAñoFecha()}">
                                <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRrz8OeDwo2-a701isH0hm17vnMYXuQmE21WQ&usqp=CAU" width="200" height="200"/>
                             </a>
                             <p>Nombre: <c:out value="${entry.key}"/> <c:out value="${entry.value.getApellido()}"/> </p>
                             <p>Fecha de nacimiento: <c:out value="${entry.value.getFechaNacimientoString()}"/> </p>
                             <p>Profesión: <c:out value="${entry.value.getProfesion()}"/> </p>
                         </article>  
                     </td>
                  </tr>       
            </c:forEach>
            
        </table>
    </body>
</html>
