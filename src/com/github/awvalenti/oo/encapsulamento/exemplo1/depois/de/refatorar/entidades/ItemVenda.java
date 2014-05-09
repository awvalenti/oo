package com.github.awvalenti.oo.encapsulamento.exemplo1.depois.de.refatorar.entidades;

import java.math.BigDecimal;

public class ItemVenda {

	private Produto produto;
	private BigDecimal quantidade;

	public ItemVenda(Produto produto, BigDecimal quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public BigDecimal calcularValor() {
		return produto.getValor().multiply(quantidade);
	}

}
