package oo.encapsulamento.exemplo1.incorreto;

import java.math.BigDecimal;

public class ItemVenda {

	private Produto produto;
	private BigDecimal quantidade;

	// ...

	public Produto getProduto() {
		return produto;
	}

	public BigDecimal getQuantidade() {
		return quantidade;
	}

}
