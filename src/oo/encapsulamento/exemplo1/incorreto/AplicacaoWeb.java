package oo.encapsulamento.exemplo1.incorreto;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/venda/resumo")
public class AplicacaoWeb extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Venda venda;

	// ...
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Trecho 1
		BigDecimal valorTotalVenda = BigDecimal.ZERO;
		for (ItemVenda item : venda.getItens()) {
			valorTotalVenda = valorTotalVenda.add(item.getValor());
		}

		// Trecho 2
		request.setAttribute("valorTotalVenda", valorTotalVenda);

		// Trecho 3
		request.getRequestDispatcher("WEB-INF/venda/resumo.jsp").forward(request, response);
	}

}
