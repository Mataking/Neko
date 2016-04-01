<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html dir="ltr" lang="en-US"><head>
        <meta charset="utf-8">
        <title>Liste des chats</title>
        <meta name="viewport" content="initial-scale = 1.0, maximum-scale = 1.0, user-scalable = no, width = device-width">

        <!--[if lt IE 9]><script src="https://html5shiv.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
        <link rel="stylesheet" href="/resource/style/style.css" media="screen">
        <!--[if lte IE 7]><link rel="stylesheet" href="style.ie7.css" media="screen" /><![endif]-->
        <link rel="stylesheet" href="/resource/style/style.responsive.css" media="all">


        <script src="/resource/style/jquery.js"></script>
        <script src="/resource/style/script.js"></script>
        <script src="/resource/style/script.responsive.js"></script>



    </head>
    <body>
        <div id="art-main">
            <header class="art-header">


                <div class="art-shapes">

                </div>






            </header>
            <nav class="art-nav">
                <ul class="art-hmenu"><li><a href="accueil.html">Accueil</a></li>
                    <li><a href="chats.html" class="active">Chats</a><ul><li><a href="rare.html">Rares</a></li>
                            <li><a href="communs.html">Communs</a></li></ul></li>
                    <li><a href="astuces.html">Astuces</a></li>
                    <li><a href="nouveauchat.html" >Soumettre un nouveau chat</a></li>  
                    <li><a href="${pageContext.request.contextPath}/edituser-${pageContext.request.userPrincipal.name}">Edit compte : ${pageContext.request.userPrincipal.name}</a></li>


                    <li><a href="<c:url value="/j_spring_security_logout" />" >Logout</a></li>
            </nav>
            <div class="art-sheet clearfix">
                <div class="art-layout-wrapper">
                    <div class="art-content-layout">
                        <div class="art-content-layout-row">
                            <div class="art-layout-cell art-content"><article class="art-post art-article">
                                    <div class="art-postmetadataheader">

                                        <h2 class="art-postheader">Liste des chats</h2>

                                        <h1>THANKS FOR YOUR HELP TO ADD A NEW CAT. THE ADMINISTRATOR WILL VALIDATE IT.</h1> 



                                    </div>
                                    <div class="art-postcontent art-postcontent-0 clearfix"><p><br></p></div>


                                </article></div>

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