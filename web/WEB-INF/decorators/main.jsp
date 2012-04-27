<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">

<html>

<head>

<%@ include file="header.jsp" %>
<title><decorator:title default="pritom shosti Voting System"/></title>
<decorator:head/>
<link href="/WEB-INF/css/style.css" type="text/css" rel="stylesheet"/>


<style type="text/css">

/*body{ background-color:blue;}*/
/*div.foot {*/
/*align: center;*/
/*background-color: #ffffcc;*/
/*width: 100%;*/
/*height: 60px;*/

/*}*/

body {
    margin: 0;
    padding: 0;
    background: #ffcc00 url(/WEB-INF/images/wrapper-background.png) repeat;
    font-family: Arial, Helvetica, sans-serif;
    font-size: 14px;
    color: #181B20;
}

h1, h2, h3 {
    margin: 0px;
    padding: 0px;
    text-transform: lowercase;
    font-family: 'Abel', sans-serif;
    font-weight: 400;
}

h1 {
    font-size: 2em;
}

h2 {
    font-size: 2.4em;
}

h3 {
    font-size: 1.6em;
}

p, ul, ol {
    margin-top: 0;
    line-height: 180%;
}

ul, ol {
}

a {
    text-decoration: none;
    color: #398A12;
}

a:hover {
    text-decoration: underline;
}

img.border {
    border: 6px solid #EEE7DF;
}

img.alignleft {
    float: left;
    margin-right: 25px;
}

img.alignright {
    float: right;
}

img.aligncenter {
    margin: 0px auto;
}

#wrapper {
    margin: 0 auto;
    padding: 0;
}

/* Header */

#header-wrapper {
    height: 240px;
}

#header {
    width: 960px;
    height: 240px;
    margin: 0 auto;
}

/* Logo */

#logo {
    width: 980px;
    height: 100px;
    margin: 0px auto;
    padding: 80px 0px 0px 0px;
    color: #FFFFFF;
}

#logo h1, #logo p {
    display: block;
    margin: 0px;
    padding: 0px;
    text-transform:uppercase;
}

#logo h1 {
    letter-spacing: -5px;
    text-align: center;
    text-transform: uppercase;
    font-size: 80px;
    color: #FFFFFF;
}

#logo h1 a {
    color: #FFFFFF;
}

#logo p {
    margin-top: -25px;
    text-align: center;
    font-family: 'Abel', sans-serif;
    font-size: 25px;
}

#logo a {
    border: none;
    background: none;
    text-decoration: none;
    color: #FFFFFF;
}

/* Search */

#search {
    float: right;
    width: 280px;
    height: 100px;
    padding: 0;
}

#search form {
    height: 41px;
    margin: 0;
    padding: 60px 0 0 30px;
}

#search fieldset {
    margin: 0;
    padding: 0;
    border: none;
}

#search-text {
    width: 195px;
    padding: 6px 10px;
    border: none;
    background: #FFFFFF;
    text-transform: lowercase;
    font: normal 11px Arial, Helvetica, sans-serif;
    color: #7F7F81;
}

#search-submit {
    display: none;
}

/* Menu */

#menu {
    width: 940px;
    height: 60px;
    margin: 0px auto;
    padding: 0px 20px 0px 20px;
    background: #33820F url(/WEB-INF/images/menu-wrapper-bg.png) repeat-x left top;
}

#menu ul {
    margin: 0;
    padding: 0px 0px 0px 0px;
    list-style: none;
    line-height: normal;
}

#menu li {
    float: left;
    margin-right: 1px;
}

#menu a {
    display: block;
    float: left;
    height: 60px;
    margin: 0px;
    padding: 0px 30px 0px 30px;
    line-height: 60px;
    letter-spacing: -1px;
    text-decoration: none;
    text-transform: lowercase;
    text-shadow: 2px 2px 2px #2E7C0E;
    font-family: 'Abel', sans-serif;
    font-size: 24px;
    font-weight: normal;
    color: #FFFFFF;
    border: none;
}

#menu .current_page_item a {
    text-shadow: 2px 2px 2px #1B5803;
    background: #276D05;
}

#menu a:hover {
    background: #276D05;
    text-decoration: none;
    text-shadow: 2px 2px 2px #1B5803;
    color: #FFFFFF;
}

/* Page */

#page {
    width: 680px;
    margin: 0px auto;
    padding: 0px;
}

/* Content */

#content {
    float: right;
    width: 590px;
    padding: 30px 30px 0px 30px;
    background: #FFFFFF url(/WEB-INF/images/content-bg-bottom.png) no-repeat left bottom;
}

.post {
    clear: both;
    padding-bottom: 10px;
}

.post .title {
    padding-top: 10px;
    letter-spacing: -4px;
    text-transform: lowercase;
    font-size: 50px;
}

.post .title a {
    border: none;
    color: #272727;
}

.post .meta {
    padding-bottom: 10px;
    text-align: left;
    font-family: Arial, Helvetica, sans-serif;
    font-size: 11px;
    font-style: italic;
}

.post .meta a {
}

.post .entry {
    text-align: justify;
    margin-bottom: 25px;
    padding: 10px 0px 0px 0px;
}

.links {
    display: block;
    width: 96px;
    padding: 2px 0px 2px 0px;
    background: #A53602;
    text-align: center;
    text-transform: uppercase;
    font-size: 10px;
    color: #FFFFFF;
}

/* Sidebar */

#sidebar-bg {
    float: left;
    width: 330px;
    background: url(/WEB-INF/images/sidebar-shadow-bg.png) repeat-y left top;
}

#sidebar {
    overflow: hidden;
    width: 270px;
    padding: 30px 30px 20px 30px;
    background: url(/WEB-INF/images/sidebar-bg-bottom.png) no-repeat left bottom;
}

#sidebar ul {
    margin: 0;
    padding: 0;
    list-style: none;
}

#sidebar li {
    margin: 0;
    padding: 0;
}

#sidebar li ul {
    margin: 0px 0px;
    padding-bottom: 30px;
}

    /*#sidebar li li {
        padding-left: 30px;
        line-height: 35px;
        background: url(/WEB-INF/images/img01.gif) no-repeat left 5px;
    }*/

#sidebar li li span {
    display: block;
    margin-top: -20px;
    padding: 0;
    font-size: 11px;
    font-style: italic;
}

#sidebar h2 {
    height: 38px;
    margin-bottom: 20px;
    padding: 12px 0 0 0px;
    border-bottom: 1px solid #DEDEDE;
    letter-spacing: -2px;
    font-size: 30px;
}

#sidebar p {
    margin: 0 0px;
    padding: 0px 20px 20px 20px;
    text-align: justify;
}

#sidebar a {
    border: none;
}

#sidebar a:hover {
    text-decoration: underline;
}

/* Calendar */

#calendar {
}

#calendar_wrap {
    padding: 20px;
}

#calendar table {
    width: 100%;
}

#calendar tbody td {
    text-align: center;
}

#calendar #next {
    text-align: right;
}

/* Footer */

#footer {
    width: 650px;
    height: 100px;
    margin: 0px auto;
    padding-left: 330px;
}

#footer p {
    margin: 0;
    padding-top: 18px;
    line-height: normal;
    letter-spacing: -1px;
    text-align: center;
    text-shadow: 1px 1px 1px #050505;
    text-transform: lowercase;
    font-family: 'Abel', sans-serif;
    font-size: 20px;
    color: #525050;
}

#footer a {
    text-decoration: underline;
    color: #525050;
}

#slider {
    position: relative;
    width: 590px;
    margin: 0px auto 20px auto;
}

#slider .viewer {
    width: 590px;
    height: 300px;
    overflow: hidden;
    margin: 0 auto;
}

#slider .viewer .reel {
    display: none;
    height: 300px;
}

#slider .viewer .reel .slide {
    position: relative;
    width: 590px;
    height: 300px;
}


</style>


</head>

<body bgcolor="#F5FFFF">

<decorator:body/>

<%@ include file="footer.jsp" %>

</body>

</html>
