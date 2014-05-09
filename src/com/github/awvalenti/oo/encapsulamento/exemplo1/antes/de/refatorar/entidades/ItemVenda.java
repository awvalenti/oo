package com.github.awvalenti.oo.encapsulamento.exemplo1.antes.de.refatorar.entidades;

import java.math.BigDecimal;

public class ItemVenda {

	private Produto produto;
	private BigDecimal quantidade;

	public ItemVenda(Produto produto, BigDecimal quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public BigDecimal getQuantidade() {
		return quantidade;
	}

}
