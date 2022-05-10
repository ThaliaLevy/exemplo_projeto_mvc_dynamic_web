package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.entidade.Carro;

//localização do meu servlet > não se deve alterar!
@WebServlet("/SvCarroCadastrar")

public class SvCarroCadastrar extends HttpServlet {
	// request e response são variáveis
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// pegar informações que serão usadas, vindas do arquivo .html de entrada
		String nome = request.getParameter("nome");
		String marca = request.getParameter("marca");
		String placa = request.getParameter("placa");
		int ano = Integer.parseInt(request.getParameter("ano"));

		// chamar entidade que será responsável pela regra de negócio
		Carro c = new Carro(nome, placa, marca, ano);

		if (c.tratarDados() == true) {
			// enviar os resultados ao arquivo .jsp dinâmico
			request.getRequestDispatcher("resultado.jsp").forward(request, response);
		} else {

			String mensagemErro = "Erro ao cadastrar.";
			// para setar atributos criados
			request.setAttribute("mensagemErro", mensagemErro);
			request.getRequestDispatcher("telaErro.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}


