package oo.encapsulamento.exemplo1.incorreto;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/venda/resumo")
public class InterfaceWeb extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Trecho 0
		Venda venda = (Venda) request.getSession().getAttribute("venda");

		// Trecho 1
		BigDecimal valorTotalVenda = BigDecimal.ZERO;
		for (ItemVenda item : venda.getItens()) {
			valorTotalVenda = valorTotalVenda.add(item.getProduto().getValor().multiply(item.getQuantidade()));
		}

		// Trecho 2
		request.setAttribute("valorTotalVenda", valorTotalVenda);

		// Trecho 3
		request.getRequestDispatcher("WEB-INF/venda/resumo.jsp").forward(request, response);
	}

}
