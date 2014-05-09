package com.github.awvalenti.oo.encapsulamento.exemplo1.depois.de.refatorar.interfacegrafica.web;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.github.awvalenti.oo.encapsulamento.exemplo1.depois.de.refatorar.entidades.Venda;

@SuppressWarnings("serial")
@WebServlet("/venda/resumo")
public class PaginaWeb extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Trecho 0
		Venda venda = (Venda) request.getSession().getAttribute("venda");

		// Trecho 1
		BigDecimal total = venda.calcularValorTotal();

		// Trecho 2
		request.setAttribute("valorTotalVenda", total);

		// Trecho 3
		request.getRequestDispatcher("WEB-INF/venda/resumo.jsp").forward(request, response);
	}

}
