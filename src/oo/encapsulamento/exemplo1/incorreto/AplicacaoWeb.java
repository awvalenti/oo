package oo.encapsulamento.exemplo1.incorreto;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AplicacaoWeb extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Venda venda;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BigDecimal valorTotalVenda = BigDecimal.ZERO;
		for (ItemVenda item : venda.getItens()) {
			valorTotalVenda = valorTotalVenda.add(item.getValor());
		}

		request.setAttribute("valorTotalVenda", valorTotalVenda);

		request.getRequestDispatcher("WEB-INF/venda/resumo.jsp").forward(request, response);
	}

}