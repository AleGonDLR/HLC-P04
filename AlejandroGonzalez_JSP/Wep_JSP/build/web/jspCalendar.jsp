<%--
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
--%>


<HTML>
<%@page language="java" import="java.util.*" %>
<H1>Bienvenido a JSPCalendar</H1>

<P>Hoy es</P>
<jsp:useBean id="clock" class="Clases.JspCalendar" />

<UL>
<LI>D?a: <%= clock.getDayOfMonth() %>
<LI>Mes: <%= clock.getMonthInt() %>
<LI>A?o: <%= clock.getYear() %>
</UL>
<%-- Check for AM or PM --%>
<%! int time = Calendar.getInstance().get(Calendar.AM_PM); %>
<%
if (time == Calendar.AM) {
%>
Buenos d?as
<%
}
else {
%>
Buenas tardes
<%
}
%>
<%--
<%@ include file="copyright.html" %>
--%>
</HTML> 
