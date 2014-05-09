package com.github.awvalenti.oo.encapsulamento.exemplo1.depois.de.refatorar.interfacegrafica.web;

import java.io.IOException;

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

		// Trechos 1 e 2 mesclados
		request.setAttribute("valorTotalVenda", venda.calcularValorTotal());

		// Trecho 3
		request.getRequestDispatcher("WEB-INF/venda/resumo.jsp").forward(request, response);
	}

}
