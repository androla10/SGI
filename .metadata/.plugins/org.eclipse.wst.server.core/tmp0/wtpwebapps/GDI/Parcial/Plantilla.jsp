<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="../css/bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="../css/bootstrap/bootstrap-theme.min.css">
<link rel="stylesheet" href="../css/font-awesome/font-awesome.min.css">
<link rel="stylesheet" href="../css/estilos.css">
<script src="../js/librerias/jquery-2.2.3.min.js.js"></script>
<script src="../js/librerias/bootstrap.min.js"></script>
<script src="../js/general.js"></script>
<title>Sistema de Gesti�n de Incidencias</title>
</head>
<body>

	<div class="header">
		<tiles:insertAttribute name="header"/>
	</div>
	<div class="aside">
		<tiles:insertAttribute name="aside"/>
	</div>
	<div class="body">
		<tiles:insertAttribute name="body"/>
	</div>
	<div class="footer">
		<tiles:insertAttribute name="footer"/>
	</div>

</body>
</html>