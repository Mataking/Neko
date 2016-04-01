<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html dir="ltr" lang="en-US">
    <head>
        <meta charset="utf-8">
        <title>Login</title>
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
                                <div class="block clearfix">
                                    <div class="blockheader">
                                        <h3 class="t">Connexion</h3>
                                    </div>
                                    <div class="blockcontent">
                                        <form method="post" action="<c:url value='j_spring_security_check'/>" >
                                            <fieldset class="input" style="border: 0 none;">
                                                <p>
                                                    <c:if test="${error == true}">
                                                        <div class="error">Invalid login or password.</div>
                                                    </c:if>
                                                </p>
                                                <table>
                                                    <tbody>
                                                        <tr>
                                                            <c:choose>
                                                                <c:when test="${log}">
                                                                    <td>Login:</td>
                                                                    <td><input type="text" name="j_username" id="j_username"size="30" maxlength="40" value = "${userLog1}"/></td>
                                                                    </c:when>
                                                                    <c:otherwise>
                                                                    <td>Login:</td>
                                                                    <td><input type="text" name="j_username" id="j_username"size="30" maxlength="40" /></td>
                                                                </c:otherwise>
                                                            </c:choose>
                                                        </tr>
                                                        <tr>
                                                            <c:choose>
                                                                <c:when test="${log}">
                                                                    <td>Password:</td>
                                                                    <td><input type="password" name="j_password" id="j_password" size="30" maxlength="32" value = "${userLog2}"/></td>
                                                                </c:when>
                                                                <c:otherwise>
                                                                    <td>Password:</td>
                                                                    <td><input type="password" name="j_password" id="j_password" size="30" maxlength="32" /></td>
                                                                </c:otherwise>
                                                            </c:choose>
                                                        </tr>
                                                        <tr>
                                                            <c:choose>
                                                                <c:when test="${log}">
                                                                    <td></td>
                                                                    <td><input type="submit" value="confirmer" /></td>
                                                                </c:when>
                                                                <c:otherwise>
                                                                    <td></td>
                                                                    <td><input type="submit" value="Login" /></td>
                                                                </c:otherwise>
                                                            </c:choose>
                                                        </tr>
                                                    </tbody>
                                                </table>
                                            </fieldset>
                                        </form>	
                                        <ul>
                                            <li>
                                                <a href="${pageContext.request.contextPath}/newuser">Créer un compte ?</a>
                                            </li>
                                        </ul>
                                        </form>
                                    </div>
                                </div>
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
