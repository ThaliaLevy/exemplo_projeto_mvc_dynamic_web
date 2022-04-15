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
		
}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
