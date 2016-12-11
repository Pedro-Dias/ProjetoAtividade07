package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoletoServlet extends HttpServlet{
	
	protected void service (HttpServletRequest request, HttpServletResponse responde) throws
	ServletException, IOException{
		
		String codigoBoleto = request.getParameter("codigoBoleto");
		String dataPagamento = request.getParameter("dataPagamento");
		String valorPago = request.getParameter("valorPago");
		
		
	}

}
