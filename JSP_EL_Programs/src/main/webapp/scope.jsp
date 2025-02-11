<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Scope.jsp</title>
</head>
<body>
  <%
  pageContext.setAttribute("platform1","JavaSE",PageContext.PAGE_SCOPE);
  pageContext.setAttribute("platform2","JavaEE",PageContext.REQUEST_SCOPE);
  pageContext.setAttribute("platform3","JavaME",PageContext.SESSION_SCOPE);
  pageContext.setAttribute("platform4","JavaFX",PageContext.APPLICATION_SCOPE);
  %>
  ${pageScope.platform1}<br>
  ${requestScope.platform2}<br>
  ${sessionScope.platform3}<br>
  ${applicationScope.platform4}<br>
</body>
</html>