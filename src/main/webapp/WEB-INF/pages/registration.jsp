<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html dir="ltr" lang="en-US">
    <head>
        <meta charset="utf-8">
        <title>Profil</title>
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
                                        <h3 class="t">Inscription</h3>
                                    </div>
                                    <c:url var="saveUrl" value="/newuser" />
                                    <form:form modelAttribute="user" method="POST" action="${saveUrl}">
                                        <c:if test="${msg == true}">
                                            <div class="error">Verify your information.</div>
                                        </c:if>
                                        <table>
                                            <tr>
                                                <td><form:label path="login">Login:</form:label><span class="requis">*</span></td>
                                                <td><form:input id="login" path="login" name="newlogin" onkeypress="verifierCaracteres(event);return false;"/></td>
                                                <h2><span class="erreur" id="erreurSaisie" style="color: red"></span></h2>
                                            </tr>
                                            <tr>
                                                <td><form:label path="password">password</form:label><span class="requis">*</span></td>
                                                <td><form:input type="password" id="password" path="password" name="newpassword" onkeypress="verifierCaracteres(event); return false;"/></td>
                                                <h2><span class="erreur" id="erreurSaisie" style="color: red"></span></h2>
                                            </tr>
                                            <tr>
                                                <td><form:label path="adresse_mail">mail</form:label><span class="requis">*</span></td>
                                                <td><form:input type="email" path="adresse_mail" name="newadresse_mail"/></td>
                                            </tr>
                                            <tr>
                                                <td><form:input type="hidden" path="banni" name="banni" value="0"/></td>
                                            </tr>
                                        </table>
                                        <input type="submit" value="Save" />
                                    </form:form>
                                    <br />
                                    <input type="button" value="Retour" onclick="history.go(-1)"</input>
                                    <script>
                                        function verifierCaracteres(event) {
                                            var keyCode = event.which ? event.which : event.keyCode;

                                            var touche = String.fromCharCode(keyCode);

                                            var caracteres = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789';

                                            var erreurSaisie = document.getElementById("erreurSaisie");

                                            if (caracteres.indexOf(touche) >= 0) {
                                                erreurSaisie.innerText = "";
                                                champ.value += touche;
                                            } else
                                            {
                                                erreurSaisie.innerText = "Caractère non autorisé";
                                            }
                                        }
                                    </script>
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

