<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Users List</title>
    </head>

    <body>


        <form action="liste" method="post">
            Rechercher : <input type="text" name="searchText" /><br/>

            <input type="submit" value="Search"/>
        </form>



        <table style="border: 1px solid; width: 100%; text-align:center">
            <thead style = "background:#d3dce3">
                <tr>
                    <th>id_chat</th>
                    <th>Nom</th>
                    <th>Nom Japonais</th>
                    <th>Description</th>
                    <th colspan="1"></th>
                    <th>Personnalite</th>
                    <th>Niveau</th>
                    <th>Rare</th>
                </tr>
            </thead>
            <tbody style="background:#ccc">
                <c:choose>
                    <c:when test="${find}">
                        <c:url var="ImgUrl" value="/resource/img/${listechat.nom}.png" />
                        <tr>
                            <td><a href="${ImgUrl}"><img src="${ImgUrl}"></img></a></td>
                            <td><c:out value="${listechat.idChat}"/></td>
                            <td><c:out value="${listechat.nom }"/></td>
                            <td><c:out value="${listechat.nomJaponais }"/></td>
                            <td><c:out value="${listechat.description }"/></td>
                            <td><c:out value="${listechat.personnalite }"/></td>
                            <td><c:out value="${listechat.niveau }"/></td>
                            <td><c:out value="${listechat.rare}"/></td>
                            <td><a href="/astuce.html">Astuce</a></td>
                        </tr>
                    </c:when>
                    <c:otherwise>
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
                                <td><a href="/astuce.html">Astuce</a></td>
                            </tr>
                        </c:forEach>
                    </c:otherwise>
                </c:choose>
            </tbody>
        </table>

        <a href="${pageContext.request.contextPath}/moderation.html">Moderation page</a><br/>
        <c:choose>
            <c:when test="${find}">
                <a href="<c:url value="/liste.html" />">Voir liste chat</a>
            </c:when>
        </c:choose>

    </body>

</html>