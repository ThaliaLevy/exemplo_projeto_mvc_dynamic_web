<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro realizado</title>
</head>
<body>
<p>Nome: <%= request.getParameter("nome") %></p>
<p>Placa: <%= request.getParameter("placa") %></p>
<p>Marca: <%= request.getParameter("marca") %></p>
<p>Ano: <%= request.getParameter("ano") %></p>
</body>
</html>