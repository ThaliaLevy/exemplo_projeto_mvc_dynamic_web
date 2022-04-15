package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//localização do meu servlet > não se deve alterar!
@WebServlet("/SvExemplo01")

public class SvExemplo01 extends HttpServlet {	
	//request e response são variáveis
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//pegar informações que serão usadas, vindas do arquivo .html de entrada 
		String nomeRecebido = request.getParameter("nomeCadastrado");
		int nota1 = Integer.parseInt(request.getParameter("nota1"));
		int nota2 = Integer.parseInt(request.getParameter("nota2"));
		int nota3 = Integer.parseInt(request.getParameter("nota3"));
		int nota4 = Integer.parseInt(request.getParameter("nota4"));
		
		//realizar o desenvolvimento da regra de negócio
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		
		//setar atributo criado
		request.setAttribute("media", media);
		
		//enviar os resultados ao arquivo .jsp dinâmico
		request.getRequestDispatcher("resultado.jsp").forward(request, response);
}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
