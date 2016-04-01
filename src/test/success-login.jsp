<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Welcome page</title>
</head>
<body>
<h1>Welcome page</h1>
<c:choose>
<c:when test="${edit}">
<p>You have update it successfully.</p><br />
</c:when>
<c:otherwise>
<p>You have successfully logged in.</p><br />
</c:otherwise>
</c:choose>
<a href="${pageContext.request.contextPath}/testacceuil.html">Moderation Page</a><br/></p>
</body>
</html>