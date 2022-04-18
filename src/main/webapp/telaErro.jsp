<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inicial</title>
</head>
<body>
	<p><%=request.getAttribute("mensagemErro")%>
		Por favor, tente novamente!
	</p>
	<form action="SvCarroCadastrar" method="post">
		<label>Nome: </label> <input type="text" name="nome" value=<%=request.getParameter("nome")%>><br> 
		<label>Placa:</label> <input type="text" name="placa" value=<%=request.getParameter("placa")%>><br> 
		<label>Marca:</label> <input type="text" name=marca value=<%=request.getParameter("marca")%>><br> 
		<label>Ano:</label> <input type="text" name="ano" value=<%=request.getParameter("ano")%>><br>
		<br> 
		<input type="submit" value="Cadastrar" />
	</form>
</body>
</html>