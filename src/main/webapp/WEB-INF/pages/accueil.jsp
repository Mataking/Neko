<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html dir="ltr" lang="en-US">
    <head>
        <meta charset="utf-8">
        <title>NekoAtsume</title>
        <meta name="viewport" content="initial-scale = 1.0, maximum-scale = 1.0, user-scalable = no, width = device-width">

        <link rel="stylesheet" href="/resource/style/style.css" media="screen">
        <link rel="stylesheet" href="/resource/style/style.responsive.css" media="all">

        <script src="/resource/style/jquery.js"></script>
        <script src="/resource/style/script.js"></script>
        <script src="/resource/style/script.responsive.js"></script>


        <style>.content .postcontent-0 .layout-item-0 { padding-right: 10px;padding-left: 10px;  }
            .ie7 .post .layout-cell {border:none !important; padding:0 !important; }
            .ie6 .post .layout-cell {border:none !important; padding:0 !important; }

        </style>
    </head>
    <body>
        <div id="main">
            <header class="header">
                <div class="shapes">
                </div>
            </header>
            <nav class="nav">
                <ul class="hmenu">
                    <li><a href="accueil.html" class="active">Accueil</a></li>
                    <li><a href="chats.html">Chats</a>
                        <ul>
                            <li><a href="rare.html">Rares</a></li>
                            <li><a href="communs.html">Communs</a></li>
                        </ul>
                    </li>
                    <li><a href="astuces.html">Astuces</a></li>  
                    <li><a href="${pageContext.request.contextPath}/edituser-${pageContext.request.userPrincipal.name}">Edit compte : ${pageContext.request.userPrincipal.name}</a></li>
                    <li><a href="<c:url value="/j_spring_security_logout" />" >Logout</a></li>
                </ul>
            </nav>
            <div class="sheet clearfix">
                <div class="layout-wrapper">
                    <div class="content-layout">
                        <div class="content-layout-row">
                            <div class="layout-cell content"><article class="post article">
                                    <div class="postmetadataheader">
                                        <h2 class="postheader">About NekoAtsume</h2>
                                    </div>
                                    <div class="postcontent postcontent-0 clearfix"><div class="content-layout">
                                            <div class="content-layout-row">
                                                <div class="layout-cell layout-item-0" style="width: 100%" >
                                                    <p style="margin-top: 0.4em; margin-bottom: 0.5em; color: rgb(58, 58, 58); font-family: Helvetica, Arial, sans-serif; 
                                                       font-size: 16px; line-height: 26px; widows: 1; text-align: center;">                                                    
                                                        <img width="500" height="333" alt="" class="lightbox" src="/resource/img/IMG_3874.0.0-2.jpg">
                                                    </p>
                                                    <p style="margin-top: 0.4em; margin-bottom: 0.5em; 
                                                       color: rgb(58, 58, 58); font-family: Helvetica, Arial, sans-serif; font-size: 16px; line-height: 26px; widows: 1; 
                                                       text-align: center;">
                                                        <b style="font-style: inherit;">Neko Atsume</b>&nbsp;(Kitty Collector in English) is a recent trending&nbsp;
                                                        <a rel="nofollow" class="external text" href="https://itunes.apple.com/us/app/neko-atsume-kitty-collector/id923917775" 
                                                           style="font-style: inherit; font-weight: inherit; color: rgb(84, 132, 94);">iOS</a>&nbsp;and&nbsp;
                                                        <a rel="nofollow" class="external text" href="https://play.google.com/store/apps/details?id=jp.co.hit_point.nekoatsume" 
                                                           style="font-style: inherit; font-weight: inherit; color: rgb(84, 132, 94); ">Android</a>
                                                        &nbsp;mobile phone game designed by the Japanese&nbsp;<b style="font-style: inherit;">developer&nbsp;</b>
                                                        Hit-Point, in 2014. An English language option was released in an update on 30th October, 2015. It's&nbsp;
                                                        <b style="font-style: inherit;">addictive</b>,&nbsp;<b style="font-style: inherit;">adorable</b>, and completely&nbsp;
                                                        <b style="font-style: inherit;">free</b>!</p><p style="margin-top: 1em; margin-bottom: 1em; color: rgb(58, 58, 58); 
                                                                                                    font-family: Helvetica, Arial, sans-serif; font-size: 16px; line-height: 26px; widows: 1; text-align: center;">
                                                        The game provides the player of a small backyard area (which can later be&nbsp;<b style="font-style: inherit;">
                                                            expanded&nbsp;</b>
                                                        with an indoor area as well) where the stray cats of the neighborhood come to visit. The game currently features more than 40&nbsp;
                                                        <i style="font-weight: inherit;">different&nbsp;</i>Cats: white and black, tabby and calico.&nbsp;<b style="font-style: inherit;">
                                                            Rare Cats&nbsp;</b>are rumored to roam the neighborhood too, but you'll need&nbsp;
                                                        <i style="font-weight: inherit;">particular</i>items to entice those elusive felines!</p>
                                                    <p><a href="#"></a></p>
                                                </div>
                                            </div>
                                        </div>
                                    </div>


                                </article></div>

                            </form></div>
                    </div><div class="vmenublock clearfix">
                        <div class="vmenublockheader">
                            <h3 class="t">Derniers messages</h3>
                        </div>
                        <div class="vmenublockcontent">
                            <ul class="vmenu">
                                <li><a href="accueil.html" class="active">Accueil</a></li>
                                <li><a href="chats.html">Chats</a>
                                    <ul><li><a href="rares.html">Rares</a></li>
                                        <li><a href="communs.html">Communs</a></li>
                                    </ul>
                                </li>
                                <li><a href="astuces.html">Astuces</a></li>
                            </ul>
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