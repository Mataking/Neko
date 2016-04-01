<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html dir="ltr" lang="en-US">
    <head>
        <meta charset="utf-8">
        <title>Admin - Chats</title>
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
                                                    <th colspan="1"></th>
                                                    <th>id_chat</th>
                                                    <th>Nom</th>
                                                    <th>Nom Japonais</th>
                                                    <th>Description</th>
                                                    <th>Personnalite</th>
                                                    <th>Niveau</th>
                                                    <th>Rare</th>
                                                </tr>
                                            </thead>
                                            <tbody style="background:#ccc">
                                                <c:forEach items="${listechat}" var="liste">
                                                    <c:url var="ImgUrl" value="/resource/img/${liste.nom}.png" />
                                                    <tr>
                                                        <td><a href="${ImgUrl}"><img src="${ImgUrl}"></img></a></td>
                                                        <td><c:out value="${liste.idChat}"/></td>
                                                        <td><c:out value="${liste.nom }"/></td>
                                                        <td><c:out value="${liste.nomJaponais }"/></td>
                                                        <td><c:out value="${liste.description }"/></td>
                                                        <td><c:out value="${liste.personnalite }"/></td>
                                                        <td><c:out value="${liste.niveau }"/></td>
                                                        <td><c:out value="${liste.rare}"/></td>
                                                        <td><c:out value="${liste.validation}"/></td>
                                                        <td><a href = "/validerchat-${liste.idChat}">Valider</a></td>
                                                        <td><a href = "#">Supprimer</a></td>
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