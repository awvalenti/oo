package com.github.awvalenti.oo.encapsulamento.exemplo1.depois.de.refatorar.entidades;

import java.math.BigDecimal;
import java.util.List;

public class Venda {

	private List<ItemVenda> itens;

	public Venda(List<ItemVenda> itens) {
		this.itens = itens;
	}

	public BigDecimal calcularValorTotal() {
		BigDecimal total = BigDecimal.ZERO;
		for (ItemVenda item : itens) {
			total = total.add(item.calcularValor());
		}
		return total;
	}

}
