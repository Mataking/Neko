<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html dir="ltr" lang="en-US">
    <head>
        <meta charset="utf-8">
        <title>Admin - Accueil</title>
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
                                        <ul>
                                            <li><a href="${pageContext.request.contextPath}/index.html">Accueil page</a></li>
                                            <li><a href="admin-chats.html">Listes chats</a></li>
                                            <li><a href="admin-astuces.html">Listes astuces</a></li>
                                            <li><a href="admin-users.html">Listes users</a></li>
                                            <li><a href="<c:url value="/j_spring_security_logout" />" >Logout</a></li>
                                        </ul>
                                    </div>
                                </article>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
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
