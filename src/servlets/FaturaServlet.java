package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classesBasicas.Fatura;
import conexoes.Dao;

@WebServlet(urlPatterns="/fatura")

public class FaturaServlet extends HttpServlet{
	
	protected void service (HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException{
		
		String nomeCliente = request.getParameter("noemCliente");
		String codigoFatura = request.getParameter("codigoFatura");
		String dataVencimento = request.getParameter("dataVenciemtno");
		Double valorTotal = Double.parseDouble(request.getParameter("valoTotal"));
		
		Fatura fatura = new Fatura();
		fatura.setNomeCliente(nomeCliente);
		fatura.setCodigoFatura(codigoFatura);
		fatura.setValorTotal(valorTotal); 
		
		Date dataEmTexto=null;
		boolean erroConversaoData=false;
		
		try{
			dataEmTexto = new SimpleDateFormat("dd/MM/yyyy").parse(dataVencimento);
		}catch(ParseException e){
			erroConversaoData=true;
			
		}if(erroConversaoData=false){
			fatura.setDataVencimento(dataEmTexto);
			
			Dao dao = new Dao();
			dao.alteracaoFatura(fatura);
			
			
			// Falta Terminar O print do IF e do ELSE 
			// Não sei ainda como faz :D 
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("Contato ");
			out.println("</body>");
			out.println("</html>");
		}else{
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("Existe Algum Erro");
			out.println("</body>");
			out.println("</html>");
		}
		
	}

}
