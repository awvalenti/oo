package oo.encapsulamento.exemplo1.incorreto;

import java.math.BigDecimal;

public class ItemVenda {

	private BigDecimal valorProduto;
	private int quantidade;

	public BigDecimal calcularValor() {
		return valorProduto * quantidade;
	}

}
