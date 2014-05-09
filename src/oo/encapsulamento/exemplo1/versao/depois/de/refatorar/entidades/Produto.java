package oo.encapsulamento.exemplo1.versao.depois.de.refatorar.entidades;

import java.math.BigDecimal;

public class Produto {

	private BigDecimal valor;

	public Produto(BigDecimal valor) {
		this.valor = valor;
	}

	public BigDecimal getValor() {
		return valor;
	}

}
