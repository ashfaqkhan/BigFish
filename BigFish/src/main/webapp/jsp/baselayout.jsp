<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<html>
<head>
<title>BigFish Project Management</title>
<link href="css/styleDefault.css" id="style" TYPE="text/css" rel="STYLESHEET">
	<meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <meta http-equiv="content-language" content="cs" />
    <meta name="robots" content="all,follow" />

    <meta name="author" content="All: ... [Ashfaq Khan - www.khaninfotech.com]; e-mail: contact@khaninfotech.com" />
    <meta name="copyright" content="Khan Infotech: Ashfaq Khan [www.khaninfotech.com]; e-mail: contact@khaninfotech.com" />
    
    <title>BigFish</title>
    <meta name="description" content="..." />
    <meta name="keywords" content="..." />
    
    <link rel="index" href="./" title="Home" />
    <link rel="stylesheet" media="screen,projection" type="text/css" href="${pageContext.request.contextPath}/css/template/main.css" />
    <link rel="stylesheet" media="print" type="text/css" href="${pageContext.request.contextPath}/css/template/print.css" />
    <link rel="stylesheet" media="aural" type="text/css" href="${pageContext.request.contextPath}/css/template/aural.css" />

</head>

<body leftmargin=0 topmargin=0 marginheight="0" marginwidth="0">

<div id="main" class="box">
<tiles:insertAttribute name="header" />
<tiles:insertAttribute name="menu" />
<tiles:insertAttribute name="body" />
<tiles:insertAttribute name="rightpanel" />
<tiles:insertAttribute name="footer" />
</div> <!-- /main -->
</body>
</html>