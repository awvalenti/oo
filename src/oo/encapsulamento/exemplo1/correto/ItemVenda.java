package oo.encapsulamento.exemplo1.correto;

import java.math.BigDecimal;

public class ItemVenda {

	private Produto produto;
	private BigDecimal quantidade;

	public BigDecimal calcularValor() {
		return produto.getValor().multiply(quantidade);
	}

}
