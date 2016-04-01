<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html dir="ltr" lang="en-US">
    <head>
        <meta charset="utf-8">
        <title>Admin - Users</title>
        <meta name="viewport" content="initial-scale = 1.0, maximum-scale = 1.0, user-scalable = no, width = device-width">

        <link rel="stylesheet" href="/resource/style/style.css" media="screen">
        <link rel="stylesheet" href="/resource/style/style.responsive.css" media="all">

        <script src="/resource/style/jquery.js"></script>
        <script src="/resource/style/script.js"></script>
        <script src="/resource/style/script.responsive.js"></script>
    </head>
    <body>
        <div id="main">
            <header class="header">
                <div class="shapes">
                </div> 
            </header>
            <div class="sheet clearfix">
                <div class="layout-wrapper">
                    <div class="content-layout">
                        <div class="content-layout-row">
                            <div class="layout-cell content">
                                <article class="post article">
                                    <div class="postmetadataheader">
                                        <a href="${pageContext.request.contextPath}/admin.html">Admin page</a><br/><br/>
                                        <table style="border: 1px solid; width: 100%; text-align:center">
                                            <thead style = "background:#d3dce3">
                                                <tr>
                                                    <th>id_user</th>
                                                    <th>Login</th>
                                                    <th>Password</th>
                                                    <th>Adresse mail</th>
                                                    <th>Banni</th>
                                                </tr>
                                            </thead>
                                            <tbody style="background:#ccc">
                                                <c:forEach items="${listuser}" var="liste">
                                                    <tr>
                                                        <td><c:out value="${liste.id}"/></td>
                                                        <td><c:out value="${liste.login }"/></td>
                                                        <td><c:out value="${liste.password }"/></td>
                                                        <td><c:out value="${liste.adresse_mail}" /></td>
                                                        <td><c:out value="${liste.banni}"/></td>
                                                        <%--<c:choose> --%>
                                                        <%--<c:when test="${banni}"> --%>
                                                        <%-- <td><a href = "/bannir-${liste.id}">Bannir</a></td> --%>
                                                        <%-- </c:when> --%>
                                                        <%-- <c:otherwise> --%>
                                                        <%-- <td><a href = "/bannir-${liste.id}">Revalider</a></td> --%>
                                                        <%-- </c:otherwise> --%>
                                                        <%-- </c:choose> --%>
                                                        <td><a href = "/bannir-${liste.id}">Bannir</a></td>
                                                        <td><a href = "/revalider-${liste.id}">Revalider</a></td>
                                                    </tr>
                                                </c:forEach>
                                            </tbody>
                                        </table>
                                    </div>
                                </article>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
    </body>
    <footer class="footer">
        <div class="footer-inner">
            <p class="page-footer">
                <span id="footnote-links">Developpé par : Diamantino - Gaël - Iandry - Kévin.</span>
            </p>
        </div>
    </footer>
</div>
</body>
</html>

