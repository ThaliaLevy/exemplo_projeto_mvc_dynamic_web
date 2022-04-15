<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Resultado do cálculo da média do aluno</h1><hr>
<p>Nome do aluno: <%= request.getParameter("nomeCadastrado") %></p>
<p>1ª nota: <%= request.getParameter("nota1") %></p>
<p>2ª nota: <%= request.getParameter("nota2") %></p>
<p>3ª nota: <%= request.getParameter("nota3") %></p>
<p>4ª nota: <%= request.getParameter("nota4") %></p>
<p>Média: <%= request.getAttribute("media") %></p>
</body>
</html>